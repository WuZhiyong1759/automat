package com.pt.domain;

public class Stu {
    private Integer sId;

    private String sName;

    private String sSlogan;

    private String sSchool;

    private String sIntroduce;

    private String sAvata;

    private String sType;

    private String sCompany;

    private String sRecommand;

    private Integer sStatus;

    private Long createat;

    private Long updateat;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsSlogan() {
        return sSlogan;
    }

    public void setsSlogan(String sSlogan) {
        this.sSlogan = sSlogan == null ? null : sSlogan.trim();
    }

    public String getsSchool() {
        return sSchool;
    }

    public void setsSchool(String sSchool) {
        this.sSchool = sSchool == null ? null : sSchool.trim();
    }

    public String getsIntroduce() {
        return sIntroduce;
    }

    public void setsIntroduce(String sIntroduce) {
        this.sIntroduce = sIntroduce == null ? null : sIntroduce.trim();
    }

    public String getsAvata() {
        return sAvata;
    }

    public void setsAvata(String sAvata) {
        this.sAvata = sAvata == null ? null : sAvata.trim();
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType == null ? null : sType.trim();
    }

    public String getsCompany() {
        return sCompany;
    }

    public void setsCompany(String sCompany) {
        this.sCompany = sCompany == null ? null : sCompany.trim();
    }

    public String getsRecommand() {
        return sRecommand;
    }

    public void setsRecommand(String sRecommand) {
        this.sRecommand = sRecommand == null ? null : sRecommand.trim();
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    public Long getCreateat() {
        return createat;
    }

    public void setCreateat(Long createat) {
        this.createat = createat;
    }

    public Long getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Long updateat) {
        this.updateat = updateat;
    }
}