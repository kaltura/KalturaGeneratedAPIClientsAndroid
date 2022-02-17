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
@MultiRequestBuilder.Tokenizer(EventObjectChangedCondition.Tokenizer.class)
public class EventObjectChangedCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		String modifiedColumns();
	}

	/**
	 * Comma seperated column names to be tested
	 */
	private String modifiedColumns;

	// modifiedColumns:
	public String getModifiedColumns(){
		return this.modifiedColumns;
	}
	public void setModifiedColumns(String modifiedColumns){
		this.modifiedColumns = modifiedColumns;
	}

	public void modifiedColumns(String multirequestToken){
		setToken("modifiedColumns", multirequestToken);
	}


	public EventObjectChangedCondition() {
		super();
	}

	public EventObjectChangedCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		modifiedColumns = GsonParser.parseString(jsonObject.get("modifiedColumns"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventObjectChangedCondition");
		kparams.add("modifiedColumns", this.modifiedColumns);
		return kparams;
	}


    public static final Creator<EventObjectChangedCondition> CREATOR = new Creator<EventObjectChangedCondition>() {
        @Override
        public EventObjectChangedCondition createFromParcel(Parcel source) {
            return new EventObjectChangedCondition(source);
        }

        @Override
        public EventObjectChangedCondition[] newArray(int size) {
            return new EventObjectChangedCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.modifiedColumns);
    }

    public EventObjectChangedCondition(Parcel in) {
        super(in);
        this.modifiedColumns = in.readString();
    }
}

