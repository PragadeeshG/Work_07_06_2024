package com.test1;

public class OverrideReasonCodesReporting {
	private Integer collateralId;
	private Integer overrideReasonCodesId;
	private Integer ledgerAccountNumber;
	private String targetGroup;
	private Integer baseReportingIndicator;
	private boolean overrideReasonCodesMappedToReport;
	private boolean isActive;
	private String legalControlName;
	private String legalControlType;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public OverrideReasonCodesReporting() {

	}

	public OverrideReasonCodesReporting(Integer collateralId, Integer overrideReasonCodesId,
			Integer ledgerAccountNumber, String targetGroup, Integer baseReportingIndicator,
			boolean overrideReasonCodesMappedToReport, boolean isActive, String legalControlName,
			String legalControlType, String creationCr, String modifiedCr, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.collateralId = collateralId;
		this.overrideReasonCodesId = overrideReasonCodesId;
		this.ledgerAccountNumber = ledgerAccountNumber;
		this.targetGroup = targetGroup;
		this.baseReportingIndicator = baseReportingIndicator;
		this.overrideReasonCodesMappedToReport = overrideReasonCodesMappedToReport;
		this.isActive = isActive;
		this.legalControlName = legalControlName;
		this.legalControlType = legalControlType;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
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

	public Integer getLedgerAccountNumber() {
		return ledgerAccountNumber;
	}

	public void setLedgerAccountNumber(Integer ledgerAccountNumber) {
		this.ledgerAccountNumber = ledgerAccountNumber;
	}

	public String getTargetGroup() {
		return targetGroup;
	}

	public void setTargetGroup(String targetGroup) {
		this.targetGroup = targetGroup;
	}

	public Integer getBaseReportingIndicator() {
		return baseReportingIndicator;
	}

	public void setBaseReportingIndicator(Integer baseReportingIndicator) {
		this.baseReportingIndicator = baseReportingIndicator;
	}

	public boolean isOverrideReasonCodesMappedToReport() {
		return overrideReasonCodesMappedToReport;
	}

	public void setOverrideReasonCodesMappedToReport(boolean overrideReasonCodesMappedToReport) {
		this.overrideReasonCodesMappedToReport = overrideReasonCodesMappedToReport;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getLegalControlName() {
		return legalControlName;
	}

	public void setLegalControlName(String legalControlName) {
		this.legalControlName = legalControlName;
	}

	public String getLegalControlType() {
		return legalControlType;
	}

	public void setLegalControlType(String legalControlType) {
		this.legalControlType = legalControlType;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
