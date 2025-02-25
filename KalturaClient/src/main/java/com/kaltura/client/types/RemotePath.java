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
@MultiRequestBuilder.Tokenizer(RemotePath.Tokenizer.class)
public class RemotePath extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String storageProfileId();
		String uri();
	}

	private Integer storageProfileId;
	private String uri;

	// storageProfileId:
	public Integer getStorageProfileId(){
		return this.storageProfileId;
	}
	// uri:
	public String getUri(){
		return this.uri;
	}

	public RemotePath() {
		super();
	}

	public RemotePath(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		storageProfileId = GsonParser.parseInt(jsonObject.get("storageProfileId"));
		uri = GsonParser.parseString(jsonObject.get("uri"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRemotePath");
		return kparams;
	}


    public static final Creator<RemotePath> CREATOR = new Creator<RemotePath>() {
        @Override
        public RemotePath createFromParcel(Parcel source) {
            return new RemotePath(source);
        }

        @Override
        public RemotePath[] newArray(int size) {
            return new RemotePath[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.storageProfileId);
        dest.writeString(this.uri);
    }

    public RemotePath(Parcel in) {
        super(in);
        this.storageProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.uri = in.readString();
    }
}

