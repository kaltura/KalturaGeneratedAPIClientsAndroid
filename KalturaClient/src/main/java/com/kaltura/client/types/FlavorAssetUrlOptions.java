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
@MultiRequestBuilder.Tokenizer(FlavorAssetUrlOptions.Tokenizer.class)
public class FlavorAssetUrlOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String fileName();
		String referrer();
	}

	/**
	 * The name of the downloaded file
	 */
	private String fileName;
	private String referrer;

	// fileName:
	public String getFileName(){
		return this.fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public void fileName(String multirequestToken){
		setToken("fileName", multirequestToken);
	}

	// referrer:
	public String getReferrer(){
		return this.referrer;
	}
	public void setReferrer(String referrer){
		this.referrer = referrer;
	}

	public void referrer(String multirequestToken){
		setToken("referrer", multirequestToken);
	}


	public FlavorAssetUrlOptions() {
		super();
	}

	public FlavorAssetUrlOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileName = GsonParser.parseString(jsonObject.get("fileName"));
		referrer = GsonParser.parseString(jsonObject.get("referrer"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFlavorAssetUrlOptions");
		kparams.add("fileName", this.fileName);
		kparams.add("referrer", this.referrer);
		return kparams;
	}


    public static final Creator<FlavorAssetUrlOptions> CREATOR = new Creator<FlavorAssetUrlOptions>() {
        @Override
        public FlavorAssetUrlOptions createFromParcel(Parcel source) {
            return new FlavorAssetUrlOptions(source);
        }

        @Override
        public FlavorAssetUrlOptions[] newArray(int size) {
            return new FlavorAssetUrlOptions[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.fileName);
        dest.writeString(this.referrer);
    }

    public FlavorAssetUrlOptions(Parcel in) {
        super(in);
        this.fileName = in.readString();
        this.referrer = in.readString();
    }
}

