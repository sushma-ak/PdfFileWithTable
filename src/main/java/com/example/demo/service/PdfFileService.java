package com.example.demo.service;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

@Service
public class PdfFileService {

	public void pdfCreation()
	{
		String filepath="C:\\Users\\annap\\Desktop\\PdfFiles\\simpleTable.pdf";
		
		try{
			PdfWriter writer=new PdfWriter(filepath);
			PdfDocument pdfdoc=new PdfDocument(writer);
			Document document=new Document(pdfdoc);
			
			float[] columnWidth= {200f,200f,200f,200f};
			Table table=new Table(columnWidth);
			table.addCell(new Cell().add("id"));
			table.addCell(new Cell().add("FirstName"));
			table.addCell(new Cell().add("LastName"));
			table.addCell(new Cell().add("Eamil"));
			table.addCell(new Cell().add("101"));
			table.addCell(new Cell().add("Sachin"));
			table.addCell(new Cell().add("Tendulkar"));
			table.addCell(new Cell().add("Sachine@gmail.com"));
			
			document.add(table);
			document.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
