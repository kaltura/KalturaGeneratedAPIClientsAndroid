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
@MultiRequestBuilder.Tokenizer(UrlTokenizerUplynk.Tokenizer.class)
public class UrlTokenizerUplynk extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String accountId();
	}

	/**
	 * accountId
	 */
	private String accountId;

	// accountId:
	public String getAccountId(){
		return this.accountId;
	}
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}

	public void accountId(String multirequestToken){
		setToken("accountId", multirequestToken);
	}


	public UrlTokenizerUplynk() {
		super();
	}

	public UrlTokenizerUplynk(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		accountId = GsonParser.parseString(jsonObject.get("accountId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerUplynk");
		kparams.add("accountId", this.accountId);
		return kparams;
	}


    public static final Creator<UrlTokenizerUplynk> CREATOR = new Creator<UrlTokenizerUplynk>() {
        @Override
        public UrlTokenizerUplynk createFromParcel(Parcel source) {
            return new UrlTokenizerUplynk(source);
        }

        @Override
        public UrlTokenizerUplynk[] newArray(int size) {
            return new UrlTokenizerUplynk[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.accountId);
    }

    public UrlTokenizerUplynk(Parcel in) {
        super(in);
        this.accountId = in.readString();
    }
}

