package com.hcm.chase;

public class TenderDocument {
	
	 private DocumentBuilder documentBuilder;
	 
	 public void setDocumentBuilder(DocumentBuilder cDocumentBuilder){
		 documentBuilder = cDocumentBuilder;
	 }
	 
	 public Document documents(){
		 return documentBuilder.getDocument();
	 }
	 
	 public void constructDocument(){
		 documentBuilder.createDocument();
		 documentBuilder.createProjects();
		 documentBuilder.createAssociateDetails();
		 documentBuilder.createExpenseDetails();
	 }

}
