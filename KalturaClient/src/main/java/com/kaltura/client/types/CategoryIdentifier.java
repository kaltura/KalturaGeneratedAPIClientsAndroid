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
import com.kaltura.client.enums.CategoryIdentifierField;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryIdentifier.Tokenizer.class)
public class CategoryIdentifier extends ObjectIdentifier {
	
	public interface Tokenizer extends ObjectIdentifier.Tokenizer {
		String identifier();
	}

	/**
	 * Identifier of the object
	 */
	private CategoryIdentifierField identifier;

	// identifier:
	public CategoryIdentifierField getIdentifier(){
		return this.identifier;
	}
	public void setIdentifier(CategoryIdentifierField identifier){
		this.identifier = identifier;
	}

	public void identifier(String multirequestToken){
		setToken("identifier", multirequestToken);
	}


	public CategoryIdentifier() {
		super();
	}

	public CategoryIdentifier(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		identifier = CategoryIdentifierField.get(GsonParser.parseString(jsonObject.get("identifier")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryIdentifier");
		kparams.add("identifier", this.identifier);
		return kparams;
	}


    public static final Creator<CategoryIdentifier> CREATOR = new Creator<CategoryIdentifier>() {
        @Override
        public CategoryIdentifier createFromParcel(Parcel source) {
            return new CategoryIdentifier(source);
        }

        @Override
        public CategoryIdentifier[] newArray(int size) {
            return new CategoryIdentifier[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.identifier == null ? -1 : this.identifier.ordinal());
    }

    public CategoryIdentifier(Parcel in) {
        super(in);
        int tmpIdentifier = in.readInt();
        this.identifier = tmpIdentifier == -1 ? null : CategoryIdentifierField.values()[tmpIdentifier];
    }
}

