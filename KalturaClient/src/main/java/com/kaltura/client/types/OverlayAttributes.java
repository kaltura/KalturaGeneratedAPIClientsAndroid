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
@MultiRequestBuilder.Tokenizer(OverlayAttributes.Tokenizer.class)
public class OverlayAttributes extends MediaCompositionAttributes {
	
	public interface Tokenizer extends MediaCompositionAttributes.Tokenizer {
		ContentResource.Tokenizer resource();
		RequestBuilder.ListTokenizer<MediaCompositionAttributes.Tokenizer> resourceMediaCompositionAttributesArray();
	}

	/**
	 * Only KalturaEntryResource and KalturaAssetResource are supported
	 */
	private ContentResource resource;
	/**
	 * Only KalturaReplaceBackgroundAttributes is supported
	 */
	private List<MediaCompositionAttributes> resourceMediaCompositionAttributesArray;

	// resource:
	public ContentResource getResource(){
		return this.resource;
	}
	public void setResource(ContentResource resource){
		this.resource = resource;
	}

	// resourceMediaCompositionAttributesArray:
	public List<MediaCompositionAttributes> getResourceMediaCompositionAttributesArray(){
		return this.resourceMediaCompositionAttributesArray;
	}
	public void setResourceMediaCompositionAttributesArray(List<MediaCompositionAttributes> resourceMediaCompositionAttributesArray){
		this.resourceMediaCompositionAttributesArray = resourceMediaCompositionAttributesArray;
	}


	public OverlayAttributes() {
		super();
	}

	public OverlayAttributes(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resource = GsonParser.parseObject(jsonObject.getAsJsonObject("resource"), ContentResource.class);
		resourceMediaCompositionAttributesArray = GsonParser.parseArray(jsonObject.getAsJsonArray("resourceMediaCompositionAttributesArray"), MediaCompositionAttributes.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOverlayAttributes");
		kparams.add("resource", this.resource);
		kparams.add("resourceMediaCompositionAttributesArray", this.resourceMediaCompositionAttributesArray);
		return kparams;
	}


    public static final Creator<OverlayAttributes> CREATOR = new Creator<OverlayAttributes>() {
        @Override
        public OverlayAttributes createFromParcel(Parcel source) {
            return new OverlayAttributes(source);
        }

        @Override
        public OverlayAttributes[] newArray(int size) {
            return new OverlayAttributes[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.resource, flags);
        if(this.resourceMediaCompositionAttributesArray != null) {
            dest.writeInt(this.resourceMediaCompositionAttributesArray.size());
            dest.writeList(this.resourceMediaCompositionAttributesArray);
        } else {
            dest.writeInt(-1);
        }
    }

    public OverlayAttributes(Parcel in) {
        super(in);
        this.resource = in.readParcelable(ContentResource.class.getClassLoader());
        int resourceMediaCompositionAttributesArraySize = in.readInt();
        if( resourceMediaCompositionAttributesArraySize > -1) {
            this.resourceMediaCompositionAttributesArray = new ArrayList<>();
            in.readList(this.resourceMediaCompositionAttributesArray, MediaCompositionAttributes.class.getClassLoader());
        }
    }
}

