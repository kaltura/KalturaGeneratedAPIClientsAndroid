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
import com.kaltura.client.enums.VendorCatalogItemOutputFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorCaptionsCatalogItem.Tokenizer.class)
public class VendorCaptionsCatalogItem extends VendorCatalogItem {
	
	public interface Tokenizer extends VendorCatalogItem.Tokenizer {
		String sourceLanguage();
		String outputFormat();
		String enableSpeakerId();
		String fixedPriceAddons();
	}

	private CatalogItemLanguage sourceLanguage;
	private VendorCatalogItemOutputFormat outputFormat;
	private Boolean enableSpeakerId;
	private Integer fixedPriceAddons;

	// sourceLanguage:
	public CatalogItemLanguage getSourceLanguage(){
		return this.sourceLanguage;
	}
	public void setSourceLanguage(CatalogItemLanguage sourceLanguage){
		this.sourceLanguage = sourceLanguage;
	}

	public void sourceLanguage(String multirequestToken){
		setToken("sourceLanguage", multirequestToken);
	}

	// outputFormat:
	public VendorCatalogItemOutputFormat getOutputFormat(){
		return this.outputFormat;
	}
	public void setOutputFormat(VendorCatalogItemOutputFormat outputFormat){
		this.outputFormat = outputFormat;
	}

	public void outputFormat(String multirequestToken){
		setToken("outputFormat", multirequestToken);
	}

	// enableSpeakerId:
	public Boolean getEnableSpeakerId(){
		return this.enableSpeakerId;
	}
	public void setEnableSpeakerId(Boolean enableSpeakerId){
		this.enableSpeakerId = enableSpeakerId;
	}

	public void enableSpeakerId(String multirequestToken){
		setToken("enableSpeakerId", multirequestToken);
	}

	// fixedPriceAddons:
	public Integer getFixedPriceAddons(){
		return this.fixedPriceAddons;
	}
	public void setFixedPriceAddons(Integer fixedPriceAddons){
		this.fixedPriceAddons = fixedPriceAddons;
	}

	public void fixedPriceAddons(String multirequestToken){
		setToken("fixedPriceAddons", multirequestToken);
	}


	public VendorCaptionsCatalogItem() {
		super();
	}

	public VendorCaptionsCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sourceLanguage = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("sourceLanguage")));
		outputFormat = VendorCatalogItemOutputFormat.get(GsonParser.parseInt(jsonObject.get("outputFormat")));
		enableSpeakerId = GsonParser.parseBoolean(jsonObject.get("enableSpeakerId"));
		fixedPriceAddons = GsonParser.parseInt(jsonObject.get("fixedPriceAddons"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCaptionsCatalogItem");
		kparams.add("sourceLanguage", this.sourceLanguage);
		kparams.add("outputFormat", this.outputFormat);
		kparams.add("enableSpeakerId", this.enableSpeakerId);
		kparams.add("fixedPriceAddons", this.fixedPriceAddons);
		return kparams;
	}


    public static final Creator<VendorCaptionsCatalogItem> CREATOR = new Creator<VendorCaptionsCatalogItem>() {
        @Override
        public VendorCaptionsCatalogItem createFromParcel(Parcel source) {
            return new VendorCaptionsCatalogItem(source);
        }

        @Override
        public VendorCaptionsCatalogItem[] newArray(int size) {
            return new VendorCaptionsCatalogItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.sourceLanguage == null ? -1 : this.sourceLanguage.ordinal());
        dest.writeInt(this.outputFormat == null ? -1 : this.outputFormat.ordinal());
        dest.writeValue(this.enableSpeakerId);
        dest.writeValue(this.fixedPriceAddons);
    }

    public VendorCaptionsCatalogItem(Parcel in) {
        super(in);
        int tmpSourceLanguage = in.readInt();
        this.sourceLanguage = tmpSourceLanguage == -1 ? null : CatalogItemLanguage.values()[tmpSourceLanguage];
        int tmpOutputFormat = in.readInt();
        this.outputFormat = tmpOutputFormat == -1 ? null : VendorCatalogItemOutputFormat.values()[tmpOutputFormat];
        this.enableSpeakerId = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.fixedPriceAddons = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

