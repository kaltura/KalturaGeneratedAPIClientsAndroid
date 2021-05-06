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
import com.kaltura.client.enums.DryRunFileType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduledTaskJobData.Tokenizer.class)
public class ScheduledTaskJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String maxResults();
		String totalCount();
		String fileFormat();
		String resultsFilePath();
		String referenceTime();
	}

	private Integer maxResults;
	private Integer totalCount;
	private DryRunFileType fileFormat;
	private String resultsFilePath;
	private Integer referenceTime;

	// maxResults:
	public Integer getMaxResults(){
		return this.maxResults;
	}
	public void setMaxResults(Integer maxResults){
		this.maxResults = maxResults;
	}

	public void maxResults(String multirequestToken){
		setToken("maxResults", multirequestToken);
	}

	// totalCount:
	public Integer getTotalCount(){
		return this.totalCount;
	}
	public void setTotalCount(Integer totalCount){
		this.totalCount = totalCount;
	}

	public void totalCount(String multirequestToken){
		setToken("totalCount", multirequestToken);
	}

	// fileFormat:
	public DryRunFileType getFileFormat(){
		return this.fileFormat;
	}
	public void setFileFormat(DryRunFileType fileFormat){
		this.fileFormat = fileFormat;
	}

	public void fileFormat(String multirequestToken){
		setToken("fileFormat", multirequestToken);
	}

	// resultsFilePath:
	public String getResultsFilePath(){
		return this.resultsFilePath;
	}
	public void setResultsFilePath(String resultsFilePath){
		this.resultsFilePath = resultsFilePath;
	}

	public void resultsFilePath(String multirequestToken){
		setToken("resultsFilePath", multirequestToken);
	}

	// referenceTime:
	public Integer getReferenceTime(){
		return this.referenceTime;
	}
	public void setReferenceTime(Integer referenceTime){
		this.referenceTime = referenceTime;
	}

	public void referenceTime(String multirequestToken){
		setToken("referenceTime", multirequestToken);
	}


	public ScheduledTaskJobData() {
		super();
	}

	public ScheduledTaskJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		maxResults = GsonParser.parseInt(jsonObject.get("maxResults"));
		totalCount = GsonParser.parseInt(jsonObject.get("totalCount"));
		fileFormat = DryRunFileType.get(GsonParser.parseInt(jsonObject.get("fileFormat")));
		resultsFilePath = GsonParser.parseString(jsonObject.get("resultsFilePath"));
		referenceTime = GsonParser.parseInt(jsonObject.get("referenceTime"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduledTaskJobData");
		kparams.add("maxResults", this.maxResults);
		kparams.add("totalCount", this.totalCount);
		kparams.add("fileFormat", this.fileFormat);
		kparams.add("resultsFilePath", this.resultsFilePath);
		kparams.add("referenceTime", this.referenceTime);
		return kparams;
	}


    public static final Creator<ScheduledTaskJobData> CREATOR = new Creator<ScheduledTaskJobData>() {
        @Override
        public ScheduledTaskJobData createFromParcel(Parcel source) {
            return new ScheduledTaskJobData(source);
        }

        @Override
        public ScheduledTaskJobData[] newArray(int size) {
            return new ScheduledTaskJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.maxResults);
        dest.writeValue(this.totalCount);
        dest.writeInt(this.fileFormat == null ? -1 : this.fileFormat.ordinal());
        dest.writeString(this.resultsFilePath);
        dest.writeValue(this.referenceTime);
    }

    public ScheduledTaskJobData(Parcel in) {
        super(in);
        this.maxResults = (Integer)in.readValue(Integer.class.getClassLoader());
        this.totalCount = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpFileFormat = in.readInt();
        this.fileFormat = tmpFileFormat == -1 ? null : DryRunFileType.values()[tmpFileFormat];
        this.resultsFilePath = in.readString();
        this.referenceTime = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

