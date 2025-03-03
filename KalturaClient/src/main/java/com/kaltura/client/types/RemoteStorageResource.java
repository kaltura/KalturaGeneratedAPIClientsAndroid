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

/**
 * Used to ingest media that is available on remote server and accessible using the
  supplied URL, the media file won't be downloaded but a file sync object of URL
  type will point to the media URL.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RemoteStorageResource.Tokenizer.class)
public class RemoteStorageResource extends UrlResource {
	
	public interface Tokenizer extends UrlResource.Tokenizer {
		String storageProfileId();
	}

	/**
	 * ID of storage profile to be associated with the created file sync, used for file
	  serving URL composing.
	 */
	private Integer storageProfileId;

	// storageProfileId:
	public Integer getStorageProfileId(){
		return this.storageProfileId;
	}
	public void setStorageProfileId(Integer storageProfileId){
		this.storageProfileId = storageProfileId;
	}

	public void storageProfileId(String multirequestToken){
		setToken("storageProfileId", multirequestToken);
	}


	public RemoteStorageResource() {
		super();
	}

	public RemoteStorageResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		storageProfileId = GsonParser.parseInt(jsonObject.get("storageProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRemoteStorageResource");
		kparams.add("storageProfileId", this.storageProfileId);
		return kparams;
	}


    public static final Creator<RemoteStorageResource> CREATOR = new Creator<RemoteStorageResource>() {
        @Override
        public RemoteStorageResource createFromParcel(Parcel source) {
            return new RemoteStorageResource(source);
        }

        @Override
        public RemoteStorageResource[] newArray(int size) {
            return new RemoteStorageResource[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.storageProfileId);
    }

    public RemoteStorageResource(Parcel in) {
        super(in);
        this.storageProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

