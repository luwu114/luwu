package com.chinasofti.model;

public class Tourist {//�ο���Ϣ��
    private String touristid;//�ο���Ϣ��ţ�����

    private String idcard;//�ο����֤��

    private String tel;//�ο��ֻ���

    private String realname;//�ο���ʵ����

    public String getTouristid() {
        return touristid;
    }

    public void setTouristid(String touristid) {
        this.touristid = touristid == null ? null : touristid.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}