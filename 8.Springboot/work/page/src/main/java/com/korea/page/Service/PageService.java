package com.korea.page.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.page.DTO.PageDTO;
import com.korea.page.Repository.PageRepository;
import com.korea.page.model.PageEntity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Service
public class PageService {
	private final PageRepository repository;
	
	public List<PageDTO> showAccount(){
		List<PageEntity> member = repository.findAll();
		return member.stream().map(PageDTO::new).collect(Collectors.toList());
	}
	
	public List<PageDTO> filterAccount(String email){
		List<PageEntity> member = repository.findAll();
		if(email != null) {
			member = member.stream().filter(members -> email.equals(members.getEmail())).collect(Collectors.toList());
		}
		return member.stream().map(PageDTO::new).collect(Collectors.toList());
	}
	
	public List<PageDTO> addAccount(PageDTO dto){
		   PageEntity entity = PageDTO.toEntity(dto);
		   repository.save(entity);
		return repository.findAll().stream().map(PageDTO::new).collect(Collectors.toList());
	}
	
	public List<PageDTO> editAccount(String id, PageDTO dto){
		Optional<PageEntity> optionalEntity = repository.findById(id);
		   if(optionalEntity.isPresent()) {
			   PageEntity entity = optionalEntity.get();
			   entity.setPassword(dto.getPassword());
			   repository.save(entity);
		   }
		   return repository.findAll().stream().map(PageDTO::new).collect(Collectors.toList());
	}
	
	public List<PageDTO> deleteAccount(int id){
		repository.findById(id).ifPresent(repository::delete);
		return repository.findAll().stream().map(PageDTO::new).collect(Collectors.toList());
	}

}
