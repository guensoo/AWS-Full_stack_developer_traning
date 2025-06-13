package com.korea.rnBoard.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.rnBoard.domain.PostEntity;
import com.korea.rnBoard.dto.PostDTO;
import com.korea.rnBoard.repository.PostRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Service
// final이나 @nonull로 정의된 필드를 매개변수로 갖는 생성자를 만들어 준다.
public class PostService {

	private final PostRepository repository;

	// 전체 조회
	public List<PostDTO> getAll() {
		List<PostEntity> board = repository.findAll();
		return board.stream().map(PostDTO::new).collect(Collectors.toList());
	}

	// 
	public List<PostDTO> addPost(PostDTO dto) {
		PostEntity board = PostDTO.toEntity(dto);  
		repository.save(board);
		return repository.findAll().stream().map(PostDTO::new).collect(Collectors.toList());
	}

	public boolean deletePost(int id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

	public List<PostDTO> findPostById(int id) {
		Optional<PostEntity> board = repository.findById(id);
		if(board.isPresent()) {
			return board.stream().map(PostDTO::new).collect(Collectors.toList());
		} else {
			throw new RuntimeException("게시글이 없습니다.");
		}
		
	}

	public List<PostDTO> editPost(int id, PostDTO dto) {
		Optional<PostEntity> entity = repository.findById(id);
		PostEntity post = entity.get();
		post.setTitle(dto.getTitle());
		post.setAuthor(dto.getAuthor());
		// private String description;
		post.setDescription(dto.getDescription());
		repository.save(post);
		return repository.findById(id).stream().map(PostDTO::new).collect(Collectors.toList());
	}
}
