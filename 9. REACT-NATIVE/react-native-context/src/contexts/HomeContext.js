import { Children, createContext, useContext, useState } from "react";
import { View, Text, StyleSheet } from "react-native";

const HomeContext = createContext();

const HomeProvider = ({children}) => {
  // const [user, setUser] = useState();
  // const [logined, setLogined] = useState({name : 'John Doe'});

  const [user, setUser] = useState(null);
  const login = () => setUser({name : 'John Doe'});
  const logOut = () => setUser(null);

  return(
    <HomeContext.Provider value={{user, login, logOut}}>
      {children}
    </HomeContext.Provider>
  )

  // const user = {name : 'John Doe'}

  // const toggleLogIn = () => {
  //   setLogin(prev => !prev);
  //   setUser({name: 'John Doe'})
  // }

  // const login = () =>{
  //   console.log(login)
  //   // console.log('user : '+user)
  //   console.log('logined : '+logined)
  //     setLogined(user);
  // }

  // const logout = () =>{
  //   console.log(logout)
  //   console.log(logined)
  //     setLogined(null);
  // }

  // const value = {logined, login, logout}

  // return(
  //   <HomeContext.Provider value={value}>
  //     {children}
  //   </HomeContext.Provider>
  // )
}

export {HomeContext, HomeProvider}