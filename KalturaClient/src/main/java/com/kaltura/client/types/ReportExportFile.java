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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportExportFile.Tokenizer.class)
public class ReportExportFile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String fileId();
		String fileName();
	}

	private String fileId;
	private String fileName;

	// fileId:
	public String getFileId(){
		return this.fileId;
	}
	public void setFileId(String fileId){
		this.fileId = fileId;
	}

	public void fileId(String multirequestToken){
		setToken("fileId", multirequestToken);
	}

	// fileName:
	public String getFileName(){
		return this.fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public void fileName(String multirequestToken){
		setToken("fileName", multirequestToken);
	}


	public ReportExportFile() {
		super();
	}

	public ReportExportFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileId = GsonParser.parseString(jsonObject.get("fileId"));
		fileName = GsonParser.parseString(jsonObject.get("fileName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportExportFile");
		kparams.add("fileId", this.fileId);
		kparams.add("fileName", this.fileName);
		return kparams;
	}


    public static final Creator<ReportExportFile> CREATOR = new Creator<ReportExportFile>() {
        @Override
        public ReportExportFile createFromParcel(Parcel source) {
            return new ReportExportFile(source);
        }

        @Override
        public ReportExportFile[] newArray(int size) {
            return new ReportExportFile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.fileId);
        dest.writeString(this.fileName);
    }

    public ReportExportFile(Parcel in) {
        super(in);
        this.fileId = in.readString();
        this.fileName = in.readString();
    }
}

