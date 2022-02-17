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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaEntryFilterForPlaylist.Tokenizer.class)
public class MediaEntryFilterForPlaylist extends MediaEntryFilter {
	
	public interface Tokenizer extends MediaEntryFilter.Tokenizer {
		String limit();
		String name();
	}

	private Integer limit;
	private String name;

	// limit:
	public Integer getLimit(){
		return this.limit;
	}
	public void setLimit(Integer limit){
		this.limit = limit;
	}

	public void limit(String multirequestToken){
		setToken("limit", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}


	public MediaEntryFilterForPlaylist() {
		super();
	}

	public MediaEntryFilterForPlaylist(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		limit = GsonParser.parseInt(jsonObject.get("limit"));
		name = GsonParser.parseString(jsonObject.get("name"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaEntryFilterForPlaylist");
		kparams.add("limit", this.limit);
		kparams.add("name", this.name);
		return kparams;
	}


    public static final Creator<MediaEntryFilterForPlaylist> CREATOR = new Creator<MediaEntryFilterForPlaylist>() {
        @Override
        public MediaEntryFilterForPlaylist createFromParcel(Parcel source) {
            return new MediaEntryFilterForPlaylist(source);
        }

        @Override
        public MediaEntryFilterForPlaylist[] newArray(int size) {
            return new MediaEntryFilterForPlaylist[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.limit);
        dest.writeString(this.name);
    }

    public MediaEntryFilterForPlaylist(Parcel in) {
        super(in);
        this.limit = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
    }
}

