import {useState, useEffect, useContext} from 'react'
import axios from 'axios'
import {Link, useNavigate} from 'react-router-dom'
import { BoardContext } from '../context/BoardContext'
import { mokData } from './mokData'
import '../css/BoardList.css'
import { call } from '../ApiService';
import { API_BASE_URL } from '../api-config'

const BoardList = () => {

  const {boardList, setBoardList} = useContext(BoardContext);

  const [currentPage, setCurrentPage] = useState(1); // 현재 페이지
  const [postsPerPage, setPostsPerPage] = useState(3); // 한 페이지에 보여줄 게시물 개수
  const [totalPages, setTotalPages] = useState(1); // 총 페이지 수
  const [items, setItems] = useState([])
  const [loading, setLoading] = useState(true)
  // 최초 렌더링시 1번만 실행
  const navigate = useNavigate();

  useEffect(() => {
    // 백엔드와 통신하는 척 boardList에 가짜데이터를 넣는다.
    // setBoardList(mokData);
    // 게시판의 총 페이지 수
    setTotalPages(Math.ceil(boardList.length/postsPerPage));
    setCurrentPage(1);
    axios({
      method: 'GET',
      url: API_BASE_URL+'/all',
    })
    .then(res => {
      setBoardList(res.data)
      console.log(res.data)
      navigate("/");
    })
    // 게시글 개수와, 총 페이지 수가 변할 때마다 재렌더링
  },[])



  // 페이지 계산
  // 현재 페이지의 마지막 게시글 인덱스 + 1을 구한다.
  // ex) 현재 페이지 : 2, 한페이지에 보여줄 게시글 3
  const indexOfLastPage = currentPage * postsPerPage
  // 현재 페이지의 첫번쨰 게시물의 인덱스
  // ex) 6 - 3 = 3
  const indexOfFirstPost = indexOfLastPage - postsPerPage
  // indexOfFirstPost부터 indexOfLastPost미만까지 잘라낸 새로운 배열
  const currentPosts = boardList.slice(indexOfFirstPost, indexOfLastPage)

  const paginate = (pageNumber) => setCurrentPage(pageNumber);

  // 보여줄 게시물 수 조정하는 함수
  const handlePostsPerPage = (e) => {
    setPostsPerPage(parseInt(e.target.value));
    setCurrentPage(1); // 1페이지로 돌아간다..
  }

  // 글쓰기 페이지로 이동하기
  const handleWritePost = () => {
    navigate("/write")
  }


  return (
    <div className='board-container'>
      <h1 className='board-title'>게시판</h1>
      <div className='board-button'>
        <button onClick={handleWritePost}>글쓰기</button>
      </div>
      <br />
      {/* 목업데이터 출력하기 */}
      {boardList.length === 0 ? (
        <h3>게시글이 없습니다.</h3>
      ) : (
      <ul className='board-posts'>
        {currentPosts.map((board) => (
          <li key={board.id} className='board-post-item'>
          <Link to={`/post/${board.id}`}>{board.title}</Link>
          <span>작성자 : {board.author}</span>
          <span> ㅣ 작성 시간 : {board.writingTime}</span>
          </li>
        ))}
      </ul>
      )}
      {/* 한번에 보여줄 게시글 수  */}
      <div className='board-posts-per-page'>
        <label>
          게시물 수 : {" "}
          <select value={postsPerPage} onChange={handlePostsPerPage}>
            <option value={3}>3개</option>
            <option value={5}>5개</option>
            <option value={10}>10개</option>
          </select>
        </label>
      </div>
      {/* 이동할 페이징 처리 */}
      <div className='board-pagination'>
        {/* 1. Array(totalPages) : 전체 페이지 만큼 방을 가지는 배열 생성
            2. .keys() : 0부터 totalPages-1 까지 인덱스 이터레이터가 생성된다.
            3. ...으로 펼쳐서 [0, 1, 2, 3,...totalPages-1]형태의 배열을 얻는다.
            4. map((number) => ...) : 각 number에 대해 버튼을 생성한다. */}
        {[...Array(totalPages).keys()].map((number) => (
          <button
          key={number+1}
          className={currentPage === number+1 ? "selected" : ""}
          onClick={() => paginate(number+1)}
          >
            {number+1}
          </button>
        ))}
      </div>
      
    </div>
  )
}

export default BoardList;