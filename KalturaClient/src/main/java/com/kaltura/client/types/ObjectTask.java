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
import com.kaltura.client.enums.ObjectTaskType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ObjectTask.Tokenizer.class)
public abstract class ObjectTask extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String type();
		String stopProcessingOnError();
	}

	private ObjectTaskType type;
	private Boolean stopProcessingOnError;

	// type:
	public ObjectTaskType getType(){
		return this.type;
	}
	// stopProcessingOnError:
	public Boolean getStopProcessingOnError(){
		return this.stopProcessingOnError;
	}
	public void setStopProcessingOnError(Boolean stopProcessingOnError){
		this.stopProcessingOnError = stopProcessingOnError;
	}

	public void stopProcessingOnError(String multirequestToken){
		setToken("stopProcessingOnError", multirequestToken);
	}


	public ObjectTask() {
		super();
	}

	public ObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = ObjectTaskType.get(GsonParser.parseString(jsonObject.get("type")));
		stopProcessingOnError = GsonParser.parseBoolean(jsonObject.get("stopProcessingOnError"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaObjectTask");
		kparams.add("stopProcessingOnError", this.stopProcessingOnError);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeValue(this.stopProcessingOnError);
    }

    public ObjectTask(Parcel in) {
        super(in);
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : ObjectTaskType.values()[tmpType];
        this.stopProcessingOnError = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

