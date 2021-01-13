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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetDistributionRule.Tokenizer.class)
public class AssetDistributionRule extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String validationError();
		RequestBuilder.ListTokenizer<AssetDistributionCondition.Tokenizer> assetDistributionConditions();
	}

	/**
	 * The validation error description that will be set on the "data" property on
	  KalturaDistributionValidationErrorMissingAsset if rule was not fulfilled
	 */
	private String validationError;
	/**
	 * An array of asset distribution conditions
	 */
	private List<AssetDistributionCondition> assetDistributionConditions;

	// validationError:
	public String getValidationError(){
		return this.validationError;
	}
	public void setValidationError(String validationError){
		this.validationError = validationError;
	}

	public void validationError(String multirequestToken){
		setToken("validationError", multirequestToken);
	}

	// assetDistributionConditions:
	public List<AssetDistributionCondition> getAssetDistributionConditions(){
		return this.assetDistributionConditions;
	}
	public void setAssetDistributionConditions(List<AssetDistributionCondition> assetDistributionConditions){
		this.assetDistributionConditions = assetDistributionConditions;
	}


	public AssetDistributionRule() {
		super();
	}

	public AssetDistributionRule(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		validationError = GsonParser.parseString(jsonObject.get("validationError"));
		assetDistributionConditions = GsonParser.parseArray(jsonObject.getAsJsonArray("assetDistributionConditions"), AssetDistributionCondition.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetDistributionRule");
		kparams.add("validationError", this.validationError);
		kparams.add("assetDistributionConditions", this.assetDistributionConditions);
		return kparams;
	}


    public static final Creator<AssetDistributionRule> CREATOR = new Creator<AssetDistributionRule>() {
        @Override
        public AssetDistributionRule createFromParcel(Parcel source) {
            return new AssetDistributionRule(source);
        }

        @Override
        public AssetDistributionRule[] newArray(int size) {
            return new AssetDistributionRule[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.validationError);
        if(this.assetDistributionConditions != null) {
            dest.writeInt(this.assetDistributionConditions.size());
            dest.writeList(this.assetDistributionConditions);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetDistributionRule(Parcel in) {
        super(in);
        this.validationError = in.readString();
        int assetDistributionConditionsSize = in.readInt();
        if( assetDistributionConditionsSize > -1) {
            this.assetDistributionConditions = new ArrayList<>();
            in.readList(this.assetDistributionConditions, AssetDistributionCondition.class.getClassLoader());
        }
    }
}

