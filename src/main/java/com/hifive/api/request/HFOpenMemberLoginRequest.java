package com.hifive.api.request;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.response.HFOpenMemberLoginResponse;

import java.util.Map;

/**
 * @author meiyang
 * @version 1.0
 * @review meiyang
 * @date 2021-05-10 20:16:42
 **/
public class HFOpenMemberLoginRequest extends HFBaseRequest<HFOpenMemberLoginResponse> {

    /**
     * B端用户APPID
     */
    private String appId;
    /**
     * 会员名称
     */
    private String nickname;
    /**
     * 设备ID
     */
    private String deviceId;
    /**
     * 时间戳
     */
    private Long timestamp;
    /**
     * secret(API装载)
     */
    private String secret;
    /**
     * companyId(API装载)
     */
    private Long companyId;
    /*-----------------------扩展字段-----------------------------------*/
    /**
     * 头像URL
     */
    private String headerUrl;
    /**
     * 性别,未知：0，男：1，女：2
     */
    private Integer gender;
    /**
     * 生日
     */
    private Long birthday;
    /**
     * 经纬度信息，纬度在前(30.779164,103.94547)
     */
    private String location;
    /**
     * 喜欢的歌手名，多个用英文逗号隔开
     */
    private String favoriteSinger;
    /**
     * 手机号
     */
    private String phone;

    @Override
    public String getApiMethodName() {
        return "OpenMemberLogin";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("appId", getAppId());
                put("nickname",getNickname());
                put("deviceId", getDeviceId());
                put("timestamp", getTimestamp());
                put("secret", getSecret());
                put("companyId", getCompanyId());
                put("headerUrl", getHeaderUrl());
                put("gender", getGender());
                put("birthday", getBirthday());
                put("location", getLocation());
                put("favoriteSinger", getFavoriteSinger());
                put("phone", getPhone());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFOpenMemberLoginResponse> getResponseClass() {
        return HFOpenMemberLoginResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFavoriteSinger() {
        return favoriteSinger;
    }

    public void setFavoriteSinger(String favoriteSinger) {
        this.favoriteSinger = favoriteSinger;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
