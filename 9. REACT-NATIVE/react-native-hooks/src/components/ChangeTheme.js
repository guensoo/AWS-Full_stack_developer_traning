import { useToggle } from "../hooks/useToggle";
import { TextInput, Text, View, Button, Pressable } from "react-native";

export const ChangeTheme = () => {
  // const {value, toggle} = useToggle(false);
  const theme = useToggle();



  return (
    <View style={{
        flex:1,
        alignItems:'center',
        justifyContent:'center',
        backgroundColor: '#fff'
    }}>
      <Text style={{fontSize: 24, marginBottom: 20}}>현재 상태 : {theme.value ? 'ON' : 'OFF'}</Text>
      <Pressable onPress={theme.toggle} style={{backgroundColor: theme.value ? '#f1c40f' : '#95a5a6', padding: 12, borderRadius: 8,}} >
        <Text style={{color:'white', fontSize: 18}}>상태 토글</Text>
      </Pressable>
      {/* <Button title="Change" onPress={theme.toggle} /> */}
    </View>
  )
}