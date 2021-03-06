package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PdfGenaratorUtil;

@RestController
public class DocumentsController {

	@Autowired
	PdfGenaratorUtil pdfGenaratorUtil;
	
	@GetMapping("/generate-pdf")
	public boolean generatePdf() {
		Map<String,String> data = new HashMap<String,String>();
	    data.put("name","Christopher");
	    
	    try {
			pdfGenaratorUtil.createPdf("greeting",data);
		} catch (Exception e) {
			System.out.println("Error al crear pdf :(");
			e.printStackTrace();
		} 
		
		return true;
	}
	
}
