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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UiConfAdmin.Tokenizer.class)
public class UiConfAdmin extends UiConf {
	
	public interface Tokenizer extends UiConf.Tokenizer {
		String isPublic();
	}

	private Boolean isPublic;

	// isPublic:
	public Boolean getIsPublic(){
		return this.isPublic;
	}
	public void setIsPublic(Boolean isPublic){
		this.isPublic = isPublic;
	}

	public void isPublic(String multirequestToken){
		setToken("isPublic", multirequestToken);
	}


	public UiConfAdmin() {
		super();
	}

	public UiConfAdmin(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isPublic = GsonParser.parseBoolean(jsonObject.get("isPublic"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUiConfAdmin");
		kparams.add("isPublic", this.isPublic);
		return kparams;
	}


    public static final Creator<UiConfAdmin> CREATOR = new Creator<UiConfAdmin>() {
        @Override
        public UiConfAdmin createFromParcel(Parcel source) {
            return new UiConfAdmin(source);
        }

        @Override
        public UiConfAdmin[] newArray(int size) {
            return new UiConfAdmin[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.isPublic);
    }

    public UiConfAdmin(Parcel in) {
        super(in);
        this.isPublic = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

