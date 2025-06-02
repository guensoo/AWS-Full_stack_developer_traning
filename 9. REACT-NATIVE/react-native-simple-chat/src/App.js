// 최상위 컴포넌트가 사용될 컴포넌트
import {StatusBar} from 'react-native';
import {ThemeProvider} from 'styled-components';
import { theme } from './theme';

const App = () => {
  return (
    // 스타일드 컴포넌트의 ThemeProvider 컴포넌트를 사용해
    // 스타일드 컴포넌트에서 정의된 theme를 사용할 수 있도록 작성했다.
    <ThemeProvider theme={theme}>
      <StatusBar barStyle={'dark-comtent'}/>
    </ThemeProvider>
  )
}

export default App;