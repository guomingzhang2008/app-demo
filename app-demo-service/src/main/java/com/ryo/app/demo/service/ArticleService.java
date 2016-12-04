package com.ryo.app.demo.service;

import com.ryo.app.demo.dal.model.Article;

import java.util.List;

/**
 * @author houbinbin
 * @on 16/12/4
 */
public interface ArticleService {

  /**
   * 分页查询
   * @param pageNum 当前页数
   * @return
   */
  List<Article> queryAllArticlesByPage(int pageNum);

}
