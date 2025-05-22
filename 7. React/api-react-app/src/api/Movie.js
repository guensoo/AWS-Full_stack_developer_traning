import { useState } from "react";
import axios from "axios";

function MovieApi(){

  // 일별 박스오피스 순위, 영화제목, 영화 개봉일, 해당일의 매출액
  const [movies, setMovies] = useState([]); // 일별 박스오피스
  const [loading, setLoading] = useState(false); // 로딩상태
  const [error, setError] = useState(null); // 에러상태
  const [targetDt, setTargetDt] = useState(''); // 검색 일자

  const searchMovies = async () => {
    setLoading(true);
    setError(null);
    const cleanDate = targetDt.replaceAll('-', '');

    const key = 'ddffa88cc27b9e0d42017d1df6153a29';
    try {
      const response = await axios({
        url: `http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=${key}&targetDt=${cleanDate}`,
      })

      setMovies(response.data.boxOfficeResult.dailyBoxOfficeList);
    } catch (error) {
      setError("영화 검색에 실패했습니다.")
    } finally{
        setLoading(false);
    }
  }
  const handleSearch = (e) => {
    e.preventDefault();
    searchMovies();
  }
  

  return (
    <div>
      <h1>일별 박스오피스 순위</h1>
      <form onSubmit={handleSearch}>
        <input type="date" value={targetDt} onChange={(e) => setTargetDt(e.target.value)}/>
        <button type="submit">검색</button>
      </form>

      <ul>
        {movies.map((movie, index) =>
        <li key={index}>
          <p>순위 : {movie.rank}</p>
          <p>제목 : {movie.movieNm}</p>
          <p>개봉일 : {movie.openDt}</p>
          <p>매출액 : {movie.salesAmt ? `${movie.salesAmt}원` : `매출 정보 없음`}</p>
        </li>
        )}
      </ul>
    </div>
  )
}

export default MovieApi;