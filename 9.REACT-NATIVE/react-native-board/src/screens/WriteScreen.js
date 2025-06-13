import { useState,useLayoutEffect, useCallback } from "react";
import {View, TextInput, StyleSheet, Pressable, Text, Alert} from 'react-native'
import axios from "axios";


const WriteScreen = ({navigation}) => {
    const [title, setTitle] = useState('');
    const [author, setAuthor] = useState(''); 
    const [description, setDescription] = useState('');

    //백엔드에 요청하는 함수
    const handleSubmit = useCallback(() => {
        //axios, fetch를 써서 우리의 백엔드로 데이터를 보내서 디비에 등록
        console.log('title : ',title,author,description);
        if(!title || !author || !description){
            Alert.alert('모든 항목을 입력하세요');
            return;
        }

        const data = {title,author,description};
        
        axios({
            method : 'post',
            url : 'http://10.0.2.2:10000/api/posts',
            data,
            headers:{
                "Content-Type":"application/json",
            },  
        })
        .then((res) => {
            Alert.alert('게시글이 등록되었습니다.');
            console.log('res : ',res);
            navigation.goBack();
        })
        .catch((error) => {
            console.error("등록 실패:",error);
            Alert.alert('게시글 등록에 실패했습니다.')
        })
    },[title,author,description,navigation]);

    useLayoutEffect(() => {
        if(navigation){
        navigation.setOptions({
            headerRight : () => (
                <Pressable style={{marginRight : 12}} onPress={handleSubmit}>
                    <View style={{
                        backgroundColor : '#2ecc71',
                        paddingHorizontal : 14,
                        paddingVertical : 6,
                        borderRadius : 6,
                    }}>
                        <Text style={{color : 'white', fontWeight:'bold'}}>등록</Text>
                    </View>
                </Pressable>
            )
        })
    }
    },[handleSubmit, navigation]);


    return(
        <View style={styles.container}>
            <TextInput
                placeholder="제목"
                placeholderTextColor="#fff"
                style={styles.titleInput}
                value={title}
                onChangeText={setTitle}
            />

            <TextInput
                placeholder="저자"
                placeholderTextColor="#fff"
                style={styles.titleInput}
                value={author}
                onChangeText={setAuthor}
            />

            <TextInput
                placeholder="내용을 입력하세요"
                placeholderTextColor="#666"
                style={styles.descriptionInput}
                value={description}
                onChangeText={setDescription}
            />
        </View>
    )
}

const styles = StyleSheet.create({
    container : {
        flex : 1,
        backgroundColor : '#121212',
        paddingHorizontal : 16,
        paddingTop : 8,
    },
    titleInput : {
        fontSize : 18,
        fontWeight : 'bold',
        color : '#fff',
        borderBottomWidth : 1,
        borderBottomColor : '#333',
        marginBottom : 12,
        paddingVertical : 8,
    },
    descriptionInput : {
        flex : 1,
        fontSize : 16,
        color : '#fff',
        textAlignVertical : 'top',
    }
});
export default WriteScreen;