package com.ryo.util;

/**
 * Created by houbinbin on 16/7/4.
 */
public class PageUtil {
    private PageUtil() {
    }

    /**
     * 获取总页数
     *
     * @param totalCount
     * @param pageSize
     * @return
     */
    public static Integer getTotalPage(Integer totalCount, Integer pageSize) {
        return (totalCount % pageSize == 0) ? (totalCount / pageSize) : (totalCount / pageSize + 1);
    }

    public static Integer getCurrentPage(Integer firstResult, Integer maxResults) {
        return (firstResult / maxResults) + 1;
    }

    public static Integer getFirstResult(Integer pageNow, Integer maxResults) {
        return (pageNow - 1) * maxResults;
    }
}
