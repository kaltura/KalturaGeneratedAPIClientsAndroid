// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.CatalogItemLanguage;
import com.kaltura.client.enums.ReachVendorEngineType;
import com.kaltura.client.enums.VendorCatalogItemStage;
import com.kaltura.client.enums.VendorCatalogItemStatus;
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceTurnAroundTime;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.VendorCatalogItemPricing;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorCatalogItem.Tokenizer.class)
public abstract class VendorCatalogItem extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String vendorPartnerId();
		String name();
		String systemName();
		String createdAt();
		String updatedAt();
		String status();
		String serviceType();
		String serviceFeature();
		String turnAroundTime();
		VendorCatalogItemPricing.Tokenizer pricing();
		String engineType();
		String sourceLanguage();
		String allowResubmission();
		String payPerUse();
		String vendorData();
		String stage();
		String lastBulkUpdateId();
		String contract();
		String createdBy();
		String notes();
		String partnerId();
		String defaultReachProfileId();
		String adminTagsToExclude();
	}

	private Integer id;
	private Integer vendorPartnerId;
	private String name;
	private String systemName;
	private Long createdAt;
	private Long updatedAt;
	private VendorCatalogItemStatus status;
	private VendorServiceType serviceType;
	private VendorServiceFeature serviceFeature;
	private VendorServiceTurnAroundTime turnAroundTime;
	private VendorCatalogItemPricing pricing;
	/**
	 * Property showing the catalog item's engine type, in case a vendor can offer the
	  same service via different engines.
	 */
	private ReachVendorEngineType engineType;
	private CatalogItemLanguage sourceLanguage;
	private Boolean allowResubmission;
	private Boolean payPerUse;
	private String vendorData;
	private VendorCatalogItemStage stage;
	private Integer lastBulkUpdateId;
	private String contract;
	private String createdBy;
	private String notes;
	private Integer partnerId;
	private Integer defaultReachProfileId;
	private String adminTagsToExclude;

	// id:
	public Integer getId(){
		return this.id;
	}
	// vendorPartnerId:
	public Integer getVendorPartnerId(){
		return this.vendorPartnerId;
	}
	public void setVendorPartnerId(Integer vendorPartnerId){
		this.vendorPartnerId = vendorPartnerId;
	}

	public void vendorPartnerId(String multirequestToken){
		setToken("vendorPartnerId", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// status:
	public VendorCatalogItemStatus getStatus(){
		return this.status;
	}
	// serviceType:
	public VendorServiceType getServiceType(){
		return this.serviceType;
	}
	public void setServiceType(VendorServiceType serviceType){
		this.serviceType = serviceType;
	}

	public void serviceType(String multirequestToken){
		setToken("serviceType", multirequestToken);
	}

	// serviceFeature:
	public VendorServiceFeature getServiceFeature(){
		return this.serviceFeature;
	}
	// turnAroundTime:
	public VendorServiceTurnAroundTime getTurnAroundTime(){
		return this.turnAroundTime;
	}
	public void setTurnAroundTime(VendorServiceTurnAroundTime turnAroundTime){
		this.turnAroundTime = turnAroundTime;
	}

	public void turnAroundTime(String multirequestToken){
		setToken("turnAroundTime", multirequestToken);
	}

	// pricing:
	public VendorCatalogItemPricing getPricing(){
		return this.pricing;
	}
	public void setPricing(VendorCatalogItemPricing pricing){
		this.pricing = pricing;
	}

	// engineType:
	public ReachVendorEngineType getEngineType(){
		return this.engineType;
	}
	public void setEngineType(ReachVendorEngineType engineType){
		this.engineType = engineType;
	}

	public void engineType(String multirequestToken){
		setToken("engineType", multirequestToken);
	}

	// sourceLanguage:
	public CatalogItemLanguage getSourceLanguage(){
		return this.sourceLanguage;
	}
	public void setSourceLanguage(CatalogItemLanguage sourceLanguage){
		this.sourceLanguage = sourceLanguage;
	}

	public void sourceLanguage(String multirequestToken){
		setToken("sourceLanguage", multirequestToken);
	}

	// allowResubmission:
	public Boolean getAllowResubmission(){
		return this.allowResubmission;
	}
	public void setAllowResubmission(Boolean allowResubmission){
		this.allowResubmission = allowResubmission;
	}

	public void allowResubmission(String multirequestToken){
		setToken("allowResubmission", multirequestToken);
	}

	// payPerUse:
	public Boolean getPayPerUse(){
		return this.payPerUse;
	}
	public void setPayPerUse(Boolean payPerUse){
		this.payPerUse = payPerUse;
	}

	public void payPerUse(String multirequestToken){
		setToken("payPerUse", multirequestToken);
	}

	// vendorData:
	public String getVendorData(){
		return this.vendorData;
	}
	public void setVendorData(String vendorData){
		this.vendorData = vendorData;
	}

	public void vendorData(String multirequestToken){
		setToken("vendorData", multirequestToken);
	}

	// stage:
	public VendorCatalogItemStage getStage(){
		return this.stage;
	}
	public void setStage(VendorCatalogItemStage stage){
		this.stage = stage;
	}

	public void stage(String multirequestToken){
		setToken("stage", multirequestToken);
	}

	// lastBulkUpdateId:
	public Integer getLastBulkUpdateId(){
		return this.lastBulkUpdateId;
	}
	public void setLastBulkUpdateId(Integer lastBulkUpdateId){
		this.lastBulkUpdateId = lastBulkUpdateId;
	}

	public void lastBulkUpdateId(String multirequestToken){
		setToken("lastBulkUpdateId", multirequestToken);
	}

	// contract:
	public String getContract(){
		return this.contract;
	}
	public void setContract(String contract){
		this.contract = contract;
	}

	public void contract(String multirequestToken){
		setToken("contract", multirequestToken);
	}

	// createdBy:
	public String getCreatedBy(){
		return this.createdBy;
	}
	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public void createdBy(String multirequestToken){
		setToken("createdBy", multirequestToken);
	}

	// notes:
	public String getNotes(){
		return this.notes;
	}
	public void setNotes(String notes){
		this.notes = notes;
	}

	public void notes(String multirequestToken){
		setToken("notes", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// defaultReachProfileId:
	public Integer getDefaultReachProfileId(){
		return this.defaultReachProfileId;
	}
	public void setDefaultReachProfileId(Integer defaultReachProfileId){
		this.defaultReachProfileId = defaultReachProfileId;
	}

	public void defaultReachProfileId(String multirequestToken){
		setToken("defaultReachProfileId", multirequestToken);
	}

	// adminTagsToExclude:
	public String getAdminTagsToExclude(){
		return this.adminTagsToExclude;
	}
	public void setAdminTagsToExclude(String adminTagsToExclude){
		this.adminTagsToExclude = adminTagsToExclude;
	}

	public void adminTagsToExclude(String multirequestToken){
		setToken("adminTagsToExclude", multirequestToken);
	}


	public VendorCatalogItem() {
		super();
	}

	public VendorCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		vendorPartnerId = GsonParser.parseInt(jsonObject.get("vendorPartnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		status = VendorCatalogItemStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		serviceType = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceType")));
		serviceFeature = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeature")));
		turnAroundTime = VendorServiceTurnAroundTime.get(GsonParser.parseInt(jsonObject.get("turnAroundTime")));
		pricing = GsonParser.parseObject(jsonObject.getAsJsonObject("pricing"), VendorCatalogItemPricing.class);
		engineType = ReachVendorEngineType.get(GsonParser.parseString(jsonObject.get("engineType")));
		sourceLanguage = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("sourceLanguage")));
		allowResubmission = GsonParser.parseBoolean(jsonObject.get("allowResubmission"));
		payPerUse = GsonParser.parseBoolean(jsonObject.get("payPerUse"));
		vendorData = GsonParser.parseString(jsonObject.get("vendorData"));
		stage = VendorCatalogItemStage.get(GsonParser.parseInt(jsonObject.get("stage")));
		lastBulkUpdateId = GsonParser.parseInt(jsonObject.get("lastBulkUpdateId"));
		contract = GsonParser.parseString(jsonObject.get("contract"));
		createdBy = GsonParser.parseString(jsonObject.get("createdBy"));
		notes = GsonParser.parseString(jsonObject.get("notes"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		defaultReachProfileId = GsonParser.parseInt(jsonObject.get("defaultReachProfileId"));
		adminTagsToExclude = GsonParser.parseString(jsonObject.get("adminTagsToExclude"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCatalogItem");
		kparams.add("vendorPartnerId", this.vendorPartnerId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("serviceType", this.serviceType);
		kparams.add("turnAroundTime", this.turnAroundTime);
		kparams.add("pricing", this.pricing);
		kparams.add("engineType", this.engineType);
		kparams.add("sourceLanguage", this.sourceLanguage);
		kparams.add("allowResubmission", this.allowResubmission);
		kparams.add("payPerUse", this.payPerUse);
		kparams.add("vendorData", this.vendorData);
		kparams.add("stage", this.stage);
		kparams.add("lastBulkUpdateId", this.lastBulkUpdateId);
		kparams.add("contract", this.contract);
		kparams.add("createdBy", this.createdBy);
		kparams.add("notes", this.notes);
		kparams.add("partnerId", this.partnerId);
		kparams.add("defaultReachProfileId", this.defaultReachProfileId);
		kparams.add("adminTagsToExclude", this.adminTagsToExclude);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.vendorPartnerId);
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.serviceType == null ? -1 : this.serviceType.ordinal());
        dest.writeInt(this.serviceFeature == null ? -1 : this.serviceFeature.ordinal());
        dest.writeInt(this.turnAroundTime == null ? -1 : this.turnAroundTime.ordinal());
        dest.writeParcelable(this.pricing, flags);
        dest.writeInt(this.engineType == null ? -1 : this.engineType.ordinal());
        dest.writeInt(this.sourceLanguage == null ? -1 : this.sourceLanguage.ordinal());
        dest.writeValue(this.allowResubmission);
        dest.writeValue(this.payPerUse);
        dest.writeString(this.vendorData);
        dest.writeInt(this.stage == null ? -1 : this.stage.ordinal());
        dest.writeValue(this.lastBulkUpdateId);
        dest.writeString(this.contract);
        dest.writeString(this.createdBy);
        dest.writeString(this.notes);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.defaultReachProfileId);
        dest.writeString(this.adminTagsToExclude);
    }

    public VendorCatalogItem(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.vendorPartnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.systemName = in.readString();
        this.createdAt = (Long)in.readValue(Long.class.getClassLoader());
        this.updatedAt = (Long)in.readValue(Long.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : VendorCatalogItemStatus.values()[tmpStatus];
        int tmpServiceType = in.readInt();
        this.serviceType = tmpServiceType == -1 ? null : VendorServiceType.values()[tmpServiceType];
        int tmpServiceFeature = in.readInt();
        this.serviceFeature = tmpServiceFeature == -1 ? null : VendorServiceFeature.values()[tmpServiceFeature];
        int tmpTurnAroundTime = in.readInt();
        this.turnAroundTime = tmpTurnAroundTime == -1 ? null : VendorServiceTurnAroundTime.values()[tmpTurnAroundTime];
        this.pricing = in.readParcelable(VendorCatalogItemPricing.class.getClassLoader());
        int tmpEngineType = in.readInt();
        this.engineType = tmpEngineType == -1 ? null : ReachVendorEngineType.values()[tmpEngineType];
        int tmpSourceLanguage = in.readInt();
        this.sourceLanguage = tmpSourceLanguage == -1 ? null : CatalogItemLanguage.values()[tmpSourceLanguage];
        this.allowResubmission = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.payPerUse = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.vendorData = in.readString();
        int tmpStage = in.readInt();
        this.stage = tmpStage == -1 ? null : VendorCatalogItemStage.values()[tmpStage];
        this.lastBulkUpdateId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.contract = in.readString();
        this.createdBy = in.readString();
        this.notes = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.defaultReachProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.adminTagsToExclude = in.readString();
    }
}

