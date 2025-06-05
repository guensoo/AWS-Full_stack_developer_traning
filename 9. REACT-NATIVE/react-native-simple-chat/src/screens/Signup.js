import styled from "styled-components";
// import { Text } from "react-native";
import { KeyboardAwareScrollView } from "react-native-keyboard-aware-scroll-view";
import { validateEmail, removeWhitespace } from "../utils/common";
import { useRef, useState, useEffect } from "react";
import { Image, Input, Button } from "../components/index.js";
import { images } from "../utils/images";
import { signup } from "../utils/firebase.js";
import { Alert } from "react-native";
import * as ImagePicker from 'expo-image-picker';

const Container = styled.View`
  flex : 1;
  justify-content : center;
  align-items : center;
  background-color : ${({theme}) => theme.background};
  padding : 0 20px;
`

const ErrorText = styled.Text`
  align-items : flex-start;
  width : 90%;
  height : 20px;
  margin-bottom : 10px;
  line-height : 20px;
  color : ${({theme}) => theme.errorText};
`

const Signup = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [passwordConfirm, setPasswordConfirm] = useState('');
  const [errorMessage, setErrorMessage] = useState('');
  const [disabled, setIsDisabled] = useState(true);

  // 프로필 사진 이미지 URL
  const [photoURL, setPhotoURL] = useState(images.photo);
  const emailRef = useRef();
  const passwordRef = useRef();
  const passwordConfirmRef = useRef();
  
  
  useEffect(() => {
    let _errorMessage = '';
    if(!name){
      _errorMessage = 'Please Enter your name';
    } else if(!validateEmail(email)){
      _errorMessage = 'Please verify your email';
    } else if(password.length < 6){
      _errorMessage = 'The password must contain 6 characters at least.';
    } else if(password != passwordConfirm) {
      _errorMessage = 'Password need to match';
    } else{
      _errorMessage = '';
    }
    // setIsDisabled(!(name && email && password && !errorMessage));
    setErrorMessage(_errorMessage);
  },[name, email, password, passwordConfirm, errorMessage]);

  const _handleSignupButtonPress = async() => {
    try {
      const user = await signup({email, password});
      console.log(user);
      Alert.alert('Signup Success',user.email);
    } catch (error) {
      Alert.alert('Signup Error', error.message);
    }
  }
  // 조건에 따라 버튼 활성화 / 비활성화 하기
  useEffect(() => {
    setIsDisabled(
      !(name && email && password && passwordConfirm && !errorMessage));
  },[name, email, password, passwordConfirm, errorMessage])
  // const _handleNameChange = (name) => {
  //   const changedName = removeWhitespace(name);
  //   setName(changedName);
  //   setErrorMessage(
  //     changedName === '' ? 'Please Enter your name' : ''
  //   )
  // }
  //   const _handleEmailChange = (email) => {
  //   const changedEmail = removeWhitespace(email);
  //   setEmail(changedEmail);
  //   setErrorMessage(
  //     validateEmail(changedEmail) ? '' : 'Please verify your email'
  //   )
  // }
  // const _handlePasswordChange = (password) => {
  //   const changedPassword = removeWhitespace(password);
  //   setPassword(changedPassword)
  //   setErrorMessage(
  //     changedPassword.length < 6 ? 'The password must contain 6 characters at least.' : ''
  //   )
  // }
  // const _handlePasswordConfirmChange = (password, passwordConfirm) => {
  //   const changedPassword = removeWhitespace(password);
  //   const changedPasswordConfirm = removeWhitespace(passwordConfirm);
  //   setPassword(changedPassword)
  //   setPasswordConfirm(changedPasswordConfirm)
  //   setErrorMessage(
  //     changedPassword !== changedPasswordConfirm ? 'Password need to match' : ''
  //   )
  // }

  return (
    <KeyboardAwareScrollView
      contentContainerStyle={{flex:1}}    
      extraHeight={80}
      enableOnAndroid={true}
    >
      <Container>
        {/* <Text style={{fontSize : 30}}>Signup Screen</Text> */}
        <Image 
            rounded 
            url={photoURL}
            showButton
            onChangeImage={url => {console.warn(url), setPhotoURL(url)}}
        />
        <Input
          label="Name"
          value={name}
          onChangeText={(text) => setName(text)}
          onSubmitEditing = {() => {
              setName(name.trim());
              emailRef.current.focus();
          }}
          onBlur = {() => setName(name.trim())}
          placeholder="Name"
          returnKeyType="next"
        />
        <Input
          ref={emailRef}
          label="Email"
          value={email}
          onChangeText={(text) => setEmail(text)}
          onSubmitEditing={() => passwordRef.current.focus()}
          placeholder="Email"
          returnKeyType="next"
        />
        <Input
          ref={passwordRef}
          label="Password"
          value={password}
          onChangeText={(text) => setPassword(text)}
          onSubmitEditing={() => passwordConfirmRef.current.focus()}
          placeholder="Password"
          returnKeyType="done"
          isPassword
        />
        <Input
          ref={passwordConfirmRef}
          label="Password Confirm"
          value={passwordConfirm}
          onChangeText={(text) => setPasswordConfirm(text)}
          onSubmitEditing={_handleSignupButtonPress}
          placeholder="Password"
          returnKeyType="done"
          isPassword
        />
        {/* 에러메시지 출력 */}
        <ErrorText>{errorMessage}</ErrorText>

        {/* 회원가입 버튼 */}
        <Button
          title="Signup"
          onPress={_handleSignupButtonPress}
          disabled={disabled}
        />
      </Container>
    </KeyboardAwareScrollView>
  )
}

export default Signup;