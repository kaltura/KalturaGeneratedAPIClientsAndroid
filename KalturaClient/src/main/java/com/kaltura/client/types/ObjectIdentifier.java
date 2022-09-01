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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Configuration for extended item in the Kaltura MRSS feeds
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ObjectIdentifier.Tokenizer.class)
public abstract class ObjectIdentifier extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String extendedFeatures();
	}

	/**
	 * Comma separated string of enum values denoting which features of the item need
	  to be included in the MRSS
	 */
	private String extendedFeatures;

	// extendedFeatures:
	public String getExtendedFeatures(){
		return this.extendedFeatures;
	}
	public void setExtendedFeatures(String extendedFeatures){
		this.extendedFeatures = extendedFeatures;
	}

	public void extendedFeatures(String multirequestToken){
		setToken("extendedFeatures", multirequestToken);
	}


	public ObjectIdentifier() {
		super();
	}

	public ObjectIdentifier(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		extendedFeatures = GsonParser.parseString(jsonObject.get("extendedFeatures"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaObjectIdentifier");
		kparams.add("extendedFeatures", this.extendedFeatures);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.extendedFeatures);
    }

    public ObjectIdentifier(Parcel in) {
        super(in);
        this.extendedFeatures = in.readString();
    }
}

