import { createStackNavigator } from "@react-navigation/stack"
import { Channel } from "../screens";

// Stack객체 만들기
const Stack = createStackNavigator();

const MainStack = () => {
  // ChannelCreation
  // Channel
  // 두 개의 컴포넌트를 Screen으로 갖는 Stack네비게이션 만들기
  <Stack.Navigator
    screenOptions={{
      headerTitleAlign:'center',
      headerTintColor : ThemeConsumer.headerTintColor,
      cardStyle : {backgroundColor: ThemeConsumer.backgroundColor},
      headerBackTitleVisible:false,
    }}>
    <Stack.Screen name="Channel Creation" component={ChannelCreation}/>
    <Stack.Screen name="Channel" component={Channel}/>
  </Stack.Navigator>

}