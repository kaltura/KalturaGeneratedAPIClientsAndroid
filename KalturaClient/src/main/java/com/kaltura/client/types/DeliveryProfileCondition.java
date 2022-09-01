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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileCondition.Tokenizer.class)
public class DeliveryProfileCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> deliveryProfileIds();
	}

	/**
	 * The delivery ids that are accepted by this condition
	 */
	private List<IntegerValue> deliveryProfileIds;

	// deliveryProfileIds:
	public List<IntegerValue> getDeliveryProfileIds(){
		return this.deliveryProfileIds;
	}
	public void setDeliveryProfileIds(List<IntegerValue> deliveryProfileIds){
		this.deliveryProfileIds = deliveryProfileIds;
	}


	public DeliveryProfileCondition() {
		super();
	}

	public DeliveryProfileCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		deliveryProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryProfileIds"), IntegerValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileCondition");
		kparams.add("deliveryProfileIds", this.deliveryProfileIds);
		return kparams;
	}


    public static final Creator<DeliveryProfileCondition> CREATOR = new Creator<DeliveryProfileCondition>() {
        @Override
        public DeliveryProfileCondition createFromParcel(Parcel source) {
            return new DeliveryProfileCondition(source);
        }

        @Override
        public DeliveryProfileCondition[] newArray(int size) {
            return new DeliveryProfileCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.deliveryProfileIds != null) {
            dest.writeInt(this.deliveryProfileIds.size());
            dest.writeList(this.deliveryProfileIds);
        } else {
            dest.writeInt(-1);
        }
    }

    public DeliveryProfileCondition(Parcel in) {
        super(in);
        int deliveryProfileIdsSize = in.readInt();
        if( deliveryProfileIdsSize > -1) {
            this.deliveryProfileIds = new ArrayList<>();
            in.readList(this.deliveryProfileIds, IntegerValue.class.getClassLoader());
        }
    }
}

