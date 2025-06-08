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
import com.kaltura.client.enums.CatalogItemSignLanguage;
import com.kaltura.client.enums.VendorCatalogItemSignLanguageOutputFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorSignLanguageCatalogItem.Tokenizer.class)
public class VendorSignLanguageCatalogItem extends VendorCatalogItem {
	
	public interface Tokenizer extends VendorCatalogItem.Tokenizer {
		String targetLanguage();
		String outputFormat();
	}

	private CatalogItemSignLanguage targetLanguage;
	private VendorCatalogItemSignLanguageOutputFormat outputFormat;

	// targetLanguage:
	public CatalogItemSignLanguage getTargetLanguage(){
		return this.targetLanguage;
	}
	public void setTargetLanguage(CatalogItemSignLanguage targetLanguage){
		this.targetLanguage = targetLanguage;
	}

	public void targetLanguage(String multirequestToken){
		setToken("targetLanguage", multirequestToken);
	}

	// outputFormat:
	public VendorCatalogItemSignLanguageOutputFormat getOutputFormat(){
		return this.outputFormat;
	}
	public void setOutputFormat(VendorCatalogItemSignLanguageOutputFormat outputFormat){
		this.outputFormat = outputFormat;
	}

	public void outputFormat(String multirequestToken){
		setToken("outputFormat", multirequestToken);
	}


	public VendorSignLanguageCatalogItem() {
		super();
	}

	public VendorSignLanguageCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		targetLanguage = CatalogItemSignLanguage.get(GsonParser.parseString(jsonObject.get("targetLanguage")));
		outputFormat = VendorCatalogItemSignLanguageOutputFormat.get(GsonParser.parseInt(jsonObject.get("outputFormat")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorSignLanguageCatalogItem");
		kparams.add("targetLanguage", this.targetLanguage);
		kparams.add("outputFormat", this.outputFormat);
		return kparams;
	}


    public static final Creator<VendorSignLanguageCatalogItem> CREATOR = new Creator<VendorSignLanguageCatalogItem>() {
        @Override
        public VendorSignLanguageCatalogItem createFromParcel(Parcel source) {
            return new VendorSignLanguageCatalogItem(source);
        }

        @Override
        public VendorSignLanguageCatalogItem[] newArray(int size) {
            return new VendorSignLanguageCatalogItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.targetLanguage == null ? -1 : this.targetLanguage.ordinal());
        dest.writeInt(this.outputFormat == null ? -1 : this.outputFormat.ordinal());
    }

    public VendorSignLanguageCatalogItem(Parcel in) {
        super(in);
        int tmpTargetLanguage = in.readInt();
        this.targetLanguage = tmpTargetLanguage == -1 ? null : CatalogItemSignLanguage.values()[tmpTargetLanguage];
        int tmpOutputFormat = in.readInt();
        this.outputFormat = tmpOutputFormat == -1 ? null : VendorCatalogItemSignLanguageOutputFormat.values()[tmpOutputFormat];
    }
}

