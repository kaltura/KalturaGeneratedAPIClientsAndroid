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
@MultiRequestBuilder.Tokenizer(RatingCount.Tokenizer.class)
public class RatingCount extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String entryId();
		String rank();
		String count();
	}

	private String entryId;
	private Integer rank;
	private Integer count;

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// rank:
	public Integer getRank(){
		return this.rank;
	}
	public void setRank(Integer rank){
		this.rank = rank;
	}

	public void rank(String multirequestToken){
		setToken("rank", multirequestToken);
	}

	// count:
	public Integer getCount(){
		return this.count;
	}
	public void setCount(Integer count){
		this.count = count;
	}

	public void count(String multirequestToken){
		setToken("count", multirequestToken);
	}


	public RatingCount() {
		super();
	}

	public RatingCount(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		rank = GsonParser.parseInt(jsonObject.get("rank"));
		count = GsonParser.parseInt(jsonObject.get("count"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRatingCount");
		kparams.add("entryId", this.entryId);
		kparams.add("rank", this.rank);
		kparams.add("count", this.count);
		return kparams;
	}


    public static final Creator<RatingCount> CREATOR = new Creator<RatingCount>() {
        @Override
        public RatingCount createFromParcel(Parcel source) {
            return new RatingCount(source);
        }

        @Override
        public RatingCount[] newArray(int size) {
            return new RatingCount[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.entryId);
        dest.writeValue(this.rank);
        dest.writeValue(this.count);
    }

    public RatingCount(Parcel in) {
        super(in);
        this.entryId = in.readString();
        this.rank = (Integer)in.readValue(Integer.class.getClassLoader());
        this.count = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}
