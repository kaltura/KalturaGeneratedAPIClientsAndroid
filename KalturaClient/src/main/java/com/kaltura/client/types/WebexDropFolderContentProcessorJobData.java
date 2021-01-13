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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(WebexDropFolderContentProcessorJobData.Tokenizer.class)
public class WebexDropFolderContentProcessorJobData extends DropFolderContentProcessorJobData {
	
	public interface Tokenizer extends DropFolderContentProcessorJobData.Tokenizer {
		String description();
		String webexHostId();
	}

	private String description;
	private String webexHostId;

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// webexHostId:
	public String getWebexHostId(){
		return this.webexHostId;
	}
	public void setWebexHostId(String webexHostId){
		this.webexHostId = webexHostId;
	}

	public void webexHostId(String multirequestToken){
		setToken("webexHostId", multirequestToken);
	}


	public WebexDropFolderContentProcessorJobData() {
		super();
	}

	public WebexDropFolderContentProcessorJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		description = GsonParser.parseString(jsonObject.get("description"));
		webexHostId = GsonParser.parseString(jsonObject.get("webexHostId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWebexDropFolderContentProcessorJobData");
		kparams.add("description", this.description);
		kparams.add("webexHostId", this.webexHostId);
		return kparams;
	}


    public static final Creator<WebexDropFolderContentProcessorJobData> CREATOR = new Creator<WebexDropFolderContentProcessorJobData>() {
        @Override
        public WebexDropFolderContentProcessorJobData createFromParcel(Parcel source) {
            return new WebexDropFolderContentProcessorJobData(source);
        }

        @Override
        public WebexDropFolderContentProcessorJobData[] newArray(int size) {
            return new WebexDropFolderContentProcessorJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.description);
        dest.writeString(this.webexHostId);
    }

    public WebexDropFolderContentProcessorJobData(Parcel in) {
        super(in);
        this.description = in.readString();
        this.webexHostId = in.readString();
    }
}

