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
import com.kaltura.client.enums.TvinciAssetsType;
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
@MultiRequestBuilder.Tokenizer(TvinciDistributionProfile.Tokenizer.class)
public class TvinciDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String ingestUrl();
		String username();
		String password();
		RequestBuilder.ListTokenizer<TvinciDistributionTag.Tokenizer> tags();
		String xsltFile();
		String innerType();
		String assetsType();
	}

	private String ingestUrl;
	private String username;
	private String password;
	/**
	 * Tags array for Tvinci distribution
	 */
	private List<TvinciDistributionTag> tags;
	private String xsltFile;
	private String innerType;
	private TvinciAssetsType assetsType;

	// ingestUrl:
	public String getIngestUrl(){
		return this.ingestUrl;
	}
	public void setIngestUrl(String ingestUrl){
		this.ingestUrl = ingestUrl;
	}

	public void ingestUrl(String multirequestToken){
		setToken("ingestUrl", multirequestToken);
	}

	// username:
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public void username(String multirequestToken){
		setToken("username", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
	}

	// tags:
	public List<TvinciDistributionTag> getTags(){
		return this.tags;
	}
	public void setTags(List<TvinciDistributionTag> tags){
		this.tags = tags;
	}

	// xsltFile:
	public String getXsltFile(){
		return this.xsltFile;
	}
	public void setXsltFile(String xsltFile){
		this.xsltFile = xsltFile;
	}

	public void xsltFile(String multirequestToken){
		setToken("xsltFile", multirequestToken);
	}

	// innerType:
	public String getInnerType(){
		return this.innerType;
	}
	public void setInnerType(String innerType){
		this.innerType = innerType;
	}

	public void innerType(String multirequestToken){
		setToken("innerType", multirequestToken);
	}

	// assetsType:
	public TvinciAssetsType getAssetsType(){
		return this.assetsType;
	}
	public void setAssetsType(TvinciAssetsType assetsType){
		this.assetsType = assetsType;
	}

	public void assetsType(String multirequestToken){
		setToken("assetsType", multirequestToken);
	}


	public TvinciDistributionProfile() {
		super();
	}

	public TvinciDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ingestUrl = GsonParser.parseString(jsonObject.get("ingestUrl"));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		tags = GsonParser.parseArray(jsonObject.getAsJsonArray("tags"), TvinciDistributionTag.class);
		xsltFile = GsonParser.parseString(jsonObject.get("xsltFile"));
		innerType = GsonParser.parseString(jsonObject.get("innerType"));
		assetsType = TvinciAssetsType.get(GsonParser.parseInt(jsonObject.get("assetsType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTvinciDistributionProfile");
		kparams.add("ingestUrl", this.ingestUrl);
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("tags", this.tags);
		kparams.add("xsltFile", this.xsltFile);
		kparams.add("innerType", this.innerType);
		kparams.add("assetsType", this.assetsType);
		return kparams;
	}


    public static final Creator<TvinciDistributionProfile> CREATOR = new Creator<TvinciDistributionProfile>() {
        @Override
        public TvinciDistributionProfile createFromParcel(Parcel source) {
            return new TvinciDistributionProfile(source);
        }

        @Override
        public TvinciDistributionProfile[] newArray(int size) {
            return new TvinciDistributionProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.ingestUrl);
        dest.writeString(this.username);
        dest.writeString(this.password);
        if(this.tags != null) {
            dest.writeInt(this.tags.size());
            dest.writeList(this.tags);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.xsltFile);
        dest.writeString(this.innerType);
        dest.writeInt(this.assetsType == null ? -1 : this.assetsType.ordinal());
    }

    public TvinciDistributionProfile(Parcel in) {
        super(in);
        this.ingestUrl = in.readString();
        this.username = in.readString();
        this.password = in.readString();
        int tagsSize = in.readInt();
        if( tagsSize > -1) {
            this.tags = new ArrayList<>();
            in.readList(this.tags, TvinciDistributionTag.class.getClassLoader());
        }
        this.xsltFile = in.readString();
        this.innerType = in.readString();
        int tmpAssetsType = in.readInt();
        this.assetsType = tmpAssetsType == -1 ? null : TvinciAssetsType.values()[tmpAssetsType];
    }
}

