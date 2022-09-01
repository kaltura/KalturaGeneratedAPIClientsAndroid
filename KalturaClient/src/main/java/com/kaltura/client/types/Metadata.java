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
import com.kaltura.client.enums.MetadataStatus;
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
@MultiRequestBuilder.Tokenizer(Metadata.Tokenizer.class)
public class Metadata extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String metadataProfileId();
		String metadataProfileVersion();
		String metadataObjectType();
		String objectId();
		String version();
		String createdAt();
		String updatedAt();
		String status();
		String xml();
	}

	private Integer id;
	private Integer partnerId;
	private Integer metadataProfileId;
	private Integer metadataProfileVersion;
	private MetadataObjectType metadataObjectType;
	private String objectId;
	private Integer version;
	private Integer createdAt;
	private Integer updatedAt;
	private MetadataStatus status;
	private String xml;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	// metadataProfileVersion:
	public Integer getMetadataProfileVersion(){
		return this.metadataProfileVersion;
	}
	// metadataObjectType:
	public MetadataObjectType getMetadataObjectType(){
		return this.metadataObjectType;
	}
	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	// version:
	public Integer getVersion(){
		return this.version;
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
	public MetadataStatus getStatus(){
		return this.status;
	}
	// xml:
	public String getXml(){
		return this.xml;
	}

	public Metadata() {
		super();
	}

	public Metadata(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		metadataProfileVersion = GsonParser.parseInt(jsonObject.get("metadataProfileVersion"));
		metadataObjectType = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectType")));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		version = GsonParser.parseInt(jsonObject.get("version"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = MetadataStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		xml = GsonParser.parseString(jsonObject.get("xml"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadata");
		return kparams;
	}


    public static final Creator<Metadata> CREATOR = new Creator<Metadata>() {
        @Override
        public Metadata createFromParcel(Parcel source) {
            return new Metadata(source);
        }

        @Override
        public Metadata[] newArray(int size) {
            return new Metadata[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.metadataProfileId);
        dest.writeValue(this.metadataProfileVersion);
        dest.writeInt(this.metadataObjectType == null ? -1 : this.metadataObjectType.ordinal());
        dest.writeString(this.objectId);
        dest.writeValue(this.version);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeString(this.xml);
    }

    public Metadata(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.metadataProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.metadataProfileVersion = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpMetadataObjectType = in.readInt();
        this.metadataObjectType = tmpMetadataObjectType == -1 ? null : MetadataObjectType.values()[tmpMetadataObjectType];
        this.objectId = in.readString();
        this.version = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : MetadataStatus.values()[tmpStatus];
        this.xml = in.readString();
    }
}

