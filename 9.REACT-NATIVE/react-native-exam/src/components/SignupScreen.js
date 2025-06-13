import styled from "styled-components";
import {Pressable, View, Alert, Text, StyleSheet} from 'react-native';
import { useState } from "react";


const Container = styled.View`
  flex : 1;
  justify-content : center;
  align-items : center;
`
const Header = styled.Text`
  font-size : 30px;
  padding : 10px;
`

const Input = styled.TextInput`
  padding : 10px;
  width : 350px;
  border : 1px solid silver;
  border-radius : 6px;
  margin : 5px;

`

const SignUp = styled.Pressable`
  background-color : gray;
  border-radius : 6px;
  width : 350px;
  padding : 10px;
  align-items : center;
`

const SignUpText = styled.Text`
  color : white;
  font-size : 20px;
  
`

const validateEmail = (email) => /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);

const SignupScreen = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [name, setName] = useState('');

  const onButton = validateEmail(email) && password.length >= 6;

  const handleSignUp = () => {
    if(onButton) {
      Alert.alert('**회원가입 완료**');
    } else{
      return;
    }
  }

  return(
    <Container>
      <Header>회원가입</Header>
      <Input placeholder="이메일"
        value={email}
        onChangeText={setEmail}
      />
      <Input placeholder="비밀번호 (6자 이상)"
        value={password}
        onChangeText={setPassword}
        secureTextEntry={true}  
      />
      <Input placeholder="이름"
        value={name}
        onChangeText={setName}
      />
      <SignUp
        style={{
          backgroundColor : onButton ? 'darkblue' : 'gray',
        }}
        onPress={handleSignUp}
        hitSlop={{top : 30, bottom : 30, left : 50, right : 50}}>
        <SignUpText>가입하기</SignUpText>
      </SignUp>
    </Container>
  )
}

export default SignupScreen;