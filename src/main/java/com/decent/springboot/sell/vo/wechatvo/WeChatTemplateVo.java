package com.decent.springboot.sell.vo.wechatvo;

import lombok.Data;

/**
 * @author jiangyu
 * @date 2019/6/26 21:28
 * @email jiangyu9633@foxmail.com
 */
@Data
public class WeChatTemplateVo {
    private String touser;
    private String templateId;
    private String topColor;
    private String url;
    private TemplateData data;

}