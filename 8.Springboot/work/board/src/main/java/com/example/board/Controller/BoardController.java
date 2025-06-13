package com.example.board.Controller;

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

import com.example.board.DTO.BoardDTO;
import com.example.board.DTO.ResponseDTO;
import com.example.board.Service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/board")
public class BoardController {
	private final BoardService service;
	
	// 게시물 전체 조회 기능 만들기
	// 포스트맨으로 기능 확인하기
	// board-react-app에서 우리의 백엔드로 요청하여 결과 받아오기
	
	@GetMapping("/all")
	public ResponseEntity<?> findAll() {
		List<BoardDTO> board = service.getAll();
		return ResponseEntity.ok(board);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addPosts(@RequestBody BoardDTO dto){
		List<BoardDTO> board = service.addPost(dto);
		return ResponseEntity.ok(board);
	}
	
	// id를 통한 게시글 한 건 조회하기("/{id}") (@PathVariable 사용하기)
	@GetMapping("/{id}")
	public ResponseEntity<?> findPostById(@PathVariable("id") Long id){
		List<BoardDTO> board = service.findPostById(id);
		return ResponseEntity.ok(board);
	}
	
	@PutMapping("/{id}")
	public ResponseDTO<?> editPost(@PathVariable("id") Long id, @RequestBody BoardDTO dto){
		List<BoardDTO> board = service.editPost(id, dto);
		return ResponseDTO.<BoardDTO>builder().data(board).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePost(@PathVariable("id") Long id){
		boolean result = service.deletePost(id);
		return ResponseEntity.ok().body(result);
//		try {
//			List<BoardDTO> board = service.deletePost(id);
//			return ResponseEntity.ok(ResponseDTO.<BoardDTO>builder()
//	                .data(board) 
//	                .error(null)
//	                .build());
//		} catch (Exception e) {
//			return ResponseEntity.body(ResponseDTO.<BoardDTO>builder()
//	                .data(null)
//	                .error("삭제 실패: " + e.getMessage())
//	                .build());
//		}
	}
}
