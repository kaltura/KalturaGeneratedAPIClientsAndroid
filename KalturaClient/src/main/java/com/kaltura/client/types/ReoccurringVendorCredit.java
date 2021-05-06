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
import com.kaltura.client.enums.VendorCreditRecurrenceFrequency;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReoccurringVendorCredit.Tokenizer.class)
public class ReoccurringVendorCredit extends TimeRangeVendorCredit {
	
	public interface Tokenizer extends TimeRangeVendorCredit.Tokenizer {
		String frequency();
	}

	private VendorCreditRecurrenceFrequency frequency;

	// frequency:
	public VendorCreditRecurrenceFrequency getFrequency(){
		return this.frequency;
	}
	public void setFrequency(VendorCreditRecurrenceFrequency frequency){
		this.frequency = frequency;
	}

	public void frequency(String multirequestToken){
		setToken("frequency", multirequestToken);
	}


	public ReoccurringVendorCredit() {
		super();
	}

	public ReoccurringVendorCredit(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		frequency = VendorCreditRecurrenceFrequency.get(GsonParser.parseString(jsonObject.get("frequency")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReoccurringVendorCredit");
		kparams.add("frequency", this.frequency);
		return kparams;
	}


    public static final Creator<ReoccurringVendorCredit> CREATOR = new Creator<ReoccurringVendorCredit>() {
        @Override
        public ReoccurringVendorCredit createFromParcel(Parcel source) {
            return new ReoccurringVendorCredit(source);
        }

        @Override
        public ReoccurringVendorCredit[] newArray(int size) {
            return new ReoccurringVendorCredit[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.frequency == null ? -1 : this.frequency.ordinal());
    }

    public ReoccurringVendorCredit(Parcel in) {
        super(in);
        int tmpFrequency = in.readInt();
        this.frequency = tmpFrequency == -1 ? null : VendorCreditRecurrenceFrequency.values()[tmpFrequency];
    }
}

