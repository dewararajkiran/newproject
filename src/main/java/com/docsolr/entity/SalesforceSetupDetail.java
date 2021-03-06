package com.docsolr.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.docsolr.entity.admin.Profiles;

@Entity
@Table(name="salesforcesetupdetail")

public class SalesforceSetupDetail extends BaseEntity{
	
	private SalesforceSetup salesforceSetup  ;
	
	private String salesforceObjectApiName  ;
	
	private String salesforceFields  ;

	
	public SalesforceSetupDetail() {
		super();
	}

	public SalesforceSetupDetail( String salesforceObjectApiName,
			String salesforceFields) {
		super();
		
		this.salesforceObjectApiName = salesforceObjectApiName;
		this.salesforceFields = salesforceFields;
	}

	@ManyToOne(targetEntity = Profiles.class)
    @JoinColumn(name = "salesforceSetupId")
	public SalesforceSetup getSalesforceSetup() {
		return salesforceSetup;
	}

	public void setSalesforceSetup(SalesforceSetup salesforceSetup) {
		
		this.salesforceSetup = salesforceSetup;
	}

	public String getSalesforceObjectApiName() {
		return salesforceObjectApiName;
	}

	public void setSalesforceObjectApiName(String salesforceObjectApiName) {
		this.salesforceObjectApiName = salesforceObjectApiName;
	}


	public String getSalesforceFields() {
		return salesforceFields;
	}

	public void setSalesforceFields(String salesforceFields) {
		this.salesforceFields = salesforceFields;
	}
}
