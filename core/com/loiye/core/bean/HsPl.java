package com.loiye.core.bean;

public class HsPl {
    private Integer id;

    private Integer fId;

    private Integer zjId;

    private Integer plyhId;

    private Integer dxyhId;

    private Integer dzsl;

    private String plsj;

    private String plnr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getZjId() {
        return zjId;
    }

    public void setZjId(Integer zjId) {
        this.zjId = zjId;
    }

    public Integer getPlyhId() {
        return plyhId;
    }

    public void setPlyhId(Integer plyhId) {
        this.plyhId = plyhId;
    }

    public Integer getDxyhId() {
        return dxyhId;
    }

    public void setDxyhId(Integer dxyhId) {
        this.dxyhId = dxyhId;
    }

    public Integer getDzsl() {
        return dzsl;
    }

    public void setDzsl(Integer dzsl) {
        this.dzsl = dzsl;
    }

    public String getPlsj() {
        return plsj;
    }

    public void setPlsj(String plsj) {
        this.plsj = plsj == null ? null : plsj.trim();
    }

    public String getPlnr() {
        return plnr;
    }

    public void setPlnr(String plnr) {
        this.plnr = plnr == null ? null : plnr.trim();
    }
}