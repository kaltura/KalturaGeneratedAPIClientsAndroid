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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AccessControlProfile.Tokenizer.class)
public class AccessControlProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String name();
		String systemName();
		String description();
		String createdAt();
		String updatedAt();
		String isDefault();
		RequestBuilder.ListTokenizer<Rule.Tokenizer> rules();
	}

	/**
	 * The id of the Access Control Profile
	 */
	private Integer id;
	private Integer partnerId;
	/**
	 * The name of the Access Control Profile
	 */
	private String name;
	/**
	 * System name of the Access Control Profile
	 */
	private String systemName;
	/**
	 * The description of the Access Control Profile
	 */
	private String description;
	/**
	 * Creation time as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Update time as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * True if this access control profile is the partner default
	 */
	private Boolean isDefault;
	/**
	 * Array of access control rules
	 */
	private List<Rule> rules;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
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
	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	public void isDefault(String multirequestToken){
		setToken("isDefault", multirequestToken);
	}

	// rules:
	public List<Rule> getRules(){
		return this.rules;
	}
	public void setRules(List<Rule> rules){
		this.rules = rules;
	}


	public AccessControlProfile() {
		super();
	}

	public AccessControlProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		rules = GsonParser.parseArray(jsonObject.getAsJsonArray("rules"), Rule.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAccessControlProfile");
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("isDefault", this.isDefault);
		kparams.add("rules", this.rules);
		return kparams;
	}


    public static final Creator<AccessControlProfile> CREATOR = new Creator<AccessControlProfile>() {
        @Override
        public AccessControlProfile createFromParcel(Parcel source) {
            return new AccessControlProfile(source);
        }

        @Override
        public AccessControlProfile[] newArray(int size) {
            return new AccessControlProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeString(this.description);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeValue(this.isDefault);
        if(this.rules != null) {
            dest.writeInt(this.rules.size());
            dest.writeList(this.rules);
        } else {
            dest.writeInt(-1);
        }
    }

    public AccessControlProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.systemName = in.readString();
        this.description = in.readString();
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.isDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int rulesSize = in.readInt();
        if( rulesSize > -1) {
            this.rules = new ArrayList<>();
            in.readList(this.rules, Rule.class.getClassLoader());
        }
    }
}

