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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(QuickPlayDistributionJobProviderData.Tokenizer.class)
public class QuickPlayDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String xml();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> videoFilePaths();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> thumbnailFilePaths();
	}

	private String xml;
	private List<StringHolder> videoFilePaths;
	private List<StringHolder> thumbnailFilePaths;

	// xml:
	public String getXml(){
		return this.xml;
	}
	public void setXml(String xml){
		this.xml = xml;
	}

	public void xml(String multirequestToken){
		setToken("xml", multirequestToken);
	}

	// videoFilePaths:
	public List<StringHolder> getVideoFilePaths(){
		return this.videoFilePaths;
	}
	public void setVideoFilePaths(List<StringHolder> videoFilePaths){
		this.videoFilePaths = videoFilePaths;
	}

	// thumbnailFilePaths:
	public List<StringHolder> getThumbnailFilePaths(){
		return this.thumbnailFilePaths;
	}
	public void setThumbnailFilePaths(List<StringHolder> thumbnailFilePaths){
		this.thumbnailFilePaths = thumbnailFilePaths;
	}


	public QuickPlayDistributionJobProviderData() {
		super();
	}

	public QuickPlayDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xml = GsonParser.parseString(jsonObject.get("xml"));
		videoFilePaths = GsonParser.parseArray(jsonObject.getAsJsonArray("videoFilePaths"), StringHolder.class);
		thumbnailFilePaths = GsonParser.parseArray(jsonObject.getAsJsonArray("thumbnailFilePaths"), StringHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuickPlayDistributionJobProviderData");
		kparams.add("xml", this.xml);
		kparams.add("videoFilePaths", this.videoFilePaths);
		kparams.add("thumbnailFilePaths", this.thumbnailFilePaths);
		return kparams;
	}


    public static final Creator<QuickPlayDistributionJobProviderData> CREATOR = new Creator<QuickPlayDistributionJobProviderData>() {
        @Override
        public QuickPlayDistributionJobProviderData createFromParcel(Parcel source) {
            return new QuickPlayDistributionJobProviderData(source);
        }

        @Override
        public QuickPlayDistributionJobProviderData[] newArray(int size) {
            return new QuickPlayDistributionJobProviderData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.xml);
        if(this.videoFilePaths != null) {
            dest.writeInt(this.videoFilePaths.size());
            dest.writeList(this.videoFilePaths);
        } else {
            dest.writeInt(-1);
        }
        if(this.thumbnailFilePaths != null) {
            dest.writeInt(this.thumbnailFilePaths.size());
            dest.writeList(this.thumbnailFilePaths);
        } else {
            dest.writeInt(-1);
        }
    }

    public QuickPlayDistributionJobProviderData(Parcel in) {
        super(in);
        this.xml = in.readString();
        int videoFilePathsSize = in.readInt();
        if( videoFilePathsSize > -1) {
            this.videoFilePaths = new ArrayList<>();
            in.readList(this.videoFilePaths, StringHolder.class.getClassLoader());
        }
        int thumbnailFilePathsSize = in.readInt();
        if( thumbnailFilePathsSize > -1) {
            this.thumbnailFilePaths = new ArrayList<>();
            in.readList(this.thumbnailFilePaths, StringHolder.class.getClassLoader());
        }
    }
}

