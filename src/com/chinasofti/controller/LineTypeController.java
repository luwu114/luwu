package com.chinasofti.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.model.LineType;
import com.chinasofti.service.LineTypeService;
@Controller
public class LineTypeController {

	@Autowired //�Զ�ע�� ����Ҫset get
	LineTypeService lineTypeService;
	public final static int pageSize=10;
	@RequestMapping("/LineType")
	public ModelAndView LineType() {
		ModelAndView mav = new ModelAndView("insertLineType");
		mav.addObject("linetype", new LineType());
		return mav;
	}
	@RequestMapping("/LineTypeList")
	public ModelAndView LineTypelist(@RequestParam("pageIndex") int pageIndex) {
		if (pageIndex<=1){
			pageIndex=1;
		}
		int startRow = 0;
		startRow = pageSize*(pageIndex-1); 
		int count=lineTypeService.Linetypecount();
		int endRow;
		if(count%pageSize==0) {
			endRow = count/pageSize;
		}else {
			endRow = count/pageSize+1;
		}
		ModelAndView mav = new ModelAndView("linetypelist");
		Map map =new HashMap<>();
		map.put("startRow", startRow);
		map.put("pageSize", pageSize);
		List<LineType> linetypelist =lineTypeService.selectLineTypeByPagesMap(map);
		mav.addObject("linetypelist" ,linetypelist);
		mav.addObject("pageIndex",pageIndex);
		mav.addObject("endRow",endRow);
		return mav;
	}
	
	@RequestMapping("/insertLineType")
	public ModelAndView InsetLineType(@ModelAttribute("linetype") LineType lineType,HttpServletRequest request,@RequestParam("filename")MultipartFile filename) throws IllegalStateException, IOException {
		String path =request.getSession().getServletContext().getRealPath("/upload"); //������·�� ��tomcat��
		if(!new File(path).exists()) {
		    new File(path).mkdirs();
		  }
		System.out.println(path);
		String filename1 =filename.getOriginalFilename(); //���ļ����ƴ���filename1
	    String name=filename1.substring(filename1.indexOf("."));
		System.out.println(name);
		if(name.equals(".jpg")||name.equals(".jpeg")||name.equals(".jpg")||name.equals(".png")||name.equals(".bmp")) {
			filename.transferTo(new File(path+"/"+filename1));//���ļ��ϴ���ָ��·��������
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			lineType.setLinetypeid(uuid);
			lineType.setTime(new Date());
			lineType.setIcon(filename1);
			lineTypeService.insert(lineType);
			
			Map map =new HashMap<>();
			map.put("startRow", 0);
			map.put("pageSize", pageSize);
			List<LineType> linetypelist =lineTypeService.selectLineTypeByPagesMap(map);
			ModelAndView mav = new ModelAndView("linetypelist");
			mav.addObject("linetypelist" ,linetypelist);
			return mav;
		}else{
			ModelAndView mav = new ModelAndView("insertLineType");
			mav.addObject("linetype", new LineType());
			mav.addObject("msg", "�ϴ��ļ�ֻ��Ϊjpg��jpeg��png��bmp��ʽ");
			return mav;
		}
	}
		//׼���޸���·
		@RequestMapping("/updatelinetype1")
		public ModelAndView updateline1(@RequestParam("linetypeid")String linetypeid) {
			LineType linetype= lineTypeService.selectByID(linetypeid);
			ModelAndView mav = new ModelAndView("updatelinetype");
			mav.addObject("linetype", linetype);
			return mav;
		}
		//�޸�·��
		@RequestMapping("/updatelinetype")
		public ModelAndView updateline(@ModelAttribute("linetype")LineType linetype,@RequestParam("file")MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException {
			String path =request.getSession().getServletContext().getRealPath("/upload"); 
			if(!new File(path).exists()) {
			    new File(path).mkdirs();
			  }
			String filename =file.getOriginalFilename(); //���ļ����ƴ���filename
			file.transferTo(new File(path+"/"+filename));//���ļ��ϴ���ָ��·��������
			
			lineTypeService.updateNameAndIcon(linetype.getLinetypeid(),linetype.getTypename(),filename);
			
			Map map =new HashMap<>();
			map.put("startRow", 0);
			map.put("pageSize", pageSize);
			List<LineType> linetypelist =lineTypeService.selectLineTypeByPagesMap(map);
			ModelAndView mav = new ModelAndView("linetypelist");
			mav.addObject("linetypelist" ,linetypelist);
			return mav;
		}
}
