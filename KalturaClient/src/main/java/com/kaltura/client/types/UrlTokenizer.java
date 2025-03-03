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
@MultiRequestBuilder.Tokenizer(UrlTokenizer.Tokenizer.class)
public class UrlTokenizer extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String window();
		String key();
		String limitIpAddress();
	}

	/**
	 * Window
	 */
	private Integer window;
	/**
	 * key
	 */
	private String key;
	private Boolean limitIpAddress;

	// window:
	public Integer getWindow(){
		return this.window;
	}
	public void setWindow(Integer window){
		this.window = window;
	}

	public void window(String multirequestToken){
		setToken("window", multirequestToken);
	}

	// key:
	public String getKey(){
		return this.key;
	}
	public void setKey(String key){
		this.key = key;
	}

	public void key(String multirequestToken){
		setToken("key", multirequestToken);
	}

	// limitIpAddress:
	public Boolean getLimitIpAddress(){
		return this.limitIpAddress;
	}
	public void setLimitIpAddress(Boolean limitIpAddress){
		this.limitIpAddress = limitIpAddress;
	}

	public void limitIpAddress(String multirequestToken){
		setToken("limitIpAddress", multirequestToken);
	}


	public UrlTokenizer() {
		super();
	}

	public UrlTokenizer(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		window = GsonParser.parseInt(jsonObject.get("window"));
		key = GsonParser.parseString(jsonObject.get("key"));
		limitIpAddress = GsonParser.parseBoolean(jsonObject.get("limitIpAddress"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizer");
		kparams.add("window", this.window);
		kparams.add("key", this.key);
		kparams.add("limitIpAddress", this.limitIpAddress);
		return kparams;
	}


    public static final Creator<UrlTokenizer> CREATOR = new Creator<UrlTokenizer>() {
        @Override
        public UrlTokenizer createFromParcel(Parcel source) {
            return new UrlTokenizer(source);
        }

        @Override
        public UrlTokenizer[] newArray(int size) {
            return new UrlTokenizer[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.window);
        dest.writeString(this.key);
        dest.writeValue(this.limitIpAddress);
    }

    public UrlTokenizer(Parcel in) {
        super(in);
        this.window = (Integer)in.readValue(Integer.class.getClassLoader());
        this.key = in.readString();
        this.limitIpAddress = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

