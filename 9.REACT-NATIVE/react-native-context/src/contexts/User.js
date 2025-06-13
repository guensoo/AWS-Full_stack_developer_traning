import { createContext, useState } from "react";

// Context의 값을 수정해 Context를 사용하는 컴포넌트에 변경된 내용을 반영해보자.
const UserContext = createContext({
  user : {name : ""}, // 기본 사용자 이름을 빈 문자열로 설정
  dispatch : () => {}, // 기본 'dispatch'는 빈 함수로 설정
});

const UserProvider = ({children}) => {
  const [name, setName] = useState('Beomjun kim');

  // 
  const value = {user: {name}, dispatch : setName};

  return(
    <UserContext.Provider value={value}>
      {children}
    </UserContext.Provider>
  )
}

const UserConsumer = UserContext.Consumer;

export {UserProvider, UserConsumer};
export default UserContext;