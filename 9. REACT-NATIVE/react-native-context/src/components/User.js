import styled from "styled-components";
import { useContext } from "react";
import UserContext from "../contexts/User";
import { UserProvider } from "../contexts/User";
import { UserConsumer } from "../contexts/User";

const StyledText = styled.Text`
  font-size : 24px;
  margin : 10px;
`
// Consumer
// Consumer 컴포넌트는 상위 컴포넌트 중 가장 가까운 곳에 있는 Provider 컴포넌트가 전달하는 데이터를 이용한다.
// Provider 컴포넌트가 없다면 createContext함수의 파라미터로 전달된 기본값을 사용한다.
const User = () => {
  const {user, dispatch} = useContext(UserContext);
  return (
    // Provider 컴포넌트를 사용할 때 반드시 value를 지정해 줘야 한다는 것
    // Consumer 컴포넌트는 가장 가까운 Provider가 전달하는 값을 이용한다.
    // <UserContext.Provider value={{name:'React Native'}}>
    //   <UserContext.Consumer>
    //     {value => <StyledText>Name : {value.name}</StyledText>}
    //   </UserContext.Consumer>
    // </UserContext.Provider>
    // <UserConsumer>
    //   {({user}) => <StyledText>Name : {user.name}</StyledText>}
    // </UserConsumer>
    <StyledText>Name : {user.name}</StyledText>
  )
}

export default User;