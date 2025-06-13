import {StyleSheet, View, Text, Button} from 'react-native'
import { useState } from 'react';

const MyButton = (first, second, result) => {
  const [op, setOp] = useState('');

  switch (op){
    case'+':
    result = first + second;
    break;
    case'-':
    result = first - second;
    break;
    case'*':
    result = first * second;
    break;
    case'/':
    result = first / second;
    break;
  }
  

  return (
      <View style={styles.container}>
        <View style={styles.button}>
          <Button title="+" onPress={() => setOp('+')} />
        </View>
        <View style={styles.button}>
          <Button title="-" onPress={() => setOp('-')} />
        </View>
        <View style={styles.button}>
          <Button title="*" onPress={() => setOp('*')} />
        </View>
        <View style={styles.button}>
          <Button title="/" onPress={() => setOp('/')} />
        </View>
      </View>
  )
}

const styles = StyleSheet.create({
  container: {
    borderRadius: 100,
    alignItems: 'center',
    padding: 20,
    flexDirection: 'row',
  },
  button: {
    borderRadius: 10,
    padding: 20,
    flexDirection: 'row',
    alignItems: 'center',
  },
})
export default MyButton