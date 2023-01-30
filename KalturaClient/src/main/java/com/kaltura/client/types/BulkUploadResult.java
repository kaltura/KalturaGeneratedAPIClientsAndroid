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
import com.kaltura.client.enums.BulkUploadAction;
import com.kaltura.client.enums.BulkUploadObjectType;
import com.kaltura.client.enums.BulkUploadResultStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResult.Tokenizer.class)
public class BulkUploadResult extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String bulkUploadJobId();
		String lineIndex();
		String partnerId();
		String status();
		String action();
		String objectId();
		String objectStatus();
		String bulkUploadResultObjectType();
		String rowData();
		String partnerData();
		String objectErrorDescription();
		RequestBuilder.ListTokenizer<BulkUploadPluginData.Tokenizer> pluginsData();
		String errorDescription();
		String errorCode();
		String errorType();
	}

	/**
	 * The id of the result
	 */
	private Integer id;
	/**
	 * The id of the parent job
	 */
	private Long bulkUploadJobId;
	/**
	 * The index of the line in the CSV
	 */
	private Integer lineIndex;
	private Integer partnerId;
	private BulkUploadResultStatus status;
	private BulkUploadAction action;
	private String objectId;
	private Integer objectStatus;
	private BulkUploadObjectType bulkUploadResultObjectType;
	/**
	 * The data as recieved in the csv
	 */
	private String rowData;
	private String partnerData;
	private String objectErrorDescription;
	private List<BulkUploadPluginData> pluginsData;
	private String errorDescription;
	private String errorCode;
	private Integer errorType;

	// id:
	public Integer getId(){
		return this.id;
	}
	// bulkUploadJobId:
	public Long getBulkUploadJobId(){
		return this.bulkUploadJobId;
	}
	public void setBulkUploadJobId(Long bulkUploadJobId){
		this.bulkUploadJobId = bulkUploadJobId;
	}

	public void bulkUploadJobId(String multirequestToken){
		setToken("bulkUploadJobId", multirequestToken);
	}

	// lineIndex:
	public Integer getLineIndex(){
		return this.lineIndex;
	}
	public void setLineIndex(Integer lineIndex){
		this.lineIndex = lineIndex;
	}

	public void lineIndex(String multirequestToken){
		setToken("lineIndex", multirequestToken);
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

	// status:
	public BulkUploadResultStatus getStatus(){
		return this.status;
	}
	public void setStatus(BulkUploadResultStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// action:
	public BulkUploadAction getAction(){
		return this.action;
	}
	public void setAction(BulkUploadAction action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// objectStatus:
	public Integer getObjectStatus(){
		return this.objectStatus;
	}
	public void setObjectStatus(Integer objectStatus){
		this.objectStatus = objectStatus;
	}

	public void objectStatus(String multirequestToken){
		setToken("objectStatus", multirequestToken);
	}

	// bulkUploadResultObjectType:
	public BulkUploadObjectType getBulkUploadResultObjectType(){
		return this.bulkUploadResultObjectType;
	}
	public void setBulkUploadResultObjectType(BulkUploadObjectType bulkUploadResultObjectType){
		this.bulkUploadResultObjectType = bulkUploadResultObjectType;
	}

	public void bulkUploadResultObjectType(String multirequestToken){
		setToken("bulkUploadResultObjectType", multirequestToken);
	}

	// rowData:
	public String getRowData(){
		return this.rowData;
	}
	public void setRowData(String rowData){
		this.rowData = rowData;
	}

	public void rowData(String multirequestToken){
		setToken("rowData", multirequestToken);
	}

	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// objectErrorDescription:
	public String getObjectErrorDescription(){
		return this.objectErrorDescription;
	}
	public void setObjectErrorDescription(String objectErrorDescription){
		this.objectErrorDescription = objectErrorDescription;
	}

	public void objectErrorDescription(String multirequestToken){
		setToken("objectErrorDescription", multirequestToken);
	}

	// pluginsData:
	public List<BulkUploadPluginData> getPluginsData(){
		return this.pluginsData;
	}
	public void setPluginsData(List<BulkUploadPluginData> pluginsData){
		this.pluginsData = pluginsData;
	}

	// errorDescription:
	public String getErrorDescription(){
		return this.errorDescription;
	}
	public void setErrorDescription(String errorDescription){
		this.errorDescription = errorDescription;
	}

	public void errorDescription(String multirequestToken){
		setToken("errorDescription", multirequestToken);
	}

	// errorCode:
	public String getErrorCode(){
		return this.errorCode;
	}
	public void setErrorCode(String errorCode){
		this.errorCode = errorCode;
	}

	public void errorCode(String multirequestToken){
		setToken("errorCode", multirequestToken);
	}

	// errorType:
	public Integer getErrorType(){
		return this.errorType;
	}
	public void setErrorType(Integer errorType){
		this.errorType = errorType;
	}

	public void errorType(String multirequestToken){
		setToken("errorType", multirequestToken);
	}


	public BulkUploadResult() {
		super();
	}

	public BulkUploadResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		bulkUploadJobId = GsonParser.parseLong(jsonObject.get("bulkUploadJobId"));
		lineIndex = GsonParser.parseInt(jsonObject.get("lineIndex"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		status = BulkUploadResultStatus.get(GsonParser.parseString(jsonObject.get("status")));
		action = BulkUploadAction.get(GsonParser.parseString(jsonObject.get("action")));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		objectStatus = GsonParser.parseInt(jsonObject.get("objectStatus"));
		bulkUploadResultObjectType = BulkUploadObjectType.get(GsonParser.parseString(jsonObject.get("bulkUploadResultObjectType")));
		rowData = GsonParser.parseString(jsonObject.get("rowData"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		objectErrorDescription = GsonParser.parseString(jsonObject.get("objectErrorDescription"));
		pluginsData = GsonParser.parseArray(jsonObject.getAsJsonArray("pluginsData"), BulkUploadPluginData.class);
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));
		errorCode = GsonParser.parseString(jsonObject.get("errorCode"));
		errorType = GsonParser.parseInt(jsonObject.get("errorType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResult");
		kparams.add("bulkUploadJobId", this.bulkUploadJobId);
		kparams.add("lineIndex", this.lineIndex);
		kparams.add("partnerId", this.partnerId);
		kparams.add("status", this.status);
		kparams.add("action", this.action);
		kparams.add("objectId", this.objectId);
		kparams.add("objectStatus", this.objectStatus);
		kparams.add("bulkUploadResultObjectType", this.bulkUploadResultObjectType);
		kparams.add("rowData", this.rowData);
		kparams.add("partnerData", this.partnerData);
		kparams.add("objectErrorDescription", this.objectErrorDescription);
		kparams.add("pluginsData", this.pluginsData);
		kparams.add("errorDescription", this.errorDescription);
		kparams.add("errorCode", this.errorCode);
		kparams.add("errorType", this.errorType);
		return kparams;
	}


    public static final Creator<BulkUploadResult> CREATOR = new Creator<BulkUploadResult>() {
        @Override
        public BulkUploadResult createFromParcel(Parcel source) {
            return new BulkUploadResult(source);
        }

        @Override
        public BulkUploadResult[] newArray(int size) {
            return new BulkUploadResult[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.bulkUploadJobId);
        dest.writeValue(this.lineIndex);
        dest.writeValue(this.partnerId);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.action == null ? -1 : this.action.ordinal());
        dest.writeString(this.objectId);
        dest.writeValue(this.objectStatus);
        dest.writeInt(this.bulkUploadResultObjectType == null ? -1 : this.bulkUploadResultObjectType.ordinal());
        dest.writeString(this.rowData);
        dest.writeString(this.partnerData);
        dest.writeString(this.objectErrorDescription);
        if(this.pluginsData != null) {
            dest.writeInt(this.pluginsData.size());
            dest.writeList(this.pluginsData);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.errorDescription);
        dest.writeString(this.errorCode);
        dest.writeValue(this.errorType);
    }

    public BulkUploadResult(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.bulkUploadJobId = (Long)in.readValue(Long.class.getClassLoader());
        this.lineIndex = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : BulkUploadResultStatus.values()[tmpStatus];
        int tmpAction = in.readInt();
        this.action = tmpAction == -1 ? null : BulkUploadAction.values()[tmpAction];
        this.objectId = in.readString();
        this.objectStatus = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpBulkUploadResultObjectType = in.readInt();
        this.bulkUploadResultObjectType = tmpBulkUploadResultObjectType == -1 ? null : BulkUploadObjectType.values()[tmpBulkUploadResultObjectType];
        this.rowData = in.readString();
        this.partnerData = in.readString();
        this.objectErrorDescription = in.readString();
        int pluginsDataSize = in.readInt();
        if( pluginsDataSize > -1) {
            this.pluginsData = new ArrayList<>();
            in.readList(this.pluginsData, BulkUploadPluginData.class.getClassLoader());
        }
        this.errorDescription = in.readString();
        this.errorCode = in.readString();
        this.errorType = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

