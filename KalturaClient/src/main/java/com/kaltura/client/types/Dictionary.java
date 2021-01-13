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
import com.kaltura.client.enums.CatalogItemLanguage;
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
@MultiRequestBuilder.Tokenizer(Dictionary.Tokenizer.class)
public class Dictionary extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String language();
		String data();
	}

	private CatalogItemLanguage language;
	private String data;

	// language:
	public CatalogItemLanguage getLanguage(){
		return this.language;
	}
	public void setLanguage(CatalogItemLanguage language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// data:
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}

	public void data(String multirequestToken){
		setToken("data", multirequestToken);
	}


	public Dictionary() {
		super();
	}

	public Dictionary(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		language = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("language")));
		data = GsonParser.parseString(jsonObject.get("data"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDictionary");
		kparams.add("language", this.language);
		kparams.add("data", this.data);
		return kparams;
	}


    public static final Creator<Dictionary> CREATOR = new Creator<Dictionary>() {
        @Override
        public Dictionary createFromParcel(Parcel source) {
            return new Dictionary(source);
        }

        @Override
        public Dictionary[] newArray(int size) {
            return new Dictionary[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.language == null ? -1 : this.language.ordinal());
        dest.writeString(this.data);
    }

    public Dictionary(Parcel in) {
        super(in);
        int tmpLanguage = in.readInt();
        this.language = tmpLanguage == -1 ? null : CatalogItemLanguage.values()[tmpLanguage];
        this.data = in.readString();
    }
}

