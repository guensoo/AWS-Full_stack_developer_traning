package com.korea.page.Controller;

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

import com.korea.page.DTO.PageDTO;
import com.korea.page.DTO.ResponseDTO;
import com.korea.page.Service.PageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("pages")
public class PageController {
	private final PageService service;
	
	@GetMapping("/signin")
	public ResponseEntity<?> findById(){
		try {
			List<PageDTO> member = service.showAccount();
			return ResponseEntity.ok(member);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<PageDTO> response = ResponseDTO.<PageDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
		
	}
	
	@GetMapping("/{email}")
	public ResponseEntity<?> findByEmail(@PathVariable String email){
		try {
			List<PageDTO> member = service.filterAccount(email);
			return ResponseEntity.ok(member);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<PageDTO> response = ResponseDTO.<PageDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> addMember(@RequestBody PageDTO dto) {
		
		try {
			List<PageDTO> member = service.addAccount(dto);
			return ResponseEntity.ok(member);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<PageDTO> response = ResponseDTO.<PageDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	@PutMapping("/{email}")
	public ResponseEntity<?> editMember(@PathVariable String email, @RequestBody PageDTO dto) {
		try {
			List<PageDTO> member = service.editAccount(email, dto);
			return ResponseEntity.ok(member);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<PageDTO> response = ResponseDTO.<PageDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
		
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteMember(@PathVariable int id){
		try {
			List<PageDTO> member = service.deleteAccount(id);
			return ResponseEntity.ok(member);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<PageDTO> response = ResponseDTO.<PageDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
}
