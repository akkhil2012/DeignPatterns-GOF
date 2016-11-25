package com.hcm.chase;

public class AppClient {
	public static void main(String args[]) {
		
		/*
		 * Service Layer : Called by Client
		 */
		TenderDocument tenderDocument
		      = new TenderDocument();
		
		DocumentBuilder memoBuilder
		     = new MemoBuilder();
		
		DocumentBuilder invoiceBuilder
		    = new InvoiceBuilder();
		
		/*
		 * Calling MemoBuilder
		 */
		tenderDocument.setDocumentBuilder(memoBuilder);
		
		// Calls the method in Service Layer which in turn calls the methods partially implmented in the
		// Builder Class( Abstarct Class ) and partialy in the implmented Classes
		tenderDocument.constructDocument();
		
		
		/*
		 * Objet to be created is finally served by Builder Class itself
		 */
		Document document = tenderDocument.documents();
		
		System.out.println(" Document created is " + document.toString());
		
		/*
		 * Calling Invoice Builder
		 */
		tenderDocument.setDocumentBuilder(invoiceBuilder);
		tenderDocument.constructDocument();
		
		 document = tenderDocument.documents();
		
		System.out.println(" Document created is " + document.toString());
		
	}

}
