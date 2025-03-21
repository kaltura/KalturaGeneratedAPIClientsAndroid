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
import com.kaltura.client.enums.BeaconIndexType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BeaconEnhanceFilter.Tokenizer.class)
public class BeaconEnhanceFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String externalElasticQueryObject();
		String indexTypeEqual();
	}

	private String externalElasticQueryObject;
	private BeaconIndexType indexTypeEqual;

	// externalElasticQueryObject:
	public String getExternalElasticQueryObject(){
		return this.externalElasticQueryObject;
	}
	public void setExternalElasticQueryObject(String externalElasticQueryObject){
		this.externalElasticQueryObject = externalElasticQueryObject;
	}

	public void externalElasticQueryObject(String multirequestToken){
		setToken("externalElasticQueryObject", multirequestToken);
	}

	// indexTypeEqual:
	public BeaconIndexType getIndexTypeEqual(){
		return this.indexTypeEqual;
	}
	public void setIndexTypeEqual(BeaconIndexType indexTypeEqual){
		this.indexTypeEqual = indexTypeEqual;
	}

	public void indexTypeEqual(String multirequestToken){
		setToken("indexTypeEqual", multirequestToken);
	}


	public BeaconEnhanceFilter() {
		super();
	}

	public BeaconEnhanceFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		externalElasticQueryObject = GsonParser.parseString(jsonObject.get("externalElasticQueryObject"));
		indexTypeEqual = BeaconIndexType.get(GsonParser.parseString(jsonObject.get("indexTypeEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBeaconEnhanceFilter");
		kparams.add("externalElasticQueryObject", this.externalElasticQueryObject);
		kparams.add("indexTypeEqual", this.indexTypeEqual);
		return kparams;
	}


    public static final Creator<BeaconEnhanceFilter> CREATOR = new Creator<BeaconEnhanceFilter>() {
        @Override
        public BeaconEnhanceFilter createFromParcel(Parcel source) {
            return new BeaconEnhanceFilter(source);
        }

        @Override
        public BeaconEnhanceFilter[] newArray(int size) {
            return new BeaconEnhanceFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.externalElasticQueryObject);
        dest.writeInt(this.indexTypeEqual == null ? -1 : this.indexTypeEqual.ordinal());
    }

    public BeaconEnhanceFilter(Parcel in) {
        super(in);
        this.externalElasticQueryObject = in.readString();
        int tmpIndexTypeEqual = in.readInt();
        this.indexTypeEqual = tmpIndexTypeEqual == -1 ? null : BeaconIndexType.values()[tmpIndexTypeEqual];
    }
}

