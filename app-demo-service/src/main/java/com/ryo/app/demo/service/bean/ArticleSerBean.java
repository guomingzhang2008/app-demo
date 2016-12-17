package com.ryo.app.demo.service.bean;

import com.ryo.framework.checker.annotation.Valid;
import lombok.Data;

/**
 * @author houbinbin
 * @on 16/12/17
 */
@Data
public class ArticleSerBean {

    @Valid(errMsg = "ID不可为空")
    private Long id;

    @Valid(maxLen = 10, errMsg = "标题输入不符合约定")
    private String title;

}