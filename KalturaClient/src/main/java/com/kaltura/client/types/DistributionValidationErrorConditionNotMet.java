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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DistributionValidationErrorConditionNotMet.Tokenizer.class)
public class DistributionValidationErrorConditionNotMet extends DistributionValidationError {
	
	public interface Tokenizer extends DistributionValidationError.Tokenizer {
		String conditionName();
	}

	private String conditionName;

	// conditionName:
	public String getConditionName(){
		return this.conditionName;
	}
	public void setConditionName(String conditionName){
		this.conditionName = conditionName;
	}

	public void conditionName(String multirequestToken){
		setToken("conditionName", multirequestToken);
	}


	public DistributionValidationErrorConditionNotMet() {
		super();
	}

	public DistributionValidationErrorConditionNotMet(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		conditionName = GsonParser.parseString(jsonObject.get("conditionName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDistributionValidationErrorConditionNotMet");
		kparams.add("conditionName", this.conditionName);
		return kparams;
	}


    public static final Creator<DistributionValidationErrorConditionNotMet> CREATOR = new Creator<DistributionValidationErrorConditionNotMet>() {
        @Override
        public DistributionValidationErrorConditionNotMet createFromParcel(Parcel source) {
            return new DistributionValidationErrorConditionNotMet(source);
        }

        @Override
        public DistributionValidationErrorConditionNotMet[] newArray(int size) {
            return new DistributionValidationErrorConditionNotMet[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.conditionName);
    }

    public DistributionValidationErrorConditionNotMet(Parcel in) {
        super(in);
        this.conditionName = in.readString();
    }
}

