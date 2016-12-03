
> 简介

一个基础的maven多模块示范。

## dao

- domain 对应实体类

- mapper mybatis SQL

## service

- 主要是 CRUD 等操作， 依赖于 dao

## biz

- 业务逻辑层，依赖于service

## web

- web

## util

- 工具类

## test

- 集成测试层


> 约定

- 所有的 spring 配置文件必须以 ```applicationContext-*``` 形式命名

- pom 文件中插件版本的统一管理,需引入另外一个jar包 ```framework-plugin-pom```

> branch manage

- 每个小版本开启一个分支, 在分支上开发。

- 开发完成合并到master上。




