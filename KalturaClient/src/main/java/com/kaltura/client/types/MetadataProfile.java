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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.enums.MetadataProfileCreateMode;
import com.kaltura.client.enums.MetadataProfileStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataProfile.Tokenizer.class)
public class MetadataProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String metadataObjectType();
		String version();
		String name();
		String systemName();
		String description();
		String createdAt();
		String updatedAt();
		String status();
		String xsd();
		String views();
		String xslt();
		String createMode();
		String disableReIndexing();
	}

	private Integer id;
	private Integer partnerId;
	private MetadataObjectType metadataObjectType;
	private Integer version;
	private String name;
	private String systemName;
	private String description;
	private Integer createdAt;
	private Integer updatedAt;
	private MetadataProfileStatus status;
	private String xsd;
	private String views;
	private String xslt;
	private MetadataProfileCreateMode createMode;
	private Boolean disableReIndexing;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// metadataObjectType:
	public MetadataObjectType getMetadataObjectType(){
		return this.metadataObjectType;
	}
	public void setMetadataObjectType(MetadataObjectType metadataObjectType){
		this.metadataObjectType = metadataObjectType;
	}

	public void metadataObjectType(String multirequestToken){
		setToken("metadataObjectType", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
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

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// status:
	public MetadataProfileStatus getStatus(){
		return this.status;
	}
	// xsd:
	public String getXsd(){
		return this.xsd;
	}
	// views:
	public String getViews(){
		return this.views;
	}
	// xslt:
	public String getXslt(){
		return this.xslt;
	}
	// createMode:
	public MetadataProfileCreateMode getCreateMode(){
		return this.createMode;
	}
	public void setCreateMode(MetadataProfileCreateMode createMode){
		this.createMode = createMode;
	}

	public void createMode(String multirequestToken){
		setToken("createMode", multirequestToken);
	}

	// disableReIndexing:
	public Boolean getDisableReIndexing(){
		return this.disableReIndexing;
	}
	public void setDisableReIndexing(Boolean disableReIndexing){
		this.disableReIndexing = disableReIndexing;
	}

	public void disableReIndexing(String multirequestToken){
		setToken("disableReIndexing", multirequestToken);
	}


	public MetadataProfile() {
		super();
	}

	public MetadataProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		metadataObjectType = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectType")));
		version = GsonParser.parseInt(jsonObject.get("version"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = MetadataProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		xsd = GsonParser.parseString(jsonObject.get("xsd"));
		views = GsonParser.parseString(jsonObject.get("views"));
		xslt = GsonParser.parseString(jsonObject.get("xslt"));
		createMode = MetadataProfileCreateMode.get(GsonParser.parseInt(jsonObject.get("createMode")));
		disableReIndexing = GsonParser.parseBoolean(jsonObject.get("disableReIndexing"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataProfile");
		kparams.add("metadataObjectType", this.metadataObjectType);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("createMode", this.createMode);
		kparams.add("disableReIndexing", this.disableReIndexing);
		return kparams;
	}


    public static final Creator<MetadataProfile> CREATOR = new Creator<MetadataProfile>() {
        @Override
        public MetadataProfile createFromParcel(Parcel source) {
            return new MetadataProfile(source);
        }

        @Override
        public MetadataProfile[] newArray(int size) {
            return new MetadataProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeInt(this.metadataObjectType == null ? -1 : this.metadataObjectType.ordinal());
        dest.writeValue(this.version);
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeString(this.description);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeString(this.xsd);
        dest.writeString(this.views);
        dest.writeString(this.xslt);
        dest.writeInt(this.createMode == null ? -1 : this.createMode.ordinal());
        dest.writeValue(this.disableReIndexing);
    }

    public MetadataProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpMetadataObjectType = in.readInt();
        this.metadataObjectType = tmpMetadataObjectType == -1 ? null : MetadataObjectType.values()[tmpMetadataObjectType];
        this.version = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.systemName = in.readString();
        this.description = in.readString();
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : MetadataProfileStatus.values()[tmpStatus];
        this.xsd = in.readString();
        this.views = in.readString();
        this.xslt = in.readString();
        int tmpCreateMode = in.readInt();
        this.createMode = tmpCreateMode == -1 ? null : MetadataProfileCreateMode.values()[tmpCreateMode];
        this.disableReIndexing = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

