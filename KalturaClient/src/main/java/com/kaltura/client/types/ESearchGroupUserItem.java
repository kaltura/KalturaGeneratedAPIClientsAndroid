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
import com.kaltura.client.enums.EsearchGroupUserFieldName;
import com.kaltura.client.enums.GroupUserCreationMode;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchGroupUserItem.Tokenizer.class)
public class ESearchGroupUserItem extends ESearchAbstractUserItem {
	
	public interface Tokenizer extends ESearchAbstractUserItem.Tokenizer {
		String fieldName();
		String creationMode();
	}

	private EsearchGroupUserFieldName fieldName;
	private GroupUserCreationMode creationMode;

	// fieldName:
	public EsearchGroupUserFieldName getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(EsearchGroupUserFieldName fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}

	// creationMode:
	public GroupUserCreationMode getCreationMode(){
		return this.creationMode;
	}
	public void setCreationMode(GroupUserCreationMode creationMode){
		this.creationMode = creationMode;
	}

	public void creationMode(String multirequestToken){
		setToken("creationMode", multirequestToken);
	}


	public ESearchGroupUserItem() {
		super();
	}

	public ESearchGroupUserItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = EsearchGroupUserFieldName.get(GsonParser.parseString(jsonObject.get("fieldName")));
		creationMode = GroupUserCreationMode.get(GsonParser.parseInt(jsonObject.get("creationMode")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchGroupUserItem");
		kparams.add("fieldName", this.fieldName);
		kparams.add("creationMode", this.creationMode);
		return kparams;
	}


    public static final Creator<ESearchGroupUserItem> CREATOR = new Creator<ESearchGroupUserItem>() {
        @Override
        public ESearchGroupUserItem createFromParcel(Parcel source) {
            return new ESearchGroupUserItem(source);
        }

        @Override
        public ESearchGroupUserItem[] newArray(int size) {
            return new ESearchGroupUserItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.fieldName == null ? -1 : this.fieldName.ordinal());
        dest.writeInt(this.creationMode == null ? -1 : this.creationMode.ordinal());
    }

    public ESearchGroupUserItem(Parcel in) {
        super(in);
        int tmpFieldName = in.readInt();
        this.fieldName = tmpFieldName == -1 ? null : EsearchGroupUserFieldName.values()[tmpFieldName];
        int tmpCreationMode = in.readInt();
        this.creationMode = tmpCreationMode == -1 ? null : GroupUserCreationMode.values()[tmpCreationMode];
    }
}

