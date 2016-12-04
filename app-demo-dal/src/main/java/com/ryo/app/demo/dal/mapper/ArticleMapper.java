package com.ryo.app.demo.dal.mapper;

import com.ryo.app.demo.dal.model.Article;
import com.ryo.framework.data.mapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends MyMapper<Article> {
}