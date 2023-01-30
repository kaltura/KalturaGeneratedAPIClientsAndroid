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
import com.kaltura.client.enums.GeoCoderType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Represents the current request country context as calculated based on the IP
  address
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CoordinatesContextField.Tokenizer.class)
public class CoordinatesContextField extends StringField {
	
	public interface Tokenizer extends StringField.Tokenizer {
		String geoCoderType();
	}

	/**
	 * The ip geo coder engine to be used
	 */
	private GeoCoderType geoCoderType;

	// geoCoderType:
	public GeoCoderType getGeoCoderType(){
		return this.geoCoderType;
	}
	public void setGeoCoderType(GeoCoderType geoCoderType){
		this.geoCoderType = geoCoderType;
	}

	public void geoCoderType(String multirequestToken){
		setToken("geoCoderType", multirequestToken);
	}


	public CoordinatesContextField() {
		super();
	}

	public CoordinatesContextField(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		geoCoderType = GeoCoderType.get(GsonParser.parseString(jsonObject.get("geoCoderType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCoordinatesContextField");
		kparams.add("geoCoderType", this.geoCoderType);
		return kparams;
	}


    public static final Creator<CoordinatesContextField> CREATOR = new Creator<CoordinatesContextField>() {
        @Override
        public CoordinatesContextField createFromParcel(Parcel source) {
            return new CoordinatesContextField(source);
        }

        @Override
        public CoordinatesContextField[] newArray(int size) {
            return new CoordinatesContextField[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.geoCoderType == null ? -1 : this.geoCoderType.ordinal());
    }

    public CoordinatesContextField(Parcel in) {
        super(in);
        int tmpGeoCoderType = in.readInt();
        this.geoCoderType = tmpGeoCoderType == -1 ? null : GeoCoderType.values()[tmpGeoCoderType];
    }
}

