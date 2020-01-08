// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2020  Kaltura Inc.
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

/**
 * Used to ingest media that is available on remote server and accessible using the
  supplied URL, media file will be downloaded using import job in order to make
  the asset ready.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlResource.Tokenizer.class)
public class UrlResource extends ContentResource {
	
	public interface Tokenizer extends ContentResource.Tokenizer {
		String url();
		String forceAsyncDownload();
	}

	/**
	 * Remote URL, FTP, HTTP or HTTPS
	 */
	private String url;
	/**
	 * Force Import Job
	 */
	private Boolean forceAsyncDownload;

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
	}

	// forceAsyncDownload:
	public Boolean getForceAsyncDownload(){
		return this.forceAsyncDownload;
	}
	public void setForceAsyncDownload(Boolean forceAsyncDownload){
		this.forceAsyncDownload = forceAsyncDownload;
	}

	public void forceAsyncDownload(String multirequestToken){
		setToken("forceAsyncDownload", multirequestToken);
	}


	public UrlResource() {
		super();
	}

	public UrlResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		url = GsonParser.parseString(jsonObject.get("url"));
		forceAsyncDownload = GsonParser.parseBoolean(jsonObject.get("forceAsyncDownload"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlResource");
		kparams.add("url", this.url);
		kparams.add("forceAsyncDownload", this.forceAsyncDownload);
		return kparams;
	}


    public static final Creator<UrlResource> CREATOR = new Creator<UrlResource>() {
        @Override
        public UrlResource createFromParcel(Parcel source) {
            return new UrlResource(source);
        }

        @Override
        public UrlResource[] newArray(int size) {
            return new UrlResource[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.url);
        dest.writeValue(this.forceAsyncDownload);
    }

    public UrlResource(Parcel in) {
        super(in);
        this.url = in.readString();
        this.forceAsyncDownload = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

