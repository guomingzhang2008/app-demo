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
     *
     * @param pageNum 当前页数
     * @return
     */
    List<Article> queryAllArticlesByPage(int pageNum);


    /**
     * 查询文章
     * @param id
     * @return
     */
    Article queryArticle(Long id);

    /**
     * 移除文章
     * @param id
     * @return
     */
    void removeArticle(Long id);


    /**
     * 移除文章
     * @param article
     * @return
     */
    Article editArticle(Article article);


    /**
     * 清除缓存
     */
    void clearCache();
}
