package com.chinasofti.model;

public class Picture {//��·ͼƬ��
    private Integer pictyreid;//ͼƬ���

    private String introduction;//ͼƬ����

    private String name;//ͼƬ����

    private String lineid;//��·���

    public Integer getPictyreid() {
        return pictyreid;
    }

    public void setPictyreid(Integer pictyreid) {
        this.pictyreid = pictyreid;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

	@Override
	public String toString() {
		return "Picture [pictyreid=" + pictyreid + ", introduction=" + introduction + ", name=" + name + ", lineid="
				+ lineid + "]";
	}
    
    
}