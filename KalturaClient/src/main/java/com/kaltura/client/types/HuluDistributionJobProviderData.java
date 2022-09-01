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
@MultiRequestBuilder.Tokenizer(HuluDistributionJobProviderData.Tokenizer.class)
public class HuluDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String videoAssetFilePath();
		String thumbAssetFilePath();
		RequestBuilder.ListTokenizer<CuePoint.Tokenizer> cuePoints();
		String fileBaseName();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> captionLocalPaths();
	}

	private String videoAssetFilePath;
	private String thumbAssetFilePath;
	private List<CuePoint> cuePoints;
	private String fileBaseName;
	private List<StringHolder> captionLocalPaths;

	// videoAssetFilePath:
	public String getVideoAssetFilePath(){
		return this.videoAssetFilePath;
	}
	public void setVideoAssetFilePath(String videoAssetFilePath){
		this.videoAssetFilePath = videoAssetFilePath;
	}

	public void videoAssetFilePath(String multirequestToken){
		setToken("videoAssetFilePath", multirequestToken);
	}

	// thumbAssetFilePath:
	public String getThumbAssetFilePath(){
		return this.thumbAssetFilePath;
	}
	public void setThumbAssetFilePath(String thumbAssetFilePath){
		this.thumbAssetFilePath = thumbAssetFilePath;
	}

	public void thumbAssetFilePath(String multirequestToken){
		setToken("thumbAssetFilePath", multirequestToken);
	}

	// cuePoints:
	public List<CuePoint> getCuePoints(){
		return this.cuePoints;
	}
	public void setCuePoints(List<CuePoint> cuePoints){
		this.cuePoints = cuePoints;
	}

	// fileBaseName:
	public String getFileBaseName(){
		return this.fileBaseName;
	}
	public void setFileBaseName(String fileBaseName){
		this.fileBaseName = fileBaseName;
	}

	public void fileBaseName(String multirequestToken){
		setToken("fileBaseName", multirequestToken);
	}

	// captionLocalPaths:
	public List<StringHolder> getCaptionLocalPaths(){
		return this.captionLocalPaths;
	}
	public void setCaptionLocalPaths(List<StringHolder> captionLocalPaths){
		this.captionLocalPaths = captionLocalPaths;
	}


	public HuluDistributionJobProviderData() {
		super();
	}

	public HuluDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
		thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));
		cuePoints = GsonParser.parseArray(jsonObject.getAsJsonArray("cuePoints"), CuePoint.class);
		fileBaseName = GsonParser.parseString(jsonObject.get("fileBaseName"));
		captionLocalPaths = GsonParser.parseArray(jsonObject.getAsJsonArray("captionLocalPaths"), StringHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHuluDistributionJobProviderData");
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
		kparams.add("cuePoints", this.cuePoints);
		kparams.add("fileBaseName", this.fileBaseName);
		kparams.add("captionLocalPaths", this.captionLocalPaths);
		return kparams;
	}


    public static final Creator<HuluDistributionJobProviderData> CREATOR = new Creator<HuluDistributionJobProviderData>() {
        @Override
        public HuluDistributionJobProviderData createFromParcel(Parcel source) {
            return new HuluDistributionJobProviderData(source);
        }

        @Override
        public HuluDistributionJobProviderData[] newArray(int size) {
            return new HuluDistributionJobProviderData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.videoAssetFilePath);
        dest.writeString(this.thumbAssetFilePath);
        if(this.cuePoints != null) {
            dest.writeInt(this.cuePoints.size());
            dest.writeList(this.cuePoints);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.fileBaseName);
        if(this.captionLocalPaths != null) {
            dest.writeInt(this.captionLocalPaths.size());
            dest.writeList(this.captionLocalPaths);
        } else {
            dest.writeInt(-1);
        }
    }

    public HuluDistributionJobProviderData(Parcel in) {
        super(in);
        this.videoAssetFilePath = in.readString();
        this.thumbAssetFilePath = in.readString();
        int cuePointsSize = in.readInt();
        if( cuePointsSize > -1) {
            this.cuePoints = new ArrayList<>();
            in.readList(this.cuePoints, CuePoint.class.getClassLoader());
        }
        this.fileBaseName = in.readString();
        int captionLocalPathsSize = in.readInt();
        if( captionLocalPathsSize > -1) {
            this.captionLocalPaths = new ArrayList<>();
            in.readList(this.captionLocalPaths, StringHolder.class.getClassLoader());
        }
    }
}

