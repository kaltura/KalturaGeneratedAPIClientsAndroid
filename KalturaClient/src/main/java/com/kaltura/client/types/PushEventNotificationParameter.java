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
@MultiRequestBuilder.Tokenizer(PushEventNotificationParameter.Tokenizer.class)
public class PushEventNotificationParameter extends EventNotificationParameter {
	
	public interface Tokenizer extends EventNotificationParameter.Tokenizer {
		String queueKeyToken();
	}

	private String queueKeyToken;

	// queueKeyToken:
	public String getQueueKeyToken(){
		return this.queueKeyToken;
	}
	public void setQueueKeyToken(String queueKeyToken){
		this.queueKeyToken = queueKeyToken;
	}

	public void queueKeyToken(String multirequestToken){
		setToken("queueKeyToken", multirequestToken);
	}


	public PushEventNotificationParameter() {
		super();
	}

	public PushEventNotificationParameter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		queueKeyToken = GsonParser.parseString(jsonObject.get("queueKeyToken"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushEventNotificationParameter");
		kparams.add("queueKeyToken", this.queueKeyToken);
		return kparams;
	}


    public static final Creator<PushEventNotificationParameter> CREATOR = new Creator<PushEventNotificationParameter>() {
        @Override
        public PushEventNotificationParameter createFromParcel(Parcel source) {
            return new PushEventNotificationParameter(source);
        }

        @Override
        public PushEventNotificationParameter[] newArray(int size) {
            return new PushEventNotificationParameter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.queueKeyToken);
    }

    public PushEventNotificationParameter(Parcel in) {
        super(in);
        this.queueKeyToken = in.readString();
    }
}

