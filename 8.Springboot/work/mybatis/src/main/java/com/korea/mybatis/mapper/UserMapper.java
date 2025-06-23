package com.korea.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.korea.mybatis.domain.User;

@Mapper // 자동으로 bean으로 등록이 된다.
public interface UserMapper {

	@Select("SELECT * FROM 'user'")
	List<User> findAll(); // 전체 유저 조회
	
	@Select("SELECT * FROM 'user' WHERE id=#{id}")
	User findById(Long id); // id를 통한 유저 한 건 조회
	
	@Insert("INSERT INTO 'user'(name,email) values(#{name},#{email})")
	void insert(User user); // 유저 추가하기
	void update(User user); // 유저 수정하기
	void delete(Long id); // 유저 삭제하기
}
