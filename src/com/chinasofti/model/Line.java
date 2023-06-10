package com.chinasofti.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;


public class Line {//��·��
    private String lineid;//��·���

    private String linetypeid;//��·���ͱ��

    private String linename;//��·����

    private String days;//��������

    private String vehicle;//���ν�ͨ����

    private String introduction;//��·���

    private String reason;//��·�Ƽ�����

    private String arrange;//��·�г̰���

    private BigDecimal price;//��·�۸�

    private Integer teambuy;//�Ƿ�Ϊ�Ź���·��ֵΪ1ʱ��ʾΪ�Ź���·

    private BigDecimal teambuyprice;//��·�Ź��۸�
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date begintime;//��·�Ź���ʼʱ��
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endtime;//��·�Ź�����ʱ��

    private Date ontime;//��·���ʱ��
    
    private LineType linetype;
    
    private List<Picture> picturelist;
    
    private List<Car> carlist;
    
    public String getLineid() {
        return lineid;
    }

	public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

    public String getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(String linetypeid) {
        this.linetypeid = linetypeid == null ? null : linetypeid.trim();
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days == null ? null : days.trim();
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getArrange() {
        return arrange;
    }

    public void setArrange(String arrange) {
        this.arrange = arrange == null ? null : arrange.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getTeambuy() {
        return teambuy;
    }

    public void setTeambuy(Integer teambuy) {
        this.teambuy = teambuy;
    }

    public BigDecimal getTeambuyprice() {
        return teambuyprice;
    }

    public void setTeambuyprice(BigDecimal teambuyprice) {
        this.teambuyprice = teambuyprice;
    }

	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Date getOntime() {
        return ontime;
    }

    public void setOntime(Date ontime) {
        this.ontime = ontime;
    }

	public LineType getLinetype() {
		return linetype;
	}

	public void setLinetype(LineType linetype) {
		this.linetype = linetype;
	}

	public List<Picture> getPicturelist() {
		return picturelist;
	}

	public void setPicturelist(List<Picture> picturelist) {
		this.picturelist = picturelist;
	}

	public List<Car> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<Car> carlist) {
		this.carlist = carlist;
	}

	@Override
	public String toString() {
		return "Line [lineid=" + lineid + ", linetypeid=" + linetypeid + ", linename=" + linename + ", days=" + days
				+ ", vehicle=" + vehicle + ", introduction=" + introduction + ", reason=" + reason + ", arrange="
				+ arrange + ", price=" + price + ", teambuy=" + teambuy + ", teambuyprice=" + teambuyprice
				+ ", begintime=" + begintime + ", endtime=" + endtime + ", ontime=" + ontime + ", linetype=" + linetype
				+ ", picturelist=" + picturelist + ", carlist=" + carlist + "]";
	}
	
	

}