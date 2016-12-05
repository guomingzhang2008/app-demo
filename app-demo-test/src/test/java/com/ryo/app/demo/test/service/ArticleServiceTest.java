package com.ryo.app.demo.test.service;

import com.ryo.app.demo.dal.model.Article;
import com.ryo.app.demo.service.ArticleService;
import com.ryo.framework.util.LoggerUtil;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author houbinbin
 * @since 16/12/4
 */
@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-beans.xml",
        "classpath:/spring/applicationContext-aop.xml",
        "classpath:/spring/applicationContext-tx.xml",
        "classpath:/spring/applicationContext-redis.xml",})
public class ArticleServiceTest {

    @Resource
    private ArticleService articleService;

    @Test
    public void queryAllArticlesByPageTest() {
        int pageNum = 1;
        List<Article> articleList = articleService.queryAllArticlesByPage(pageNum);
        log.info("查询结果:{}", articleList);
    }

    @Test
    public void queryArticle() {
        Long id = 1L;
        Article article = articleService.queryArticle(id);
        LoggerUtil.info(log, "query result: {}", article);
    }

    @Test
    public void removeArticleTest() {
        Long id = 1L;
        articleService.removeArticle(id);
    }
}
