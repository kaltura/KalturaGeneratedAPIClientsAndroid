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
import com.kaltura.client.enums.ESearchEntryFieldName;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchEntryItem.Tokenizer.class)
public class ESearchEntryItem extends ESearchAbstractEntryItem {
	
	public interface Tokenizer extends ESearchAbstractEntryItem.Tokenizer {
		String fieldName();
	}

	private ESearchEntryFieldName fieldName;

	// fieldName:
	public ESearchEntryFieldName getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(ESearchEntryFieldName fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}


	public ESearchEntryItem() {
		super();
	}

	public ESearchEntryItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = ESearchEntryFieldName.get(GsonParser.parseString(jsonObject.get("fieldName")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchEntryItem");
		kparams.add("fieldName", this.fieldName);
		return kparams;
	}


    public static final Creator<ESearchEntryItem> CREATOR = new Creator<ESearchEntryItem>() {
        @Override
        public ESearchEntryItem createFromParcel(Parcel source) {
            return new ESearchEntryItem(source);
        }

        @Override
        public ESearchEntryItem[] newArray(int size) {
            return new ESearchEntryItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.fieldName == null ? -1 : this.fieldName.ordinal());
    }

    public ESearchEntryItem(Parcel in) {
        super(in);
        int tmpFieldName = in.readInt();
        this.fieldName = tmpFieldName == -1 ? null : ESearchEntryFieldName.values()[tmpFieldName];
    }
}

