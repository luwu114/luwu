package com.chinasofti.model;

import java.util.Date;
import java.util.List;

public class Car {//���ﳵ��
    private Integer carid;//���ﳵ���

    private Integer customerid;//�ͻ����

    private String linid;//��·���

    private Date time;//��·��������ﳵ��ʱ��
    
    private List<Line> linelist; 

	public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getLinid() {
		return linid;
	}

	public void setLinid(String linid) {
		this.linid = linid;
	}

	public List<Line> getLinelist() {
		return linelist;
	}

	public void setLinelist(List<Line> linelist) {
		this.linelist = linelist;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", customerid=" + customerid + ", linid=" + linid + ", time=" + time
				+ ", linelist=" + linelist + "]";
	}


}