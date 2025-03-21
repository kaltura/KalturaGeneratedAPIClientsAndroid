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
import com.kaltura.client.enums.ExternalMediaEntryCompareAttribute;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Auto-generated class.  Used to search KalturaExternalMediaEntry attributes. Use
  KalturaExternalMediaEntryCompareAttribute enum to provide attribute name. /
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ExternalMediaEntryCompareAttributeCondition.Tokenizer.class)
public class ExternalMediaEntryCompareAttributeCondition extends SearchComparableAttributeCondition {
	
	public interface Tokenizer extends SearchComparableAttributeCondition.Tokenizer {
		String attribute();
	}

	private ExternalMediaEntryCompareAttribute attribute;

	// attribute:
	public ExternalMediaEntryCompareAttribute getAttribute(){
		return this.attribute;
	}
	public void setAttribute(ExternalMediaEntryCompareAttribute attribute){
		this.attribute = attribute;
	}

	public void attribute(String multirequestToken){
		setToken("attribute", multirequestToken);
	}


	public ExternalMediaEntryCompareAttributeCondition() {
		super();
	}

	public ExternalMediaEntryCompareAttributeCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		attribute = ExternalMediaEntryCompareAttribute.get(GsonParser.parseString(jsonObject.get("attribute")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExternalMediaEntryCompareAttributeCondition");
		kparams.add("attribute", this.attribute);
		return kparams;
	}


    public static final Creator<ExternalMediaEntryCompareAttributeCondition> CREATOR = new Creator<ExternalMediaEntryCompareAttributeCondition>() {
        @Override
        public ExternalMediaEntryCompareAttributeCondition createFromParcel(Parcel source) {
            return new ExternalMediaEntryCompareAttributeCondition(source);
        }

        @Override
        public ExternalMediaEntryCompareAttributeCondition[] newArray(int size) {
            return new ExternalMediaEntryCompareAttributeCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.attribute == null ? -1 : this.attribute.ordinal());
    }

    public ExternalMediaEntryCompareAttributeCondition(Parcel in) {
        super(in);
        int tmpAttribute = in.readInt();
        this.attribute = tmpAttribute == -1 ? null : ExternalMediaEntryCompareAttribute.values()[tmpAttribute];
    }
}

