import { Text, Image, ScrollView, StyleSheet } from 'react-native';

const DetailScreen = ({ route }) => {
  const { item } = route.params;

  return (
    <ScrollView contentContainerStyle={styles.container}>
      <Image source={{ uri: item.image }} style={styles.image} />

      <Text style={styles.title}>{item.title}</Text>
      <Text style={styles.author}>저자: {item.author}</Text>
      <Text style={styles.discount}>가격: {item.discount}</Text>

      <Text style={styles.description}>
        {item.description}
      </Text>
    </ScrollView>
  );
};

export default DetailScreen;

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'lightgray',
    padding: 16,
    backgroundColor: '#fff',
  },
  image: {
    width: 220,
    height: 300,
    alignSelf: 'center',
    marginBottom: 20,
  },
  title: {
    fontSize: 22,
    fontWeight: 'bold',
    marginBottom: 8,
  },
  author: {
    fontSize: 16,
  },
  discount: {
    fontSize: 16,
    marginBottom: 10,
  },
});
