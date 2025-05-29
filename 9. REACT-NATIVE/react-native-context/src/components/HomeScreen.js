import { View, Text, Button, StyleSheet  } from "react-native";
import { HomeContext } from "../contexts/HomeContext";
import { useContext } from "react";

const HomeComponent = () => {
  // const {logined, login, logout} = useContext(HomeContext)
  const {user, login, logOut} = useContext(HomeContext);
  
  return (
    // <View>
    //   {loginId ? 
    //     <View>
    //       <Text></Text>
    //       <Button></Button>
    //     </View> :
    //     <View>
    //       <Button></Button>
    //     </View> }
    // </View>

    // JS에서 false로 판단하는 것들 : false, '', null, undefined, 0, NaN
    user !== null ? 
    <View style={{flex:1, justifyContent : 'center', alignItems : 'center'}}>
      <Text>Welcome, {user.name}</Text>
      <Button title="로그아웃" onPress={logOut} />
    </View>
         : 
    <View style={{flex:1, justifyContent : 'center', alignItems : 'center'}}>
      <Button title="로그인" onPress={login} />
    </View>
  )
}

export default HomeComponent;