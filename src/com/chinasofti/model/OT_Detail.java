package com.chinasofti.model;

public class OT_Detail {//�����ο���Ϣ��
    private Integer otid;//�����ο���Ϣ��ţ�����������

    private String odid;//������ţ����

    private String touristid;//�ο���Ϣ��ţ����

    public Integer getOtid() {
        return otid;
    }

    public void setOtid(Integer otid) {
        this.otid = otid;
    }

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid == null ? null : odid.trim();
    }

    public String getTouristid() {
        return touristid;
    }

    public void setTouristid(String touristid) {
        this.touristid = touristid == null ? null : touristid.trim();
    }
}