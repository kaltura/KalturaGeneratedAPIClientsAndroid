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
// Copyright (C) 2006-2018  Kaltura Inc.
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AvnDistributionProfile.Tokenizer.class)
public class AvnDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String feedUrl();
		String feedTitle();
	}

	private String feedUrl;
	private String feedTitle;

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	public void setFeedUrl(String feedUrl){
		this.feedUrl = feedUrl;
	}

	public void feedUrl(String multirequestToken){
		setToken("feedUrl", multirequestToken);
	}

	// feedTitle:
	public String getFeedTitle(){
		return this.feedTitle;
	}
	public void setFeedTitle(String feedTitle){
		this.feedTitle = feedTitle;
	}

	public void feedTitle(String multirequestToken){
		setToken("feedTitle", multirequestToken);
	}


	public AvnDistributionProfile() {
		super();
	}

	public AvnDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		feedTitle = GsonParser.parseString(jsonObject.get("feedTitle"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAvnDistributionProfile");
		kparams.add("feedTitle", this.feedTitle);
		return kparams;
	}


    public static final Creator<AvnDistributionProfile> CREATOR = new Creator<AvnDistributionProfile>() {
        @Override
        public AvnDistributionProfile createFromParcel(Parcel source) {
            return new AvnDistributionProfile(source);
        }

        @Override
        public AvnDistributionProfile[] newArray(int size) {
            return new AvnDistributionProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.feedUrl);
        dest.writeString(this.feedTitle);
    }

    public AvnDistributionProfile(Parcel in) {
        super(in);
        this.feedUrl = in.readString();
        this.feedTitle = in.readString();
    }
}

