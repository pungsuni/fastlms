package com.zerobase.fastlms.course.controller;

import com.zerobase.fastlms.util.PageUtil;

public class BaseController {

    public String getPagerHtml(long totalCount, long pageSize, Long pageIndex, String queryString) {
        PageUtil pageUtil = new PageUtil(totalCount,pageSize, pageIndex, queryString);

        return pageUtil.pager();
    }


}
