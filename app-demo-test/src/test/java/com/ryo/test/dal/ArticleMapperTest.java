package com.ryo.test.dal;

import com.ryo.dal.mapper.ArticleMapper;
import com.ryo.dal.model.Article;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author houbinbin
 * @since 16/12/4
 */
@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-dal.xml"})
public class ArticleMapperTest {

  private static final Logger logger = LogManager.getLogger(ArticleMapperTest.class);

  @Autowired
  private ArticleMapper articleMapper;

  @Test
  public void selectAllTest() {
    List<Article> articleList = articleMapper.selectAll();
    logger.info("result:{}", articleList);
  }

}
