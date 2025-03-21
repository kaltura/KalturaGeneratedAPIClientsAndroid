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
@MultiRequestBuilder.Tokenizer(DataEntry.Tokenizer.class)
public class DataEntry extends BaseEntry {
	
	public interface Tokenizer extends BaseEntry.Tokenizer {
		String dataContent();
		String retrieveDataContentByGet();
	}

	/**
	 * The data of the entry
	 */
	private String dataContent;
	/**
	 * indicator whether to return the object for get action with the dataContent
	  field.
	 */
	private Boolean retrieveDataContentByGet;

	// dataContent:
	public String getDataContent(){
		return this.dataContent;
	}
	public void setDataContent(String dataContent){
		this.dataContent = dataContent;
	}

	public void dataContent(String multirequestToken){
		setToken("dataContent", multirequestToken);
	}

	// retrieveDataContentByGet:
	public Boolean getRetrieveDataContentByGet(){
		return this.retrieveDataContentByGet;
	}
	public void setRetrieveDataContentByGet(Boolean retrieveDataContentByGet){
		this.retrieveDataContentByGet = retrieveDataContentByGet;
	}

	public void retrieveDataContentByGet(String multirequestToken){
		setToken("retrieveDataContentByGet", multirequestToken);
	}


	public DataEntry() {
		super();
	}

	public DataEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dataContent = GsonParser.parseString(jsonObject.get("dataContent"));
		retrieveDataContentByGet = GsonParser.parseBoolean(jsonObject.get("retrieveDataContentByGet"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDataEntry");
		kparams.add("dataContent", this.dataContent);
		kparams.add("retrieveDataContentByGet", this.retrieveDataContentByGet);
		return kparams;
	}


    public static final Creator<DataEntry> CREATOR = new Creator<DataEntry>() {
        @Override
        public DataEntry createFromParcel(Parcel source) {
            return new DataEntry(source);
        }

        @Override
        public DataEntry[] newArray(int size) {
            return new DataEntry[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.dataContent);
        dest.writeValue(this.retrieveDataContentByGet);
    }

    public DataEntry(Parcel in) {
        super(in);
        this.dataContent = in.readString();
        this.retrieveDataContentByGet = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

