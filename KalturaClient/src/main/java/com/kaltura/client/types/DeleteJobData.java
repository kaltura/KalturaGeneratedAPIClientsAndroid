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
import com.kaltura.client.types.Filter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeleteJobData.Tokenizer.class)
public class DeleteJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		Filter.Tokenizer filter();
	}

	/**
	 * The filter should return the list of objects that need to be deleted.
	 */
	private Filter filter;

	// filter:
	public Filter getFilter(){
		return this.filter;
	}
	public void setFilter(Filter filter){
		this.filter = filter;
	}


	public DeleteJobData() {
		super();
	}

	public DeleteJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), Filter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeleteJobData");
		kparams.add("filter", this.filter);
		return kparams;
	}


    public static final Creator<DeleteJobData> CREATOR = new Creator<DeleteJobData>() {
        @Override
        public DeleteJobData createFromParcel(Parcel source) {
            return new DeleteJobData(source);
        }

        @Override
        public DeleteJobData[] newArray(int size) {
            return new DeleteJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.filter, flags);
    }

    public DeleteJobData(Parcel in) {
        super(in);
        this.filter = in.readParcelable(Filter.class.getClassLoader());
    }
}

