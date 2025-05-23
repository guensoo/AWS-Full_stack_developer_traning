import logo from './logo.svg';
import './App.css';
import {Greeting} from './Greetings';
import WelcomeMessage from './Welcome';
import { useState } from 'react';
import Todo from './Todo';
import { Example } from './Example';
import { Farewell } from './Greetings';
import AddTodo from './AddTodo';
import { Container,List,Paper } from '@mui/material';

// Container
// 레이아웃의 가로 폭을 제한하고, 중앙 정렬 및 기본 패딩을 자동으로 적용해주는 컴포넌트

// 주요 props
// maxWidth : 최대 너비를 지정(xs, sm, md, lg, xl, false)
//fixed : maxWidth와 관계없이 항상 고정폭 적용

function App() {
  // 하나의 할 일을 객체로 관리할 것이다.
  // id, title, done
  const [items, setItem] = useState([])

  // Todo를 추가하기 위한 백엔드 콜을 대신할 가짜함수를 만들어보자
  const add = (item) => {
    // newItem 객체가 하나의 Todo
    const newItem = {
      ...item,
      id: "ID-" + items.length,
      done:false,
    }
    // 상태를 변화시키는 함수를 호출하면 state의 변경사항이 화면에 적용이 된다.
    setItems(prev => [...prev, newItem])
    console.log("items : ", [...items,newItem]);
  }

  // React는 key속성에 들어있는 값을 참고해서 리스트의 요소가 변경될 경우 어떤 요소가 변경되었는지
  // 빠르게 파악할 수 있다.
  const todoItems = items.length > 0 && 
  // Paper컴포넌트
  // 종이 같은 표면 효과를 제공하는 컴테이너 컴포넌트
  // elevation(그림자깊이)를 통해 높낮이를 표현하고
  // 배경색과 그림자 효과로 콘텐츠를 돋보이게 한다.
  <Paper style={{margin: 16}}>
    <List>{/* 일련의 항목을 세로로 나열하는 컨테이너 역할 */}
      {items.map((item) => (
        <Todo item={item} key={item.id} />
      ))}
    </List>
  </Paper>

  // const [item2, setItem2] = useState({
  //   id:"1",
  //   title:"Hello world 2",
  //   done:false
  // })
  // let items = [item, item2]
  // const [name ,setName] = useState("John");
  return (
    <div className="App">
    <Container maxWidth="md">
      <AddTodo add={add}/> {/* AddTodo에 add함수를 전달 */}
      {todoItems}
      {/* <Todo justName={items}/> */}
      {/* <Todo justName={item2}/> */}
      {/* <Farewell name="홍길동"/> */}
      {/* 컴포넌트의 호출 <컴포넌트명 />
      <Greeting name = {name} />
      <Farewell name = "John" />
      {name은 하나씩 선언해야 한다.}
      {<WelcomeMessage isLoggedIn={true} /> */}
      </Container>
    </div>
  );
}


export default App;
