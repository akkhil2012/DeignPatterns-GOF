package com.hcm.chase;

public class InvoiceBuilder extends DocumentBuilder{

	@Override
	public boolean createProjects() {
		document.setRegion("India");
		document.setType("Invoice");
		return true;
	}

	@Override
	public boolean createAssociateDetails() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createExpenseDetails() {
		// TODO Auto-generated method stub
		return false;
	}

}
