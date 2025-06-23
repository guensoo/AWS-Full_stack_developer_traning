package com.korea.swagger.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.korea.swagger.dto.PostDTO;

@Service
public class PostService {
	
	// 게시글을 저장하는 db라고 가정
	private final Map<Long, PostDTO> postMap = new HashMap<>();
	private Long nextId = 1L;
	
	public PostService() {
		savePost(new PostDTO(null, "첫 번째 게시글"));
		savePost(new PostDTO(null, "두 번째 게시글"));
	}
	
	public List<PostDTO> getAllPosts(){
		return new ArrayList<>(postMap.values());
	}
	
	public PostDTO getPostById(Long id) {
		return postMap.get(id);
	}
	
	public PostDTO savePost(PostDTO postDTO) {
		postDTO.setId(nextId++);
		postMap.put(postDTO.getId(), postDTO);
		return postDTO;
	}
	
	public void deletePostById(Long id) {
		postMap.remove(id);
	}

//	public List<PostDTO> getAllPosts() {
//		return Arrays.asList(
//					new PostDTO(1L, "첫 번째 게시글"),
//					new PostDTO(2L, "두 번째 게시글")
//				);
//	}
	
//	public PostDTO getPostById(Long id) {
//		return new PostDTO(id, "게시글"+id);
//	}
}
