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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileForensicWatermark.Tokenizer.class)
public class DeliveryProfileForensicWatermark extends DeliveryProfile {
	
	public interface Tokenizer extends DeliveryProfile.Tokenizer {
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> internalUrl();
		String encryptionKey();
		String encryptionIv();
		String encryptionRegex();
	}

	/**
	 * The URL used to pull manifest from the server, keyed by dc id, asterisk means
	  all dcs
	 */
	private List<KeyValue> internalUrl;
	/**
	 * The key used to encrypt the URI (256 bits)
	 */
	private String encryptionKey;
	/**
	 * The iv used to encrypt the URI (128 bits)
	 */
	private String encryptionIv;
	/**
	 * The regex used to match the encrypted part of the URI (according to the
	  'encrypt' named group)
	 */
	private String encryptionRegex;

	// internalUrl:
	public List<KeyValue> getInternalUrl(){
		return this.internalUrl;
	}
	public void setInternalUrl(List<KeyValue> internalUrl){
		this.internalUrl = internalUrl;
	}

	// encryptionKey:
	public String getEncryptionKey(){
		return this.encryptionKey;
	}
	public void setEncryptionKey(String encryptionKey){
		this.encryptionKey = encryptionKey;
	}

	public void encryptionKey(String multirequestToken){
		setToken("encryptionKey", multirequestToken);
	}

	// encryptionIv:
	public String getEncryptionIv(){
		return this.encryptionIv;
	}
	public void setEncryptionIv(String encryptionIv){
		this.encryptionIv = encryptionIv;
	}

	public void encryptionIv(String multirequestToken){
		setToken("encryptionIv", multirequestToken);
	}

	// encryptionRegex:
	public String getEncryptionRegex(){
		return this.encryptionRegex;
	}
	public void setEncryptionRegex(String encryptionRegex){
		this.encryptionRegex = encryptionRegex;
	}

	public void encryptionRegex(String multirequestToken){
		setToken("encryptionRegex", multirequestToken);
	}


	public DeliveryProfileForensicWatermark() {
		super();
	}

	public DeliveryProfileForensicWatermark(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		internalUrl = GsonParser.parseArray(jsonObject.getAsJsonArray("internalUrl"), KeyValue.class);
		encryptionKey = GsonParser.parseString(jsonObject.get("encryptionKey"));
		encryptionIv = GsonParser.parseString(jsonObject.get("encryptionIv"));
		encryptionRegex = GsonParser.parseString(jsonObject.get("encryptionRegex"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileForensicWatermark");
		kparams.add("internalUrl", this.internalUrl);
		kparams.add("encryptionKey", this.encryptionKey);
		kparams.add("encryptionIv", this.encryptionIv);
		kparams.add("encryptionRegex", this.encryptionRegex);
		return kparams;
	}


    public static final Creator<DeliveryProfileForensicWatermark> CREATOR = new Creator<DeliveryProfileForensicWatermark>() {
        @Override
        public DeliveryProfileForensicWatermark createFromParcel(Parcel source) {
            return new DeliveryProfileForensicWatermark(source);
        }

        @Override
        public DeliveryProfileForensicWatermark[] newArray(int size) {
            return new DeliveryProfileForensicWatermark[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.internalUrl != null) {
            dest.writeInt(this.internalUrl.size());
            dest.writeList(this.internalUrl);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.encryptionKey);
        dest.writeString(this.encryptionIv);
        dest.writeString(this.encryptionRegex);
    }

    public DeliveryProfileForensicWatermark(Parcel in) {
        super(in);
        int internalUrlSize = in.readInt();
        if( internalUrlSize > -1) {
            this.internalUrl = new ArrayList<>();
            in.readList(this.internalUrl, KeyValue.class.getClassLoader());
        }
        this.encryptionKey = in.readString();
        this.encryptionIv = in.readString();
        this.encryptionRegex = in.readString();
    }
}

