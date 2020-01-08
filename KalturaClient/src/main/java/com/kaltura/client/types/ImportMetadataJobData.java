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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ImportMetadataJobData.Tokenizer.class)
public class ImportMetadataJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String srcFileUrl();
		String destFileLocalPath();
		String metadataId();
	}

	private String srcFileUrl;
	private String destFileLocalPath;
	private Integer metadataId;

	// srcFileUrl:
	public String getSrcFileUrl(){
		return this.srcFileUrl;
	}
	public void setSrcFileUrl(String srcFileUrl){
		this.srcFileUrl = srcFileUrl;
	}

	public void srcFileUrl(String multirequestToken){
		setToken("srcFileUrl", multirequestToken);
	}

	// destFileLocalPath:
	public String getDestFileLocalPath(){
		return this.destFileLocalPath;
	}
	public void setDestFileLocalPath(String destFileLocalPath){
		this.destFileLocalPath = destFileLocalPath;
	}

	public void destFileLocalPath(String multirequestToken){
		setToken("destFileLocalPath", multirequestToken);
	}

	// metadataId:
	public Integer getMetadataId(){
		return this.metadataId;
	}
	public void setMetadataId(Integer metadataId){
		this.metadataId = metadataId;
	}

	public void metadataId(String multirequestToken){
		setToken("metadataId", multirequestToken);
	}


	public ImportMetadataJobData() {
		super();
	}

	public ImportMetadataJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		srcFileUrl = GsonParser.parseString(jsonObject.get("srcFileUrl"));
		destFileLocalPath = GsonParser.parseString(jsonObject.get("destFileLocalPath"));
		metadataId = GsonParser.parseInt(jsonObject.get("metadataId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaImportMetadataJobData");
		kparams.add("srcFileUrl", this.srcFileUrl);
		kparams.add("destFileLocalPath", this.destFileLocalPath);
		kparams.add("metadataId", this.metadataId);
		return kparams;
	}


    public static final Creator<ImportMetadataJobData> CREATOR = new Creator<ImportMetadataJobData>() {
        @Override
        public ImportMetadataJobData createFromParcel(Parcel source) {
            return new ImportMetadataJobData(source);
        }

        @Override
        public ImportMetadataJobData[] newArray(int size) {
            return new ImportMetadataJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.srcFileUrl);
        dest.writeString(this.destFileLocalPath);
        dest.writeValue(this.metadataId);
    }

    public ImportMetadataJobData(Parcel in) {
        super(in);
        this.srcFileUrl = in.readString();
        this.destFileLocalPath = in.readString();
        this.metadataId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

