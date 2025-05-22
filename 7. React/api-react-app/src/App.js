import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route} from 'react-router-dom'
import Address from './api/Address'
import MultipleButtons from './MultiButtons';
import {useNavigate} from 'react-router-dom'
import MovieApi from './api/Movie';
import MapContainer from './api/Map';
 
function App() {
  return (
    
    <BrowserRouter>
      <div className="App" style={{marginTop:"20px"}}>
        <MultipleButtons />
          <Routes>
            <Route path="/address" element={<Address />} />
            <Route path="/movie" element={<MovieApi />} />
            <Route path="/map" element={<KakaoMap />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
