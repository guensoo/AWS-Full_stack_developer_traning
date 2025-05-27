import styled from 'styled-components';
import Counter from './components/Counter';
import Parent from './components/Parent';
import Form from './components/Form';
import { useEffect, useState } from 'react';
import { Button } from 'react-native';
import ScrollEnd from './components/ScrollEnd';
import Length from './components/Length';
import AverageCalculator from './components/Average';
import Dog from './components/Dog';
import LengthRepeat from './components/LengthRepeat';

const Container = styled.View`
  flex: 1;
  background-color: #fff;
  justify-content : center;
  align-items : center;
`

const App = () => {
  const [display, setDisplay] = useState(true);
  const [hide, setHide] = useState('Hide');

  console.log(display);

  // const _onPress = () => {
  //   hide === 'Hide' ? setHide('Show') : setHide('Hide');
  // }

  return (
  <Container>
    {/* <Counter /> */}
    {/* <Parent /> */}
    {/* 버튼을 하나 만들고, title은 Hide, Form이 안보일 때는 Show
        버튼을 눌렀을 때 Form을 숨기거나, 보이게 만들기 */}
    {/* <Button title={hide} onPress={_onPress}/>
    {hide === 'Hide' ? <Form /> : ''} */}
    {/* <Button title={display ? 'Hide':'Show'} onPress={() => setDisplay(prev => !prev)} />
      {display && <Form />}
      <ScrollEnd /> */}
      {/* <Length /> */}
      {/* <AverageCalculator /> */}
      {/* <Dog /> */}
      <LengthRepeat />
  </Container>
  )
}

export default App;