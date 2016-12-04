CREATE DATABASE `blog_view`
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE `blog_view`;

DROP TABLE IF EXISTS `blog_view`.`article`;
CREATE TABLE `blog_view`.`article`
(
  id            BIGINT(20) AUTO_INCREMENT NOT NULL
  COMMENT '主键, 自增',
  title         VARCHAR(256)              NOT NULL
  COMMENT '标题',
  summary       VARCHAR(512)              NOT NULL         DEFAULT ''
  COMMENT '摘要',
  body          LONGTEXT                  NOT NULL
  COMMENT '内容',
  category_code VARCHAR(16)               NOT NULL
  COMMENT '栏目代码',
  category_name VARCHAR(32)               NOT NULL
  COMMENT '栏目名称',
  created_time  DATETIME                  NOT NULL
  COMMENT '创建时间',
  updated_time  DATETIME                                   DEFAULT NULL
  COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
)
  COMMENT '文章表';