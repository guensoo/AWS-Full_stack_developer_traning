import { useState,useEffect, useContext } from "react";
import { BoardContext } from "../context/BoardContext";
import { useParams,useNavigate } from "react-router-dom";
import CustomButton from "../component/CustomButton";
import axios from "axios";

const PostDetail = () => {

    const navigate = useNavigate();

    //넘어온 아이디를 받아야 한다.
    const {id} = useParams();

    //게시글을 사용하기 위해 BoardContext 사용
    const {boardList, setBoardList} = useContext(BoardContext);

    //하나의 게시글을 담기 위한 state
    const [item, setItem] = useState({});

    //id를 통해 boardList에 들어있는 게시글 한건을 꺼내서
    //화면에 출력하기
    //useEffect()사용하기

    const getBoard = async () => {
        const response = await axios({
                url:`http://localhost:10000/api/board/${id}`,
                method:'GET'
            });
        setItem(response.data);
    }

    //게시글 한 건 조회
    useEffect(() => {
       getBoard();
    },[id]);

    const moveToEdit = () => {
        navigate("/edit/"+id);
    }

    //게시글 삭제하기
    const handleDelete = async () => {
        //백엔드에 삭제를 요청
        //응답으로 true 또는 false를 받아오기
        //true일 때 삭제되었습니다. alert 띄우기
        if(window.confirm("게시글을 삭제하시겠습니까?")){
            await axios({
                url:`http://localhost:10000/api/board/${id}`,
                method:'DELETE'
            })
             .then(response => {
                if(response.data){
                    alert("삭제되었습니다");
                } else {
                    alert("삭제 안됐습니다.")
                }
             })
             navigate("/");
        }
    }


    function moveToBoard(){
        navigate("/")
    }

    return(
        <div>
            <h2 className="board-detail-title">{item.title}</h2>
            <div className="board-detail-info">
                <h5>작성자 : {item.author}</h5>
                <p style={{fontSize:"12px", color:"gray"}}>{item.writingTime}</p>
            </div>
            <hr />
                <p className="board-detail-body">{item.content}</p>
            <hr />
            <div>
                <CustomButton label="수정" onClick={moveToEdit} />
                <CustomButton label="삭제" color="secondary" onClick={handleDelete} />
                <CustomButton label="목록으로" variant="outlined" onClick={moveToBoard} />
            </div>
        </div>
    )
}

export default PostDetail;