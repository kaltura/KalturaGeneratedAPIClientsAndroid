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
import com.kaltura.client.enums.UserEntryExtendedStatus;
import com.kaltura.client.enums.UserEntryStatus;
import com.kaltura.client.enums.UserEntryType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserEntry.Tokenizer.class)
public abstract class UserEntry extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String entryId();
		String userId();
		String partnerId();
		String status();
		String createdAt();
		String updatedAt();
		String type();
		String extendedStatus();
	}

	/**
	 * unique auto-generated identifier
	 */
	private Long id;
	private String entryId;
	private String userId;
	private Integer partnerId;
	private UserEntryStatus status;
	private Integer createdAt;
	private Integer updatedAt;
	private UserEntryType type;
	private UserEntryExtendedStatus extendedStatus;

	// id:
	public Long getId(){
		return this.id;
	}
	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// status:
	public UserEntryStatus getStatus(){
		return this.status;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// type:
	public UserEntryType getType(){
		return this.type;
	}
	// extendedStatus:
	public UserEntryExtendedStatus getExtendedStatus(){
		return this.extendedStatus;
	}
	public void setExtendedStatus(UserEntryExtendedStatus extendedStatus){
		this.extendedStatus = extendedStatus;
	}

	public void extendedStatus(String multirequestToken){
		setToken("extendedStatus", multirequestToken);
	}


	public UserEntry() {
		super();
	}

	public UserEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		status = UserEntryStatus.get(GsonParser.parseString(jsonObject.get("status")));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		type = UserEntryType.get(GsonParser.parseString(jsonObject.get("type")));
		extendedStatus = UserEntryExtendedStatus.get(GsonParser.parseString(jsonObject.get("extendedStatus")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserEntry");
		kparams.add("entryId", this.entryId);
		kparams.add("userId", this.userId);
		kparams.add("extendedStatus", this.extendedStatus);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.entryId);
        dest.writeString(this.userId);
        dest.writeValue(this.partnerId);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeInt(this.extendedStatus == null ? -1 : this.extendedStatus.ordinal());
    }

    public UserEntry(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.entryId = in.readString();
        this.userId = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : UserEntryStatus.values()[tmpStatus];
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : UserEntryType.values()[tmpType];
        int tmpExtendedStatus = in.readInt();
        this.extendedStatus = tmpExtendedStatus == -1 ? null : UserEntryExtendedStatus.values()[tmpExtendedStatus];
    }
}

