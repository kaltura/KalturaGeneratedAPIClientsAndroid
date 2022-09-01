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
import com.kaltura.client.enums.DropFolderContentFileHandlerMatchPolicy;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderContentFileHandlerConfig.Tokenizer.class)
public class DropFolderContentFileHandlerConfig extends DropFolderFileHandlerConfig {
	
	public interface Tokenizer extends DropFolderFileHandlerConfig.Tokenizer {
		String contentMatchPolicy();
		String slugRegex();
	}

	private DropFolderContentFileHandlerMatchPolicy contentMatchPolicy;
	/**
	 * Regular expression that defines valid file names to be handled.   The following
	  might be extracted from the file name and used if defined:   -
	  (?P&lt;referenceId&gt;\w+) - will be used as the drop folder file's parsed slug.
	    - (?P&lt;flavorName&gt;\w+)  - will be used as the drop folder file's parsed
	  flavor.
	 */
	private String slugRegex;

	// contentMatchPolicy:
	public DropFolderContentFileHandlerMatchPolicy getContentMatchPolicy(){
		return this.contentMatchPolicy;
	}
	public void setContentMatchPolicy(DropFolderContentFileHandlerMatchPolicy contentMatchPolicy){
		this.contentMatchPolicy = contentMatchPolicy;
	}

	public void contentMatchPolicy(String multirequestToken){
		setToken("contentMatchPolicy", multirequestToken);
	}

	// slugRegex:
	public String getSlugRegex(){
		return this.slugRegex;
	}
	public void setSlugRegex(String slugRegex){
		this.slugRegex = slugRegex;
	}

	public void slugRegex(String multirequestToken){
		setToken("slugRegex", multirequestToken);
	}


	public DropFolderContentFileHandlerConfig() {
		super();
	}

	public DropFolderContentFileHandlerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		contentMatchPolicy = DropFolderContentFileHandlerMatchPolicy.get(GsonParser.parseInt(jsonObject.get("contentMatchPolicy")));
		slugRegex = GsonParser.parseString(jsonObject.get("slugRegex"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderContentFileHandlerConfig");
		kparams.add("contentMatchPolicy", this.contentMatchPolicy);
		kparams.add("slugRegex", this.slugRegex);
		return kparams;
	}


    public static final Creator<DropFolderContentFileHandlerConfig> CREATOR = new Creator<DropFolderContentFileHandlerConfig>() {
        @Override
        public DropFolderContentFileHandlerConfig createFromParcel(Parcel source) {
            return new DropFolderContentFileHandlerConfig(source);
        }

        @Override
        public DropFolderContentFileHandlerConfig[] newArray(int size) {
            return new DropFolderContentFileHandlerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.contentMatchPolicy == null ? -1 : this.contentMatchPolicy.ordinal());
        dest.writeString(this.slugRegex);
    }

    public DropFolderContentFileHandlerConfig(Parcel in) {
        super(in);
        int tmpContentMatchPolicy = in.readInt();
        this.contentMatchPolicy = tmpContentMatchPolicy == -1 ? null : DropFolderContentFileHandlerMatchPolicy.values()[tmpContentMatchPolicy];
        this.slugRegex = in.readString();
    }
}

