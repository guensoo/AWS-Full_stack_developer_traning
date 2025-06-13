import React, { useEffect, useState, useContext } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { BoardContext } from "../context/BoardContext"; // Context 사용
import axios from "axios";
import CustomButton from "../component/CustomButton";
import CustomInput from "../component/CustomInput";

const EditPost = () => {
  const navigate = useNavigate();
  const { id } = useParams();
  const { boardList, setBoardList } = useContext(BoardContext); // Context 사용
  const [post, setPost] = useState({title:"",author:"",content:""});

  const { author, title, content } = post;

  const onChange = (event) => {
    const { value, name } = event.target;
    setPost((prevPost) => ({
      ...prevPost,
      [name]: value,
    }));
    console.log(post)
  };

    const getPost = async () => {
        const response = await axios({
                url:`http://localhost:10000/api/board/${id}`,
                method:'GET'
            });
        setPost(response.data);
    }

  const backToPost = () => {
    navigate("/post/" + id);
  };

  const updatePost = async () => {
    //수정한 내용을 데이터베이스에 반영하기
    await axios({
       url:`http://localhost:10000/api/board/${id}`,
       method:'put',
       data : post
    })
    .then(response => {
      if(response.status === 200){
        alert("수정되었습니다.");
        navigate("/post/"+id);
      }
    })





  };

  useEffect(() => {
    getPost();
  }, [id,boardList]);

  return (
    <div>
      <h1>글 수정하기</h1>
      <form>
        <CustomInput label="제목" name="title" value={title} onChange={onChange} />
        <CustomInput label="작성자" name="author" value={author} onChange={onChange} />
        <CustomInput
          label="내용"
          name="content"
          multiline
          rows={6}
          value={content}
          onChange={onChange}
        />
        <div>
          <CustomButton label="수정 완료" onClick={updatePost} />
          <CustomButton label="수정 취소" variant="outlined" color="secondary" onClick={backToPost} />
        </div>
      </form>
    </div>
  );
};

export default EditPost;
