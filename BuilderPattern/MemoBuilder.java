package com.hcm.chase;

public class MemoBuilder extends DocumentBuilder{

	
	@Override
	public boolean createProjects() {
		document.setRegion("India");
		document.setType("Memo");
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
