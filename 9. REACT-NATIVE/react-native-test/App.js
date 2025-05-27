import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Text, View, Button, TextInput, Pressable, Alert } from 'react-native';

export default function App() {
  const [id, setId] = useState('');
  const [password, setPassword] = useState('');
  const [email, setEmail] = useState('');

  const _onPress = () => {
    Alert.alert(`입력된 id는 ${id}, 이메일은 ${email}`)
  }

  return (
    <View style={styles.container}>
      <View style={styles.header}>
        <Text style={styles.headerText}>SmartAppDev</Text>
      </View>
      <View style={styles.middle}>
        <View style={styles.title}>
          <Text style={styles.titleText}>회원가입</Text>
        </View>
        <View style={styles.input} >
          <Text style={styles.inputTitle}>아이디</Text>
          <TextInput style={styles.inputText} value={id} onChangeText={setId} />
        </View>
        <View style={styles.input} >
          <Text style={styles.inputTitle}>비밀번호</Text>
          <TextInput style={styles.inputText} value={password} onChangeText={setPassword} />
        </View>
        <View style={styles.input} >
          <Text style={styles.inputTitle}>이메일</Text>
          <TextInput  style={styles.inputText} value={email} onChangeText={setEmail}/>
        </View>
          <Pressable style={{
                  backgroundColor:'purple',
                  paddingLeft : 80,
                  paddingRight: 80,
                  paddingTop: 10,
                  paddingBottom: 10,
                  marginTop: 30,
                  borderRadius: 6,
              }}
              onPress={_onPress}>
            <Text style={styles.buttonText}>가입하기</Text>
          </Pressable>
      </View>
      <View style={styles.bottom}>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  header:{
    backgroundColor: 'purple',
    textAlign: 'left',
    alignItems: 'center',
    flexDirection: 'row',
    padding: 20,
    width: '100%',
    height: 70,
  },
  headerText:{
    fontSize: 20,
    color: 'white',
    textAlign: 'left',
  },
  title:{
    alignItems: 'center',
    justifyContent: 'center',
    marginBottom: 10,
    paddingBottom: 60,
  },
  titleText:{
    color: 'gray',
    alignItems: 'center',
    justifyContent: 'center',
    fontSize: 30,
    fontWeight: 'bold',
  },
  input:{
    flexDirection: 'row',
    width: 300,
    marginBottom: 25,
    justifyContent: 'space-between',
    alignItems: 'center'
  },
  inputTitle:{
    color: 'gray',
  },
  inputText:{
    textAlign: 'left',
    borderBottomWidth: 1,
    borderBottomColor: 'gray',
    width: 200,
  },
  buttonText:{
    color: 'white',
    textAlign: 'center',
  },
  middle:{
    flex: 2,
    alignItems: 'center',
    justifyContent: 'center',
  },
  bottom:{
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});