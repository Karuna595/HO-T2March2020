package com.mastek.inventorymgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mastek.inventorymgmt.model.Product;
import com.mastek.inventorymgmt.service.ProductService;

@Controller
@RequestMapping("/inventory")
public class ProductController {

	@Autowired
	private ProductService ps;
	private ModelAndView mv;
	
	@GetMapping("/products")
	private ModelAndView findAll()
	{
		return new ModelAndView("products","products",ps.findAll());
		
	}
	@GetMapping("/product/{id}")
	private ModelAndView findById(@PathVariable("id") String id)
	{
		return new ModelAndView("product","product",ps.findById(id));
		
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute Product product) {
		mv = new ModelAndView("result");
		if (ps.save(product)) {
			mv.addObject("message", "Product saved successfully "+product);
		} else {
			mv.addObject("message", "Product is not added.");
		}
		return mv;
	}
	
	@PostMapping("/delete")
	public ModelAndView delete(@ModelAttribute Product product) {
		mv = new ModelAndView("result");
		
		if(ps.delete(product.getProduct_id()))
			mv.addObject("message","Product delete successfull");
		else
			mv.addObject("message", "Product is not deleted");
		
		return mv;
	}
}
