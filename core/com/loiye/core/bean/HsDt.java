package com.loiye.core.bean;

public class HsDt {
    private Integer id;

    private Integer yhId;

    private Integer dxId;

    private Integer lx;

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

    public Integer getDxId() {
        return dxId;
    }

    public void setDxId(Integer dxId) {
        this.dxId = dxId;
    }

    public Integer getLx() {
        return lx;
    }

    public void setLx(Integer lx) {
        this.lx = lx;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }
}