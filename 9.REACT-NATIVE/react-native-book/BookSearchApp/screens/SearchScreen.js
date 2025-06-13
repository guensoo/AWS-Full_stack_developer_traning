import { useState } from 'react';
import { View, TextInput, Button, FlatList, Alert, StyleSheet } from 'react-native';
import { searchBooks } from '../api/naverApi';
import BookItem from '../components/BookItem';

const SearchScreen = ({ navigation }) => {
  const [query, setQuery] = useState('');
  const [results, setResults] = useState([]);

  const handleSearch = async () => {
    try {
      const books = await searchBooks(query);
      if (books.length === 0) {
        Alert.alert('검색 결과가 없습니다.');
      }
      setResults(books);
    } catch (error) {
      Alert.alert(error, '오류 발생');
    }
  };

  return (
    <View style={styles.container}>
      <View style={styles.searchRow}>
        <TextInput
          style={styles.input}
          placeholder="검색어를 입력하세요"
          value={query}
          onChangeText={setQuery}
          autoCapitalize='none'
        />
        <Button title="검색" onPress={handleSearch} />
      </View>

      <FlatList
        data={results}
        keyExtractor={(item, index) => index.toString()}
        renderItem={({ item }) => (
          <BookItem
            item={item}
            onPress={() => navigation.navigate('Detail', { item })}
          />
        )}
      />
    </View>
  );
};

export default SearchScreen;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'lightgray',
    padding: 10,
  },
  searchRow: {
    flexDirection: 'row',
  },
  input: {
    flex: 1,
    borderWidth: 1,
    borderColor: '#ddd',
    marginRight: 8,
    paddingHorizontal: 10,
    height: 40,
  },
});
