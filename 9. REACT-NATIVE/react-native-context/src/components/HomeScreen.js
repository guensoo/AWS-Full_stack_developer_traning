import { View, Text, Button, StyleSheet  } from "react-native";
import { HomeContext } from "../contexts/HomeContext";
import { useContext } from "react";

const HomeComponent = () => {
  // const {logined, login, logout} = useContext(HomeContext)
  const {logined, login, logOut} = useContext(HomeContext);
  
  return (
    <View>
      {loginId ? 
        <View>
          <Text></Text>
          <Button></Button>
        </View> :
        <View>
          <Button></Button>
        </View> }
    </View>

    logined !== null ? 
    <View style={{flex:1, justifyContent : 'center', alignItems : 'center'}}>
      <Text>Welcome, {logined.name}</Text>
      <Button title="로그아웃" onPress={logout} />
    </View>
         : 
    <View style={{flex:1, justifyContent : 'center', alignItems : 'center'}}>
      <Button title="로그인" onPress={login} />
    </View>
  )
}

export default HomeComponent;