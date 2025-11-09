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
import com.kaltura.client.enums.Language;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryCaptionAdvancedFilter.Tokenizer.class)
public class EntryCaptionAdvancedFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String hasCaption();
		String language();
	}

	private Boolean hasCaption;
	private Language language;

	// hasCaption:
	public Boolean getHasCaption(){
		return this.hasCaption;
	}
	public void setHasCaption(Boolean hasCaption){
		this.hasCaption = hasCaption;
	}

	public void hasCaption(String multirequestToken){
		setToken("hasCaption", multirequestToken);
	}

	// language:
	public Language getLanguage(){
		return this.language;
	}
	public void setLanguage(Language language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}


	public EntryCaptionAdvancedFilter() {
		super();
	}

	public EntryCaptionAdvancedFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		hasCaption = GsonParser.parseBoolean(jsonObject.get("hasCaption"));
		language = Language.get(GsonParser.parseString(jsonObject.get("language")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryCaptionAdvancedFilter");
		kparams.add("hasCaption", this.hasCaption);
		kparams.add("language", this.language);
		return kparams;
	}


    public static final Creator<EntryCaptionAdvancedFilter> CREATOR = new Creator<EntryCaptionAdvancedFilter>() {
        @Override
        public EntryCaptionAdvancedFilter createFromParcel(Parcel source) {
            return new EntryCaptionAdvancedFilter(source);
        }

        @Override
        public EntryCaptionAdvancedFilter[] newArray(int size) {
            return new EntryCaptionAdvancedFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.hasCaption);
        dest.writeInt(this.language == null ? -1 : this.language.ordinal());
    }

    public EntryCaptionAdvancedFilter(Parcel in) {
        super(in);
        this.hasCaption = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpLanguage = in.readInt();
        this.language = tmpLanguage == -1 ? null : Language.values()[tmpLanguage];
    }
}

