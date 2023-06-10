package com.chinasofti.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Customer {//�ͻ��������ֱ����Ա����ͨ�û���
	
    private Integer customerid;//�ͻ����
    @Length(min=6,max=12)
	@NotNull
    private String account;//�ͻ��˺�
    @NotNull
    private String name;//�ͻ���ʵ����
    @Length(min=6,max=12)
    @NotNull
    private String password;//����
    @NotNull
    private String sex;//�Ա�
    @Length(min=10,max=18)
    private String identityid;//�ͻ����֤��
    @Length(min=8,max=11)
    private String tel;//�ͻ��ֻ���

    private Integer type;//״̬��ֵΪ1ʱ�ǹ���Ա
    
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdentityid() {
        return identityid;
    }

    public void setIdentityid(String identityid) {
        this.identityid = identityid == null ? null : identityid.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


}