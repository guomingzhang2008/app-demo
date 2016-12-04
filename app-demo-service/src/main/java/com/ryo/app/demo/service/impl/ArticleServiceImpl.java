package com.ryo.app.demo.service.impl;

import com.ryo.app.demo.dal.model.Article;
import com.ryo.app.demo.service.ArticleService;
import com.ryo.framework.business.service.BaseService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author houbinbin
 * @since 16/12/4
 */
@Service
public class ArticleServiceImpl extends BaseService<Article> implements ArticleService {

  @Override
  public List<Article> queryAllArticlesByPage(int pageNum) {
    Example example = new Example(Article.class);
    example.setOrderByClause("id DESC");
    return super.queryByExample4Page(pageNum, example);
  }

}
