package com.tranzmate.server.resources;
import com.tranzmate.server.infra.*;

public class ResourceBase {
	
	protected String emptyString;
	protected String nullVariable;

	public ResourceBase(){
		GlobalVariables globalVariable = new GlobalVariables();
		emptyString = globalVariable.getEmptyString();
		nullVariable = globalVariable.getNullVariable();
		}
}