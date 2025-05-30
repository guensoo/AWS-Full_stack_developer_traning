import { useEffect } from "react";
// 컴포넌트
// UI의 조각
// 함수로 이루어져 있다.
// JSX문법을 이용해서 html을 반환

// 일반함수
// function Counter(){
// 
// }

// 화살표 함수
const Counter = ({count, setCount}) => {
  
  // const count = props.count;
  // const setCount = props.setCount;

  // useEffect() 훅
  // 컴포넌트가 렌더링 됐을 때 특정 작업을 수행할 수 있도록 하는 훅
  // 컴포넌트가 렌더링 될 때 통신을 통해서 데이터를 조회 해 올 때 많이 쓴다.
  // 의존성배열
  // 없으면 매 렌더링마다 useEffect의 콜백함수가 실행이 된다.
  // [] : 최초 렌더링 시에만 useEffect가 실행된다.
  // 특정 값을 배열에 넣으면, 그 값들이 변경될 때 마다 useEffect가 실행된다.
  useEffect(() => {
    console.log('useEffect 호출된 횟수')
    // 백엔드와 통신하는 코드
  },[count]);

  // JSX
  // HTML요소들을 JS와 함께 사용하는 문법
  const element = <h1>hello, JSX</h1>
  const isLoggedIn = true;

  const items = ['사과', '바나나', '체리']
  return (
    // html 코드(화면에 보게 될 ui)
    // <> -> JSX Fragment div는 쓰기 싫은데 안의 내용들을 하나로 묶어야 할 때 사용
    <>
      {element}
      {/* 조건부 렌더링 */}
      {/* {isLoggedIn ? 참일때 렌더링할 컴포넌트 : 거짓일 때 렌더링 할 컴포넌트} */}
      {/* {isLoggedIn && 컴포넌트} -> 참일때는 보이고, 거짓이면 아예 안보인다.*/}
      <ul>
        {/* map메서드를 이용하여 배열에 있는 내용을 출력 */}
        {/* 콜백함수에서 (item, index) => (<li key = {index}>{item}<.li>)
            콜백함수를 소괄호로 묶으면 안에 있는 내용을 묵시적으로 반환하겠다. */}
        {items.map((item, index) => (
          // { return <li key={index}>{item}</li> }
          <li key={index}>{item}</li>
        ))}
      </ul>
      {/* 스타일을 줄 때는 객체형식으로 줘야한다. */}
      <h2 style={{color:'red', fontsize:32}}>{count}</h2>
      {/* 태그의 속성을 줄 때 반드시 camelCase(낙타표기법)로 써야 한다. */}
      <button onClick={() => setCount(count+1)}>+</button>
    </>
  )
}

// 컴포넌트를 생성하고 난 뒤에는 내보내기를 해줘야 한다.
// export default Counter; // import 할 때 중괄호 안 써도 되고, 일므을 마음대로 써도 된다.
export {Counter}; // 내보내기 할 때도 중괄호, import 할 때도 중괄호, 이름을 무조건 맞춰서 써야 한다.