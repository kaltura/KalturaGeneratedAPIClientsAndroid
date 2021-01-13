// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.BusinessProcessProvider;
import com.kaltura.client.enums.BusinessProcessServerStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BusinessProcessServerBaseFilter.Tokenizer.class)
public abstract class BusinessProcessServerBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String idNotIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String partnerIdEqual();
		String partnerIdIn();
		String statusEqual();
		String statusNotEqual();
		String statusIn();
		String statusNotIn();
		String typeEqual();
		String typeIn();
		String dcEqual();
		String dcEqOrNull();
	}

	private Integer idEqual;
	private String idIn;
	private String idNotIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private BusinessProcessServerStatus statusEqual;
	private BusinessProcessServerStatus statusNotEqual;
	private String statusIn;
	private String statusNotIn;
	private BusinessProcessProvider typeEqual;
	private String typeIn;
	private Integer dcEqual;
	private Integer dcEqOrNull;

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

	// idNotIn:
	public String getIdNotIn(){
		return this.idNotIn;
	}
	public void setIdNotIn(String idNotIn){
		this.idNotIn = idNotIn;
	}

	public void idNotIn(String multirequestToken){
		setToken("idNotIn", multirequestToken);
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

	// statusEqual:
	public BusinessProcessServerStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(BusinessProcessServerStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusNotEqual:
	public BusinessProcessServerStatus getStatusNotEqual(){
		return this.statusNotEqual;
	}
	public void setStatusNotEqual(BusinessProcessServerStatus statusNotEqual){
		this.statusNotEqual = statusNotEqual;
	}

	public void statusNotEqual(String multirequestToken){
		setToken("statusNotEqual", multirequestToken);
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

	// statusNotIn:
	public String getStatusNotIn(){
		return this.statusNotIn;
	}
	public void setStatusNotIn(String statusNotIn){
		this.statusNotIn = statusNotIn;
	}

	public void statusNotIn(String multirequestToken){
		setToken("statusNotIn", multirequestToken);
	}

	// typeEqual:
	public BusinessProcessProvider getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(BusinessProcessProvider typeEqual){
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

	// dcEqual:
	public Integer getDcEqual(){
		return this.dcEqual;
	}
	public void setDcEqual(Integer dcEqual){
		this.dcEqual = dcEqual;
	}

	public void dcEqual(String multirequestToken){
		setToken("dcEqual", multirequestToken);
	}

	// dcEqOrNull:
	public Integer getDcEqOrNull(){
		return this.dcEqOrNull;
	}
	public void setDcEqOrNull(Integer dcEqOrNull){
		this.dcEqOrNull = dcEqOrNull;
	}

	public void dcEqOrNull(String multirequestToken){
		setToken("dcEqOrNull", multirequestToken);
	}


	public BusinessProcessServerBaseFilter() {
		super();
	}

	public BusinessProcessServerBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		statusEqual = BusinessProcessServerStatus.get(GsonParser.parseString(jsonObject.get("statusEqual")));
		statusNotEqual = BusinessProcessServerStatus.get(GsonParser.parseString(jsonObject.get("statusNotEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));
		typeEqual = BusinessProcessProvider.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		dcEqual = GsonParser.parseInt(jsonObject.get("dcEqual"));
		dcEqOrNull = GsonParser.parseInt(jsonObject.get("dcEqOrNull"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessProcessServerBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idNotIn", this.idNotIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusNotEqual", this.statusNotEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("statusNotIn", this.statusNotIn);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("dcEqual", this.dcEqual);
		kparams.add("dcEqOrNull", this.dcEqOrNull);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.idEqual);
        dest.writeString(this.idIn);
        dest.writeString(this.idNotIn);
        dest.writeValue(this.createdAtGreaterThanOrEqual);
        dest.writeValue(this.createdAtLessThanOrEqual);
        dest.writeValue(this.updatedAtGreaterThanOrEqual);
        dest.writeValue(this.updatedAtLessThanOrEqual);
        dest.writeValue(this.partnerIdEqual);
        dest.writeString(this.partnerIdIn);
        dest.writeInt(this.statusEqual == null ? -1 : this.statusEqual.ordinal());
        dest.writeInt(this.statusNotEqual == null ? -1 : this.statusNotEqual.ordinal());
        dest.writeString(this.statusIn);
        dest.writeString(this.statusNotIn);
        dest.writeInt(this.typeEqual == null ? -1 : this.typeEqual.ordinal());
        dest.writeString(this.typeIn);
        dest.writeValue(this.dcEqual);
        dest.writeValue(this.dcEqOrNull);
    }

    public BusinessProcessServerBaseFilter(Parcel in) {
        super(in);
        this.idEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.idIn = in.readString();
        this.idNotIn = in.readString();
        this.createdAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerIdIn = in.readString();
        int tmpStatusEqual = in.readInt();
        this.statusEqual = tmpStatusEqual == -1 ? null : BusinessProcessServerStatus.values()[tmpStatusEqual];
        int tmpStatusNotEqual = in.readInt();
        this.statusNotEqual = tmpStatusNotEqual == -1 ? null : BusinessProcessServerStatus.values()[tmpStatusNotEqual];
        this.statusIn = in.readString();
        this.statusNotIn = in.readString();
        int tmpTypeEqual = in.readInt();
        this.typeEqual = tmpTypeEqual == -1 ? null : BusinessProcessProvider.values()[tmpTypeEqual];
        this.typeIn = in.readString();
        this.dcEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.dcEqOrNull = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

