package com.bgamq.sso.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel
@Data
public class DateTime {

    /**
     * 创建时间戳 秒
     */
    private String dateCreated;
    /**
     * 更新时间戳 秒
     */
    private String dateModified;
}
