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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileGenericHdsFilter.Tokenizer.class)
public class DeliveryProfileGenericHdsFilter extends DeliveryProfileGenericHdsBaseFilter {
	
	public interface Tokenizer extends DeliveryProfileGenericHdsBaseFilter.Tokenizer {
	}



	public DeliveryProfileGenericHdsFilter() {
		super();
	}

	public DeliveryProfileGenericHdsFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileGenericHdsFilter");
		return kparams;
	}


    public static final Creator<DeliveryProfileGenericHdsFilter> CREATOR = new Creator<DeliveryProfileGenericHdsFilter>() {
        @Override
        public DeliveryProfileGenericHdsFilter createFromParcel(Parcel source) {
            return new DeliveryProfileGenericHdsFilter(source);
        }

        @Override
        public DeliveryProfileGenericHdsFilter[] newArray(int size) {
            return new DeliveryProfileGenericHdsFilter[size];
        }
    };

    public DeliveryProfileGenericHdsFilter(Parcel in) {
        super(in);
    }
}

