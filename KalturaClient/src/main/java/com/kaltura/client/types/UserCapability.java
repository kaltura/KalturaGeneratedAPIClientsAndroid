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
import com.kaltura.client.enums.UserCapabilityType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserCapability.Tokenizer.class)
public class UserCapability extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String capability();
	}

	private UserCapabilityType capability;

	// capability:
	public UserCapabilityType getCapability(){
		return this.capability;
	}
	public void setCapability(UserCapabilityType capability){
		this.capability = capability;
	}

	public void capability(String multirequestToken){
		setToken("capability", multirequestToken);
	}


	public UserCapability() {
		super();
	}

	public UserCapability(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		capability = UserCapabilityType.get(GsonParser.parseString(jsonObject.get("capability")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserCapability");
		kparams.add("capability", this.capability);
		return kparams;
	}


    public static final Creator<UserCapability> CREATOR = new Creator<UserCapability>() {
        @Override
        public UserCapability createFromParcel(Parcel source) {
            return new UserCapability(source);
        }

        @Override
        public UserCapability[] newArray(int size) {
            return new UserCapability[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.capability == null ? -1 : this.capability.ordinal());
    }

    public UserCapability(Parcel in) {
        super(in);
        int tmpCapability = in.readInt();
        this.capability = tmpCapability == -1 ? null : UserCapabilityType.values()[tmpCapability];
    }
}

