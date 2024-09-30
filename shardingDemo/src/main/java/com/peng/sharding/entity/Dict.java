package com.peng.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/9/30 21:45
 */
@TableName("dict")
public class Dict {
    private Long dictid;
    private String dictkey;
    private String dictval;

    @Override
    public String toString() {
        return "Dict{" +
                "dictId=" + dictid +
                ", dictkey='" + dictkey + '\'' +
                ", dictval='" + dictval + '\'' +
                '}';
    }

    public Long getDictid() {
        return dictid;
    }

    public void setDictid(Long dictid) {
        this.dictid = dictid;
    }

    public String getDictkey() {
        return dictkey;
    }

    public void setDictkey(String dictkey) {
        this.dictkey = dictkey;
    }

    public String getDictval() {
        return dictval;
    }

    public void setDictval(String dictval) {
        this.dictval = dictval;
    }
}

