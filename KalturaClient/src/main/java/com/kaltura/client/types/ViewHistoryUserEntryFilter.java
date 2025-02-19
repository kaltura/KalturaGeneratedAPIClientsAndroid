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
import com.kaltura.client.enums.UserEntryExtendedStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ViewHistoryUserEntryFilter.Tokenizer.class)
public class ViewHistoryUserEntryFilter extends UserEntryFilter {
	
	public interface Tokenizer extends UserEntryFilter.Tokenizer {
		String extendedStatusEqual();
		String extendedStatusIn();
		String extendedStatusNotIn();
	}

	private UserEntryExtendedStatus extendedStatusEqual;
	private String extendedStatusIn;
	private String extendedStatusNotIn;

	// extendedStatusEqual:
	public UserEntryExtendedStatus getExtendedStatusEqual(){
		return this.extendedStatusEqual;
	}
	public void setExtendedStatusEqual(UserEntryExtendedStatus extendedStatusEqual){
		this.extendedStatusEqual = extendedStatusEqual;
	}

	public void extendedStatusEqual(String multirequestToken){
		setToken("extendedStatusEqual", multirequestToken);
	}

	// extendedStatusIn:
	public String getExtendedStatusIn(){
		return this.extendedStatusIn;
	}
	public void setExtendedStatusIn(String extendedStatusIn){
		this.extendedStatusIn = extendedStatusIn;
	}

	public void extendedStatusIn(String multirequestToken){
		setToken("extendedStatusIn", multirequestToken);
	}

	// extendedStatusNotIn:
	public String getExtendedStatusNotIn(){
		return this.extendedStatusNotIn;
	}
	public void setExtendedStatusNotIn(String extendedStatusNotIn){
		this.extendedStatusNotIn = extendedStatusNotIn;
	}

	public void extendedStatusNotIn(String multirequestToken){
		setToken("extendedStatusNotIn", multirequestToken);
	}


	public ViewHistoryUserEntryFilter() {
		super();
	}

	public ViewHistoryUserEntryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		extendedStatusEqual = UserEntryExtendedStatus.get(GsonParser.parseString(jsonObject.get("extendedStatusEqual")));
		extendedStatusIn = GsonParser.parseString(jsonObject.get("extendedStatusIn"));
		extendedStatusNotIn = GsonParser.parseString(jsonObject.get("extendedStatusNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaViewHistoryUserEntryFilter");
		kparams.add("extendedStatusEqual", this.extendedStatusEqual);
		kparams.add("extendedStatusIn", this.extendedStatusIn);
		kparams.add("extendedStatusNotIn", this.extendedStatusNotIn);
		return kparams;
	}


    public static final Creator<ViewHistoryUserEntryFilter> CREATOR = new Creator<ViewHistoryUserEntryFilter>() {
        @Override
        public ViewHistoryUserEntryFilter createFromParcel(Parcel source) {
            return new ViewHistoryUserEntryFilter(source);
        }

        @Override
        public ViewHistoryUserEntryFilter[] newArray(int size) {
            return new ViewHistoryUserEntryFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.extendedStatusEqual == null ? -1 : this.extendedStatusEqual.ordinal());
        dest.writeString(this.extendedStatusIn);
        dest.writeString(this.extendedStatusNotIn);
    }

    public ViewHistoryUserEntryFilter(Parcel in) {
        super(in);
        int tmpExtendedStatusEqual = in.readInt();
        this.extendedStatusEqual = tmpExtendedStatusEqual == -1 ? null : UserEntryExtendedStatus.values()[tmpExtendedStatusEqual];
        this.extendedStatusIn = in.readString();
        this.extendedStatusNotIn = in.readString();
    }
}

