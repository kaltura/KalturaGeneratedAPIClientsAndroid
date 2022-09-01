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
import com.kaltura.client.enums.MixEntryMatchAttribute;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Auto-generated class.  Used to search KalturaMixEntry attributes. Use
  KalturaMixEntryMatchAttribute enum to provide attribute name. /
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MixEntryMatchAttributeCondition.Tokenizer.class)
public class MixEntryMatchAttributeCondition extends SearchMatchAttributeCondition {
	
	public interface Tokenizer extends SearchMatchAttributeCondition.Tokenizer {
		String attribute();
	}

	private MixEntryMatchAttribute attribute;

	// attribute:
	public MixEntryMatchAttribute getAttribute(){
		return this.attribute;
	}
	public void setAttribute(MixEntryMatchAttribute attribute){
		this.attribute = attribute;
	}

	public void attribute(String multirequestToken){
		setToken("attribute", multirequestToken);
	}


	public MixEntryMatchAttributeCondition() {
		super();
	}

	public MixEntryMatchAttributeCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		attribute = MixEntryMatchAttribute.get(GsonParser.parseString(jsonObject.get("attribute")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMixEntryMatchAttributeCondition");
		kparams.add("attribute", this.attribute);
		return kparams;
	}


    public static final Creator<MixEntryMatchAttributeCondition> CREATOR = new Creator<MixEntryMatchAttributeCondition>() {
        @Override
        public MixEntryMatchAttributeCondition createFromParcel(Parcel source) {
            return new MixEntryMatchAttributeCondition(source);
        }

        @Override
        public MixEntryMatchAttributeCondition[] newArray(int size) {
            return new MixEntryMatchAttributeCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.attribute == null ? -1 : this.attribute.ordinal());
    }

    public MixEntryMatchAttributeCondition(Parcel in) {
        super(in);
        int tmpAttribute = in.readInt();
        this.attribute = tmpAttribute == -1 ? null : MixEntryMatchAttribute.values()[tmpAttribute];
    }
}

