package com.hifive.api.domain.constants;

/***
 *
 * @author yong.huang
 */
public enum SearchSmartEnum {

    /**
     * 不智能分词
     */
    NO(0),
    /**
     * 智能分词
     */
    YES(1);

    Integer value;


    SearchSmartEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
