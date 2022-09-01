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
@MultiRequestBuilder.Tokenizer(MicrosoftTeamsIntegrationSetting.Tokenizer.class)
public class MicrosoftTeamsIntegrationSetting extends IntegrationSetting {
	
	public interface Tokenizer extends IntegrationSetting.Tokenizer {
		String clientSecret();
		String clientId();
		String secretExpirationDate();
	}

	private String clientSecret;
	private String clientId;
	private Integer secretExpirationDate;

	// clientSecret:
	public String getClientSecret(){
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret){
		this.clientSecret = clientSecret;
	}

	public void clientSecret(String multirequestToken){
		setToken("clientSecret", multirequestToken);
	}

	// clientId:
	public String getClientId(){
		return this.clientId;
	}
	public void setClientId(String clientId){
		this.clientId = clientId;
	}

	public void clientId(String multirequestToken){
		setToken("clientId", multirequestToken);
	}

	// secretExpirationDate:
	public Integer getSecretExpirationDate(){
		return this.secretExpirationDate;
	}
	public void setSecretExpirationDate(Integer secretExpirationDate){
		this.secretExpirationDate = secretExpirationDate;
	}

	public void secretExpirationDate(String multirequestToken){
		setToken("secretExpirationDate", multirequestToken);
	}


	public MicrosoftTeamsIntegrationSetting() {
		super();
	}

	public MicrosoftTeamsIntegrationSetting(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clientSecret = GsonParser.parseString(jsonObject.get("clientSecret"));
		clientId = GsonParser.parseString(jsonObject.get("clientId"));
		secretExpirationDate = GsonParser.parseInt(jsonObject.get("secretExpirationDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMicrosoftTeamsIntegrationSetting");
		kparams.add("clientSecret", this.clientSecret);
		kparams.add("clientId", this.clientId);
		kparams.add("secretExpirationDate", this.secretExpirationDate);
		return kparams;
	}


    public static final Creator<MicrosoftTeamsIntegrationSetting> CREATOR = new Creator<MicrosoftTeamsIntegrationSetting>() {
        @Override
        public MicrosoftTeamsIntegrationSetting createFromParcel(Parcel source) {
            return new MicrosoftTeamsIntegrationSetting(source);
        }

        @Override
        public MicrosoftTeamsIntegrationSetting[] newArray(int size) {
            return new MicrosoftTeamsIntegrationSetting[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.clientSecret);
        dest.writeString(this.clientId);
        dest.writeValue(this.secretExpirationDate);
    }

    public MicrosoftTeamsIntegrationSetting(Parcel in) {
        super(in);
        this.clientSecret = in.readString();
        this.clientId = in.readString();
        this.secretExpirationDate = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

