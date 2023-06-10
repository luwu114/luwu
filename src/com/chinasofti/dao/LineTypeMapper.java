package com.chinasofti.dao;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chinasofti.model.Line;
import com.chinasofti.model.LineType;
import com.chinasofti.model.Picture;
@Repository
public interface LineTypeMapper {
    int deleteByPrimaryKey(String linetypeid);

    int insert(LineType record);

    int insertSelective(LineType record);

    LineType selectByPrimaryKey(String linetypeid);

    int updateByPrimaryKeySelective(LineType record);

    int updateByPrimaryKey(LineType record);
    
    List<LineType> selectLineTypeByPagesMap(Map map);

	//��ȡ·�����ƹ����·��ʹ��
	List<LineType> select();
	//����id��ѯ
	LineType selectByID(String linetypeid);
	//����idͼƬ�޸�����
	void updateName(String linetypeid, String filename);

	int Linetypecount();
	//����id����typeAndicon
	void updateNameAndIcon(String linetypeid, String typename, String filename);
	//�������Ʋ�ѯid
	List<LineType> selectByTypeName(String string);
	
	List<Line> selectLineByLineTypeID(String string);
	
	List<Picture> selectPictureByLineID(String string);

	LineType selectLineTypesBylineid(String linetypeid);

	List<LineType> selectLineType();
}