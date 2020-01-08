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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.ScheduleEventType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderICalBulkUploadFileHandlerConfig.Tokenizer.class)
public class DropFolderICalBulkUploadFileHandlerConfig extends DropFolderFileHandlerConfig {
	
	public interface Tokenizer extends DropFolderFileHandlerConfig.Tokenizer {
		String eventsType();
	}

	/**
	 * The type of the events that ill be created by this upload
	 */
	private ScheduleEventType eventsType;

	// eventsType:
	public ScheduleEventType getEventsType(){
		return this.eventsType;
	}
	public void setEventsType(ScheduleEventType eventsType){
		this.eventsType = eventsType;
	}

	public void eventsType(String multirequestToken){
		setToken("eventsType", multirequestToken);
	}


	public DropFolderICalBulkUploadFileHandlerConfig() {
		super();
	}

	public DropFolderICalBulkUploadFileHandlerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventsType = ScheduleEventType.get(GsonParser.parseInt(jsonObject.get("eventsType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderICalBulkUploadFileHandlerConfig");
		kparams.add("eventsType", this.eventsType);
		return kparams;
	}


    public static final Creator<DropFolderICalBulkUploadFileHandlerConfig> CREATOR = new Creator<DropFolderICalBulkUploadFileHandlerConfig>() {
        @Override
        public DropFolderICalBulkUploadFileHandlerConfig createFromParcel(Parcel source) {
            return new DropFolderICalBulkUploadFileHandlerConfig(source);
        }

        @Override
        public DropFolderICalBulkUploadFileHandlerConfig[] newArray(int size) {
            return new DropFolderICalBulkUploadFileHandlerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.eventsType == null ? -1 : this.eventsType.ordinal());
    }

    public DropFolderICalBulkUploadFileHandlerConfig(Parcel in) {
        super(in);
        int tmpEventsType = in.readInt();
        this.eventsType = tmpEventsType == -1 ? null : ScheduleEventType.values()[tmpEventsType];
    }
}

