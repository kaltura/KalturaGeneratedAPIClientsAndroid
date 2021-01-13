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
// Copyright (C) 2006-2021  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(IndexTagsByPrivacyContextJobData.Tokenizer.class)
public class IndexTagsByPrivacyContextJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String changedCategoryId();
		String deletedPrivacyContexts();
		String addedPrivacyContexts();
	}

	private Integer changedCategoryId;
	private String deletedPrivacyContexts;
	private String addedPrivacyContexts;

	// changedCategoryId:
	public Integer getChangedCategoryId(){
		return this.changedCategoryId;
	}
	public void setChangedCategoryId(Integer changedCategoryId){
		this.changedCategoryId = changedCategoryId;
	}

	public void changedCategoryId(String multirequestToken){
		setToken("changedCategoryId", multirequestToken);
	}

	// deletedPrivacyContexts:
	public String getDeletedPrivacyContexts(){
		return this.deletedPrivacyContexts;
	}
	public void setDeletedPrivacyContexts(String deletedPrivacyContexts){
		this.deletedPrivacyContexts = deletedPrivacyContexts;
	}

	public void deletedPrivacyContexts(String multirequestToken){
		setToken("deletedPrivacyContexts", multirequestToken);
	}

	// addedPrivacyContexts:
	public String getAddedPrivacyContexts(){
		return this.addedPrivacyContexts;
	}
	public void setAddedPrivacyContexts(String addedPrivacyContexts){
		this.addedPrivacyContexts = addedPrivacyContexts;
	}

	public void addedPrivacyContexts(String multirequestToken){
		setToken("addedPrivacyContexts", multirequestToken);
	}


	public IndexTagsByPrivacyContextJobData() {
		super();
	}

	public IndexTagsByPrivacyContextJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		changedCategoryId = GsonParser.parseInt(jsonObject.get("changedCategoryId"));
		deletedPrivacyContexts = GsonParser.parseString(jsonObject.get("deletedPrivacyContexts"));
		addedPrivacyContexts = GsonParser.parseString(jsonObject.get("addedPrivacyContexts"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIndexTagsByPrivacyContextJobData");
		kparams.add("changedCategoryId", this.changedCategoryId);
		kparams.add("deletedPrivacyContexts", this.deletedPrivacyContexts);
		kparams.add("addedPrivacyContexts", this.addedPrivacyContexts);
		return kparams;
	}


    public static final Creator<IndexTagsByPrivacyContextJobData> CREATOR = new Creator<IndexTagsByPrivacyContextJobData>() {
        @Override
        public IndexTagsByPrivacyContextJobData createFromParcel(Parcel source) {
            return new IndexTagsByPrivacyContextJobData(source);
        }

        @Override
        public IndexTagsByPrivacyContextJobData[] newArray(int size) {
            return new IndexTagsByPrivacyContextJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.changedCategoryId);
        dest.writeString(this.deletedPrivacyContexts);
        dest.writeString(this.addedPrivacyContexts);
    }

    public IndexTagsByPrivacyContextJobData(Parcel in) {
        super(in);
        this.changedCategoryId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.deletedPrivacyContexts = in.readString();
        this.addedPrivacyContexts = in.readString();
    }
}

