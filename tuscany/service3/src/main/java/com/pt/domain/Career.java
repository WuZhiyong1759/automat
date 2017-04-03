package com.pt.domain;

import java.io.Serializable;

public class Career implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7254074962906631432L;
	private Integer cId;

    private String cName;
    
    private String cType;

    public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	private String cDescri;

    private Integer cDegree;

    private Integer cLevel;

    private String cTime;

    private Integer cCount;

    private Integer cRare;

    private String cSalary1;

    private String cSalary2;

    private String cSalary3;

    private Integer cStu;

    private String cTips;

    private String cIntroduce;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcDescri() {
        return cDescri;
    }

    public void setcDescri(String cDescri) {
        this.cDescri = cDescri == null ? null : cDescri.trim();
    }

    public Integer getcDegree() {
        return cDegree;
    }

    public void setcDegree(Integer cDegree) {
        this.cDegree = cDegree;
    }

    public Integer getcLevel() {
        return cLevel;
    }

    public void setcLevel(Integer cLevel) {
        this.cLevel = cLevel;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime == null ? null : cTime.trim();
    }

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
    }

    public Integer getcRare() {
        return cRare;
    }

    public void setcRare(Integer cRare) {
        this.cRare = cRare;
    }

    public String getcSalary1() {
        return cSalary1;
    }

    public void setcSalary1(String cSalary1) {
        this.cSalary1 = cSalary1 == null ? null : cSalary1.trim();
    }

    public String getcSalary2() {
        return cSalary2;
    }

    public void setcSalary2(String cSalary2) {
        this.cSalary2 = cSalary2 == null ? null : cSalary2.trim();
    }

    public String getcSalary3() {
        return cSalary3;
    }

    public void setcSalary3(String cSalary3) {
        this.cSalary3 = cSalary3 == null ? null : cSalary3.trim();
    }

    public Integer getcStu() {
        return cStu;
    }

    public void setcStu(Integer cStu) {
        this.cStu = cStu;
    }

    public String getcTips() {
        return cTips;
    }

    public void setcTips(String cTips) {
        this.cTips = cTips == null ? null : cTips.trim();
    }

    public String getcIntroduce() {
        return cIntroduce;
    }

    public void setcIntroduce(String cIntroduce) {
        this.cIntroduce = cIntroduce == null ? null : cIntroduce.trim();
    }
}