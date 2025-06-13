import { NavigationContainer } from "@react-navigation/native";
import RootStack from "./navigations/RootStack";
import { StatusBar } from "expo-status-bar";

export default function App(){
  return (
    <NavigationContainer>
      <StatusBar barStyle = 'light=content' />
      <RootStack />
    </NavigationContainer>
  )
}