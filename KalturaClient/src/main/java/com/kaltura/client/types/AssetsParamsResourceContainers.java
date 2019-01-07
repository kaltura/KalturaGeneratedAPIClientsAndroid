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
// Copyright (C) 2006-2019  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetsParamsResourceContainers.Tokenizer.class)
public class AssetsParamsResourceContainers extends Resource {
	
	public interface Tokenizer extends Resource.Tokenizer {
		RequestBuilder.ListTokenizer<AssetParamsResourceContainer.Tokenizer> resources();
	}

	/**
	 * Array of resources associated with asset params ids
	 */
	private List<AssetParamsResourceContainer> resources;

	// resources:
	public List<AssetParamsResourceContainer> getResources(){
		return this.resources;
	}
	public void setResources(List<AssetParamsResourceContainer> resources){
		this.resources = resources;
	}


	public AssetsParamsResourceContainers() {
		super();
	}

	public AssetsParamsResourceContainers(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resources = GsonParser.parseArray(jsonObject.getAsJsonArray("resources"), AssetParamsResourceContainer.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetsParamsResourceContainers");
		kparams.add("resources", this.resources);
		return kparams;
	}


    public static final Creator<AssetsParamsResourceContainers> CREATOR = new Creator<AssetsParamsResourceContainers>() {
        @Override
        public AssetsParamsResourceContainers createFromParcel(Parcel source) {
            return new AssetsParamsResourceContainers(source);
        }

        @Override
        public AssetsParamsResourceContainers[] newArray(int size) {
            return new AssetsParamsResourceContainers[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.resources != null) {
            dest.writeInt(this.resources.size());
            dest.writeList(this.resources);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetsParamsResourceContainers(Parcel in) {
        super(in);
        int resourcesSize = in.readInt();
        if( resourcesSize > -1) {
            this.resources = new ArrayList<>();
            in.readList(this.resources, AssetParamsResourceContainer.class.getClassLoader());
        }
    }
}

