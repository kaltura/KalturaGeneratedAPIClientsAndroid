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
@MultiRequestBuilder.Tokenizer(ESearchOrderBy.Tokenizer.class)
public class ESearchOrderBy extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<ESearchOrderByItem.Tokenizer> orderItems();
	}

	private List<ESearchOrderByItem> orderItems;

	// orderItems:
	public List<ESearchOrderByItem> getOrderItems(){
		return this.orderItems;
	}
	public void setOrderItems(List<ESearchOrderByItem> orderItems){
		this.orderItems = orderItems;
	}


	public ESearchOrderBy() {
		super();
	}

	public ESearchOrderBy(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		orderItems = GsonParser.parseArray(jsonObject.getAsJsonArray("orderItems"), ESearchOrderByItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchOrderBy");
		kparams.add("orderItems", this.orderItems);
		return kparams;
	}


    public static final Creator<ESearchOrderBy> CREATOR = new Creator<ESearchOrderBy>() {
        @Override
        public ESearchOrderBy createFromParcel(Parcel source) {
            return new ESearchOrderBy(source);
        }

        @Override
        public ESearchOrderBy[] newArray(int size) {
            return new ESearchOrderBy[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.orderItems != null) {
            dest.writeInt(this.orderItems.size());
            dest.writeList(this.orderItems);
        } else {
            dest.writeInt(-1);
        }
    }

    public ESearchOrderBy(Parcel in) {
        super(in);
        int orderItemsSize = in.readInt();
        if( orderItemsSize > -1) {
            this.orderItems = new ArrayList<>();
            in.readList(this.orderItems, ESearchOrderByItem.class.getClassLoader());
        }
    }
}

