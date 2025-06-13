import { TextInput, View, StyleSheet } from "react-native"
import { useState } from "react"


const Input = () => {
  const [first, setFirst] = useState('');
  const [second, setSecond] = useState('');

  return (
    <View style={styles.container}>
      <TextInput placeholder='Enter first number' value={first} onChange={setFirst}/>
      <TextInput placeholder='Enter second number' value={second} onChange={setSecond}/>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'white',
    borderRadius: '2px',
    alignItems: 'center',
    justifyContent: 'center',
    margin: '5px',
    padding: '5px'
  },
});

export default Input;