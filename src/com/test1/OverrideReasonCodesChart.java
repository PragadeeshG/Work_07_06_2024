package com.test1;

public class OverrideReasonCodesChart {
	private Integer collateralId;
	private Integer overrideReasonCodesId;
	private String overrideReasonCodesIndicator;
	private String overrideReasonCodesSheet;
	private String overrideReasonCodesControlFlag;
	private String overrideReasonCodesDesc;
	private String overrideReasonCodesShortDesc;
	private String overrideReasonCodesType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public OverrideReasonCodesChart() {

	}

	public OverrideReasonCodesChart(Integer collateralId, Integer overrideReasonCodesId,
			String overrideReasonCodesIndicator, String overrideReasonCodesSheet, String overrideReasonCodesControlFlag,
			String overrideReasonCodesDesc, String overrideReasonCodesShortDesc, String overrideReasonCodesType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.collateralId = collateralId;
		this.overrideReasonCodesId = overrideReasonCodesId;
		this.overrideReasonCodesIndicator = overrideReasonCodesIndicator;
		this.overrideReasonCodesSheet = overrideReasonCodesSheet;
		this.overrideReasonCodesControlFlag = overrideReasonCodesControlFlag;
		this.overrideReasonCodesDesc = overrideReasonCodesDesc;
		this.overrideReasonCodesShortDesc = overrideReasonCodesShortDesc;
		this.overrideReasonCodesType = overrideReasonCodesType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCollateralId() {
		return collateralId;
	}

	public void setCollateralId(Integer collateralId) {
		this.collateralId = collateralId;
	}

	public Integer getOverrideReasonCodesId() {
		return overrideReasonCodesId;
	}

	public void setOverrideReasonCodesId(Integer overrideReasonCodesId) {
		this.overrideReasonCodesId = overrideReasonCodesId;
	}

	public String getOverrideReasonCodesIndicator() {
		return overrideReasonCodesIndicator;
	}

	public void setOverrideReasonCodesIndicator(String overrideReasonCodesIndicator) {
		this.overrideReasonCodesIndicator = overrideReasonCodesIndicator;
	}

	public String getOverrideReasonCodesSheet() {
		return overrideReasonCodesSheet;
	}

	public void setOverrideReasonCodesSheet(String overrideReasonCodesSheet) {
		this.overrideReasonCodesSheet = overrideReasonCodesSheet;
	}

	public String getOverrideReasonCodesControlFlag() {
		return overrideReasonCodesControlFlag;
	}

	public void setOverrideReasonCodesControlFlag(String overrideReasonCodesControlFlag) {
		this.overrideReasonCodesControlFlag = overrideReasonCodesControlFlag;
	}

	public String getOverrideReasonCodesDesc() {
		return overrideReasonCodesDesc;
	}

	public void setOverrideReasonCodesDesc(String overrideReasonCodesDesc) {
		this.overrideReasonCodesDesc = overrideReasonCodesDesc;
	}

	public String getOverrideReasonCodesShortDesc() {
		return overrideReasonCodesShortDesc;
	}

	public void setOverrideReasonCodesShortDesc(String overrideReasonCodesShortDesc) {
		this.overrideReasonCodesShortDesc = overrideReasonCodesShortDesc;
	}

	public String getOverrideReasonCodesType() {
		return overrideReasonCodesType;
	}

	public void setOverrideReasonCodesType(String overrideReasonCodesType) {
		this.overrideReasonCodesType = overrideReasonCodesType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}