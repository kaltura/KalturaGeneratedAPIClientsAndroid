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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.enums.MetadataProfileCreateMode;
import com.kaltura.client.enums.MetadataProfileStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataProfileBaseFilter.Tokenizer.class)
public abstract class MetadataProfileBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String partnerIdEqual();
		String metadataObjectTypeEqual();
		String metadataObjectTypeIn();
		String versionEqual();
		String nameEqual();
		String systemNameEqual();
		String systemNameIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String statusEqual();
		String statusIn();
		String createModeEqual();
		String createModeNotEqual();
		String createModeIn();
		String createModeNotIn();
	}

	private Integer idEqual;
	private Integer partnerIdEqual;
	private MetadataObjectType metadataObjectTypeEqual;
	private String metadataObjectTypeIn;
	private Integer versionEqual;
	private String nameEqual;
	private String systemNameEqual;
	private String systemNameIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private MetadataProfileStatus statusEqual;
	private String statusIn;
	private MetadataProfileCreateMode createModeEqual;
	private MetadataProfileCreateMode createModeNotEqual;
	private String createModeIn;
	private String createModeNotIn;

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

	// metadataObjectTypeEqual:
	public MetadataObjectType getMetadataObjectTypeEqual(){
		return this.metadataObjectTypeEqual;
	}
	public void setMetadataObjectTypeEqual(MetadataObjectType metadataObjectTypeEqual){
		this.metadataObjectTypeEqual = metadataObjectTypeEqual;
	}

	public void metadataObjectTypeEqual(String multirequestToken){
		setToken("metadataObjectTypeEqual", multirequestToken);
	}

	// metadataObjectTypeIn:
	public String getMetadataObjectTypeIn(){
		return this.metadataObjectTypeIn;
	}
	public void setMetadataObjectTypeIn(String metadataObjectTypeIn){
		this.metadataObjectTypeIn = metadataObjectTypeIn;
	}

	public void metadataObjectTypeIn(String multirequestToken){
		setToken("metadataObjectTypeIn", multirequestToken);
	}

	// versionEqual:
	public Integer getVersionEqual(){
		return this.versionEqual;
	}
	public void setVersionEqual(Integer versionEqual){
		this.versionEqual = versionEqual;
	}

	public void versionEqual(String multirequestToken){
		setToken("versionEqual", multirequestToken);
	}

	// nameEqual:
	public String getNameEqual(){
		return this.nameEqual;
	}
	public void setNameEqual(String nameEqual){
		this.nameEqual = nameEqual;
	}

	public void nameEqual(String multirequestToken){
		setToken("nameEqual", multirequestToken);
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

	// statusEqual:
	public MetadataProfileStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(MetadataProfileStatus statusEqual){
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

	// createModeEqual:
	public MetadataProfileCreateMode getCreateModeEqual(){
		return this.createModeEqual;
	}
	public void setCreateModeEqual(MetadataProfileCreateMode createModeEqual){
		this.createModeEqual = createModeEqual;
	}

	public void createModeEqual(String multirequestToken){
		setToken("createModeEqual", multirequestToken);
	}

	// createModeNotEqual:
	public MetadataProfileCreateMode getCreateModeNotEqual(){
		return this.createModeNotEqual;
	}
	public void setCreateModeNotEqual(MetadataProfileCreateMode createModeNotEqual){
		this.createModeNotEqual = createModeNotEqual;
	}

	public void createModeNotEqual(String multirequestToken){
		setToken("createModeNotEqual", multirequestToken);
	}

	// createModeIn:
	public String getCreateModeIn(){
		return this.createModeIn;
	}
	public void setCreateModeIn(String createModeIn){
		this.createModeIn = createModeIn;
	}

	public void createModeIn(String multirequestToken){
		setToken("createModeIn", multirequestToken);
	}

	// createModeNotIn:
	public String getCreateModeNotIn(){
		return this.createModeNotIn;
	}
	public void setCreateModeNotIn(String createModeNotIn){
		this.createModeNotIn = createModeNotIn;
	}

	public void createModeNotIn(String multirequestToken){
		setToken("createModeNotIn", multirequestToken);
	}


	public MetadataProfileBaseFilter() {
		super();
	}

	public MetadataProfileBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		metadataObjectTypeEqual = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectTypeEqual")));
		metadataObjectTypeIn = GsonParser.parseString(jsonObject.get("metadataObjectTypeIn"));
		versionEqual = GsonParser.parseInt(jsonObject.get("versionEqual"));
		nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		statusEqual = MetadataProfileStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		createModeEqual = MetadataProfileCreateMode.get(GsonParser.parseInt(jsonObject.get("createModeEqual")));
		createModeNotEqual = MetadataProfileCreateMode.get(GsonParser.parseInt(jsonObject.get("createModeNotEqual")));
		createModeIn = GsonParser.parseString(jsonObject.get("createModeIn"));
		createModeNotIn = GsonParser.parseString(jsonObject.get("createModeNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataProfileBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("metadataObjectTypeEqual", this.metadataObjectTypeEqual);
		kparams.add("metadataObjectTypeIn", this.metadataObjectTypeIn);
		kparams.add("versionEqual", this.versionEqual);
		kparams.add("nameEqual", this.nameEqual);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("createModeEqual", this.createModeEqual);
		kparams.add("createModeNotEqual", this.createModeNotEqual);
		kparams.add("createModeIn", this.createModeIn);
		kparams.add("createModeNotIn", this.createModeNotIn);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.idEqual);
        dest.writeValue(this.partnerIdEqual);
        dest.writeInt(this.metadataObjectTypeEqual == null ? -1 : this.metadataObjectTypeEqual.ordinal());
        dest.writeString(this.metadataObjectTypeIn);
        dest.writeValue(this.versionEqual);
        dest.writeString(this.nameEqual);
        dest.writeString(this.systemNameEqual);
        dest.writeString(this.systemNameIn);
        dest.writeValue(this.createdAtGreaterThanOrEqual);
        dest.writeValue(this.createdAtLessThanOrEqual);
        dest.writeValue(this.updatedAtGreaterThanOrEqual);
        dest.writeValue(this.updatedAtLessThanOrEqual);
        dest.writeInt(this.statusEqual == null ? -1 : this.statusEqual.ordinal());
        dest.writeString(this.statusIn);
        dest.writeInt(this.createModeEqual == null ? -1 : this.createModeEqual.ordinal());
        dest.writeInt(this.createModeNotEqual == null ? -1 : this.createModeNotEqual.ordinal());
        dest.writeString(this.createModeIn);
        dest.writeString(this.createModeNotIn);
    }

    public MetadataProfileBaseFilter(Parcel in) {
        super(in);
        this.idEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpMetadataObjectTypeEqual = in.readInt();
        this.metadataObjectTypeEqual = tmpMetadataObjectTypeEqual == -1 ? null : MetadataObjectType.values()[tmpMetadataObjectTypeEqual];
        this.metadataObjectTypeIn = in.readString();
        this.versionEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.nameEqual = in.readString();
        this.systemNameEqual = in.readString();
        this.systemNameIn = in.readString();
        this.createdAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatusEqual = in.readInt();
        this.statusEqual = tmpStatusEqual == -1 ? null : MetadataProfileStatus.values()[tmpStatusEqual];
        this.statusIn = in.readString();
        int tmpCreateModeEqual = in.readInt();
        this.createModeEqual = tmpCreateModeEqual == -1 ? null : MetadataProfileCreateMode.values()[tmpCreateModeEqual];
        int tmpCreateModeNotEqual = in.readInt();
        this.createModeNotEqual = tmpCreateModeNotEqual == -1 ? null : MetadataProfileCreateMode.values()[tmpCreateModeNotEqual];
        this.createModeIn = in.readString();
        this.createModeNotIn = in.readString();
    }
}

