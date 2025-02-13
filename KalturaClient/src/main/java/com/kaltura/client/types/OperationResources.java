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
import com.kaltura.client.enums.ChapterNamePolicy;
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
@MultiRequestBuilder.Tokenizer(OperationResources.Tokenizer.class)
public class OperationResources extends ContentResource {
	
	public interface Tokenizer extends ContentResource.Tokenizer {
		RequestBuilder.ListTokenizer<OperationResource.Tokenizer> resources();
		String chapterNamePolicy();
		RequestBuilder.ListTokenizer<DimensionsAttributes.Tokenizer> dimensionsAttributes();
	}

	private List<OperationResource> resources;
	private ChapterNamePolicy chapterNamePolicy;
	private List<DimensionsAttributes> dimensionsAttributes;

	// resources:
	public List<OperationResource> getResources(){
		return this.resources;
	}
	public void setResources(List<OperationResource> resources){
		this.resources = resources;
	}

	// chapterNamePolicy:
	public ChapterNamePolicy getChapterNamePolicy(){
		return this.chapterNamePolicy;
	}
	public void setChapterNamePolicy(ChapterNamePolicy chapterNamePolicy){
		this.chapterNamePolicy = chapterNamePolicy;
	}

	public void chapterNamePolicy(String multirequestToken){
		setToken("chapterNamePolicy", multirequestToken);
	}

	// dimensionsAttributes:
	public List<DimensionsAttributes> getDimensionsAttributes(){
		return this.dimensionsAttributes;
	}
	public void setDimensionsAttributes(List<DimensionsAttributes> dimensionsAttributes){
		this.dimensionsAttributes = dimensionsAttributes;
	}


	public OperationResources() {
		super();
	}

	public OperationResources(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resources = GsonParser.parseArray(jsonObject.getAsJsonArray("resources"), OperationResource.class);
		chapterNamePolicy = ChapterNamePolicy.get(GsonParser.parseInt(jsonObject.get("chapterNamePolicy")));
		dimensionsAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("dimensionsAttributes"), DimensionsAttributes.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOperationResources");
		kparams.add("resources", this.resources);
		kparams.add("chapterNamePolicy", this.chapterNamePolicy);
		kparams.add("dimensionsAttributes", this.dimensionsAttributes);
		return kparams;
	}


    public static final Creator<OperationResources> CREATOR = new Creator<OperationResources>() {
        @Override
        public OperationResources createFromParcel(Parcel source) {
            return new OperationResources(source);
        }

        @Override
        public OperationResources[] newArray(int size) {
            return new OperationResources[size];
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
        dest.writeInt(this.chapterNamePolicy == null ? -1 : this.chapterNamePolicy.ordinal());
        if(this.dimensionsAttributes != null) {
            dest.writeInt(this.dimensionsAttributes.size());
            dest.writeList(this.dimensionsAttributes);
        } else {
            dest.writeInt(-1);
        }
    }

    public OperationResources(Parcel in) {
        super(in);
        int resourcesSize = in.readInt();
        if( resourcesSize > -1) {
            this.resources = new ArrayList<>();
            in.readList(this.resources, OperationResource.class.getClassLoader());
        }
        int tmpChapterNamePolicy = in.readInt();
        this.chapterNamePolicy = tmpChapterNamePolicy == -1 ? null : ChapterNamePolicy.values()[tmpChapterNamePolicy];
        int dimensionsAttributesSize = in.readInt();
        if( dimensionsAttributesSize > -1) {
            this.dimensionsAttributes = new ArrayList<>();
            in.readList(this.dimensionsAttributes, DimensionsAttributes.class.getClassLoader());
        }
    }
}

