package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.PdfFileService;

@Component
public class Runner implements ApplicationRunner {

	private PdfFileService pdfFileService;

	@Autowired
	public Runner(PdfFileService pdfFileService) {
		
		this.pdfFileService = pdfFileService;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Application Started to Run");
		pdfFileService.pdfCreation();
		System.out.println("Table is add into the pdf file");
		
		
	}

}
