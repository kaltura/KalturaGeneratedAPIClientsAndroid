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
@MultiRequestBuilder.Tokenizer(DeliveryProfileAkamaiHttp.Tokenizer.class)
public class DeliveryProfileAkamaiHttp extends DeliveryProfileHttp {
	
	public interface Tokenizer extends DeliveryProfileHttp.Tokenizer {
		String useIntelliseek();
	}

	/**
	 * Should we use intelliseek
	 */
	private Boolean useIntelliseek;

	// useIntelliseek:
	public Boolean getUseIntelliseek(){
		return this.useIntelliseek;
	}
	public void setUseIntelliseek(Boolean useIntelliseek){
		this.useIntelliseek = useIntelliseek;
	}

	public void useIntelliseek(String multirequestToken){
		setToken("useIntelliseek", multirequestToken);
	}


	public DeliveryProfileAkamaiHttp() {
		super();
	}

	public DeliveryProfileAkamaiHttp(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		useIntelliseek = GsonParser.parseBoolean(jsonObject.get("useIntelliseek"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileAkamaiHttp");
		kparams.add("useIntelliseek", this.useIntelliseek);
		return kparams;
	}


    public static final Creator<DeliveryProfileAkamaiHttp> CREATOR = new Creator<DeliveryProfileAkamaiHttp>() {
        @Override
        public DeliveryProfileAkamaiHttp createFromParcel(Parcel source) {
            return new DeliveryProfileAkamaiHttp(source);
        }

        @Override
        public DeliveryProfileAkamaiHttp[] newArray(int size) {
            return new DeliveryProfileAkamaiHttp[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.useIntelliseek);
    }

    public DeliveryProfileAkamaiHttp(Parcel in) {
        super(in);
        this.useIntelliseek = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

