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
import com.kaltura.client.enums.ESearchGroupOrderByFieldName;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchGroupOrderByItem.Tokenizer.class)
public class ESearchGroupOrderByItem extends ESearchOrderByItem {
	
	public interface Tokenizer extends ESearchOrderByItem.Tokenizer {
		String sortField();
	}

	private ESearchGroupOrderByFieldName sortField;

	// sortField:
	public ESearchGroupOrderByFieldName getSortField(){
		return this.sortField;
	}
	public void setSortField(ESearchGroupOrderByFieldName sortField){
		this.sortField = sortField;
	}

	public void sortField(String multirequestToken){
		setToken("sortField", multirequestToken);
	}


	public ESearchGroupOrderByItem() {
		super();
	}

	public ESearchGroupOrderByItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sortField = ESearchGroupOrderByFieldName.get(GsonParser.parseString(jsonObject.get("sortField")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchGroupOrderByItem");
		kparams.add("sortField", this.sortField);
		return kparams;
	}


    public static final Creator<ESearchGroupOrderByItem> CREATOR = new Creator<ESearchGroupOrderByItem>() {
        @Override
        public ESearchGroupOrderByItem createFromParcel(Parcel source) {
            return new ESearchGroupOrderByItem(source);
        }

        @Override
        public ESearchGroupOrderByItem[] newArray(int size) {
            return new ESearchGroupOrderByItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.sortField == null ? -1 : this.sortField.ordinal());
    }

    public ESearchGroupOrderByItem(Parcel in) {
        super(in);
        int tmpSortField = in.readInt();
        this.sortField = tmpSortField == -1 ? null : ESearchGroupOrderByFieldName.values()[tmpSortField];
    }
}

