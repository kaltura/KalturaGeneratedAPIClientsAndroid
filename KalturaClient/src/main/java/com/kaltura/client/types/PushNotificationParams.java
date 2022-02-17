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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Object which contains contextual entry-related data.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PushNotificationParams.Tokenizer.class)
public class PushNotificationParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<PushEventNotificationParameter.Tokenizer> userParams();
	}

	/**
	 * User params
	 */
	private List<PushEventNotificationParameter> userParams;

	// userParams:
	public List<PushEventNotificationParameter> getUserParams(){
		return this.userParams;
	}
	public void setUserParams(List<PushEventNotificationParameter> userParams){
		this.userParams = userParams;
	}


	public PushNotificationParams() {
		super();
	}

	public PushNotificationParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userParams = GsonParser.parseArray(jsonObject.getAsJsonArray("userParams"), PushEventNotificationParameter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushNotificationParams");
		kparams.add("userParams", this.userParams);
		return kparams;
	}


    public static final Creator<PushNotificationParams> CREATOR = new Creator<PushNotificationParams>() {
        @Override
        public PushNotificationParams createFromParcel(Parcel source) {
            return new PushNotificationParams(source);
        }

        @Override
        public PushNotificationParams[] newArray(int size) {
            return new PushNotificationParams[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.userParams != null) {
            dest.writeInt(this.userParams.size());
            dest.writeList(this.userParams);
        } else {
            dest.writeInt(-1);
        }
    }

    public PushNotificationParams(Parcel in) {
        super(in);
        int userParamsSize = in.readInt();
        if( userParamsSize > -1) {
            this.userParams = new ArrayList<>();
            in.readList(this.userParams, PushEventNotificationParameter.class.getClassLoader());
        }
    }
}

