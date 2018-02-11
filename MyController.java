package com.cg.springmobile.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmobile.dto.Mobile;
import com.cg.springmobile.service.IMobileService;

@Controller
public class MyController {
	
	@Autowired
	IMobileService mobileservice;
	@RequestMapping(value="addmobile",method=RequestMethod.GET)
public String addData(@ModelAttribute("my") Mobile mob,Map model){
		
		List<String> myCategory = new ArrayList<String>();
		
		myCategory.add("Samsung");
		myCategory.add("HTC");
		myCategory.add("Sony");
		
		model.put("mylist", myCategory);
		
		
		return "mobileadd";
		
		
	}
	@RequestMapping(value="addmob" ,method=RequestMethod.POST)
	public ModelAndView dataAdd(@Valid @ModelAttribute("my") Mobile mob,BindingResult result,Map<String,Object> model){
		
		if(result.hasErrors()){
			List<String> myCategory = new ArrayList<String>();
			
			myCategory.add("Samsung");
			myCategory.add("HTC");
			myCategory.add("Sony");
			
			model.put("mylist", myCategory);
			
			return new ModelAndView("mobileadd");
			
		}else
		{
			int mobId=mobileservice.addMobile(mob);
			return new ModelAndView("success","mobo",mobId);
		}
		
	}
	@RequestMapping(value="showall",method=RequestMethod.GET)
	public ModelAndView showProduct(){
		List<Mobile> myproduct=mobileservice.showAll();
		return new ModelAndView("showallproduct","mprod",myproduct);
	}
	
	@RequestMapping(value="search",method=RequestMethod.GET)
	public String searchProduct(){
		return "searchproduct";
		
	}
	@RequestMapping(value="prodsearch",method=RequestMethod.POST)
	public ModelAndView searchData(@RequestParam("searchid") int id){
		List<Mobile> myproduct=mobileservice.searchProduct(id);
		
		System.out.println("id is"+id);
		return new ModelAndView("showallproduct","mprod",myproduct);
		
	}
	@RequestMapping(value="removeproduct",method=RequestMethod.GET)
	public String removeProduct(){
		return "removeproduct";
		
	}
	@RequestMapping(value="removeprod",method=RequestMethod.GET)
	public String RemoveData(@RequestParam("removeid") int id){
		int status=mobileservice.removemobile(id);		
		if(status==1)
		{
			return "passremove";
		}
		else
		{
		return 	"removeproduct?msg=mobileid not found";
		}
	}
}
