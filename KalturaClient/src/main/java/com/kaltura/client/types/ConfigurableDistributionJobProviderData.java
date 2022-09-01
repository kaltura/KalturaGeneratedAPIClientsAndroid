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
@MultiRequestBuilder.Tokenizer(ConfigurableDistributionJobProviderData.Tokenizer.class)
public abstract class ConfigurableDistributionJobProviderData extends DistributionJobProviderData {
	
	public interface Tokenizer extends DistributionJobProviderData.Tokenizer {
		String fieldValues();
	}

	private String fieldValues;

	// fieldValues:
	public String getFieldValues(){
		return this.fieldValues;
	}
	public void setFieldValues(String fieldValues){
		this.fieldValues = fieldValues;
	}

	public void fieldValues(String multirequestToken){
		setToken("fieldValues", multirequestToken);
	}


	public ConfigurableDistributionJobProviderData() {
		super();
	}

	public ConfigurableDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldValues = GsonParser.parseString(jsonObject.get("fieldValues"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConfigurableDistributionJobProviderData");
		kparams.add("fieldValues", this.fieldValues);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.fieldValues);
    }

    public ConfigurableDistributionJobProviderData(Parcel in) {
        super(in);
        this.fieldValues = in.readString();
    }
}

