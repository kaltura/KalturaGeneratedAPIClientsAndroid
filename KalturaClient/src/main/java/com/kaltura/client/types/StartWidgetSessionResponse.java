// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2020  Kaltura Inc.
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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StartWidgetSessionResponse.Tokenizer.class)
public class StartWidgetSessionResponse extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String partnerId();
		String ks();
		String userId();
	}

	private Integer partnerId;
	private String ks;
	private String userId;

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// ks:
	public String getKs(){
		return this.ks;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}

	public StartWidgetSessionResponse() {
		super();
	}

	public StartWidgetSessionResponse(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		ks = GsonParser.parseString(jsonObject.get("ks"));
		userId = GsonParser.parseString(jsonObject.get("userId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStartWidgetSessionResponse");
		return kparams;
	}


    public static final Creator<StartWidgetSessionResponse> CREATOR = new Creator<StartWidgetSessionResponse>() {
        @Override
        public StartWidgetSessionResponse createFromParcel(Parcel source) {
            return new StartWidgetSessionResponse(source);
        }

        @Override
        public StartWidgetSessionResponse[] newArray(int size) {
            return new StartWidgetSessionResponse[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.partnerId);
        dest.writeString(this.ks);
        dest.writeString(this.userId);
    }

    public StartWidgetSessionResponse(Parcel in) {
        super(in);
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.ks = in.readString();
        this.userId = in.readString();
    }
}

