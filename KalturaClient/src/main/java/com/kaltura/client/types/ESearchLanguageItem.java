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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.ESearchLanguage;
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
@MultiRequestBuilder.Tokenizer(ESearchLanguageItem.Tokenizer.class)
public class ESearchLanguageItem extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String eSerachLanguage();
	}

	private ESearchLanguage eSerachLanguage;

	// eSerachLanguage:
	public ESearchLanguage getESerachLanguage(){
		return this.eSerachLanguage;
	}
	public void setESerachLanguage(ESearchLanguage eSerachLanguage){
		this.eSerachLanguage = eSerachLanguage;
	}

	public void eSerachLanguage(String multirequestToken){
		setToken("eSerachLanguage", multirequestToken);
	}


	public ESearchLanguageItem() {
		super();
	}

	public ESearchLanguageItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eSerachLanguage = ESearchLanguage.get(GsonParser.parseString(jsonObject.get("eSerachLanguage")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchLanguageItem");
		kparams.add("eSerachLanguage", this.eSerachLanguage);
		return kparams;
	}


    public static final Creator<ESearchLanguageItem> CREATOR = new Creator<ESearchLanguageItem>() {
        @Override
        public ESearchLanguageItem createFromParcel(Parcel source) {
            return new ESearchLanguageItem(source);
        }

        @Override
        public ESearchLanguageItem[] newArray(int size) {
            return new ESearchLanguageItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.eSerachLanguage == null ? -1 : this.eSerachLanguage.ordinal());
    }

    public ESearchLanguageItem(Parcel in) {
        super(in);
        int tmpESerachLanguage = in.readInt();
        this.eSerachLanguage = tmpESerachLanguage == -1 ? null : ESearchLanguage.values()[tmpESerachLanguage];
    }
}

