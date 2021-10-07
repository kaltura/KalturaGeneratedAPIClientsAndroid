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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportExportJobData.Tokenizer.class)
public class ReportExportJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String recipientEmail();
		RequestBuilder.ListTokenizer<ReportExportItem.Tokenizer> reportItems();
		String filePaths();
		String reportsGroup();
		RequestBuilder.ListTokenizer<ReportExportFile.Tokenizer> files();
		String baseUrl();
	}

	private String recipientEmail;
	private List<ReportExportItem> reportItems;
	private String filePaths;
	private String reportsGroup;
	private List<ReportExportFile> files;
	private String baseUrl;

	// recipientEmail:
	public String getRecipientEmail(){
		return this.recipientEmail;
	}
	public void setRecipientEmail(String recipientEmail){
		this.recipientEmail = recipientEmail;
	}

	public void recipientEmail(String multirequestToken){
		setToken("recipientEmail", multirequestToken);
	}

	// reportItems:
	public List<ReportExportItem> getReportItems(){
		return this.reportItems;
	}
	public void setReportItems(List<ReportExportItem> reportItems){
		this.reportItems = reportItems;
	}

	// filePaths:
	public String getFilePaths(){
		return this.filePaths;
	}
	public void setFilePaths(String filePaths){
		this.filePaths = filePaths;
	}

	public void filePaths(String multirequestToken){
		setToken("filePaths", multirequestToken);
	}

	// reportsGroup:
	public String getReportsGroup(){
		return this.reportsGroup;
	}
	public void setReportsGroup(String reportsGroup){
		this.reportsGroup = reportsGroup;
	}

	public void reportsGroup(String multirequestToken){
		setToken("reportsGroup", multirequestToken);
	}

	// files:
	public List<ReportExportFile> getFiles(){
		return this.files;
	}
	public void setFiles(List<ReportExportFile> files){
		this.files = files;
	}

	// baseUrl:
	public String getBaseUrl(){
		return this.baseUrl;
	}
	public void setBaseUrl(String baseUrl){
		this.baseUrl = baseUrl;
	}

	public void baseUrl(String multirequestToken){
		setToken("baseUrl", multirequestToken);
	}


	public ReportExportJobData() {
		super();
	}

	public ReportExportJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		recipientEmail = GsonParser.parseString(jsonObject.get("recipientEmail"));
		reportItems = GsonParser.parseArray(jsonObject.getAsJsonArray("reportItems"), ReportExportItem.class);
		filePaths = GsonParser.parseString(jsonObject.get("filePaths"));
		reportsGroup = GsonParser.parseString(jsonObject.get("reportsGroup"));
		files = GsonParser.parseArray(jsonObject.getAsJsonArray("files"), ReportExportFile.class);
		baseUrl = GsonParser.parseString(jsonObject.get("baseUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportExportJobData");
		kparams.add("recipientEmail", this.recipientEmail);
		kparams.add("reportItems", this.reportItems);
		kparams.add("filePaths", this.filePaths);
		kparams.add("reportsGroup", this.reportsGroup);
		kparams.add("files", this.files);
		kparams.add("baseUrl", this.baseUrl);
		return kparams;
	}


    public static final Creator<ReportExportJobData> CREATOR = new Creator<ReportExportJobData>() {
        @Override
        public ReportExportJobData createFromParcel(Parcel source) {
            return new ReportExportJobData(source);
        }

        @Override
        public ReportExportJobData[] newArray(int size) {
            return new ReportExportJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.recipientEmail);
        if(this.reportItems != null) {
            dest.writeInt(this.reportItems.size());
            dest.writeList(this.reportItems);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.filePaths);
        dest.writeString(this.reportsGroup);
        if(this.files != null) {
            dest.writeInt(this.files.size());
            dest.writeList(this.files);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.baseUrl);
    }

    public ReportExportJobData(Parcel in) {
        super(in);
        this.recipientEmail = in.readString();
        int reportItemsSize = in.readInt();
        if( reportItemsSize > -1) {
            this.reportItems = new ArrayList<>();
            in.readList(this.reportItems, ReportExportItem.class.getClassLoader());
        }
        this.filePaths = in.readString();
        this.reportsGroup = in.readString();
        int filesSize = in.readInt();
        if( filesSize > -1) {
            this.files = new ArrayList<>();
            in.readList(this.files, ReportExportFile.class.getClassLoader());
        }
        this.baseUrl = in.readString();
    }
}

