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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ReportResponseOptions.Tokenizer.class)
public class ReportResponseOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String delimiter();
		String skipEmptyDates();
	}

	private String delimiter;
	private Boolean skipEmptyDates;

	// delimiter:
	public String getDelimiter(){
		return this.delimiter;
	}
	public void setDelimiter(String delimiter){
		this.delimiter = delimiter;
	}

	public void delimiter(String multirequestToken){
		setToken("delimiter", multirequestToken);
	}

	// skipEmptyDates:
	public Boolean getSkipEmptyDates(){
		return this.skipEmptyDates;
	}
	public void setSkipEmptyDates(Boolean skipEmptyDates){
		this.skipEmptyDates = skipEmptyDates;
	}

	public void skipEmptyDates(String multirequestToken){
		setToken("skipEmptyDates", multirequestToken);
	}


	public ReportResponseOptions() {
		super();
	}

	public ReportResponseOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		delimiter = GsonParser.parseString(jsonObject.get("delimiter"));
		skipEmptyDates = GsonParser.parseBoolean(jsonObject.get("skipEmptyDates"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportResponseOptions");
		kparams.add("delimiter", this.delimiter);
		kparams.add("skipEmptyDates", this.skipEmptyDates);
		return kparams;
	}


    public static final Creator<ReportResponseOptions> CREATOR = new Creator<ReportResponseOptions>() {
        @Override
        public ReportResponseOptions createFromParcel(Parcel source) {
            return new ReportResponseOptions(source);
        }

        @Override
        public ReportResponseOptions[] newArray(int size) {
            return new ReportResponseOptions[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.delimiter);
        dest.writeValue(this.skipEmptyDates);
    }

    public ReportResponseOptions(Parcel in) {
        super(in);
        this.delimiter = in.readString();
        this.skipEmptyDates = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

