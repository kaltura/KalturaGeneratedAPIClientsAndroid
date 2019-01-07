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
import com.kaltura.client.types.CategoryUserFilter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Job Data representing the provider of recipients for a single categoryId
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EmailNotificationCategoryRecipientJobData.Tokenizer.class)
public class EmailNotificationCategoryRecipientJobData extends EmailNotificationRecipientJobData {
	
	public interface Tokenizer extends EmailNotificationRecipientJobData.Tokenizer {
		CategoryUserFilter.Tokenizer categoryUserFilter();
	}

	private CategoryUserFilter categoryUserFilter;

	// categoryUserFilter:
	public CategoryUserFilter getCategoryUserFilter(){
		return this.categoryUserFilter;
	}
	public void setCategoryUserFilter(CategoryUserFilter categoryUserFilter){
		this.categoryUserFilter = categoryUserFilter;
	}


	public EmailNotificationCategoryRecipientJobData() {
		super();
	}

	public EmailNotificationCategoryRecipientJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryUserFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("categoryUserFilter"), CategoryUserFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailNotificationCategoryRecipientJobData");
		kparams.add("categoryUserFilter", this.categoryUserFilter);
		return kparams;
	}


    public static final Creator<EmailNotificationCategoryRecipientJobData> CREATOR = new Creator<EmailNotificationCategoryRecipientJobData>() {
        @Override
        public EmailNotificationCategoryRecipientJobData createFromParcel(Parcel source) {
            return new EmailNotificationCategoryRecipientJobData(source);
        }

        @Override
        public EmailNotificationCategoryRecipientJobData[] newArray(int size) {
            return new EmailNotificationCategoryRecipientJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.categoryUserFilter, flags);
    }

    public EmailNotificationCategoryRecipientJobData(Parcel in) {
        super(in);
        this.categoryUserFilter = in.readParcelable(CategoryUserFilter.class.getClassLoader());
    }
}

