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
import com.kaltura.client.enums.BulkUploadCsvVersion;
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

/**
 * Represents the Bulk upload job data for CSV bulk upload
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadScheduleEventCsvJobData.Tokenizer.class)
public class BulkUploadScheduleEventCsvJobData extends BulkUploadScheduleEventJobData {
	
	public interface Tokenizer extends BulkUploadScheduleEventJobData.Tokenizer {
		String csvVersion();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> columns();
	}

	/**
	 * The version of the csv file
	 */
	private BulkUploadCsvVersion csvVersion;
	/**
	 * Array containing CSV headers
	 */
	private List<StringHolder> columns;

	// csvVersion:
	public BulkUploadCsvVersion getCsvVersion(){
		return this.csvVersion;
	}
	// columns:
	public List<StringHolder> getColumns(){
		return this.columns;
	}
	public void setColumns(List<StringHolder> columns){
		this.columns = columns;
	}


	public BulkUploadScheduleEventCsvJobData() {
		super();
	}

	public BulkUploadScheduleEventCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		csvVersion = BulkUploadCsvVersion.get(GsonParser.parseInt(jsonObject.get("csvVersion")));
		columns = GsonParser.parseArray(jsonObject.getAsJsonArray("columns"), StringHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadScheduleEventCsvJobData");
		kparams.add("columns", this.columns);
		return kparams;
	}


    public static final Creator<BulkUploadScheduleEventCsvJobData> CREATOR = new Creator<BulkUploadScheduleEventCsvJobData>() {
        @Override
        public BulkUploadScheduleEventCsvJobData createFromParcel(Parcel source) {
            return new BulkUploadScheduleEventCsvJobData(source);
        }

        @Override
        public BulkUploadScheduleEventCsvJobData[] newArray(int size) {
            return new BulkUploadScheduleEventCsvJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.csvVersion == null ? -1 : this.csvVersion.ordinal());
        if(this.columns != null) {
            dest.writeInt(this.columns.size());
            dest.writeList(this.columns);
        } else {
            dest.writeInt(-1);
        }
    }

    public BulkUploadScheduleEventCsvJobData(Parcel in) {
        super(in);
        int tmpCsvVersion = in.readInt();
        this.csvVersion = tmpCsvVersion == -1 ? null : BulkUploadCsvVersion.values()[tmpCsvVersion];
        int columnsSize = in.readInt();
        if( columnsSize > -1) {
            this.columns = new ArrayList<>();
            in.readList(this.columns, StringHolder.class.getClassLoader());
        }
    }
}

