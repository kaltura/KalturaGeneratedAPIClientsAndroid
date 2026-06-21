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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.VendorCatalogItemPricing;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorCatalogItemUnitPricing.Tokenizer.class)
public class VendorCatalogItemUnitPricing extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String serviceName();
		VendorCatalogItemPricing.Tokenizer priceUnit();
	}

	private String serviceName;
	private VendorCatalogItemPricing priceUnit;

	// serviceName:
	public String getServiceName(){
		return this.serviceName;
	}
	public void setServiceName(String serviceName){
		this.serviceName = serviceName;
	}

	public void serviceName(String multirequestToken){
		setToken("serviceName", multirequestToken);
	}

	// priceUnit:
	public VendorCatalogItemPricing getPriceUnit(){
		return this.priceUnit;
	}
	public void setPriceUnit(VendorCatalogItemPricing priceUnit){
		this.priceUnit = priceUnit;
	}


	public VendorCatalogItemUnitPricing() {
		super();
	}

	public VendorCatalogItemUnitPricing(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		serviceName = GsonParser.parseString(jsonObject.get("serviceName"));
		priceUnit = GsonParser.parseObject(jsonObject.getAsJsonObject("priceUnit"), VendorCatalogItemPricing.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCatalogItemUnitPricing");
		kparams.add("serviceName", this.serviceName);
		kparams.add("priceUnit", this.priceUnit);
		return kparams;
	}


    public static final Creator<VendorCatalogItemUnitPricing> CREATOR = new Creator<VendorCatalogItemUnitPricing>() {
        @Override
        public VendorCatalogItemUnitPricing createFromParcel(Parcel source) {
            return new VendorCatalogItemUnitPricing(source);
        }

        @Override
        public VendorCatalogItemUnitPricing[] newArray(int size) {
            return new VendorCatalogItemUnitPricing[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.serviceName);
        dest.writeParcelable(this.priceUnit, flags);
    }

    public VendorCatalogItemUnitPricing(Parcel in) {
        super(in);
        this.serviceName = in.readString();
        this.priceUnit = in.readParcelable(VendorCatalogItemPricing.class.getClassLoader());
    }
}

