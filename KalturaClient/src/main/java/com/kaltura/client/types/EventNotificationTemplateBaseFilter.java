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
import com.kaltura.client.enums.EventNotificationTemplateStatus;
import com.kaltura.client.enums.EventNotificationTemplateType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EventNotificationTemplateBaseFilter.Tokenizer.class)
public abstract class EventNotificationTemplateBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String partnerIdEqual();
		String partnerIdIn();
		String systemNameEqual();
		String systemNameIn();
		String typeEqual();
		String typeIn();
		String statusEqual();
		String statusIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
	}

	private Integer idEqual;
	private String idIn;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private String systemNameEqual;
	private String systemNameIn;
	private EventNotificationTemplateType typeEqual;
	private String typeIn;
	private EventNotificationTemplateStatus statusEqual;
	private String statusIn;
	private Long createdAtGreaterThanOrEqual;
	private Long createdAtLessThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// partnerIdIn:
	public String getPartnerIdIn(){
		return this.partnerIdIn;
	}
	public void setPartnerIdIn(String partnerIdIn){
		this.partnerIdIn = partnerIdIn;
	}

	public void partnerIdIn(String multirequestToken){
		setToken("partnerIdIn", multirequestToken);
	}

	// systemNameEqual:
	public String getSystemNameEqual(){
		return this.systemNameEqual;
	}
	public void setSystemNameEqual(String systemNameEqual){
		this.systemNameEqual = systemNameEqual;
	}

	public void systemNameEqual(String multirequestToken){
		setToken("systemNameEqual", multirequestToken);
	}

	// systemNameIn:
	public String getSystemNameIn(){
		return this.systemNameIn;
	}
	public void setSystemNameIn(String systemNameIn){
		this.systemNameIn = systemNameIn;
	}

	public void systemNameIn(String multirequestToken){
		setToken("systemNameIn", multirequestToken);
	}

	// typeEqual:
	public EventNotificationTemplateType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(EventNotificationTemplateType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// typeIn:
	public String getTypeIn(){
		return this.typeIn;
	}
	public void setTypeIn(String typeIn){
		this.typeIn = typeIn;
	}

	public void typeIn(String multirequestToken){
		setToken("typeIn", multirequestToken);
	}

	// statusEqual:
	public EventNotificationTemplateStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(EventNotificationTemplateStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Long getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Long createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Long getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Long createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Long getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Long updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Long getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Long updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}


	public EventNotificationTemplateBaseFilter() {
		super();
	}

	public EventNotificationTemplateBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
		typeEqual = EventNotificationTemplateType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		statusEqual = EventNotificationTemplateStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventNotificationTemplateBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.idEqual);
        dest.writeString(this.idIn);
        dest.writeValue(this.partnerIdEqual);
        dest.writeString(this.partnerIdIn);
        dest.writeString(this.systemNameEqual);
        dest.writeString(this.systemNameIn);
        dest.writeInt(this.typeEqual == null ? -1 : this.typeEqual.ordinal());
        dest.writeString(this.typeIn);
        dest.writeInt(this.statusEqual == null ? -1 : this.statusEqual.ordinal());
        dest.writeString(this.statusIn);
        dest.writeValue(this.createdAtGreaterThanOrEqual);
        dest.writeValue(this.createdAtLessThanOrEqual);
        dest.writeValue(this.updatedAtGreaterThanOrEqual);
        dest.writeValue(this.updatedAtLessThanOrEqual);
    }

    public EventNotificationTemplateBaseFilter(Parcel in) {
        super(in);
        this.idEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.idIn = in.readString();
        this.partnerIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerIdIn = in.readString();
        this.systemNameEqual = in.readString();
        this.systemNameIn = in.readString();
        int tmpTypeEqual = in.readInt();
        this.typeEqual = tmpTypeEqual == -1 ? null : EventNotificationTemplateType.values()[tmpTypeEqual];
        this.typeIn = in.readString();
        int tmpStatusEqual = in.readInt();
        this.statusEqual = tmpStatusEqual == -1 ? null : EventNotificationTemplateStatus.values()[tmpStatusEqual];
        this.statusIn = in.readString();
        this.createdAtGreaterThanOrEqual = (Long)in.readValue(Long.class.getClassLoader());
        this.createdAtLessThanOrEqual = (Long)in.readValue(Long.class.getClassLoader());
        this.updatedAtGreaterThanOrEqual = (Long)in.readValue(Long.class.getClassLoader());
        this.updatedAtLessThanOrEqual = (Long)in.readValue(Long.class.getClassLoader());
    }
}

