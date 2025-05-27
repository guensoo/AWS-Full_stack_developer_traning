import { useState, useMemo } from "react";
import styled from "styled-components";
import Button from "./Button";
import { View, Text } from "react-native";

const StyledText = styled.Text`
  font-size : 24px;
`

const list = ['JavaScript', 'Expo', 'Expo', 'React Native'];

let idx = 0;

const LengthRepeat = () => {

  const [text, setText] = useState(list[0]);

  const _onPress = () => {
    ++idx;
    if(idx < list.length){
      setText(list[idx]);
    } else{
      idx = 0;
      setText(list[idx]);
    }
    console.log(idx)
  }

  return (
    <>
      {/* 문자열 */}
      <StyledText>{text}</StyledText>
      {/* 해당 문자열의 길이 */}
      <StyledText>{text.length}</StyledText>
      {/* 버튼(버튼을 누를 때 마다 배열을 순환하면서 문자열의 길이를 구하는 기능) */}
      <Button title={'Loop'} onPress={_onPress} />
    </>
  )
}

export default LengthRepeat;
