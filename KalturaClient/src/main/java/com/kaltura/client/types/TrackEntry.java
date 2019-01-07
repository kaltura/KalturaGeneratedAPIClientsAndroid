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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.TrackEntryEventType;
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
@MultiRequestBuilder.Tokenizer(TrackEntry.Tokenizer.class)
public class TrackEntry extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String trackEventType();
		String psVersion();
		String context();
		String partnerId();
		String entryId();
		String hostName();
		String userId();
		String changedProperties();
		String paramStr1();
		String paramStr2();
		String paramStr3();
		String ks();
		String description();
		String createdAt();
		String updatedAt();
		String userIp();
	}

	private Integer id;
	private TrackEntryEventType trackEventType;
	private String psVersion;
	private String context;
	private Integer partnerId;
	private String entryId;
	private String hostName;
	private String userId;
	private String changedProperties;
	private String paramStr1;
	private String paramStr2;
	private String paramStr3;
	private String ks;
	private String description;
	private Integer createdAt;
	private Integer updatedAt;
	private String userIp;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// trackEventType:
	public TrackEntryEventType getTrackEventType(){
		return this.trackEventType;
	}
	public void setTrackEventType(TrackEntryEventType trackEventType){
		this.trackEventType = trackEventType;
	}

	public void trackEventType(String multirequestToken){
		setToken("trackEventType", multirequestToken);
	}

	// psVersion:
	public String getPsVersion(){
		return this.psVersion;
	}
	public void setPsVersion(String psVersion){
		this.psVersion = psVersion;
	}

	public void psVersion(String multirequestToken){
		setToken("psVersion", multirequestToken);
	}

	// context:
	public String getContext(){
		return this.context;
	}
	public void setContext(String context){
		this.context = context;
	}

	public void context(String multirequestToken){
		setToken("context", multirequestToken);
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

	// hostName:
	public String getHostName(){
		return this.hostName;
	}
	public void setHostName(String hostName){
		this.hostName = hostName;
	}

	public void hostName(String multirequestToken){
		setToken("hostName", multirequestToken);
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

	// changedProperties:
	public String getChangedProperties(){
		return this.changedProperties;
	}
	public void setChangedProperties(String changedProperties){
		this.changedProperties = changedProperties;
	}

	public void changedProperties(String multirequestToken){
		setToken("changedProperties", multirequestToken);
	}

	// paramStr1:
	public String getParamStr1(){
		return this.paramStr1;
	}
	public void setParamStr1(String paramStr1){
		this.paramStr1 = paramStr1;
	}

	public void paramStr1(String multirequestToken){
		setToken("paramStr1", multirequestToken);
	}

	// paramStr2:
	public String getParamStr2(){
		return this.paramStr2;
	}
	public void setParamStr2(String paramStr2){
		this.paramStr2 = paramStr2;
	}

	public void paramStr2(String multirequestToken){
		setToken("paramStr2", multirequestToken);
	}

	// paramStr3:
	public String getParamStr3(){
		return this.paramStr3;
	}
	public void setParamStr3(String paramStr3){
		this.paramStr3 = paramStr3;
	}

	public void paramStr3(String multirequestToken){
		setToken("paramStr3", multirequestToken);
	}

	// ks:
	public String getKs(){
		return this.ks;
	}
	public void setKs(String ks){
		this.ks = ks;
	}

	public void ks(String multirequestToken){
		setToken("ks", multirequestToken);
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
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// userIp:
	public String getUserIp(){
		return this.userIp;
	}
	public void setUserIp(String userIp){
		this.userIp = userIp;
	}

	public void userIp(String multirequestToken){
		setToken("userIp", multirequestToken);
	}


	public TrackEntry() {
		super();
	}

	public TrackEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		trackEventType = TrackEntryEventType.get(GsonParser.parseInt(jsonObject.get("trackEventType")));
		psVersion = GsonParser.parseString(jsonObject.get("psVersion"));
		context = GsonParser.parseString(jsonObject.get("context"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		hostName = GsonParser.parseString(jsonObject.get("hostName"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		changedProperties = GsonParser.parseString(jsonObject.get("changedProperties"));
		paramStr1 = GsonParser.parseString(jsonObject.get("paramStr1"));
		paramStr2 = GsonParser.parseString(jsonObject.get("paramStr2"));
		paramStr3 = GsonParser.parseString(jsonObject.get("paramStr3"));
		ks = GsonParser.parseString(jsonObject.get("ks"));
		description = GsonParser.parseString(jsonObject.get("description"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		userIp = GsonParser.parseString(jsonObject.get("userIp"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTrackEntry");
		kparams.add("id", this.id);
		kparams.add("trackEventType", this.trackEventType);
		kparams.add("psVersion", this.psVersion);
		kparams.add("context", this.context);
		kparams.add("partnerId", this.partnerId);
		kparams.add("entryId", this.entryId);
		kparams.add("hostName", this.hostName);
		kparams.add("userId", this.userId);
		kparams.add("changedProperties", this.changedProperties);
		kparams.add("paramStr1", this.paramStr1);
		kparams.add("paramStr2", this.paramStr2);
		kparams.add("paramStr3", this.paramStr3);
		kparams.add("ks", this.ks);
		kparams.add("description", this.description);
		kparams.add("createdAt", this.createdAt);
		kparams.add("updatedAt", this.updatedAt);
		kparams.add("userIp", this.userIp);
		return kparams;
	}


    public static final Creator<TrackEntry> CREATOR = new Creator<TrackEntry>() {
        @Override
        public TrackEntry createFromParcel(Parcel source) {
            return new TrackEntry(source);
        }

        @Override
        public TrackEntry[] newArray(int size) {
            return new TrackEntry[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeInt(this.trackEventType == null ? -1 : this.trackEventType.ordinal());
        dest.writeString(this.psVersion);
        dest.writeString(this.context);
        dest.writeValue(this.partnerId);
        dest.writeString(this.entryId);
        dest.writeString(this.hostName);
        dest.writeString(this.userId);
        dest.writeString(this.changedProperties);
        dest.writeString(this.paramStr1);
        dest.writeString(this.paramStr2);
        dest.writeString(this.paramStr3);
        dest.writeString(this.ks);
        dest.writeString(this.description);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeString(this.userIp);
    }

    public TrackEntry(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpTrackEventType = in.readInt();
        this.trackEventType = tmpTrackEventType == -1 ? null : TrackEntryEventType.values()[tmpTrackEventType];
        this.psVersion = in.readString();
        this.context = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryId = in.readString();
        this.hostName = in.readString();
        this.userId = in.readString();
        this.changedProperties = in.readString();
        this.paramStr1 = in.readString();
        this.paramStr2 = in.readString();
        this.paramStr3 = in.readString();
        this.ks = in.readString();
        this.description = in.readString();
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userIp = in.readString();
    }
}

