package com.deloitte.druginfo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.deloitte.druginfo.model.DrugVO;
//RestController
@Controller
@RequestMapping("/medbase")
public class DrugRESTController {

	
	
	@RequestMapping(value = "/test/{name}", headers="Accept=*/*",method = RequestMethod.GET)
	 public String getGreeting(@PathVariable String name) {
	
	  String result="Hello "+name; 
	
	  return result;

	 }

	
	 @RequestMapping(value = "/drug/",headers="Accept=application/json", method = RequestMethod.GET)
	 @ResponseBody
	 public List<DrugVO> getAllDrugs()
	    {
		   List<DrugVO> drugs   = new ArrayList<DrugVO>();
	         
	        DrugVO drug1 = new DrugVO(123l,"Crocin","8.00",new Date(),new Date());
	        DrugVO drug2 = new DrugVO(23456l,"Dola","5.00" ,new Date(),new Date());
	      
	        drugs.add(drug1);
	        drugs.add(drug2);
	         
	        return drugs;
	    }
	 
	 @RequestMapping(value = "/drug/{id}",method = RequestMethod.GET)
	 @ResponseBody
	 public DrugVO getSelectedDrug()
	    {
		   List<DrugVO> drugs   = new ArrayList<DrugVO>();
	         
	        DrugVO drug1 = new DrugVO(123l,"Crocin","8.00",new Date(),new Date());
	        DrugVO drug2 = new DrugVO(23456l,"Dola","5.00" ,new Date(),new Date());
	      
	        drugs.add(drug1);
	        drugs.add(drug2);
	         
	        return drug1;
	    }
	     
	    @RequestMapping(value = "/drug/{id}",method = RequestMethod.POST)
	    @ResponseBody
	    public DrugVO createDrug(Model model)
	    {
	    	  List<DrugVO> drugs   = new ArrayList<DrugVO>();
	    	  DrugVO drug3 = new DrugVO(3,"Cold Act","3.00",new Date(),new Date());
		         
		         
		        drugs.add(drug3);
	     //   model.addAttribute("employees", getEmployeesCollection());
	        return drug3;
	    }
	    
	    @RequestMapping(value = "/drug/{id}", method = RequestMethod.PUT)
	    @ResponseBody
	    public DrugVO updateDrug(Model model)
	    {
	    	  List<DrugVO> drugs   = new ArrayList<DrugVO>();
	    	  DrugVO drug3 = new DrugVO(3,"Cold Act","3.00",new Date(),new Date());
		         
		         
		        drugs.add(drug3);
	     //   model.addAttribute("employees", getEmployeesCollection());
	        return drug3;
	    }
	    
	    @RequestMapping(value = "/drug/{id}", method = RequestMethod.DELETE)
	    @ResponseBody
	    public DrugVO deleteDrug(Model model)
	    {
	    	 List<DrugVO> drugs   = new ArrayList<DrugVO>();
	    	  DrugVO drug3 = new DrugVO(3,"Cold Act","3.00",new Date(),new Date());
		         
		         
		        drugs.add(drug3);
	     //   model.addAttribute("employees", getEmployeesCollection());
	        return drug3;
	    }
	    
//	    @RequestMapping("person/{id}")
//		@ResponseBody
//		public Person getById(@PathVariable Long id) {
//			return personService.getById(id);
//		}
//		
//		/* same as above method, but is mapped to
//		 * /api/person?id= rather than /api/person/{id}
//		 */
//		@RequestMapping(value="person", params="id")
//		@ResponseBody
//		public Person getByIdFromParam(@RequestParam("id") Long id) {
//			return personService.getById(id);
//		}
}
