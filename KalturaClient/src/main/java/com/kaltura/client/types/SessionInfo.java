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
@MultiRequestBuilder.Tokenizer(SessionInfo.Tokenizer.class)
public class SessionInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String ks();
		String sessionType();
		String partnerId();
		String userId();
		String expiry();
		String privileges();
	}

	private String ks;
	private SessionType sessionType;
	private Integer partnerId;
	private String userId;
	private Integer expiry;
	private String privileges;

	// ks:
	public String getKs(){
		return this.ks;
	}
	// sessionType:
	public SessionType getSessionType(){
		return this.sessionType;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	// expiry:
	public Integer getExpiry(){
		return this.expiry;
	}
	// privileges:
	public String getPrivileges(){
		return this.privileges;
	}

	public SessionInfo() {
		super();
	}

	public SessionInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ks = GsonParser.parseString(jsonObject.get("ks"));
		sessionType = SessionType.get(GsonParser.parseInt(jsonObject.get("sessionType")));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		expiry = GsonParser.parseInt(jsonObject.get("expiry"));
		privileges = GsonParser.parseString(jsonObject.get("privileges"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSessionInfo");
		return kparams;
	}


    public static final Creator<SessionInfo> CREATOR = new Creator<SessionInfo>() {
        @Override
        public SessionInfo createFromParcel(Parcel source) {
            return new SessionInfo(source);
        }

        @Override
        public SessionInfo[] newArray(int size) {
            return new SessionInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.ks);
        dest.writeInt(this.sessionType == null ? -1 : this.sessionType.ordinal());
        dest.writeValue(this.partnerId);
        dest.writeString(this.userId);
        dest.writeValue(this.expiry);
        dest.writeString(this.privileges);
    }

    public SessionInfo(Parcel in) {
        super(in);
        this.ks = in.readString();
        int tmpSessionType = in.readInt();
        this.sessionType = tmpSessionType == -1 ? null : SessionType.values()[tmpSessionType];
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userId = in.readString();
        this.expiry = (Integer)in.readValue(Integer.class.getClassLoader());
        this.privileges = in.readString();
    }
}

