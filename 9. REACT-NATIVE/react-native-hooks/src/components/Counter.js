import { useState } from "react";
import styled from "styled-components";
import Button from "./Button";
import {View} from 'react-native'

const StyledText = styled.Text`
  font-size: 24px;
  margin : 10px;
`

const Counter = () => {
  const [count, setCount] = useState(0);


  return(
    <View>
      <StyledText>Counter : {count}</StyledText>
      <Button title={'+'} onPress={() => setCount(count+1)}/>
      <Button title={'-'} onPress={() => setCount(count-1)}/>
    </View>
  )
}
export default Counter;