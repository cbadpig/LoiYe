package com.loiye.core.bean;

public class HsSx {
    private Integer id;

    private Integer sxyhId;

    private Integer dxyhId;

    private Integer zt;

    private String sj;

    private String nr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSxyhId() {
        return sxyhId;
    }

    public void setSxyhId(Integer sxyhId) {
        this.sxyhId = sxyhId;
    }

    public Integer getDxyhId() {
        return dxyhId;
    }

    public void setDxyhId(Integer dxyhId) {
        this.dxyhId = dxyhId;
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

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr == null ? null : nr.trim();
    }
}