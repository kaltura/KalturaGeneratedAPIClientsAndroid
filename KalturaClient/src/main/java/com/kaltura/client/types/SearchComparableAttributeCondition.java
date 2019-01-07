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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.SearchConditionComparison;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SearchComparableAttributeCondition.Tokenizer.class)
public abstract class SearchComparableAttributeCondition extends AttributeCondition {
	
	public interface Tokenizer extends AttributeCondition.Tokenizer {
		String comparison();
	}

	private SearchConditionComparison comparison;

	// comparison:
	public SearchConditionComparison getComparison(){
		return this.comparison;
	}
	public void setComparison(SearchConditionComparison comparison){
		this.comparison = comparison;
	}

	public void comparison(String multirequestToken){
		setToken("comparison", multirequestToken);
	}


	public SearchComparableAttributeCondition() {
		super();
	}

	public SearchComparableAttributeCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		comparison = SearchConditionComparison.get(GsonParser.parseString(jsonObject.get("comparison")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchComparableAttributeCondition");
		kparams.add("comparison", this.comparison);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.comparison == null ? -1 : this.comparison.ordinal());
    }

    public SearchComparableAttributeCondition(Parcel in) {
        super(in);
        int tmpComparison = in.readInt();
        this.comparison = tmpComparison == -1 ? null : SearchConditionComparison.values()[tmpComparison];
    }
}

