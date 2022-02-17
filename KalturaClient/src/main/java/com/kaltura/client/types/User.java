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
import com.kaltura.client.enums.Gender;
import com.kaltura.client.enums.UserType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(User.Tokenizer.class)
public class User extends BaseUser {
	
	public interface Tokenizer extends BaseUser.Tokenizer {
		String type();
		String dateOfBirth();
		String gender();
		String isAdmin();
		String roleIds();
		String roleNames();
		String isAccountOwner();
		String password();
		String firstName();
		String lastName();
		String loginEnabled();
		String registrationInfo();
		String attendanceInfo();
		String title();
		String company();
		String ksPrivileges();
		String encryptedSeed();
	}

	private UserType type;
	private Integer dateOfBirth;
	private Gender gender;
	private Boolean isAdmin;
	private String roleIds;
	private String roleNames;
	private Boolean isAccountOwner;
	private String password;
	private String firstName;
	private String lastName;
	private Boolean loginEnabled;
	private String registrationInfo;
	private String attendanceInfo;
	private String title;
	private String company;
	private String ksPrivileges;
	private String encryptedSeed;

	// type:
	public UserType getType(){
		return this.type;
	}
	public void setType(UserType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// dateOfBirth:
	public Integer getDateOfBirth(){
		return this.dateOfBirth;
	}
	public void setDateOfBirth(Integer dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public void dateOfBirth(String multirequestToken){
		setToken("dateOfBirth", multirequestToken);
	}

	// gender:
	public Gender getGender(){
		return this.gender;
	}
	public void setGender(Gender gender){
		this.gender = gender;
	}

	public void gender(String multirequestToken){
		setToken("gender", multirequestToken);
	}

	// isAdmin:
	public Boolean getIsAdmin(){
		return this.isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin){
		this.isAdmin = isAdmin;
	}

	public void isAdmin(String multirequestToken){
		setToken("isAdmin", multirequestToken);
	}

	// roleIds:
	public String getRoleIds(){
		return this.roleIds;
	}
	public void setRoleIds(String roleIds){
		this.roleIds = roleIds;
	}

	public void roleIds(String multirequestToken){
		setToken("roleIds", multirequestToken);
	}

	// roleNames:
	public String getRoleNames(){
		return this.roleNames;
	}
	// isAccountOwner:
	public Boolean getIsAccountOwner(){
		return this.isAccountOwner;
	}
	public void setIsAccountOwner(Boolean isAccountOwner){
		this.isAccountOwner = isAccountOwner;
	}

	public void isAccountOwner(String multirequestToken){
		setToken("isAccountOwner", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
	}

	// firstName:
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void firstName(String multirequestToken){
		setToken("firstName", multirequestToken);
	}

	// lastName:
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void lastName(String multirequestToken){
		setToken("lastName", multirequestToken);
	}

	// loginEnabled:
	public Boolean getLoginEnabled(){
		return this.loginEnabled;
	}
	public void setLoginEnabled(Boolean loginEnabled){
		this.loginEnabled = loginEnabled;
	}

	public void loginEnabled(String multirequestToken){
		setToken("loginEnabled", multirequestToken);
	}

	// registrationInfo:
	public String getRegistrationInfo(){
		return this.registrationInfo;
	}
	public void setRegistrationInfo(String registrationInfo){
		this.registrationInfo = registrationInfo;
	}

	public void registrationInfo(String multirequestToken){
		setToken("registrationInfo", multirequestToken);
	}

	// attendanceInfo:
	public String getAttendanceInfo(){
		return this.attendanceInfo;
	}
	public void setAttendanceInfo(String attendanceInfo){
		this.attendanceInfo = attendanceInfo;
	}

	public void attendanceInfo(String multirequestToken){
		setToken("attendanceInfo", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// company:
	public String getCompany(){
		return this.company;
	}
	public void setCompany(String company){
		this.company = company;
	}

	public void company(String multirequestToken){
		setToken("company", multirequestToken);
	}

	// ksPrivileges:
	public String getKsPrivileges(){
		return this.ksPrivileges;
	}
	public void setKsPrivileges(String ksPrivileges){
		this.ksPrivileges = ksPrivileges;
	}

	public void ksPrivileges(String multirequestToken){
		setToken("ksPrivileges", multirequestToken);
	}

	// encryptedSeed:
	public String getEncryptedSeed(){
		return this.encryptedSeed;
	}

	public User() {
		super();
	}

	public User(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = UserType.get(GsonParser.parseInt(jsonObject.get("type")));
		dateOfBirth = GsonParser.parseInt(jsonObject.get("dateOfBirth"));
		gender = Gender.get(GsonParser.parseInt(jsonObject.get("gender")));
		isAdmin = GsonParser.parseBoolean(jsonObject.get("isAdmin"));
		roleIds = GsonParser.parseString(jsonObject.get("roleIds"));
		roleNames = GsonParser.parseString(jsonObject.get("roleNames"));
		isAccountOwner = GsonParser.parseBoolean(jsonObject.get("isAccountOwner"));
		password = GsonParser.parseString(jsonObject.get("password"));
		firstName = GsonParser.parseString(jsonObject.get("firstName"));
		lastName = GsonParser.parseString(jsonObject.get("lastName"));
		loginEnabled = GsonParser.parseBoolean(jsonObject.get("loginEnabled"));
		registrationInfo = GsonParser.parseString(jsonObject.get("registrationInfo"));
		attendanceInfo = GsonParser.parseString(jsonObject.get("attendanceInfo"));
		title = GsonParser.parseString(jsonObject.get("title"));
		company = GsonParser.parseString(jsonObject.get("company"));
		ksPrivileges = GsonParser.parseString(jsonObject.get("ksPrivileges"));
		encryptedSeed = GsonParser.parseString(jsonObject.get("encryptedSeed"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUser");
		kparams.add("type", this.type);
		kparams.add("dateOfBirth", this.dateOfBirth);
		kparams.add("gender", this.gender);
		kparams.add("isAdmin", this.isAdmin);
		kparams.add("roleIds", this.roleIds);
		kparams.add("isAccountOwner", this.isAccountOwner);
		kparams.add("password", this.password);
		kparams.add("firstName", this.firstName);
		kparams.add("lastName", this.lastName);
		kparams.add("loginEnabled", this.loginEnabled);
		kparams.add("registrationInfo", this.registrationInfo);
		kparams.add("attendanceInfo", this.attendanceInfo);
		kparams.add("title", this.title);
		kparams.add("company", this.company);
		kparams.add("ksPrivileges", this.ksPrivileges);
		return kparams;
	}


    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeValue(this.dateOfBirth);
        dest.writeInt(this.gender == null ? -1 : this.gender.ordinal());
        dest.writeValue(this.isAdmin);
        dest.writeString(this.roleIds);
        dest.writeString(this.roleNames);
        dest.writeValue(this.isAccountOwner);
        dest.writeString(this.password);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeValue(this.loginEnabled);
        dest.writeString(this.registrationInfo);
        dest.writeString(this.attendanceInfo);
        dest.writeString(this.title);
        dest.writeString(this.company);
        dest.writeString(this.ksPrivileges);
        dest.writeString(this.encryptedSeed);
    }

    public User(Parcel in) {
        super(in);
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : UserType.values()[tmpType];
        this.dateOfBirth = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpGender = in.readInt();
        this.gender = tmpGender == -1 ? null : Gender.values()[tmpGender];
        this.isAdmin = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.roleIds = in.readString();
        this.roleNames = in.readString();
        this.isAccountOwner = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.password = in.readString();
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.loginEnabled = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.registrationInfo = in.readString();
        this.attendanceInfo = in.readString();
        this.title = in.readString();
        this.company = in.readString();
        this.ksPrivileges = in.readString();
        this.encryptedSeed = in.readString();
    }
}

