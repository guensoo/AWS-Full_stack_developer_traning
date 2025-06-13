import styled from 'styled-components';

const Input = styled.TextInput`
  width : 80%;
  padding : 12px;
  margin : 10px 0;
  border : 1px solid #ccc;
  border-radius : 8px;
`;

const CustomInput = ({ placeholder, value, onChangeText, secureTextEntry }) => {
  return (
    <Input
      placeholder={placeholder}
      value={value}
      onChangeText={onChangeText}
      secureTextEntry={secureTextEntry}
      autoCapitalize="none"
      autoCorrect={false}
    />
  );
};

export default CustomInput;
