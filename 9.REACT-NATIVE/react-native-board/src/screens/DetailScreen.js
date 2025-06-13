import { View, Text, StyleSheet } from "react-native";

const DetailScreen = ({route}) => {
  const {post} = route.params;

  return(
    <View style={styles.container}>
      <Text style={styles.title}>{post.title}</Text>
      <Text  style={styles.meta}>
        작성자 : {post.author} {post.time} 조회수{post.views}
      </Text>
      <Text style={styles.description}>{post.description}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  container : {
    flex : 1,
    backgroundColor : '#121212',
    padding : 16,
  },
  title : {
    color : '#fff',
    fontSize : 22,
    fontWeight : 'bold',
    marginBottom : 8,
  },
  meta : {
    color : '#999',
    marginBottom : 12,
  },
  description : {
    color : '#fff',
    fontSize : 16,
    lineHeight : 24,
  }
})

export default DetailScreen;