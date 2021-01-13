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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorTranslationCatalogItem.Tokenizer.class)
public class VendorTranslationCatalogItem extends VendorCaptionsCatalogItem {
	
	public interface Tokenizer extends VendorCaptionsCatalogItem.Tokenizer {
		String targetLanguage();
	}

	private CatalogItemLanguage targetLanguage;

	// targetLanguage:
	public CatalogItemLanguage getTargetLanguage(){
		return this.targetLanguage;
	}
	public void setTargetLanguage(CatalogItemLanguage targetLanguage){
		this.targetLanguage = targetLanguage;
	}

	public void targetLanguage(String multirequestToken){
		setToken("targetLanguage", multirequestToken);
	}


	public VendorTranslationCatalogItem() {
		super();
	}

	public VendorTranslationCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		targetLanguage = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("targetLanguage")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorTranslationCatalogItem");
		kparams.add("targetLanguage", this.targetLanguage);
		return kparams;
	}


    public static final Creator<VendorTranslationCatalogItem> CREATOR = new Creator<VendorTranslationCatalogItem>() {
        @Override
        public VendorTranslationCatalogItem createFromParcel(Parcel source) {
            return new VendorTranslationCatalogItem(source);
        }

        @Override
        public VendorTranslationCatalogItem[] newArray(int size) {
            return new VendorTranslationCatalogItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.targetLanguage == null ? -1 : this.targetLanguage.ordinal());
    }

    public VendorTranslationCatalogItem(Parcel in) {
        super(in);
        int tmpTargetLanguage = in.readInt();
        this.targetLanguage = tmpTargetLanguage == -1 ? null : CatalogItemLanguage.values()[tmpTargetLanguage];
    }
}

