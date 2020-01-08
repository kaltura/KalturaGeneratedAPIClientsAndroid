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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.AppTokenHashType;
import com.kaltura.client.enums.AppTokenStatus;
import com.kaltura.client.enums.SessionType;
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
@MultiRequestBuilder.Tokenizer(AppToken.Tokenizer.class)
public class AppToken extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String token();
		String partnerId();
		String createdAt();
		String updatedAt();
		String status();
		String expiry();
		String sessionType();
		String sessionUserId();
		String sessionDuration();
		String sessionPrivileges();
		String hashType();
		String description();
	}

	/**
	 * The id of the application token
	 */
	private String id;
	/**
	 * The application token
	 */
	private String token;
	private Integer partnerId;
	/**
	 * Creation time as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Update time as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * Application token status
	 */
	private AppTokenStatus status;
	/**
	 * Expiry time of current token (unix timestamp in seconds)
	 */
	private Integer expiry;
	/**
	 * Type of KS (Kaltura Session) that created using the current token
	 */
	private SessionType sessionType;
	/**
	 * User id of KS (Kaltura Session) that created using the current token
	 */
	private String sessionUserId;
	/**
	 * Expiry duration of KS (Kaltura Session) that created using the current token (in
	  seconds)
	 */
	private Integer sessionDuration;
	/**
	 * Comma separated privileges to be applied on KS (Kaltura Session) that created
	  using the current token
	 */
	private String sessionPrivileges;
	private AppTokenHashType hashType;
	private String description;

	// id:
	public String getId(){
		return this.id;
	}
	// token:
	public String getToken(){
		return this.token;
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
	public AppTokenStatus getStatus(){
		return this.status;
	}
	// expiry:
	public Integer getExpiry(){
		return this.expiry;
	}
	public void setExpiry(Integer expiry){
		this.expiry = expiry;
	}

	public void expiry(String multirequestToken){
		setToken("expiry", multirequestToken);
	}

	// sessionType:
	public SessionType getSessionType(){
		return this.sessionType;
	}
	public void setSessionType(SessionType sessionType){
		this.sessionType = sessionType;
	}

	public void sessionType(String multirequestToken){
		setToken("sessionType", multirequestToken);
	}

	// sessionUserId:
	public String getSessionUserId(){
		return this.sessionUserId;
	}
	public void setSessionUserId(String sessionUserId){
		this.sessionUserId = sessionUserId;
	}

	public void sessionUserId(String multirequestToken){
		setToken("sessionUserId", multirequestToken);
	}

	// sessionDuration:
	public Integer getSessionDuration(){
		return this.sessionDuration;
	}
	public void setSessionDuration(Integer sessionDuration){
		this.sessionDuration = sessionDuration;
	}

	public void sessionDuration(String multirequestToken){
		setToken("sessionDuration", multirequestToken);
	}

	// sessionPrivileges:
	public String getSessionPrivileges(){
		return this.sessionPrivileges;
	}
	public void setSessionPrivileges(String sessionPrivileges){
		this.sessionPrivileges = sessionPrivileges;
	}

	public void sessionPrivileges(String multirequestToken){
		setToken("sessionPrivileges", multirequestToken);
	}

	// hashType:
	public AppTokenHashType getHashType(){
		return this.hashType;
	}
	public void setHashType(AppTokenHashType hashType){
		this.hashType = hashType;
	}

	public void hashType(String multirequestToken){
		setToken("hashType", multirequestToken);
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


	public AppToken() {
		super();
	}

	public AppToken(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		token = GsonParser.parseString(jsonObject.get("token"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = AppTokenStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		expiry = GsonParser.parseInt(jsonObject.get("expiry"));
		sessionType = SessionType.get(GsonParser.parseInt(jsonObject.get("sessionType")));
		sessionUserId = GsonParser.parseString(jsonObject.get("sessionUserId"));
		sessionDuration = GsonParser.parseInt(jsonObject.get("sessionDuration"));
		sessionPrivileges = GsonParser.parseString(jsonObject.get("sessionPrivileges"));
		hashType = AppTokenHashType.get(GsonParser.parseString(jsonObject.get("hashType")));
		description = GsonParser.parseString(jsonObject.get("description"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAppToken");
		kparams.add("expiry", this.expiry);
		kparams.add("sessionType", this.sessionType);
		kparams.add("sessionUserId", this.sessionUserId);
		kparams.add("sessionDuration", this.sessionDuration);
		kparams.add("sessionPrivileges", this.sessionPrivileges);
		kparams.add("hashType", this.hashType);
		kparams.add("description", this.description);
		return kparams;
	}


    public static final Creator<AppToken> CREATOR = new Creator<AppToken>() {
        @Override
        public AppToken createFromParcel(Parcel source) {
            return new AppToken(source);
        }

        @Override
        public AppToken[] newArray(int size) {
            return new AppToken[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.token);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.expiry);
        dest.writeInt(this.sessionType == null ? -1 : this.sessionType.ordinal());
        dest.writeString(this.sessionUserId);
        dest.writeValue(this.sessionDuration);
        dest.writeString(this.sessionPrivileges);
        dest.writeInt(this.hashType == null ? -1 : this.hashType.ordinal());
        dest.writeString(this.description);
    }

    public AppToken(Parcel in) {
        super(in);
        this.id = in.readString();
        this.token = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : AppTokenStatus.values()[tmpStatus];
        this.expiry = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpSessionType = in.readInt();
        this.sessionType = tmpSessionType == -1 ? null : SessionType.values()[tmpSessionType];
        this.sessionUserId = in.readString();
        this.sessionDuration = (Integer)in.readValue(Integer.class.getClassLoader());
        this.sessionPrivileges = in.readString();
        int tmpHashType = in.readInt();
        this.hashType = tmpHashType == -1 ? null : AppTokenHashType.values()[tmpHashType];
        this.description = in.readString();
    }
}

