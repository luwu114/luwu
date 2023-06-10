package com.chinasofti.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.model.Car;
import com.chinasofti.model.Line;
import com.chinasofti.model.LineType;
import com.chinasofti.model.OrderDetail;
import com.chinasofti.model.Tourist;
import com.chinasofti.service.CarService;
import com.chinasofti.service.LineService;
import com.chinasofti.service.LineTypeService;
import com.chinasofti.service.OrderDetailService;
import com.chinasofti.service.TouristService;

@Controller
public class TouristAreaController {
	
	@Autowired
	private LineTypeService linetypeService; 
	@Autowired
	private LineService lineService; 
	@Autowired
	private TouristService touristService;
	@Autowired
	private OrderDetailService orderDetailService;//ͼƬ
	@Autowired
	private CarService carService;
	
	@RequestMapping("/leixing")
	public ModelAndView leixing(@RequestParam("linetypename") String linetypename) {
		
		List<LineType> linetype=linetypeService.selectByTypeName(linetypename); 
		
		for (LineType lineType2 : linetype) {
			System.out.println(lineType2.toString());
		}
		ModelAndView mav = new ModelAndView("XiangQing");
		mav.addObject("linetype", linetype);
		return mav;
	}
	
	@RequestMapping("/tourist")
	public ModelAndView tourist(@ModelAttribute("tourist") Tourist tourist,@RequestParam("lineid") String lineid,@RequestParam("type") int type,HttpSession session) {
		System.out.println(lineid);
		ModelAndView mav = new ModelAndView("querenorder");
		if(type==1) {
			List<Line> linelist =lineService.selectLinesByidlist(lineid);
			mav.addObject("linelist", linelist);
			mav.addObject("inserttype", 0);
		}else {
			int customerid=(int) session.getAttribute("customerid");
			List<Car> Carlist=carService.selectCartByLine(customerid);
			mav.addObject("Carlist", Carlist);
			mav.addObject("inserttype", 1);
		}	
		mav.addObject("tourist", tourist);
		return mav;
	}
	@RequestMapping("/tiaozhuan")
	public ModelAndView tiaozhuan(@ModelAttribute("tourist") Tourist tourist,HttpSession session,@RequestParam("lineid") String lineid,@RequestParam("inserttype") int inserttype) {
		//����˿���Ϣ
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		tourist.setTouristid(uuid);	
		touristService.insert(tourist);
		//��ȡ�û�id
		int customerid = (int) session.getAttribute("customerid");
		System.out.println("�û�idΪ��"+customerid);
		//�ж��Ƿ����
		if(inserttype==1) {
			System.out.println("������");
			List<Car> Carlist=carService.selectCartByLine(customerid);
			for (Car car : Carlist) {
				System.out.println(car.toString());
				//order��id
				String dingdanid = UUID.randomUUID().toString().replaceAll("-", "");
				String ddid=dingdanid.substring(0,18);
				//����list����Ҫ��Ԫ��
				System.out.println(car.getLinelist().get(0).getLineid());
				System.out.println(car.getLinelist().get(0).getLinename());
				System.out.println(car.getLinelist().get(0).getPrice());
				System.out.println(car.getLinelist().get(0).getBegintime()); //����ʱ��
				System.out.println(car.getLinelist().get(0).getLineid());
				System.out.println(car.getLinelist().get(0).getTeambuyprice());
				//������Ϣ
				OrderDetail  orderDetail =new OrderDetail();
				orderDetail.setOdid(ddid);
				orderDetail.setCustomerid(customerid);
				orderDetail.setLineid(car.getLinelist().get(0).getLineid());
				orderDetail.setLinename(car.getLinelist().get(0).getLinename());
				orderDetail.setOrderdate(new Date());
				orderDetail.setTraveldate(car.getLinelist().get(0).getBegintime());
				orderDetail.setPrice(car.getLinelist().get(0).getPrice());
				orderDetail.setState(1);
				if(car.getLinelist().get(0).getTeambuyprice()!=null) {
					orderDetail.setTotal(car.getLinelist().get(0).getTeambuyprice());
				}else {
					orderDetail.setTotal(car.getLinelist().get(0).getPrice());
				}
				orderDetailService.insert(orderDetail);
				carService.deleteBycustomerid(customerid);
			}
		}else if(inserttype==0){
			//���붩����Ϣ
			List<Line> linelist =lineService.selectLinesByidlist(lineid);
			String ddid = UUID.randomUUID().toString().replaceAll("-", "");
			String uu=ddid.substring(0,18);
			for (Line line : linelist) {
				OrderDetail  orderDetail =new OrderDetail();
				orderDetail.setOdid(uu);
				orderDetail.setCustomerid(customerid);
				orderDetail.setLineid(line.getLineid());
				orderDetail.setLinename(line.getLinename());
				orderDetail.setOrderdate(new Date());
				orderDetail.setTraveldate(line.getBegintime());
				orderDetail.setPrice(line.getPrice());
				orderDetail.setState(1);
				if(line.getTeambuyprice()!=null) {
					orderDetail.setTotal(line.getTeambuyprice());
				}else {
					orderDetail.setTotal(line.getPrice());
				}
				orderDetailService.insert(orderDetail);
			}
		}
		ModelAndView mav = new ModelAndView("fukuanorder");
		return mav;
	}
}
