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
import com.kaltura.client.enums.ResponseProfileStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ResponseProfile.Tokenizer.class)
public class ResponseProfile extends DetachedResponseProfile {
	
	public interface Tokenizer extends DetachedResponseProfile.Tokenizer {
		String id();
		String systemName();
		String partnerId();
		String createdAt();
		String updatedAt();
		String status();
		String version();
	}

	/**
	 * Auto generated numeric identifier
	 */
	private Long id;
	/**
	 * Unique system name
	 */
	private String systemName;
	private Integer partnerId;
	/**
	 * Creation time as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Update time as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	private ResponseProfileStatus status;
	private Integer version;

	// id:
	public Long getId(){
		return this.id;
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

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
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
	public ResponseProfileStatus getStatus(){
		return this.status;
	}
	// version:
	public Integer getVersion(){
		return this.version;
	}

	public ResponseProfile() {
		super();
	}

	public ResponseProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = ResponseProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		version = GsonParser.parseInt(jsonObject.get("version"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResponseProfile");
		kparams.add("systemName", this.systemName);
		return kparams;
	}


    public static final Creator<ResponseProfile> CREATOR = new Creator<ResponseProfile>() {
        @Override
        public ResponseProfile createFromParcel(Parcel source) {
            return new ResponseProfile(source);
        }

        @Override
        public ResponseProfile[] newArray(int size) {
            return new ResponseProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.systemName);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.version);
    }

    public ResponseProfile(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.systemName = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : ResponseProfileStatus.values()[tmpStatus];
        this.version = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

