package com.hcm.template;

public abstract class Document {
	   protected abstract void createProjects();
	   protected abstract void createAssociateDetails();
	   protected abstract void createExpenseDetails();
	   public final void createDocument(){
		   createExpenseDetails();
		   createAssociateDetails();
		   createProjects();
	   }
}
