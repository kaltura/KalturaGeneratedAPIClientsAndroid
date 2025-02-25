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
import com.kaltura.client.enums.LanguageCode;
import com.kaltura.client.enums.UserMode;
import com.kaltura.client.enums.UserStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseUser.Tokenizer.class)
public class BaseUser extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String screenName();
		String fullName();
		String email();
		String country();
		String state();
		String city();
		String zip();
		String thumbnailUrl();
		String description();
		String tags();
		String adminTags();
		String status();
		String createdAt();
		String updatedAt();
		String partnerData();
		String indexedPartnerDataInt();
		String indexedPartnerDataString();
		String storageSize();
		String language();
		String lastLoginTime();
		String statusUpdatedAt();
		String deletedAt();
		String allowedPartnerIds();
		String allowedPartnerPackages();
		String userMode();
		RequestBuilder.ListTokenizer<UserCapability.Tokenizer> capabilities();
	}

	private String id;
	private Integer partnerId;
	private String screenName;
	private String fullName;
	private String email;
	private String country;
	private String state;
	private String city;
	private String zip;
	private String thumbnailUrl;
	private String description;
	private String tags;
	/**
	 * Admin tags can be updated only by using an admin session
	 */
	private String adminTags;
	private UserStatus status;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Long createdAt;
	/**
	 * Last update date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;
	/**
	 * Can be used to store various partner related data as a string
	 */
	private String partnerData;
	private Integer indexedPartnerDataInt;
	private String indexedPartnerDataString;
	private Integer storageSize;
	private LanguageCode language;
	private Integer lastLoginTime;
	private Integer statusUpdatedAt;
	private Long deletedAt;
	private String allowedPartnerIds;
	private String allowedPartnerPackages;
	private UserMode userMode;
	private List<UserCapability> capabilities;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// screenName:
	public String getScreenName(){
		return this.screenName;
	}
	public void setScreenName(String screenName){
		this.screenName = screenName;
	}

	public void screenName(String multirequestToken){
		setToken("screenName", multirequestToken);
	}

	// fullName:
	public String getFullName(){
		return this.fullName;
	}
	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public void fullName(String multirequestToken){
		setToken("fullName", multirequestToken);
	}

	// email:
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public void email(String multirequestToken){
		setToken("email", multirequestToken);
	}

	// country:
	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country = country;
	}

	public void country(String multirequestToken){
		setToken("country", multirequestToken);
	}

	// state:
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}

	public void state(String multirequestToken){
		setToken("state", multirequestToken);
	}

	// city:
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}

	public void city(String multirequestToken){
		setToken("city", multirequestToken);
	}

	// zip:
	public String getZip(){
		return this.zip;
	}
	public void setZip(String zip){
		this.zip = zip;
	}

	public void zip(String multirequestToken){
		setToken("zip", multirequestToken);
	}

	// thumbnailUrl:
	public String getThumbnailUrl(){
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public void thumbnailUrl(String multirequestToken){
		setToken("thumbnailUrl", multirequestToken);
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

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// adminTags:
	public String getAdminTags(){
		return this.adminTags;
	}
	public void setAdminTags(String adminTags){
		this.adminTags = adminTags;
	}

	public void adminTags(String multirequestToken){
		setToken("adminTags", multirequestToken);
	}

	// status:
	public UserStatus getStatus(){
		return this.status;
	}
	public void setStatus(UserStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// indexedPartnerDataInt:
	public Integer getIndexedPartnerDataInt(){
		return this.indexedPartnerDataInt;
	}
	public void setIndexedPartnerDataInt(Integer indexedPartnerDataInt){
		this.indexedPartnerDataInt = indexedPartnerDataInt;
	}

	public void indexedPartnerDataInt(String multirequestToken){
		setToken("indexedPartnerDataInt", multirequestToken);
	}

	// indexedPartnerDataString:
	public String getIndexedPartnerDataString(){
		return this.indexedPartnerDataString;
	}
	public void setIndexedPartnerDataString(String indexedPartnerDataString){
		this.indexedPartnerDataString = indexedPartnerDataString;
	}

	public void indexedPartnerDataString(String multirequestToken){
		setToken("indexedPartnerDataString", multirequestToken);
	}

	// storageSize:
	public Integer getStorageSize(){
		return this.storageSize;
	}
	// language:
	public LanguageCode getLanguage(){
		return this.language;
	}
	public void setLanguage(LanguageCode language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// lastLoginTime:
	public Integer getLastLoginTime(){
		return this.lastLoginTime;
	}
	// statusUpdatedAt:
	public Integer getStatusUpdatedAt(){
		return this.statusUpdatedAt;
	}
	// deletedAt:
	public Long getDeletedAt(){
		return this.deletedAt;
	}
	// allowedPartnerIds:
	public String getAllowedPartnerIds(){
		return this.allowedPartnerIds;
	}
	public void setAllowedPartnerIds(String allowedPartnerIds){
		this.allowedPartnerIds = allowedPartnerIds;
	}

	public void allowedPartnerIds(String multirequestToken){
		setToken("allowedPartnerIds", multirequestToken);
	}

	// allowedPartnerPackages:
	public String getAllowedPartnerPackages(){
		return this.allowedPartnerPackages;
	}
	public void setAllowedPartnerPackages(String allowedPartnerPackages){
		this.allowedPartnerPackages = allowedPartnerPackages;
	}

	public void allowedPartnerPackages(String multirequestToken){
		setToken("allowedPartnerPackages", multirequestToken);
	}

	// userMode:
	public UserMode getUserMode(){
		return this.userMode;
	}
	public void setUserMode(UserMode userMode){
		this.userMode = userMode;
	}

	public void userMode(String multirequestToken){
		setToken("userMode", multirequestToken);
	}

	// capabilities:
	public List<UserCapability> getCapabilities(){
		return this.capabilities;
	}
	public void setCapabilities(List<UserCapability> capabilities){
		this.capabilities = capabilities;
	}


	public BaseUser() {
		super();
	}

	public BaseUser(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		screenName = GsonParser.parseString(jsonObject.get("screenName"));
		fullName = GsonParser.parseString(jsonObject.get("fullName"));
		email = GsonParser.parseString(jsonObject.get("email"));
		country = GsonParser.parseString(jsonObject.get("country"));
		state = GsonParser.parseString(jsonObject.get("state"));
		city = GsonParser.parseString(jsonObject.get("city"));
		zip = GsonParser.parseString(jsonObject.get("zip"));
		thumbnailUrl = GsonParser.parseString(jsonObject.get("thumbnailUrl"));
		description = GsonParser.parseString(jsonObject.get("description"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		adminTags = GsonParser.parseString(jsonObject.get("adminTags"));
		status = UserStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		indexedPartnerDataInt = GsonParser.parseInt(jsonObject.get("indexedPartnerDataInt"));
		indexedPartnerDataString = GsonParser.parseString(jsonObject.get("indexedPartnerDataString"));
		storageSize = GsonParser.parseInt(jsonObject.get("storageSize"));
		language = LanguageCode.get(GsonParser.parseString(jsonObject.get("language")));
		lastLoginTime = GsonParser.parseInt(jsonObject.get("lastLoginTime"));
		statusUpdatedAt = GsonParser.parseInt(jsonObject.get("statusUpdatedAt"));
		deletedAt = GsonParser.parseLong(jsonObject.get("deletedAt"));
		allowedPartnerIds = GsonParser.parseString(jsonObject.get("allowedPartnerIds"));
		allowedPartnerPackages = GsonParser.parseString(jsonObject.get("allowedPartnerPackages"));
		userMode = UserMode.get(GsonParser.parseInt(jsonObject.get("userMode")));
		capabilities = GsonParser.parseArray(jsonObject.getAsJsonArray("capabilities"), UserCapability.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseUser");
		kparams.add("id", this.id);
		kparams.add("screenName", this.screenName);
		kparams.add("fullName", this.fullName);
		kparams.add("email", this.email);
		kparams.add("country", this.country);
		kparams.add("state", this.state);
		kparams.add("city", this.city);
		kparams.add("zip", this.zip);
		kparams.add("thumbnailUrl", this.thumbnailUrl);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("adminTags", this.adminTags);
		kparams.add("status", this.status);
		kparams.add("partnerData", this.partnerData);
		kparams.add("indexedPartnerDataInt", this.indexedPartnerDataInt);
		kparams.add("indexedPartnerDataString", this.indexedPartnerDataString);
		kparams.add("language", this.language);
		kparams.add("allowedPartnerIds", this.allowedPartnerIds);
		kparams.add("allowedPartnerPackages", this.allowedPartnerPackages);
		kparams.add("userMode", this.userMode);
		kparams.add("capabilities", this.capabilities);
		return kparams;
	}


    public static final Creator<BaseUser> CREATOR = new Creator<BaseUser>() {
        @Override
        public BaseUser createFromParcel(Parcel source) {
            return new BaseUser(source);
        }

        @Override
        public BaseUser[] newArray(int size) {
            return new BaseUser[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeValue(this.partnerId);
        dest.writeString(this.screenName);
        dest.writeString(this.fullName);
        dest.writeString(this.email);
        dest.writeString(this.country);
        dest.writeString(this.state);
        dest.writeString(this.city);
        dest.writeString(this.zip);
        dest.writeString(this.thumbnailUrl);
        dest.writeString(this.description);
        dest.writeString(this.tags);
        dest.writeString(this.adminTags);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeString(this.partnerData);
        dest.writeValue(this.indexedPartnerDataInt);
        dest.writeString(this.indexedPartnerDataString);
        dest.writeValue(this.storageSize);
        dest.writeInt(this.language == null ? -1 : this.language.ordinal());
        dest.writeValue(this.lastLoginTime);
        dest.writeValue(this.statusUpdatedAt);
        dest.writeValue(this.deletedAt);
        dest.writeString(this.allowedPartnerIds);
        dest.writeString(this.allowedPartnerPackages);
        dest.writeInt(this.userMode == null ? -1 : this.userMode.ordinal());
        if(this.capabilities != null) {
            dest.writeInt(this.capabilities.size());
            dest.writeList(this.capabilities);
        } else {
            dest.writeInt(-1);
        }
    }

    public BaseUser(Parcel in) {
        super(in);
        this.id = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.screenName = in.readString();
        this.fullName = in.readString();
        this.email = in.readString();
        this.country = in.readString();
        this.state = in.readString();
        this.city = in.readString();
        this.zip = in.readString();
        this.thumbnailUrl = in.readString();
        this.description = in.readString();
        this.tags = in.readString();
        this.adminTags = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : UserStatus.values()[tmpStatus];
        this.createdAt = (Long)in.readValue(Long.class.getClassLoader());
        this.updatedAt = (Long)in.readValue(Long.class.getClassLoader());
        this.partnerData = in.readString();
        this.indexedPartnerDataInt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.indexedPartnerDataString = in.readString();
        this.storageSize = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpLanguage = in.readInt();
        this.language = tmpLanguage == -1 ? null : LanguageCode.values()[tmpLanguage];
        this.lastLoginTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.statusUpdatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.deletedAt = (Long)in.readValue(Long.class.getClassLoader());
        this.allowedPartnerIds = in.readString();
        this.allowedPartnerPackages = in.readString();
        int tmpUserMode = in.readInt();
        this.userMode = tmpUserMode == -1 ? null : UserMode.values()[tmpUserMode];
        int capabilitiesSize = in.readInt();
        if( capabilitiesSize > -1) {
            this.capabilities = new ArrayList<>();
            in.readList(this.capabilities, UserCapability.class.getClassLoader());
        }
    }
}

