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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EventNotificationArrayParameter.Tokenizer.class)
public class EventNotificationArrayParameter extends EventNotificationParameter {
	
	public interface Tokenizer extends EventNotificationParameter.Tokenizer {
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> values();
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> allowedValues();
	}

	private List<StringHolder> values;
	/**
	 * Used to restrict the values to close list
	 */
	private List<StringValue> allowedValues;

	// values:
	public List<StringHolder> getValues(){
		return this.values;
	}
	public void setValues(List<StringHolder> values){
		this.values = values;
	}

	// allowedValues:
	public List<StringValue> getAllowedValues(){
		return this.allowedValues;
	}
	public void setAllowedValues(List<StringValue> allowedValues){
		this.allowedValues = allowedValues;
	}


	public EventNotificationArrayParameter() {
		super();
	}

	public EventNotificationArrayParameter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		values = GsonParser.parseArray(jsonObject.getAsJsonArray("values"), StringHolder.class);
		allowedValues = GsonParser.parseArray(jsonObject.getAsJsonArray("allowedValues"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventNotificationArrayParameter");
		kparams.add("values", this.values);
		kparams.add("allowedValues", this.allowedValues);
		return kparams;
	}


    public static final Creator<EventNotificationArrayParameter> CREATOR = new Creator<EventNotificationArrayParameter>() {
        @Override
        public EventNotificationArrayParameter createFromParcel(Parcel source) {
            return new EventNotificationArrayParameter(source);
        }

        @Override
        public EventNotificationArrayParameter[] newArray(int size) {
            return new EventNotificationArrayParameter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.values != null) {
            dest.writeInt(this.values.size());
            dest.writeList(this.values);
        } else {
            dest.writeInt(-1);
        }
        if(this.allowedValues != null) {
            dest.writeInt(this.allowedValues.size());
            dest.writeList(this.allowedValues);
        } else {
            dest.writeInt(-1);
        }
    }

    public EventNotificationArrayParameter(Parcel in) {
        super(in);
        int valuesSize = in.readInt();
        if( valuesSize > -1) {
            this.values = new ArrayList<>();
            in.readList(this.values, StringHolder.class.getClassLoader());
        }
        int allowedValuesSize = in.readInt();
        if( allowedValuesSize > -1) {
            this.allowedValues = new ArrayList<>();
            in.readList(this.allowedValues, StringValue.class.getClassLoader());
        }
    }
}

