import { NavigationContainer } from '@react-navigation/native';
import StackNavigator from './navigation/StackNavigator';

const App = () => {
  return (
    <NavigationContainer>
      <StackNavigator />
    </NavigationContainer>
  );
};

export default App;