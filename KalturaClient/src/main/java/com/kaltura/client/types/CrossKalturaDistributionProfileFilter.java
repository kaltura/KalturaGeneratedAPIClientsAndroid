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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CrossKalturaDistributionProfileFilter.Tokenizer.class)
public class CrossKalturaDistributionProfileFilter extends CrossKalturaDistributionProfileBaseFilter {
	
	public interface Tokenizer extends CrossKalturaDistributionProfileBaseFilter.Tokenizer {
	}



	public CrossKalturaDistributionProfileFilter() {
		super();
	}

	public CrossKalturaDistributionProfileFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCrossKalturaDistributionProfileFilter");
		return kparams;
	}


    public static final Creator<CrossKalturaDistributionProfileFilter> CREATOR = new Creator<CrossKalturaDistributionProfileFilter>() {
        @Override
        public CrossKalturaDistributionProfileFilter createFromParcel(Parcel source) {
            return new CrossKalturaDistributionProfileFilter(source);
        }

        @Override
        public CrossKalturaDistributionProfileFilter[] newArray(int size) {
            return new CrossKalturaDistributionProfileFilter[size];
        }
    };

    public CrossKalturaDistributionProfileFilter(Parcel in) {
        super(in);
    }
}

