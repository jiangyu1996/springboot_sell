package com.decent.springboot.sell.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jiangyu
 * @date 2019/6/30 21:22
 * @email jiangyu9633@foxmail.com
 */
@Data
public class WeChatUserInfoVo implements Serializable {

    private static final long serialVersionUID = -5137842373014512336L;
    /**
     * 用户的唯一标识
     */
    private String openid;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    private String sex;
    /**
     * 用户个人资料填写的省份
     */
    private String province;
    /**
     * 普通用户个人资料填写的城市
     */
    private String city;
    /**
     * 国家，如中国为CN
     */
    private String country;
    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     */
    private String headimgurl;
    /**
     * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     */
    private String privilege;
    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     */
    private String unionid;


}