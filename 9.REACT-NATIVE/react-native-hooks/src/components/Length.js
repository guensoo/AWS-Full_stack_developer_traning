import { useState, useMemo } from "react";
import styled from "styled-components";
import Button from "./Button";
import { View, Text } from "react-native";

const StyledText = styled.Text`
  font-size : 24px;
`

const list = ['JavaScript', 'Expo', 'Expo', 'React Native'];
  
const getLength = text => {
  console.log(`Target Text : ${text}`)
  return text.length;
}
let idx = 0;

const Length = () => {

  const [text, setText] = useState(list[0]);
  // const [length, setLength] = useState('');

  const _onPress = () => {
    // setLength(getLength(text));
    ++idx;
    if(idx < list.length) setText(list[idx]);
    // setText(prev => prev+1)
    // if(text[3]) {
    //   setText(text[0])
    // }
  }

  const length = useMemo(() => getLength(text), [text]);

  return (
    <View>
      <StyledText>Text : {text}</StyledText>
      <StyledText>Length : {length}</StyledText>
      <Button title="Get Length" onPress={_onPress} />
      {/* 문자열 */}
      <Text>{list}</Text>
      {/* 해당 문자열의 길이 */}
      <Text>{list.length}</Text>
      {/* 버튼(버튼을 누를 때 마다 배열을 순환하면서 문자열의 길이를 구하는 기능) */}
      <Button title={'길이'} onPress={() => {list.map(item => item.length)}} />
    </View>
  )
}

export default Length;