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
@MultiRequestBuilder.Tokenizer(UrlTokenizerL3.Tokenizer.class)
public class UrlTokenizerL3 extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String gen();
		String paramName();
	}

	/**
	 * gen
	 */
	private String gen;
	/**
	 * paramName
	 */
	private String paramName;

	// gen:
	public String getGen(){
		return this.gen;
	}
	public void setGen(String gen){
		this.gen = gen;
	}

	public void gen(String multirequestToken){
		setToken("gen", multirequestToken);
	}

	// paramName:
	public String getParamName(){
		return this.paramName;
	}
	public void setParamName(String paramName){
		this.paramName = paramName;
	}

	public void paramName(String multirequestToken){
		setToken("paramName", multirequestToken);
	}


	public UrlTokenizerL3() {
		super();
	}

	public UrlTokenizerL3(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		gen = GsonParser.parseString(jsonObject.get("gen"));
		paramName = GsonParser.parseString(jsonObject.get("paramName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerL3");
		kparams.add("gen", this.gen);
		kparams.add("paramName", this.paramName);
		return kparams;
	}


    public static final Creator<UrlTokenizerL3> CREATOR = new Creator<UrlTokenizerL3>() {
        @Override
        public UrlTokenizerL3 createFromParcel(Parcel source) {
            return new UrlTokenizerL3(source);
        }

        @Override
        public UrlTokenizerL3[] newArray(int size) {
            return new UrlTokenizerL3[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.gen);
        dest.writeString(this.paramName);
    }

    public UrlTokenizerL3(Parcel in) {
        super(in);
        this.gen = in.readString();
        this.paramName = in.readString();
    }
}

