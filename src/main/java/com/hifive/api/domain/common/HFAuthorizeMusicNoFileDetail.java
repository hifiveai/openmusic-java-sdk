package com.hifive.api.domain.common;

import com.hifive.api.domain.common.base.HFBaseMusic;
import com.hifive.api.domain.common.es.EsCover;
import com.hifive.api.internal.mapping.ApiField;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

public class HFAuthorizeMusicNoFileDetail extends HFBaseMusic {
    /**
     * UPC
     */
    @ApiField("upc")
    private String upc;

    /**
     * ISRC
     */
    @ApiField("isrc")
    private String isrc;

    /**
     * ISWC
     */
    @ApiField("iswc")
    private String iswc;

    /**
     * JAN
     */
    @ApiField("jan")
    private String jan;

    /**
     * JASRAC
     */
    @ApiField("jasrac")
    private String jasrac;

    /**
     * TAG
     */
    @ApiListField("tag")
    private String tag;

    /**
     * 版本名称
     */
    @ApiField("versionName")
    private String versionName;

    /**
     * 主版本
     */
    @ApiField("majorVersion")
    private String majorVersion;

    /**
     * 歌曲介绍
     */
    @ApiField("intro")
    private String intro;

    /**
     * 版本
     */
    @ApiListField("version")
    private List<HFMusicVersion> version;


    /**
     * 封面列表
     **/
    @ApiListField("cover")
    private List<EsCover> cover;


    /**
     * 表演者
     */
    @ApiListField("artist")
    private List<HifiveMusicPerson> artist;
    /**
     * 作词
     */
    @ApiListField("author")
    private List<HifiveMusicPerson> author;
    /**
     * 作曲
     */
    @ApiListField("composer")
    private List<HifiveMusicPerson> composer;
    /**
     * 编曲
     */
    @ApiListField("arranger")
    private List<HifiveMusicPerson> arranger;

    /**
     * 制作人
     */
    @ApiListField("mastery")
    private List<HifiveMusicPerson> mastery;

    /**
     * MV制作人
     */
    @ApiListField("maker")
    private List<HifiveMusicPerson> maker;


    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getIswc() {
        return iswc;
    }

    public void setIswc(String iswc) {
        this.iswc = iswc;
    }

    public String getJan() {
        return jan;
    }

    public void setJan(String jan) {
        this.jan = jan;
    }

    public String getJasrac() {
        return jasrac;
    }

    public void setJasrac(String jasrac) {
        this.jasrac = jasrac;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<HFMusicVersion> getVersion() {
        return version;
    }

    public void setVersion(List<HFMusicVersion> version) {
        this.version = version;
    }

    public List<EsCover> getCover() {
        return cover;
    }

    public void setCover(List<EsCover> cover) {
        this.cover = cover;
    }

    public List<HifiveMusicPerson> getArtist() {
        return artist;
    }

    public void setArtist(List<HifiveMusicPerson> artist) {
        this.artist = artist;
    }

    public List<HifiveMusicPerson> getAuthor() {
        return author;
    }

    public void setAuthor(List<HifiveMusicPerson> author) {
        this.author = author;
    }

    public List<HifiveMusicPerson> getComposer() {
        return composer;
    }

    public void setComposer(List<HifiveMusicPerson> composer) {
        this.composer = composer;
    }

    public List<HifiveMusicPerson> getArranger() {
        return arranger;
    }

    public void setArranger(List<HifiveMusicPerson> arranger) {
        this.arranger = arranger;
    }

    public List<HifiveMusicPerson> getMastery() {
        return mastery;
    }

    public void setMastery(List<HifiveMusicPerson> mastery) {
        this.mastery = mastery;
    }

    public List<HifiveMusicPerson> getMaker() {
        return maker;
    }

    public void setMaker(List<HifiveMusicPerson> maker) {
        this.maker = maker;
    }
}

