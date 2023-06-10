package com.chinasofti.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.dao.LineMapper;
import com.chinasofti.model.Line;
import com.chinasofti.service.LineService;
@Service
public class LineServiceImpl implements LineService {
	@Autowired
	private LineMapper lineMapper;

	@Override
	public List<Line> selectLinesByPagesMap(Map map) {
		List<Line> linelist =lineMapper.selectLinesByPagesMap(map);
		return linelist;
	}
	
	//��ѯ�Ź�
	@Override
	public List<Line> selectLinesMap(Map map) {
		return lineMapper.selectLinesMap(map);
	}
	
	@Override
	public void insert(Line line) {
		lineMapper.insert(line);
	}


	@Override
	public int Linecount() {
		int count=lineMapper.Linecount();
		return count;
	}

	@Override
	public Line selectByPrimaryKey(String lineid) {
		return lineMapper.selectByPrimaryKey(lineid);
	}
	//����id�޸�����
	@Override
	public void updateByPrimaryKeySelective(Line line) {
		lineMapper.updateByPrimaryKeySelective(line);
		
	}
	//����id������Ϣ
	@Override
	public void updateByPrimaryKey(Line line) {
		lineMapper.updateByPrimaryKey(line);
		
	}
	//����linetypeid��ѯ��Ӧ����
	@Override
	public List<Line> selectLinesByLinetypeid(String linetypeid) {
		return lineMapper.selectLinesByLinetypeid(linetypeid);
	}

	@Override
	public Line selectLinesByid(String lineid) {
		return lineMapper.selectLinesByid(lineid);
	}

	@Override
	public Line selectLinesByidpicture(String linid) {
		return lineMapper.selectLinesByidpicture(linid);
	}
	//��ѯȫ��
	@Override
	public List<Line> selectLine() {
		return lineMapper.selectLine();
	}
	//��������
	@Override
	public Line selectLinebydd(String lineid) {
		return lineMapper.selectLinebydd(lineid);
	}
	//������������
	@Override
	public List<Line> selectLinesByidlist(String lineid) {
		return lineMapper.selectLinesByidlist(lineid);
	}
}
