package com.rest.proj.domain.article.dto;

import com.rest.proj.domain.article.entity.Article;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ArticleDto {
    private final Long id;
    private final String subject;
    private final String author;
    private final LocalDateTime createDate;
    private final LocalDateTime modifyDate;

    public ArticleDto(Article article) {
        this.id = article.getId();
        this.subject = article.getSubject();
        this.author = article.getAuthor().getUserName();
        this.createDate = article.getCreatedDate();
        this.modifyDate = article.getModifiedDate();
    }
}
