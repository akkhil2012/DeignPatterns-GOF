package com.hcm.chase;

public abstract class DocumentBuilder {
	
	protected Document document;
	
	  public Document getDocument(){
		  return document;
	  }
	  
	  
	  public void createDocument(){
		  document = new Document();
	  }

	   public abstract boolean createProjects();
	   
	   public abstract boolean createAssociateDetails();
	   
	   public abstract boolean createExpenseDetails();
}
