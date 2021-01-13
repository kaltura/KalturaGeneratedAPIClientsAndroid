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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FairPlayPlaybackPluginData.Tokenizer.class)
public class FairPlayPlaybackPluginData extends DrmPlaybackPluginData {
	
	public interface Tokenizer extends DrmPlaybackPluginData.Tokenizer {
		String certificate();
	}

	private String certificate;

	// certificate:
	public String getCertificate(){
		return this.certificate;
	}
	public void setCertificate(String certificate){
		this.certificate = certificate;
	}

	public void certificate(String multirequestToken){
		setToken("certificate", multirequestToken);
	}


	public FairPlayPlaybackPluginData() {
		super();
	}

	public FairPlayPlaybackPluginData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		certificate = GsonParser.parseString(jsonObject.get("certificate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFairPlayPlaybackPluginData");
		kparams.add("certificate", this.certificate);
		return kparams;
	}


    public static final Creator<FairPlayPlaybackPluginData> CREATOR = new Creator<FairPlayPlaybackPluginData>() {
        @Override
        public FairPlayPlaybackPluginData createFromParcel(Parcel source) {
            return new FairPlayPlaybackPluginData(source);
        }

        @Override
        public FairPlayPlaybackPluginData[] newArray(int size) {
            return new FairPlayPlaybackPluginData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.certificate);
    }

    public FairPlayPlaybackPluginData(Parcel in) {
        super(in);
        this.certificate = in.readString();
    }
}

