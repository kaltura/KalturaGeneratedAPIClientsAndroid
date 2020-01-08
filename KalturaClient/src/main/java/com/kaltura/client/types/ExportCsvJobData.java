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
@MultiRequestBuilder.Tokenizer(ExportCsvJobData.Tokenizer.class)
public class ExportCsvJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String userName();
		String userMail();
		String outputPath();
	}

	/**
	 * The users name
	 */
	private String userName;
	/**
	 * The users email
	 */
	private String userMail;
	/**
	 * The file location
	 */
	private String outputPath;

	// userName:
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}

	public void userName(String multirequestToken){
		setToken("userName", multirequestToken);
	}

	// userMail:
	public String getUserMail(){
		return this.userMail;
	}
	public void setUserMail(String userMail){
		this.userMail = userMail;
	}

	public void userMail(String multirequestToken){
		setToken("userMail", multirequestToken);
	}

	// outputPath:
	public String getOutputPath(){
		return this.outputPath;
	}
	public void setOutputPath(String outputPath){
		this.outputPath = outputPath;
	}

	public void outputPath(String multirequestToken){
		setToken("outputPath", multirequestToken);
	}


	public ExportCsvJobData() {
		super();
	}

	public ExportCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userName = GsonParser.parseString(jsonObject.get("userName"));
		userMail = GsonParser.parseString(jsonObject.get("userMail"));
		outputPath = GsonParser.parseString(jsonObject.get("outputPath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExportCsvJobData");
		kparams.add("userName", this.userName);
		kparams.add("userMail", this.userMail);
		kparams.add("outputPath", this.outputPath);
		return kparams;
	}


    public static final Creator<ExportCsvJobData> CREATOR = new Creator<ExportCsvJobData>() {
        @Override
        public ExportCsvJobData createFromParcel(Parcel source) {
            return new ExportCsvJobData(source);
        }

        @Override
        public ExportCsvJobData[] newArray(int size) {
            return new ExportCsvJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.userName);
        dest.writeString(this.userMail);
        dest.writeString(this.outputPath);
    }

    public ExportCsvJobData(Parcel in) {
        super(in);
        this.userName = in.readString();
        this.userMail = in.readString();
        this.outputPath = in.readString();
    }
}

