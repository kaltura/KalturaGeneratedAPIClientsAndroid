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
@MultiRequestBuilder.Tokenizer(ResponseProfileCacheRecalculateResults.Tokenizer.class)
public class ResponseProfileCacheRecalculateResults extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String lastObjectKey();
		String recalculated();
	}

	/**
	 * Last recalculated id
	 */
	private String lastObjectKey;
	/**
	 * Number of recalculated keys
	 */
	private Integer recalculated;

	// lastObjectKey:
	public String getLastObjectKey(){
		return this.lastObjectKey;
	}
	public void setLastObjectKey(String lastObjectKey){
		this.lastObjectKey = lastObjectKey;
	}

	public void lastObjectKey(String multirequestToken){
		setToken("lastObjectKey", multirequestToken);
	}

	// recalculated:
	public Integer getRecalculated(){
		return this.recalculated;
	}
	public void setRecalculated(Integer recalculated){
		this.recalculated = recalculated;
	}

	public void recalculated(String multirequestToken){
		setToken("recalculated", multirequestToken);
	}


	public ResponseProfileCacheRecalculateResults() {
		super();
	}

	public ResponseProfileCacheRecalculateResults(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		lastObjectKey = GsonParser.parseString(jsonObject.get("lastObjectKey"));
		recalculated = GsonParser.parseInt(jsonObject.get("recalculated"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResponseProfileCacheRecalculateResults");
		kparams.add("lastObjectKey", this.lastObjectKey);
		kparams.add("recalculated", this.recalculated);
		return kparams;
	}


    public static final Creator<ResponseProfileCacheRecalculateResults> CREATOR = new Creator<ResponseProfileCacheRecalculateResults>() {
        @Override
        public ResponseProfileCacheRecalculateResults createFromParcel(Parcel source) {
            return new ResponseProfileCacheRecalculateResults(source);
        }

        @Override
        public ResponseProfileCacheRecalculateResults[] newArray(int size) {
            return new ResponseProfileCacheRecalculateResults[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.lastObjectKey);
        dest.writeValue(this.recalculated);
    }

    public ResponseProfileCacheRecalculateResults(Parcel in) {
        super(in);
        this.lastObjectKey = in.readString();
        this.recalculated = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

