import {useNavigate} from "react-router-dom"

function MultipleButtons(){
  const navigate = useNavigate();

  const handleButtonClick = (event) => {
    const buttonId = event.target.id;

    switch(buttonId){
      case 'address':
        navigate("/address");
        break;
      case 'movie':
        navigate("/movie");
        break;
      case 'map':
        navigate("/map");
        break;
    }
  }
  return (
    <div>
      <button id = "address" onClick={handleButtonClick}>
        주소찾기 api
      </button>
      <button id = "movie" onClick={handleButtonClick}>
        영화찾기 api
      </button>
      <button id = "map" onClick={handleButtonClick}>
        카카오지도 api
      </button>
    </div>
  )
}

export default MultipleButtons;