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
import com.kaltura.client.types.ESearchOperator;
import com.kaltura.client.types.ESearchOrderBy;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchParams.Tokenizer.class)
public class ESearchParams extends ESearchObject {
	
	public interface Tokenizer extends ESearchObject.Tokenizer {
		ESearchOperator.Tokenizer searchOperator();
		String objectStatuses();
		ESearchOrderBy.Tokenizer orderBy();
	}

	private ESearchOperator searchOperator;
	private String objectStatuses;
	private ESearchOrderBy orderBy;

	// searchOperator:
	public ESearchOperator getSearchOperator(){
		return this.searchOperator;
	}
	public void setSearchOperator(ESearchOperator searchOperator){
		this.searchOperator = searchOperator;
	}

	// objectStatuses:
	public String getObjectStatuses(){
		return this.objectStatuses;
	}
	public void setObjectStatuses(String objectStatuses){
		this.objectStatuses = objectStatuses;
	}

	public void objectStatuses(String multirequestToken){
		setToken("objectStatuses", multirequestToken);
	}

	// orderBy:
	public ESearchOrderBy getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(ESearchOrderBy orderBy){
		this.orderBy = orderBy;
	}


	public ESearchParams() {
		super();
	}

	public ESearchParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchOperator = GsonParser.parseObject(jsonObject.getAsJsonObject("searchOperator"), ESearchOperator.class);
		objectStatuses = GsonParser.parseString(jsonObject.get("objectStatuses"));
		orderBy = GsonParser.parseObject(jsonObject.getAsJsonObject("orderBy"), ESearchOrderBy.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchParams");
		kparams.add("searchOperator", this.searchOperator);
		kparams.add("objectStatuses", this.objectStatuses);
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}


    public static final Creator<ESearchParams> CREATOR = new Creator<ESearchParams>() {
        @Override
        public ESearchParams createFromParcel(Parcel source) {
            return new ESearchParams(source);
        }

        @Override
        public ESearchParams[] newArray(int size) {
            return new ESearchParams[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.searchOperator, flags);
        dest.writeString(this.objectStatuses);
        dest.writeParcelable(this.orderBy, flags);
    }

    public ESearchParams(Parcel in) {
        super(in);
        this.searchOperator = in.readParcelable(ESearchOperator.class.getClassLoader());
        this.objectStatuses = in.readString();
        this.orderBy = in.readParcelable(ESearchOrderBy.class.getClassLoader());
    }
}

