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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileAkamaiHds.Tokenizer.class)
public class DeliveryProfileAkamaiHds extends DeliveryProfile {
	
	public interface Tokenizer extends DeliveryProfile.Tokenizer {
		String supportClipping();
	}

	/**
	 * Should we use timing parameters - clipTo / seekFrom
	 */
	private Boolean supportClipping;

	// supportClipping:
	public Boolean getSupportClipping(){
		return this.supportClipping;
	}
	public void setSupportClipping(Boolean supportClipping){
		this.supportClipping = supportClipping;
	}

	public void supportClipping(String multirequestToken){
		setToken("supportClipping", multirequestToken);
	}


	public DeliveryProfileAkamaiHds() {
		super();
	}

	public DeliveryProfileAkamaiHds(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		supportClipping = GsonParser.parseBoolean(jsonObject.get("supportClipping"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileAkamaiHds");
		kparams.add("supportClipping", this.supportClipping);
		return kparams;
	}


    public static final Creator<DeliveryProfileAkamaiHds> CREATOR = new Creator<DeliveryProfileAkamaiHds>() {
        @Override
        public DeliveryProfileAkamaiHds createFromParcel(Parcel source) {
            return new DeliveryProfileAkamaiHds(source);
        }

        @Override
        public DeliveryProfileAkamaiHds[] newArray(int size) {
            return new DeliveryProfileAkamaiHds[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.supportClipping);
    }

    public DeliveryProfileAkamaiHds(Parcel in) {
        super(in);
        this.supportClipping = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

