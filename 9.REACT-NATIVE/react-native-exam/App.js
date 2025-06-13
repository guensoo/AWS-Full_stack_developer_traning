import { StyleSheet, Text, View, SafeAreaView } from 'react-native';
import SignupScreen from './src/components/SignupScreen';

export default function App() {
  return (
    <SafeAreaView style={styles.container}>
      <SignupScreen />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
