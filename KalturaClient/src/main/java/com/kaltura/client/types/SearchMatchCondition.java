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
@MultiRequestBuilder.Tokenizer(SearchMatchCondition.Tokenizer.class)
public class SearchMatchCondition extends SearchCondition {
	
	public interface Tokenizer extends SearchCondition.Tokenizer {
		String not();
	}

	private Boolean not;

	// not:
	public Boolean getNot(){
		return this.not;
	}
	public void setNot(Boolean not){
		this.not = not;
	}

	public void not(String multirequestToken){
		setToken("not", multirequestToken);
	}


	public SearchMatchCondition() {
		super();
	}

	public SearchMatchCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		not = GsonParser.parseBoolean(jsonObject.get("not"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchMatchCondition");
		kparams.add("not", this.not);
		return kparams;
	}


    public static final Creator<SearchMatchCondition> CREATOR = new Creator<SearchMatchCondition>() {
        @Override
        public SearchMatchCondition createFromParcel(Parcel source) {
            return new SearchMatchCondition(source);
        }

        @Override
        public SearchMatchCondition[] newArray(int size) {
            return new SearchMatchCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.not);
    }

    public SearchMatchCondition(Parcel in) {
        super(in);
        this.not = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

