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
import com.kaltura.client.enums.VendorDocumentEnrichmentType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorDocumentEnrichmentCatalogItem.Tokenizer.class)
public class VendorDocumentEnrichmentCatalogItem extends VendorCatalogItem {
	
	public interface Tokenizer extends VendorCatalogItem.Tokenizer {
		String documentEnrichmentType();
	}

	private VendorDocumentEnrichmentType documentEnrichmentType;

	// documentEnrichmentType:
	public VendorDocumentEnrichmentType getDocumentEnrichmentType(){
		return this.documentEnrichmentType;
	}
	public void setDocumentEnrichmentType(VendorDocumentEnrichmentType documentEnrichmentType){
		this.documentEnrichmentType = documentEnrichmentType;
	}

	public void documentEnrichmentType(String multirequestToken){
		setToken("documentEnrichmentType", multirequestToken);
	}


	public VendorDocumentEnrichmentCatalogItem() {
		super();
	}

	public VendorDocumentEnrichmentCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		documentEnrichmentType = VendorDocumentEnrichmentType.get(GsonParser.parseInt(jsonObject.get("documentEnrichmentType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorDocumentEnrichmentCatalogItem");
		kparams.add("documentEnrichmentType", this.documentEnrichmentType);
		return kparams;
	}


    public static final Creator<VendorDocumentEnrichmentCatalogItem> CREATOR = new Creator<VendorDocumentEnrichmentCatalogItem>() {
        @Override
        public VendorDocumentEnrichmentCatalogItem createFromParcel(Parcel source) {
            return new VendorDocumentEnrichmentCatalogItem(source);
        }

        @Override
        public VendorDocumentEnrichmentCatalogItem[] newArray(int size) {
            return new VendorDocumentEnrichmentCatalogItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.documentEnrichmentType == null ? -1 : this.documentEnrichmentType.ordinal());
    }

    public VendorDocumentEnrichmentCatalogItem(Parcel in) {
        super(in);
        int tmpDocumentEnrichmentType = in.readInt();
        this.documentEnrichmentType = tmpDocumentEnrichmentType == -1 ? null : VendorDocumentEnrichmentType.values()[tmpDocumentEnrichmentType];
    }
}

