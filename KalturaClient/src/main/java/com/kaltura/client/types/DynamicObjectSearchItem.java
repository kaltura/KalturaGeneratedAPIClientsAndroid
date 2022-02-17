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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DynamicObjectSearchItem.Tokenizer.class)
public class DynamicObjectSearchItem extends SearchOperator {
	
	public interface Tokenizer extends SearchOperator.Tokenizer {
		String field();
	}

	private String field;

	// field:
	public String getField(){
		return this.field;
	}
	public void setField(String field){
		this.field = field;
	}

	public void field(String multirequestToken){
		setToken("field", multirequestToken);
	}


	public DynamicObjectSearchItem() {
		super();
	}

	public DynamicObjectSearchItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		field = GsonParser.parseString(jsonObject.get("field"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDynamicObjectSearchItem");
		kparams.add("field", this.field);
		return kparams;
	}


    public static final Creator<DynamicObjectSearchItem> CREATOR = new Creator<DynamicObjectSearchItem>() {
        @Override
        public DynamicObjectSearchItem createFromParcel(Parcel source) {
            return new DynamicObjectSearchItem(source);
        }

        @Override
        public DynamicObjectSearchItem[] newArray(int size) {
            return new DynamicObjectSearchItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.field);
    }

    public DynamicObjectSearchItem(Parcel in) {
        super(in);
        this.field = in.readString();
    }
}

