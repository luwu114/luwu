package com.chinasofti.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class LineType {//��·���ͱ�
    private String linetypeid;//��·���ͱ��

    private String typename;//��·��������
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;//��·�������ʱ��

    private String icon;//��·����ͼ����
    
    private List<Line> linelist;

    public String getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(String linetypeid) {
        this.linetypeid = linetypeid == null ? null : linetypeid.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

	public List<Line> getLinelist() {
		return linelist;
	}

	public void setLinelist(List<Line> linelist) {
		this.linelist = linelist;
	}

	@Override
	public String toString() {
		return "LineType [linetypeid=" + linetypeid + ", typename=" + typename + ", time=" + time + ", icon=" + icon
				+ ", linelist=" + linelist + "]";
	}

	
	
}