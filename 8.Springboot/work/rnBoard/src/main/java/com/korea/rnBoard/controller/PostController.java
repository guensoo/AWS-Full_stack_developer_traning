package com.korea.rnBoard.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.rnBoard.dto.PostDTO;
import com.korea.rnBoard.dto.ResponseDTO;
import com.korea.rnBoard.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController // 화면은 RN으로 구성을 하고 있으니까
// @ResponseBody + @Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {
	
	private final PostService service;
	
	// 전체 조회
	@GetMapping("/posts")
	public ResponseEntity<?> findAll() {
		List<PostDTO> board = service.getAll();
		return ResponseEntity.ok(board);
	}
	
	// 추가
	@PostMapping("/posts")
	public ResponseEntity<?> addPosts(@RequestBody PostDTO dto){
		List<PostDTO> board = service.addPost(dto);
		return ResponseEntity.ok(board);
	}
	
	// id를 통한 게시글 한 건 조회하기("/{id}") (@PathVariable 사용하기)
	@GetMapping("/posts/{id}")
	public ResponseEntity<?> findPostById(@PathVariable("id") int id){
		List<PostDTO> board = service.findPostById(id);
		return ResponseEntity.ok(board);
	}
	
//	@PutMapping("/{id}")
//	public ResponseDTO<?> editPost(@PathVariable("id") int id, @RequestBody PostDTO dto){
//		List<PostDTO> board = service.editPost(id, dto);
//		return ResponseDTO.<PostDTO>builder().data(board).build();
//	}
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<?> deletePost(@PathVariable("id") int id){
//		boolean result = service.deletePost(id);
//		return ResponseEntity.ok().body(result);
//	}

}
