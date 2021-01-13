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
import com.kaltura.client.enums.MatchConditionType;
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MatchCondition.Tokenizer.class)
public abstract class MatchCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> values();
		String matchType();
	}

	private List<StringValue> values;
	private MatchConditionType matchType;

	// values:
	public List<StringValue> getValues(){
		return this.values;
	}
	public void setValues(List<StringValue> values){
		this.values = values;
	}

	// matchType:
	public MatchConditionType getMatchType(){
		return this.matchType;
	}
	public void setMatchType(MatchConditionType matchType){
		this.matchType = matchType;
	}

	public void matchType(String multirequestToken){
		setToken("matchType", multirequestToken);
	}


	public MatchCondition() {
		super();
	}

	public MatchCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		values = GsonParser.parseArray(jsonObject.getAsJsonArray("values"), StringValue.class);
		matchType = MatchConditionType.get(GsonParser.parseString(jsonObject.get("matchType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMatchCondition");
		kparams.add("values", this.values);
		kparams.add("matchType", this.matchType);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.values != null) {
            dest.writeInt(this.values.size());
            dest.writeList(this.values);
        } else {
            dest.writeInt(-1);
        }
        dest.writeInt(this.matchType == null ? -1 : this.matchType.ordinal());
    }

    public MatchCondition(Parcel in) {
        super(in);
        int valuesSize = in.readInt();
        if( valuesSize > -1) {
            this.values = new ArrayList<>();
            in.readList(this.values, StringValue.class.getClassLoader());
        }
        int tmpMatchType = in.readInt();
        this.matchType = tmpMatchType == -1 ? null : MatchConditionType.values()[tmpMatchType];
    }
}

