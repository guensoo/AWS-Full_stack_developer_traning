package com.korea.rnBoard.dto;

import com.korea.rnBoard.domain.PostEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
	private int id;
	private String title;
	private String author;
	private String description;
	private String time;
	private int views;

    // 생성자(Post -> PostDTO)
    public PostDTO(PostEntity entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.description = entity.getDescription();
        this.time = entity.getTime();
        this.views = entity.getViews();
    }

    // 생성자(PostDTO -> Post)
    public static PostEntity toEntity(PostDTO dto){
        return PostEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .description(dto.getDescription())
                .time(dto.getTime())
                .views(dto.getViews())
                .build();
    }
}
