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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderTrRdsFileHandlerConfig.Tokenizer.class)
public class DropFolderTrRdsFileHandlerConfig extends DropFolderFileHandlerConfig {
	
	public interface Tokenizer extends DropFolderFileHandlerConfig.Tokenizer {
		String leadPattern();
		String additionalPatterns();
	}

	private String leadPattern;
	private String additionalPatterns;

	// leadPattern:
	public String getLeadPattern(){
		return this.leadPattern;
	}
	public void setLeadPattern(String leadPattern){
		this.leadPattern = leadPattern;
	}

	public void leadPattern(String multirequestToken){
		setToken("leadPattern", multirequestToken);
	}

	// additionalPatterns:
	public String getAdditionalPatterns(){
		return this.additionalPatterns;
	}
	public void setAdditionalPatterns(String additionalPatterns){
		this.additionalPatterns = additionalPatterns;
	}

	public void additionalPatterns(String multirequestToken){
		setToken("additionalPatterns", multirequestToken);
	}


	public DropFolderTrRdsFileHandlerConfig() {
		super();
	}

	public DropFolderTrRdsFileHandlerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		leadPattern = GsonParser.parseString(jsonObject.get("leadPattern"));
		additionalPatterns = GsonParser.parseString(jsonObject.get("additionalPatterns"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderTrRdsFileHandlerConfig");
		kparams.add("leadPattern", this.leadPattern);
		kparams.add("additionalPatterns", this.additionalPatterns);
		return kparams;
	}


    public static final Creator<DropFolderTrRdsFileHandlerConfig> CREATOR = new Creator<DropFolderTrRdsFileHandlerConfig>() {
        @Override
        public DropFolderTrRdsFileHandlerConfig createFromParcel(Parcel source) {
            return new DropFolderTrRdsFileHandlerConfig(source);
        }

        @Override
        public DropFolderTrRdsFileHandlerConfig[] newArray(int size) {
            return new DropFolderTrRdsFileHandlerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.leadPattern);
        dest.writeString(this.additionalPatterns);
    }

    public DropFolderTrRdsFileHandlerConfig(Parcel in) {
        super(in);
        this.leadPattern = in.readString();
        this.additionalPatterns = in.readString();
    }
}

