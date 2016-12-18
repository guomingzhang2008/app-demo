package com.ryo.service.service;

import com.ryo.dal.model.Article;
import com.ryo.service.bean.ArticleSerBean;

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

    void valid(ArticleSerBean articleSerBean);
}
