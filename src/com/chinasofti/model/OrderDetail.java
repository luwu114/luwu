package com.chinasofti.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderDetail {//���������
    private String odid;//������ţ�����
   
    private Integer customerid;// �ͻ���ţ����

    private String linename;// ��·����

    private BigDecimal price;// ��·�۸�
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderdate;//�¶�������
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date traveldate; //��������

    private BigDecimal total;//�ܼ�

    private String lineid;//��·��ţ����

    private Integer state;//������ʾ״̬��0Ϊ����ʾ��1Ϊ��ʾ

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid == null ? null : odid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getTraveldate() {
        return traveldate;
    }

    public void setTraveldate(Date traveldate) {
        this.traveldate = traveldate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}