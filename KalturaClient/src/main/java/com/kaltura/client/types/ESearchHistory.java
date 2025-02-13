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
@MultiRequestBuilder.Tokenizer(ESearchHistory.Tokenizer.class)
public class ESearchHistory extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String searchTerm();
		String searchedObject();
		String timestamp();
	}

	private String searchTerm;
	private String searchedObject;
	private Integer timestamp;

	// searchTerm:
	public String getSearchTerm(){
		return this.searchTerm;
	}
	// searchedObject:
	public String getSearchedObject(){
		return this.searchedObject;
	}
	// timestamp:
	public Integer getTimestamp(){
		return this.timestamp;
	}

	public ESearchHistory() {
		super();
	}

	public ESearchHistory(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchTerm = GsonParser.parseString(jsonObject.get("searchTerm"));
		searchedObject = GsonParser.parseString(jsonObject.get("searchedObject"));
		timestamp = GsonParser.parseInt(jsonObject.get("timestamp"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchHistory");
		return kparams;
	}


    public static final Creator<ESearchHistory> CREATOR = new Creator<ESearchHistory>() {
        @Override
        public ESearchHistory createFromParcel(Parcel source) {
            return new ESearchHistory(source);
        }

        @Override
        public ESearchHistory[] newArray(int size) {
            return new ESearchHistory[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.searchTerm);
        dest.writeString(this.searchedObject);
        dest.writeValue(this.timestamp);
    }

    public ESearchHistory(Parcel in) {
        super(in);
        this.searchTerm = in.readString();
        this.searchedObject = in.readString();
        this.timestamp = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

