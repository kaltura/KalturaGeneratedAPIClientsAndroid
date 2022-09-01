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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.enums.ScheduledTaskProfileStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduledTaskProfileBaseFilter.Tokenizer.class)
public abstract class ScheduledTaskProfileBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String partnerIdEqual();
		String partnerIdIn();
		String systemNameEqual();
		String systemNameIn();
		String statusEqual();
		String statusIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String lastExecutionStartedAtGreaterThanOrEqual();
		String lastExecutionStartedAtLessThanOrEqual();
		String lastExecutionStartedAtLessThanOrEqualOrNull();
	}

	private Integer idEqual;
	private String idIn;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private String systemNameEqual;
	private String systemNameIn;
	private ScheduledTaskProfileStatus statusEqual;
	private String statusIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer lastExecutionStartedAtGreaterThanOrEqual;
	private Integer lastExecutionStartedAtLessThanOrEqual;
	private Integer lastExecutionStartedAtLessThanOrEqualOrNull;

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

	// statusEqual:
	public ScheduledTaskProfileStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(ScheduledTaskProfileStatus statusEqual){
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
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// lastExecutionStartedAtGreaterThanOrEqual:
	public Integer getLastExecutionStartedAtGreaterThanOrEqual(){
		return this.lastExecutionStartedAtGreaterThanOrEqual;
	}
	public void setLastExecutionStartedAtGreaterThanOrEqual(Integer lastExecutionStartedAtGreaterThanOrEqual){
		this.lastExecutionStartedAtGreaterThanOrEqual = lastExecutionStartedAtGreaterThanOrEqual;
	}

	public void lastExecutionStartedAtGreaterThanOrEqual(String multirequestToken){
		setToken("lastExecutionStartedAtGreaterThanOrEqual", multirequestToken);
	}

	// lastExecutionStartedAtLessThanOrEqual:
	public Integer getLastExecutionStartedAtLessThanOrEqual(){
		return this.lastExecutionStartedAtLessThanOrEqual;
	}
	public void setLastExecutionStartedAtLessThanOrEqual(Integer lastExecutionStartedAtLessThanOrEqual){
		this.lastExecutionStartedAtLessThanOrEqual = lastExecutionStartedAtLessThanOrEqual;
	}

	public void lastExecutionStartedAtLessThanOrEqual(String multirequestToken){
		setToken("lastExecutionStartedAtLessThanOrEqual", multirequestToken);
	}

	// lastExecutionStartedAtLessThanOrEqualOrNull:
	public Integer getLastExecutionStartedAtLessThanOrEqualOrNull(){
		return this.lastExecutionStartedAtLessThanOrEqualOrNull;
	}
	public void setLastExecutionStartedAtLessThanOrEqualOrNull(Integer lastExecutionStartedAtLessThanOrEqualOrNull){
		this.lastExecutionStartedAtLessThanOrEqualOrNull = lastExecutionStartedAtLessThanOrEqualOrNull;
	}

	public void lastExecutionStartedAtLessThanOrEqualOrNull(String multirequestToken){
		setToken("lastExecutionStartedAtLessThanOrEqualOrNull", multirequestToken);
	}


	public ScheduledTaskProfileBaseFilter() {
		super();
	}

	public ScheduledTaskProfileBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
		statusEqual = ScheduledTaskProfileStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		lastExecutionStartedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("lastExecutionStartedAtGreaterThanOrEqual"));
		lastExecutionStartedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("lastExecutionStartedAtLessThanOrEqual"));
		lastExecutionStartedAtLessThanOrEqualOrNull = GsonParser.parseInt(jsonObject.get("lastExecutionStartedAtLessThanOrEqualOrNull"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduledTaskProfileBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("lastExecutionStartedAtGreaterThanOrEqual", this.lastExecutionStartedAtGreaterThanOrEqual);
		kparams.add("lastExecutionStartedAtLessThanOrEqual", this.lastExecutionStartedAtLessThanOrEqual);
		kparams.add("lastExecutionStartedAtLessThanOrEqualOrNull", this.lastExecutionStartedAtLessThanOrEqualOrNull);
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
        dest.writeInt(this.statusEqual == null ? -1 : this.statusEqual.ordinal());
        dest.writeString(this.statusIn);
        dest.writeValue(this.createdAtGreaterThanOrEqual);
        dest.writeValue(this.createdAtLessThanOrEqual);
        dest.writeValue(this.updatedAtGreaterThanOrEqual);
        dest.writeValue(this.updatedAtLessThanOrEqual);
        dest.writeValue(this.lastExecutionStartedAtGreaterThanOrEqual);
        dest.writeValue(this.lastExecutionStartedAtLessThanOrEqual);
        dest.writeValue(this.lastExecutionStartedAtLessThanOrEqualOrNull);
    }

    public ScheduledTaskProfileBaseFilter(Parcel in) {
        super(in);
        this.idEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.idIn = in.readString();
        this.partnerIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerIdIn = in.readString();
        this.systemNameEqual = in.readString();
        this.systemNameIn = in.readString();
        int tmpStatusEqual = in.readInt();
        this.statusEqual = tmpStatusEqual == -1 ? null : ScheduledTaskProfileStatus.values()[tmpStatusEqual];
        this.statusIn = in.readString();
        this.createdAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.lastExecutionStartedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.lastExecutionStartedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.lastExecutionStartedAtLessThanOrEqualOrNull = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

