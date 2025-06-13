import { useState } from 'react';
import styled from 'styled-components';
import CustomButton from '../components/CustomButton';
import CustomInput from '../components/CustomInput';

const Container = styled.View`
  flex : 1;
  justify-content : center;
  align-items : center;
  background-color : white;
`;

const Title = styled.Text`
  font-size : 26px;
  font-weight : bold;
  margin-bottom : 30px;
`;

const LoginScreen = ({navigation}) => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  return (
    <Container>
      <Title>로그인</Title>
      <CustomInput
        placeholder="이메일"
        value={email}
        onChangeText={setEmail}
      />
      <CustomInput
        placeholder="비밀번호"
        value={password}
        onChangeText={setPassword}
        secureTextEntry
      />
      <CustomButton
        title="로그인"
        onPress={() => console.log('로그인 버튼 클릭')}
      />
      <CustomButton
        title="회원가입"
        backgroundColor="green"
        onPress={() => navigation.navigate('SignupScreen')}
      />
    </Container>
  );
};

export default LoginScreen;
