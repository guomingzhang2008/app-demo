package com.ryo.dal.mapper;

import com.ryo.dal.model.Article;
import com.ryo.framework.data.mapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends MyMapper<Article> {
}