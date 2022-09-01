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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(NdnDistributionProfile.Tokenizer.class)
public class NdnDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String feedUrl();
		String channelTitle();
		String channelLink();
		String channelDescription();
		String channelLanguage();
		String channelCopyright();
		String channelImageTitle();
		String channelImageUrl();
		String channelImageLink();
		String itemMediaRating();
	}

	private String feedUrl;
	private String channelTitle;
	private String channelLink;
	private String channelDescription;
	private String channelLanguage;
	private String channelCopyright;
	private String channelImageTitle;
	private String channelImageUrl;
	private String channelImageLink;
	private String itemMediaRating;

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	// channelTitle:
	public String getChannelTitle(){
		return this.channelTitle;
	}
	public void setChannelTitle(String channelTitle){
		this.channelTitle = channelTitle;
	}

	public void channelTitle(String multirequestToken){
		setToken("channelTitle", multirequestToken);
	}

	// channelLink:
	public String getChannelLink(){
		return this.channelLink;
	}
	public void setChannelLink(String channelLink){
		this.channelLink = channelLink;
	}

	public void channelLink(String multirequestToken){
		setToken("channelLink", multirequestToken);
	}

	// channelDescription:
	public String getChannelDescription(){
		return this.channelDescription;
	}
	public void setChannelDescription(String channelDescription){
		this.channelDescription = channelDescription;
	}

	public void channelDescription(String multirequestToken){
		setToken("channelDescription", multirequestToken);
	}

	// channelLanguage:
	public String getChannelLanguage(){
		return this.channelLanguage;
	}
	public void setChannelLanguage(String channelLanguage){
		this.channelLanguage = channelLanguage;
	}

	public void channelLanguage(String multirequestToken){
		setToken("channelLanguage", multirequestToken);
	}

	// channelCopyright:
	public String getChannelCopyright(){
		return this.channelCopyright;
	}
	public void setChannelCopyright(String channelCopyright){
		this.channelCopyright = channelCopyright;
	}

	public void channelCopyright(String multirequestToken){
		setToken("channelCopyright", multirequestToken);
	}

	// channelImageTitle:
	public String getChannelImageTitle(){
		return this.channelImageTitle;
	}
	public void setChannelImageTitle(String channelImageTitle){
		this.channelImageTitle = channelImageTitle;
	}

	public void channelImageTitle(String multirequestToken){
		setToken("channelImageTitle", multirequestToken);
	}

	// channelImageUrl:
	public String getChannelImageUrl(){
		return this.channelImageUrl;
	}
	public void setChannelImageUrl(String channelImageUrl){
		this.channelImageUrl = channelImageUrl;
	}

	public void channelImageUrl(String multirequestToken){
		setToken("channelImageUrl", multirequestToken);
	}

	// channelImageLink:
	public String getChannelImageLink(){
		return this.channelImageLink;
	}
	public void setChannelImageLink(String channelImageLink){
		this.channelImageLink = channelImageLink;
	}

	public void channelImageLink(String multirequestToken){
		setToken("channelImageLink", multirequestToken);
	}

	// itemMediaRating:
	public String getItemMediaRating(){
		return this.itemMediaRating;
	}
	public void setItemMediaRating(String itemMediaRating){
		this.itemMediaRating = itemMediaRating;
	}

	public void itemMediaRating(String multirequestToken){
		setToken("itemMediaRating", multirequestToken);
	}


	public NdnDistributionProfile() {
		super();
	}

	public NdnDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		channelTitle = GsonParser.parseString(jsonObject.get("channelTitle"));
		channelLink = GsonParser.parseString(jsonObject.get("channelLink"));
		channelDescription = GsonParser.parseString(jsonObject.get("channelDescription"));
		channelLanguage = GsonParser.parseString(jsonObject.get("channelLanguage"));
		channelCopyright = GsonParser.parseString(jsonObject.get("channelCopyright"));
		channelImageTitle = GsonParser.parseString(jsonObject.get("channelImageTitle"));
		channelImageUrl = GsonParser.parseString(jsonObject.get("channelImageUrl"));
		channelImageLink = GsonParser.parseString(jsonObject.get("channelImageLink"));
		itemMediaRating = GsonParser.parseString(jsonObject.get("itemMediaRating"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaNdnDistributionProfile");
		kparams.add("channelTitle", this.channelTitle);
		kparams.add("channelLink", this.channelLink);
		kparams.add("channelDescription", this.channelDescription);
		kparams.add("channelLanguage", this.channelLanguage);
		kparams.add("channelCopyright", this.channelCopyright);
		kparams.add("channelImageTitle", this.channelImageTitle);
		kparams.add("channelImageUrl", this.channelImageUrl);
		kparams.add("channelImageLink", this.channelImageLink);
		kparams.add("itemMediaRating", this.itemMediaRating);
		return kparams;
	}


    public static final Creator<NdnDistributionProfile> CREATOR = new Creator<NdnDistributionProfile>() {
        @Override
        public NdnDistributionProfile createFromParcel(Parcel source) {
            return new NdnDistributionProfile(source);
        }

        @Override
        public NdnDistributionProfile[] newArray(int size) {
            return new NdnDistributionProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.feedUrl);
        dest.writeString(this.channelTitle);
        dest.writeString(this.channelLink);
        dest.writeString(this.channelDescription);
        dest.writeString(this.channelLanguage);
        dest.writeString(this.channelCopyright);
        dest.writeString(this.channelImageTitle);
        dest.writeString(this.channelImageUrl);
        dest.writeString(this.channelImageLink);
        dest.writeString(this.itemMediaRating);
    }

    public NdnDistributionProfile(Parcel in) {
        super(in);
        this.feedUrl = in.readString();
        this.channelTitle = in.readString();
        this.channelLink = in.readString();
        this.channelDescription = in.readString();
        this.channelLanguage = in.readString();
        this.channelCopyright = in.readString();
        this.channelImageTitle = in.readString();
        this.channelImageUrl = in.readString();
        this.channelImageLink = in.readString();
        this.itemMediaRating = in.readString();
    }
}

