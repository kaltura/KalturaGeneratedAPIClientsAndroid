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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AuthInfo.Tokenizer.class)
public class AuthInfo extends SessionInfo {
	
	public interface Tokenizer extends SessionInfo.Tokenizer {
		String kuserId();
		String roleIds();
		String sessionPermissions();
	}

	private Integer kuserId;
	private Integer roleIds;
	private String sessionPermissions;

	// kuserId:
	public Integer getKuserId(){
		return this.kuserId;
	}
	public void setKuserId(Integer kuserId){
		this.kuserId = kuserId;
	}

	public void kuserId(String multirequestToken){
		setToken("kuserId", multirequestToken);
	}

	// roleIds:
	public Integer getRoleIds(){
		return this.roleIds;
	}
	public void setRoleIds(Integer roleIds){
		this.roleIds = roleIds;
	}

	public void roleIds(String multirequestToken){
		setToken("roleIds", multirequestToken);
	}

	// sessionPermissions:
	public String getSessionPermissions(){
		return this.sessionPermissions;
	}
	public void setSessionPermissions(String sessionPermissions){
		this.sessionPermissions = sessionPermissions;
	}

	public void sessionPermissions(String multirequestToken){
		setToken("sessionPermissions", multirequestToken);
	}


	public AuthInfo() {
		super();
	}

	public AuthInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		kuserId = GsonParser.parseInt(jsonObject.get("kuserId"));
		roleIds = GsonParser.parseInt(jsonObject.get("roleIds"));
		sessionPermissions = GsonParser.parseString(jsonObject.get("sessionPermissions"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuthInfo");
		kparams.add("kuserId", this.kuserId);
		kparams.add("roleIds", this.roleIds);
		kparams.add("sessionPermissions", this.sessionPermissions);
		return kparams;
	}


    public static final Creator<AuthInfo> CREATOR = new Creator<AuthInfo>() {
        @Override
        public AuthInfo createFromParcel(Parcel source) {
            return new AuthInfo(source);
        }

        @Override
        public AuthInfo[] newArray(int size) {
            return new AuthInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.kuserId);
        dest.writeValue(this.roleIds);
        dest.writeString(this.sessionPermissions);
    }

    public AuthInfo(Parcel in) {
        super(in);
        this.kuserId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.roleIds = (Integer)in.readValue(Integer.class.getClassLoader());
        this.sessionPermissions = in.readString();
    }
}

