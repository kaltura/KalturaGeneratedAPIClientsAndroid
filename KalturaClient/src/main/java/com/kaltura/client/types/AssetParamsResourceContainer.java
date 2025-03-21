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
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetParamsResourceContainer.Tokenizer.class)
public class AssetParamsResourceContainer extends Resource {
	
	public interface Tokenizer extends Resource.Tokenizer {
		ContentResource.Tokenizer resource();
		String assetParamsId();
	}

	/**
	 * The content resource to associate with asset params
	 */
	private ContentResource resource;
	/**
	 * The asset params to associate with the reaource
	 */
	private Integer assetParamsId;

	// resource:
	public ContentResource getResource(){
		return this.resource;
	}
	public void setResource(ContentResource resource){
		this.resource = resource;
	}

	// assetParamsId:
	public Integer getAssetParamsId(){
		return this.assetParamsId;
	}
	public void setAssetParamsId(Integer assetParamsId){
		this.assetParamsId = assetParamsId;
	}

	public void assetParamsId(String multirequestToken){
		setToken("assetParamsId", multirequestToken);
	}


	public AssetParamsResourceContainer() {
		super();
	}

	public AssetParamsResourceContainer(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resource = GsonParser.parseObject(jsonObject.getAsJsonObject("resource"), ContentResource.class);
		assetParamsId = GsonParser.parseInt(jsonObject.get("assetParamsId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetParamsResourceContainer");
		kparams.add("resource", this.resource);
		kparams.add("assetParamsId", this.assetParamsId);
		return kparams;
	}


    public static final Creator<AssetParamsResourceContainer> CREATOR = new Creator<AssetParamsResourceContainer>() {
        @Override
        public AssetParamsResourceContainer createFromParcel(Parcel source) {
            return new AssetParamsResourceContainer(source);
        }

        @Override
        public AssetParamsResourceContainer[] newArray(int size) {
            return new AssetParamsResourceContainer[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.resource, flags);
        dest.writeValue(this.assetParamsId);
    }

    public AssetParamsResourceContainer(Parcel in) {
        super(in);
        this.resource = in.readParcelable(ContentResource.class.getClassLoader());
        this.assetParamsId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

