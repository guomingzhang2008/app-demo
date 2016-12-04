package com.ryo.app.demo.service.impl;

import com.ryo.app.demo.dal.model.Article;
import com.ryo.app.demo.service.ArticleService;
import com.ryo.framework.business.service.BaseService;
import com.ryo.framework.util.LoggerUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author houbinbin
 * @since 16/12/4
 */
@Service
@Log4j2
public class ArticleServiceImpl extends BaseService<Article> implements ArticleService {

  @Override
  public List<Article> queryAllArticlesByPage(int pageNum) {
    Example example = new Example(Article.class);
    example.setOrderByClause("id DESC");
    return super.queryByExample4Page(pageNum, example);
  }

  /**
   * @Cacheable triggers cache population
   */
  @Cacheable(value = "article", key = "'article_id_' + #id")
  @Override
  public Article queryArticle(Long id) {
    Article article = new Article();
    article.setId(id);
    article.setBody("queryArticle");
    LoggerUtil.info(log, "queryArticle:{}", id);
    return article;
  }

  @CacheEvict(value = "article", key = "'article_id_'+#id")
  @Override
  public void removeArticle(Long id) {
    LoggerUtil.info(log, "removeArticle:{}", id);
  }

  /**
   * updated without interfering with the method execution
   * - 将返回的结果,放入缓存
   */
  @CachePut(value = "article", key = "'article_id_'+#article.getId()")
  @Override
  public Article editArticle(Article article) {
    LoggerUtil.info(log, "editArticle:{}", article);
    article.setBody("new body");
    return article;
  }

  @CacheEvict(value = "article", allEntries = true)
  @Override
  public void clearCache() {
    LoggerUtil.info(log, "clear all articles cache");
  }

}
