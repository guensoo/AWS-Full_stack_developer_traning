import { View, Text, Image, StyleSheet, Pressable } from 'react-native';

const BookItem = ({ item, onPress }) => {
  return (
    <Pressable onPress={onPress}>
      <View style={styles.container}>
        <Image source={{ uri: item.image }} style={styles.image} />
        <View>
          <Text style={styles.title}>
            {item.title}
          </Text>
          <Text>{item.author}</Text>
        </View>
      </View>
    </Pressable>
  );
};

export default BookItem;

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    backgroundColor: 'lightgray',
    padding: 10,
    borderBottomWidth: 1,
    borderColor: '#eee',
  },
  image: {
    width: 60,
    height: 90,
    marginRight: 10,
  },
  title: {
    fontWeight: 'bold',
    fontSize: 14,
  },
});
