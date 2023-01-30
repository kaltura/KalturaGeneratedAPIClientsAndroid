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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderImportJobData.Tokenizer.class)
public class DropFolderImportJobData extends SshImportJobData {
	
	public interface Tokenizer extends SshImportJobData.Tokenizer {
		String dropFolderFileId();
	}

	private Integer dropFolderFileId;

	// dropFolderFileId:
	public Integer getDropFolderFileId(){
		return this.dropFolderFileId;
	}
	public void setDropFolderFileId(Integer dropFolderFileId){
		this.dropFolderFileId = dropFolderFileId;
	}

	public void dropFolderFileId(String multirequestToken){
		setToken("dropFolderFileId", multirequestToken);
	}


	public DropFolderImportJobData() {
		super();
	}

	public DropFolderImportJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dropFolderFileId = GsonParser.parseInt(jsonObject.get("dropFolderFileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderImportJobData");
		kparams.add("dropFolderFileId", this.dropFolderFileId);
		return kparams;
	}


    public static final Creator<DropFolderImportJobData> CREATOR = new Creator<DropFolderImportJobData>() {
        @Override
        public DropFolderImportJobData createFromParcel(Parcel source) {
            return new DropFolderImportJobData(source);
        }

        @Override
        public DropFolderImportJobData[] newArray(int size) {
            return new DropFolderImportJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.dropFolderFileId);
    }

    public DropFolderImportJobData(Parcel in) {
        super(in);
        this.dropFolderFileId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

