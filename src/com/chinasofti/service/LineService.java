package com.chinasofti.service;

import java.util.List;
import java.util.Map;

import com.chinasofti.model.Line;
import com.chinasofti.model.LineType;


public interface LineService {
	
  void insert(Line line);

  List<Line> selectLinesByPagesMap(Map map);
  
  List<Line> selectLinesMap(Map map);
  
  Line selectByPrimaryKey(String lineid);
  //����id�޸�����
  void updateByPrimaryKeySelective(Line line);

  int Linecount();
  //����id������Ϣ
  void updateByPrimaryKey(Line line);
  //����linetypeid��ѯ��Ӧ����
  List<Line> selectLinesByLinetypeid(String linetypeid);

  Line selectLinesByid(String lineid);

  Line selectLinesByidpicture(String linid);
  //��ѯȫ��
  List<Line> selectLine();
  //��������	
  Line selectLinebydd(String lineid);
  //������������
  List<Line> selectLinesByidlist(String lineid);

 }
