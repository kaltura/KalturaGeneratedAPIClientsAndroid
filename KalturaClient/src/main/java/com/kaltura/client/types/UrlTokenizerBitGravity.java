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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlTokenizerBitGravity.Tokenizer.class)
public class UrlTokenizerBitGravity extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String hashPatternRegex();
	}

	/**
	 * hashPatternRegex
	 */
	private String hashPatternRegex;

	// hashPatternRegex:
	public String getHashPatternRegex(){
		return this.hashPatternRegex;
	}
	public void setHashPatternRegex(String hashPatternRegex){
		this.hashPatternRegex = hashPatternRegex;
	}

	public void hashPatternRegex(String multirequestToken){
		setToken("hashPatternRegex", multirequestToken);
	}


	public UrlTokenizerBitGravity() {
		super();
	}

	public UrlTokenizerBitGravity(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		hashPatternRegex = GsonParser.parseString(jsonObject.get("hashPatternRegex"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerBitGravity");
		kparams.add("hashPatternRegex", this.hashPatternRegex);
		return kparams;
	}


    public static final Creator<UrlTokenizerBitGravity> CREATOR = new Creator<UrlTokenizerBitGravity>() {
        @Override
        public UrlTokenizerBitGravity createFromParcel(Parcel source) {
            return new UrlTokenizerBitGravity(source);
        }

        @Override
        public UrlTokenizerBitGravity[] newArray(int size) {
            return new UrlTokenizerBitGravity[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.hashPatternRegex);
    }

    public UrlTokenizerBitGravity(Parcel in) {
        super(in);
        this.hashPatternRegex = in.readString();
    }
}

