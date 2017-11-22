package com.loiye.core.bean;

public class HsXh {
    private Integer id;

    private Integer yhId;

    private Integer zjId;

    private Integer zjyhId;

    private Integer zt;

    private String sj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public Integer getZjId() {
        return zjId;
    }

    public void setZjId(Integer zjId) {
        this.zjId = zjId;
    }

    public Integer getZjyhId() {
        return zjyhId;
    }

    public void setZjyhId(Integer zjyhId) {
        this.zjyhId = zjyhId;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }
}