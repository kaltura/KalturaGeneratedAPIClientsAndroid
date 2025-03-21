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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchGroupMetadataItem.Tokenizer.class)
public class ESearchGroupMetadataItem extends ESearchAbstractGroupItem {
	
	public interface Tokenizer extends ESearchAbstractGroupItem.Tokenizer {
		String xpath();
		String metadataProfileId();
		String metadataFieldId();
	}

	private String xpath;
	private Integer metadataProfileId;
	private Integer metadataFieldId;

	// xpath:
	public String getXpath(){
		return this.xpath;
	}
	public void setXpath(String xpath){
		this.xpath = xpath;
	}

	public void xpath(String multirequestToken){
		setToken("xpath", multirequestToken);
	}

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// metadataFieldId:
	public Integer getMetadataFieldId(){
		return this.metadataFieldId;
	}
	public void setMetadataFieldId(Integer metadataFieldId){
		this.metadataFieldId = metadataFieldId;
	}

	public void metadataFieldId(String multirequestToken){
		setToken("metadataFieldId", multirequestToken);
	}


	public ESearchGroupMetadataItem() {
		super();
	}

	public ESearchGroupMetadataItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xpath = GsonParser.parseString(jsonObject.get("xpath"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		metadataFieldId = GsonParser.parseInt(jsonObject.get("metadataFieldId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchGroupMetadataItem");
		kparams.add("xpath", this.xpath);
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("metadataFieldId", this.metadataFieldId);
		return kparams;
	}


    public static final Creator<ESearchGroupMetadataItem> CREATOR = new Creator<ESearchGroupMetadataItem>() {
        @Override
        public ESearchGroupMetadataItem createFromParcel(Parcel source) {
            return new ESearchGroupMetadataItem(source);
        }

        @Override
        public ESearchGroupMetadataItem[] newArray(int size) {
            return new ESearchGroupMetadataItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.xpath);
        dest.writeValue(this.metadataProfileId);
        dest.writeValue(this.metadataFieldId);
    }

    public ESearchGroupMetadataItem(Parcel in) {
        super(in);
        this.xpath = in.readString();
        this.metadataProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.metadataFieldId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

