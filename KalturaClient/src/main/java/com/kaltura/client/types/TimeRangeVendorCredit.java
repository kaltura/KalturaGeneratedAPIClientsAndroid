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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TimeRangeVendorCredit.Tokenizer.class)
public class TimeRangeVendorCredit extends VendorCredit {
	
	public interface Tokenizer extends VendorCredit.Tokenizer {
		String toDate();
	}

	private Long toDate;

	// toDate:
	public Long getToDate(){
		return this.toDate;
	}
	public void setToDate(Long toDate){
		this.toDate = toDate;
	}

	public void toDate(String multirequestToken){
		setToken("toDate", multirequestToken);
	}


	public TimeRangeVendorCredit() {
		super();
	}

	public TimeRangeVendorCredit(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		toDate = GsonParser.parseLong(jsonObject.get("toDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTimeRangeVendorCredit");
		kparams.add("toDate", this.toDate);
		return kparams;
	}


    public static final Creator<TimeRangeVendorCredit> CREATOR = new Creator<TimeRangeVendorCredit>() {
        @Override
        public TimeRangeVendorCredit createFromParcel(Parcel source) {
            return new TimeRangeVendorCredit(source);
        }

        @Override
        public TimeRangeVendorCredit[] newArray(int size) {
            return new TimeRangeVendorCredit[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.toDate);
    }

    public TimeRangeVendorCredit(Parcel in) {
        super(in);
        this.toDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

