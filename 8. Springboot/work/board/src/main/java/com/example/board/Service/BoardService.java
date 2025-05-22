package com.example.board.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.board.DTO.BoardDTO;
import com.example.board.Entity.BoardEntity;
import com.example.board.Repository.BoardRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Service
public class BoardService {
	private final BoardRepository repository;
	
	// 전체 조회
	public List<BoardDTO> getAll() {
		List<BoardEntity> board = repository.findAll();
		return board.stream().map(BoardDTO::new).collect(Collectors.toList());
	}

	// 
	public List<BoardDTO> addPost(BoardDTO dto) {
		BoardEntity board = BoardDTO.toEntity(dto);  
		repository.save(board);
		return repository.findAll().stream().map(BoardDTO::new).collect(Collectors.toList());
	}

	public boolean deletePost(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
		
		// repository.findById(id).ifPresent(repository::delete);
		
		// return repository.findAll().stream().map(BoardDTO::new).collect(Collectors.toList());
	}

	public List<BoardDTO> findPostById(Long id) {
		Optional<BoardEntity> board = repository.findById(id);
		// BoardEntity entity = null;
		if(board.isPresent()) {
			// if(option.isPresent()){
			// entity = option.get();
			// }
			// BoardDTO dto = BoardDTO.fromEntity(entity);
			// List<BoardDTO> list = Arrays.aslist(dto);
			// return list;
			return board.stream().map(BoardDTO::new).collect(Collectors.toList());
		} else {
			throw new RuntimeException("게시글이 없습니다.");
		}
		
	}

	public List<BoardDTO> editPost(Long id, BoardDTO dto) {
		Optional<BoardEntity> entity = repository.findById(id);
		BoardEntity board = entity.get();
		board.setTitle(dto.getTitle());
		board.setAuthor(dto.getAuthor());
		board.setContent(dto.getContent());
		repository.save(board);
		return repository.findById(id).stream().map(BoardDTO::new).collect(Collectors.toList());
	}

}
