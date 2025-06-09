import styled from 'styled-components/native';

const Button = styled.TouchableOpacity`
  width : 80%;
  padding : 14px;
  background-color : ${({backgroundColor}) =>
    backgroundColor ? backgroundColor : '#3498db'};
  margin: 10px 0;
  border-radius: 8px;
  align-items: center;
`;

const ButtonText = styled.Text`
  color: white;
  font-weight: bold;
`;

const CustomButton = ({title, onPress, backgroundColor}) => {
  return (
    <Button
      onPress={onPress}
      backgroundColor={backgroundColor}
    >
      <ButtonText>{title}</ButtonText>
    </Button>
  );
};

export default CustomButton;
