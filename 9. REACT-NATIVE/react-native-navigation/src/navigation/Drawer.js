import {createDrawerNavigator} from "@react-navigation/drawer";
import { HomeScreen, ProfileScreen, CustomDrawer } from "../screens/DrawerScreens";

const Drawer = createDrawerNavigator();

const DrawerNavigation = () => {
  return(
    <Drawer.Navigator
      // drawer에 들어갈 커스텀 컴포넌트
      // props로 넘어가는 내용들
      // 스크린 이름, drawer를 조작하는 함수들, 스크린의 정보
      drawerContent={(props) => <CustomDrawer {...props} />}
      screenOptions={{
        // drawer의 스타일(배경색, 너비 등)을 지정할 수 있다.
        drawerStyle : {
          backgroundColor : '#e6e6e6',
          width: 240,
          borderWidth: 10,
          borderColor : '#ccc',
        },
        // drawer 라벨의 텍스트 스타일(글자크기, 두께, 색깔, 정렬, 자간 등) 지정
        drawerLabelStyle : {fontSize : 18},
        // 선택된 drawer의 색상
        drawerActiveTintColor : '#4CAF50',
        // 선택이 안된 drawer의 색상
        drawerInactiveTintColor : '#757575',
        // 모든 스크린의 헤더가 사라진다.
        // headerShown : false,
        drawerPosition : 'right',
      }}
    >      
      <Drawer.Screen name="Home" component={HomeScreen} />
      <Drawer.Screen name="Profile" component={ProfileScreen} />
    </Drawer.Navigator>
  )
}

export default DrawerNavigation;