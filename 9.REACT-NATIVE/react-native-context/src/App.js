import styled from "styled-components"
import User from "./components/User"
import UserContext from "./contexts/User"
import { UserProvider } from "./contexts/User"
import Input from "./components/Input"
import { ThemeProvider } from "./contexts/ThemeContext"
import ThemeComponent from "./components/ThemeComponent"
import { HomeProvider } from "./contexts/HomeContext"
import HomeComponent from "./components/HomeScreen"

const Container = styled.View`
  flex : 1;
  background-color : #fff;
`

const App = () => {
  return(
    // Provider 컴포넌트로부터 value를 전달하는 하위 컴포넌트의 수에는 제한이 없다.
    // 하지만 Consumer 컴포넌트는 가장 가까운 Provider 컴포넌트에서 값을 받으므로
    // 자식 컴포넌트 중 Provider 컴포넌트가 있다면 그 중간에 있는 내용을 사용을 한다.
    // <UserContext.Provider value={{name:'Gildong'}}>
    // <UserProvider>
    //   <Container>
    //     <User />
    //     <Input />
    //   </Container>
    // </UserProvider>
    // </UserContext.Provider>
    // <ThemeProvider>
    //   <Container>
    //     <ThemeComponent/>
    //   </Container>
    // </ThemeProvider>
    <HomeProvider>
      <Container>
        <HomeComponent/>
      </Container>
    </HomeProvider>
  )
}

export default App;