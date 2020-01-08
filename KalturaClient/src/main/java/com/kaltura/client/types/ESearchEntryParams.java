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
import com.kaltura.client.types.ESearchAggregation;
import com.kaltura.client.types.ESearchEntryOperator;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchEntryParams.Tokenizer.class)
public class ESearchEntryParams extends ESearchParams {
	
	public interface Tokenizer extends ESearchParams.Tokenizer {
		ESearchEntryOperator.Tokenizer searchOperator();
		ESearchAggregation.Tokenizer aggregations();
	}

	private ESearchEntryOperator searchOperator;
	private ESearchAggregation aggregations;

	// searchOperator:
	public ESearchEntryOperator getSearchOperator(){
		return this.searchOperator;
	}
	public void setSearchOperator(ESearchEntryOperator searchOperator){
		this.searchOperator = searchOperator;
	}

	// aggregations:
	public ESearchAggregation getAggregations(){
		return this.aggregations;
	}
	public void setAggregations(ESearchAggregation aggregations){
		this.aggregations = aggregations;
	}


	public ESearchEntryParams() {
		super();
	}

	public ESearchEntryParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchOperator = GsonParser.parseObject(jsonObject.getAsJsonObject("searchOperator"), ESearchEntryOperator.class);
		aggregations = GsonParser.parseObject(jsonObject.getAsJsonObject("aggregations"), ESearchAggregation.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchEntryParams");
		kparams.add("searchOperator", this.searchOperator);
		kparams.add("aggregations", this.aggregations);
		return kparams;
	}


    public static final Creator<ESearchEntryParams> CREATOR = new Creator<ESearchEntryParams>() {
        @Override
        public ESearchEntryParams createFromParcel(Parcel source) {
            return new ESearchEntryParams(source);
        }

        @Override
        public ESearchEntryParams[] newArray(int size) {
            return new ESearchEntryParams[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.searchOperator, flags);
        dest.writeParcelable(this.aggregations, flags);
    }

    public ESearchEntryParams(Parcel in) {
        super(in);
        this.searchOperator = in.readParcelable(ESearchEntryOperator.class.getClassLoader());
        this.aggregations = in.readParcelable(ESearchAggregation.class.getClassLoader());
    }
}

