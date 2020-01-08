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
import com.kaltura.client.enums.ESearchEntryAggregateByFieldName;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchEntryAggregationItem.Tokenizer.class)
public class ESearchEntryAggregationItem extends ESearchAggregationItem {
	
	public interface Tokenizer extends ESearchAggregationItem.Tokenizer {
		String fieldName();
	}

	private ESearchEntryAggregateByFieldName fieldName;

	// fieldName:
	public ESearchEntryAggregateByFieldName getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(ESearchEntryAggregateByFieldName fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}


	public ESearchEntryAggregationItem() {
		super();
	}

	public ESearchEntryAggregationItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = ESearchEntryAggregateByFieldName.get(GsonParser.parseString(jsonObject.get("fieldName")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchEntryAggregationItem");
		kparams.add("fieldName", this.fieldName);
		return kparams;
	}


    public static final Creator<ESearchEntryAggregationItem> CREATOR = new Creator<ESearchEntryAggregationItem>() {
        @Override
        public ESearchEntryAggregationItem createFromParcel(Parcel source) {
            return new ESearchEntryAggregationItem(source);
        }

        @Override
        public ESearchEntryAggregationItem[] newArray(int size) {
            return new ESearchEntryAggregationItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.fieldName == null ? -1 : this.fieldName.ordinal());
    }

    public ESearchEntryAggregationItem(Parcel in) {
        super(in);
        int tmpFieldName = in.readInt();
        this.fieldName = tmpFieldName == -1 ? null : ESearchEntryAggregateByFieldName.values()[tmpFieldName];
    }
}

