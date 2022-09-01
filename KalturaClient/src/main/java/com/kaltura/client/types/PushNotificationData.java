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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PushNotificationData.Tokenizer.class)
public class PushNotificationData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String queueName();
		String queueKey();
		String url();
	}

	private String queueName;
	private String queueKey;
	private String url;

	// queueName:
	public String getQueueName(){
		return this.queueName;
	}
	// queueKey:
	public String getQueueKey(){
		return this.queueKey;
	}
	// url:
	public String getUrl(){
		return this.url;
	}

	public PushNotificationData() {
		super();
	}

	public PushNotificationData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		queueName = GsonParser.parseString(jsonObject.get("queueName"));
		queueKey = GsonParser.parseString(jsonObject.get("queueKey"));
		url = GsonParser.parseString(jsonObject.get("url"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushNotificationData");
		return kparams;
	}


    public static final Creator<PushNotificationData> CREATOR = new Creator<PushNotificationData>() {
        @Override
        public PushNotificationData createFromParcel(Parcel source) {
            return new PushNotificationData(source);
        }

        @Override
        public PushNotificationData[] newArray(int size) {
            return new PushNotificationData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.queueName);
        dest.writeString(this.queueKey);
        dest.writeString(this.url);
    }

    public PushNotificationData(Parcel in) {
        super(in);
        this.queueName = in.readString();
        this.queueKey = in.readString();
        this.url = in.readString();
    }
}

