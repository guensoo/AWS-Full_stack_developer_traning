import MyButton from "./component/MyButton"
import { View, Text, StyleSheet, TextInput } from "react-native";
import { createContext, useContext, useState } from "react";

const App = () => {
  const [direction, setDirection] = useState('column');
    
  const [first, setFirst] = useState(null);
  const [second, setSecond] = useState(null);
  const [result, setResult] = useState('값을 입력해주세요');
  return (
    <View style={[styles.container, direction]}>
        <View style={styles.input}>
        <TextInput placeholder='Enter first number' value={first} onChange={setFirst}/>
        </View>
        <View style={styles.input}>
        <TextInput placeholder='Enter second number' value={second} onChange={setSecond}/>
        </View>
      <View>
        <Text>Enter numbers and select operation</Text>
      </View>
      <View>
        <MyButton />
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#f3f3f3',
    alignItems: 'center',
    justifyContent: 'center',
    padding: 20,
    direction: 'column',
  },
  input: {
    borderRadius: 10,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
    margin: 10,
    padding: 10,
    width: 300,
  },
});

export default App;