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
import com.kaltura.client.enums.DailymotionGeoBlockingMapping;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DailymotionDistributionProfile.Tokenizer.class)
public class DailymotionDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String user();
		String password();
		String geoBlockingMapping();
	}

	private String user;
	private String password;
	private DailymotionGeoBlockingMapping geoBlockingMapping;

	// user:
	public String getUser(){
		return this.user;
	}
	public void setUser(String user){
		this.user = user;
	}

	public void user(String multirequestToken){
		setToken("user", multirequestToken);
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

	// geoBlockingMapping:
	public DailymotionGeoBlockingMapping getGeoBlockingMapping(){
		return this.geoBlockingMapping;
	}
	public void setGeoBlockingMapping(DailymotionGeoBlockingMapping geoBlockingMapping){
		this.geoBlockingMapping = geoBlockingMapping;
	}

	public void geoBlockingMapping(String multirequestToken){
		setToken("geoBlockingMapping", multirequestToken);
	}


	public DailymotionDistributionProfile() {
		super();
	}

	public DailymotionDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		user = GsonParser.parseString(jsonObject.get("user"));
		password = GsonParser.parseString(jsonObject.get("password"));
		geoBlockingMapping = DailymotionGeoBlockingMapping.get(GsonParser.parseInt(jsonObject.get("geoBlockingMapping")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDailymotionDistributionProfile");
		kparams.add("user", this.user);
		kparams.add("password", this.password);
		kparams.add("geoBlockingMapping", this.geoBlockingMapping);
		return kparams;
	}


    public static final Creator<DailymotionDistributionProfile> CREATOR = new Creator<DailymotionDistributionProfile>() {
        @Override
        public DailymotionDistributionProfile createFromParcel(Parcel source) {
            return new DailymotionDistributionProfile(source);
        }

        @Override
        public DailymotionDistributionProfile[] newArray(int size) {
            return new DailymotionDistributionProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.user);
        dest.writeString(this.password);
        dest.writeInt(this.geoBlockingMapping == null ? -1 : this.geoBlockingMapping.ordinal());
    }

    public DailymotionDistributionProfile(Parcel in) {
        super(in);
        this.user = in.readString();
        this.password = in.readString();
        int tmpGeoBlockingMapping = in.readInt();
        this.geoBlockingMapping = tmpGeoBlockingMapping == -1 ? null : DailymotionGeoBlockingMapping.values()[tmpGeoBlockingMapping];
    }
}

