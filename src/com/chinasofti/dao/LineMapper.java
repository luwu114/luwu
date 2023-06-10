package com.chinasofti.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chinasofti.model.Line;
@Repository
public interface LineMapper {
	
    int deleteByPrimaryKey(String lineid);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(String lineid);
    
    Line selectLinesByid(String lineid);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
    
    int Linecount();

	List<Line> selectLinesByPagesMap(Map map);

	void updateName(String lineid, String linename);

	List<Line> selectLinesMap(Map map);
	//����linetypeid��ѯ��Ӧ����
	List<Line> selectLinesByLinetypeid(String linetypeid);
	//���Ӳ�ѯ
	Line selectLinesByidpicture(String linid);
	//��ѯȫ��
	List<Line> selectLine();
	//��������
	Line selectLinebydd(String lineid);
	//������������
	List<Line> selectLinesByidlist(String lineid);

}