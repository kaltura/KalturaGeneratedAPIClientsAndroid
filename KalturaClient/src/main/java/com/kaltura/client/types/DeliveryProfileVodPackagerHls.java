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
@MultiRequestBuilder.Tokenizer(DeliveryProfileVodPackagerHls.Tokenizer.class)
public class DeliveryProfileVodPackagerHls extends DeliveryProfileVodPackagerPlayServer {
	
	public interface Tokenizer extends DeliveryProfileVodPackagerPlayServer.Tokenizer {
		String allowFairplayOffline();
		String supportFmp4();
	}

	private Boolean allowFairplayOffline;
	private Boolean supportFmp4;

	// allowFairplayOffline:
	public Boolean getAllowFairplayOffline(){
		return this.allowFairplayOffline;
	}
	public void setAllowFairplayOffline(Boolean allowFairplayOffline){
		this.allowFairplayOffline = allowFairplayOffline;
	}

	public void allowFairplayOffline(String multirequestToken){
		setToken("allowFairplayOffline", multirequestToken);
	}

	// supportFmp4:
	public Boolean getSupportFmp4(){
		return this.supportFmp4;
	}
	public void setSupportFmp4(Boolean supportFmp4){
		this.supportFmp4 = supportFmp4;
	}

	public void supportFmp4(String multirequestToken){
		setToken("supportFmp4", multirequestToken);
	}


	public DeliveryProfileVodPackagerHls() {
		super();
	}

	public DeliveryProfileVodPackagerHls(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		allowFairplayOffline = GsonParser.parseBoolean(jsonObject.get("allowFairplayOffline"));
		supportFmp4 = GsonParser.parseBoolean(jsonObject.get("supportFmp4"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileVodPackagerHls");
		kparams.add("allowFairplayOffline", this.allowFairplayOffline);
		kparams.add("supportFmp4", this.supportFmp4);
		return kparams;
	}


    public static final Creator<DeliveryProfileVodPackagerHls> CREATOR = new Creator<DeliveryProfileVodPackagerHls>() {
        @Override
        public DeliveryProfileVodPackagerHls createFromParcel(Parcel source) {
            return new DeliveryProfileVodPackagerHls(source);
        }

        @Override
        public DeliveryProfileVodPackagerHls[] newArray(int size) {
            return new DeliveryProfileVodPackagerHls[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.allowFairplayOffline);
        dest.writeValue(this.supportFmp4);
    }

    public DeliveryProfileVodPackagerHls(Parcel in) {
        super(in);
        this.allowFairplayOffline = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.supportFmp4 = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

