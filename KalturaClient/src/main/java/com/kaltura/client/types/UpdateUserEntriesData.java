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
import com.kaltura.client.enums.UserEntryStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UpdateUserEntriesData.Tokenizer.class)
public class UpdateUserEntriesData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String oldStatus();
		String newStatus();
	}

	private UserEntryStatus oldStatus;
	private UserEntryStatus newStatus;

	// oldStatus:
	public UserEntryStatus getOldStatus(){
		return this.oldStatus;
	}
	public void setOldStatus(UserEntryStatus oldStatus){
		this.oldStatus = oldStatus;
	}

	public void oldStatus(String multirequestToken){
		setToken("oldStatus", multirequestToken);
	}

	// newStatus:
	public UserEntryStatus getNewStatus(){
		return this.newStatus;
	}
	public void setNewStatus(UserEntryStatus newStatus){
		this.newStatus = newStatus;
	}

	public void newStatus(String multirequestToken){
		setToken("newStatus", multirequestToken);
	}


	public UpdateUserEntriesData() {
		super();
	}

	public UpdateUserEntriesData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		oldStatus = UserEntryStatus.get(GsonParser.parseString(jsonObject.get("oldStatus")));
		newStatus = UserEntryStatus.get(GsonParser.parseString(jsonObject.get("newStatus")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUpdateUserEntriesData");
		kparams.add("oldStatus", this.oldStatus);
		kparams.add("newStatus", this.newStatus);
		return kparams;
	}


    public static final Creator<UpdateUserEntriesData> CREATOR = new Creator<UpdateUserEntriesData>() {
        @Override
        public UpdateUserEntriesData createFromParcel(Parcel source) {
            return new UpdateUserEntriesData(source);
        }

        @Override
        public UpdateUserEntriesData[] newArray(int size) {
            return new UpdateUserEntriesData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.oldStatus == null ? -1 : this.oldStatus.ordinal());
        dest.writeInt(this.newStatus == null ? -1 : this.newStatus.ordinal());
    }

    public UpdateUserEntriesData(Parcel in) {
        super(in);
        int tmpOldStatus = in.readInt();
        this.oldStatus = tmpOldStatus == -1 ? null : UserEntryStatus.values()[tmpOldStatus];
        int tmpNewStatus = in.readInt();
        this.newStatus = tmpNewStatus == -1 ? null : UserEntryStatus.values()[tmpNewStatus];
    }
}

