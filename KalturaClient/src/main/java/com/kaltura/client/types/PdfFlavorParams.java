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
// Copyright (C) 2006-2017  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(PdfFlavorParams.Tokenizer.class)
public class PdfFlavorParams extends FlavorParams {
	
	public interface Tokenizer extends FlavorParams.Tokenizer {
		String readonly();
	}

	private Boolean readonly;

	// readonly:
	public Boolean getReadonly(){
		return this.readonly;
	}
	public void setReadonly(Boolean readonly){
		this.readonly = readonly;
	}

	public void readonly(String multirequestToken){
		setToken("readonly", multirequestToken);
	}


	public PdfFlavorParams() {
		super();
	}

	public PdfFlavorParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		readonly = GsonParser.parseBoolean(jsonObject.get("readonly"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPdfFlavorParams");
		kparams.add("readonly", this.readonly);
		return kparams;
	}


    public static final Creator<PdfFlavorParams> CREATOR = new Creator<PdfFlavorParams>() {
        @Override
        public PdfFlavorParams createFromParcel(Parcel source) {
            return new PdfFlavorParams(source);
        }

        @Override
        public PdfFlavorParams[] newArray(int size) {
            return new PdfFlavorParams[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.readonly);
    }

    public PdfFlavorParams(Parcel in) {
        super(in);
        this.readonly = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

