import { View, StyleSheet, FlatList, Pressable, Text } from "react-native";
import PostItem from "../components/PostItem";
import FloatingButton from "../components/FloatingButton";
// import posts from "../data/posts";
import { useState, useEffect } from "react";
import axios from "axios";

const BoardScreen = ({navigation}) => {
  console.log('navigation : ',navigation);

  // fetch나 axios를 통해서 읽어온 데이터들을 state에 담아서
  // FlatList에 출력
  const [posts, setPosts] = useState([]);
  const fetchPosts = async () => {
    try {
      const response = await axios.get("http://10.0.2.2:10000/api/posts");
      setPosts(response.data); // 서버에서 받아온 게시글들 저장
      console.log("🔥 받아온 데이터:", response.data);
    } catch (err) {
      console.error("게시글 불러오기 실패:", err);
    }
  };

  
  useEffect(() => {
    const unsubscribe = navigation.addListener('focus', () => {
      fetchPosts();
    });

    return unsubscribe;
  }, [navigation]);

  return (
    <View style={styles.container}>
      {posts.length === 0 ? (
          <View style={styles.container}>
            <Text style={styles.emptyText}>게시글이 없습니다.</Text>
            <FloatingButton onPress={() => navigation.navigate('Write')} />  
          </View>
          
      ) : (
        <View style={{ flex: 1 }}>
          <FlatList
            data={posts}
            keyExtractor={(item) => item.id.toString()}
            renderItem={({ item }) => (
              <Pressable onPress={() => navigation.navigate('Detail', { post: item })}>
                <PostItem post={item} />
              </Pressable>
            )}
          />
          <FloatingButton onPress={() => navigation.navigate('Write')} />
        </View>
      )}
    </View>
  );
};

const styles = StyleSheet.create({
  container : {
    flex : 1,
    backgroundColor : '#121212',
  },
  emptyText : {
    justifyContent : 'center',
    textAlign : 'center',
    fontSize : 20,
    color : 'white',
    alignItems : 'center',
    marginTop : '50%',

  }
})

export default BoardScreen;