import styled from "styled-components";
import { Alert, Text } from "react-native";
import { Image, Input, Button } from "../components/index.js";
import { images } from "../utils/images";
import { useState, useRef, useEffect } from "react";
import { KeyboardAwareScrollView } from "react-native-keyboard-aware-scroll-view";
import { removeWhitespace, validateEmail } from "../utils/common";
import { login } from "../utils/firebase.js";

const Container = styled.View`
  flex : 1;
  justify-content : center;
  align-items : center;
  background-color : ${({theme}) => theme.background};
`
const ErrorText = styled.Text`
  align-items : flex-start;
  width: 90%;
  height : 20px;
  margin-bottom : 10px;
  line-height : 20px;
  color : ${({theme}) => theme.errorText};
`
const Login = ({navigation}) => {
  // 이메일 상태 관리
  const [email, setEmail] = useState('');
  // 비밀번호 상태 관리
  const [password, setPassword] = useState('');
  // 에러메시지 상태 관리
  const [errorMessage, setErrorMessage] = useState('');
  // 버튼의 활성화 상태를 관리하는 state
  const [disabled, setIsDisabled] = useState(true);

  const passwordRef = useRef();

  // email, password, errorMessage의 state값이 변할 때 마다
  // 조건에 맞게 disabled의 state에 값을 세팅한다.
  useEffect(() => {
    // 로그인 버튼은 이메일과 비밀번호가 입력되어있어야 하고
    // 오류 메시지가 없어야 활성화된다.
    setIsDisabled(!(email && password && !errorMessage));
  },[email, password, errorMessage]);

  const _handleEmailChange = (email) => {
    // 입력된 이메일에 공백이 있다면 먼저 지운다.
    const changedEmail = removeWhitespace(email);
    setEmail(changedEmail);
    setErrorMessage(
      validateEmail(changedEmail) ? '' : 'Please verify your email'
    )
  }

  const _handlePasswordChange = (password) => {
    setPassword(removeWhitespace(password));
  }

  // 이메일과 비밀번호를 가지고 로그인 버튼을 눌렀을 때 
  const _handleLoginButtonPress = async() => {
        try {
            const user = await login({email,password});
            Alert.alert("Login Success",user.email)
        } catch (error) {
            Alert.alert("Login Error",error.message)      
        }
    }


  return(
    <KeyboardAwareScrollView
        contentContainerStyle={{flexGrow:1}}
        extraScrollHeight={20}  
        enableOnAndroid={true}
    >
      <Container>
        <Image url={images.logo} imageStyle={{borderRadius : 40}}/>
        <Input
          label="Email"
          value={email}
          onChangeText={_handleEmailChange}
          onSubmitEditing={() => passwordRef.current.focus()}
          placeholder={"Email"}
          returnKeyType="next"
        />
        <Input
          ref={passwordRef}
          label="Password"
          value={password}
          onChangeText={_handlePasswordChange}
          onSubmitEditing={() => {}}
          placeholder={"Password"}
          returnKeyType="done"
          isPassword
        />
        {/* <Text style={{fontSize : 30}}>Login Screen</Text> */}
        <ErrorText>{errorMessage}</ErrorText>
        <Button
            title="Login"
            onPress={_handleLoginButtonPress}
            disabled={disabled} />
        <Button
            title="Sign up with email"
            onPress={() => navigation.navigate('Signup')}
            isFilled={false}
        />
      </Container>
    </KeyboardAwareScrollView>
  )
}

export default Login;