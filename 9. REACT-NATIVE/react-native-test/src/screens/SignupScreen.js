import{ useState } from 'react';
import styled from 'styled-components/native';
import CustomInput from '../components/CustomInput';
import CustomButton from '../components/CustomButton';

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

const SignupScreen = ({navigation}) => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  return (
    <Container>
      <Title>회원가입</Title>
      <CustomInput
        placeholder="이름"
        value={name}
        onChangeText={setName}
      />
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
        title="회원가입"
        onPress={() => console.log('회원가입 버튼 클릭')}
      />
      <CustomButton
        title="로그인"
        backgroundColor="orange"
        onPress={() => navigation.navigate('LoginScreen')}
      />
    </Container>
  );
};

export default SignupScreen;
