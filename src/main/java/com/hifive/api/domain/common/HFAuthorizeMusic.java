package com.hifive.api.domain.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 授权曲库歌曲查询接口
 * @author shen_xu
 * @ClassName AuthorizeMusicDTO
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HFAuthorizeMusic {
    /**
     * HIFIVE音乐唯一标识
     */
    private String musicId;

    /**
     * upc
     */
    private String upc;

    /**
     * isrc
     */
    private String isrc;

    /**
     * iswc
     */
    private String iswc;

    /**
     * jan
     */
    private String jan;

    /**
     * jasrac
     */
    private String jasrac;

    /**
     * 歌曲名
     */
    private String musicName;

    /**
     * HIFIVE专辑唯一标识
     */
    private String albumId;

    /**
     * 专辑名称
     */
    private String albumName;

    /**
     * artist
     */
    private List<HifiveMusicPerson> artist;

    /**
     * author
     */
    private List<HifiveMusicPerson> author;

    /**
     * composer
     */
    private List<HifiveMusicPerson> composer;

    /**
     * arranger
     */
    private List<HifiveMusicPerson> arranger;

    /**
     * maker
     */
    private List<HifiveMusicPerson> maker;

    /**
     * mastery
     */
    private List<HifiveMusicPerson> mastery;

    /**
     * 歌曲时长，单位为秒
     */
    private Integer duration;

    /**
     * 推荐试听开始时间，单位为秒
     */
    private Integer auditionBegin;

    /**
     * 推荐试听结束时间，单位为秒
     */
    private Integer auditionEnd;

    /**
     * 节奏
     */
    private Integer bpm;

    /**
     * 标签名称，以“,”间隔
     */
    private String tag;

    /**
     * 版本名称
     */
    private String versionName;

    /**
     * 主版本的musicId
     */
    private String majorVersion;

    /**
     * 音乐介绍
     */
    private String intro;

    /**
     * 歌曲封面
     */
    private String coverUrl;

    /**
     * 歌词
     */
    private HFMusicLyricFile lyric;

    /**
     * 音频文件地址
     */
    private String fileUrl;

    /**
     * mv文件地址
     */
    private String mvUrl;

    /**
     * 波形图文件地址
     */
    private String waveUrl;


}
