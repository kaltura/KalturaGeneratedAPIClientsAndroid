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
@MultiRequestBuilder.Tokenizer(PermissionLevelUserEntry.Tokenizer.class)
public class PermissionLevelUserEntry extends UserEntry {
	
	public interface Tokenizer extends UserEntry.Tokenizer {
		RequestBuilder.ListTokenizer<PermissionLevel.Tokenizer> permissionLevels();
		String permissionOrder();
	}

	/**
	 * Playback context
	 */
	private List<PermissionLevel> permissionLevels;
	private Integer permissionOrder;

	// permissionLevels:
	public List<PermissionLevel> getPermissionLevels(){
		return this.permissionLevels;
	}
	public void setPermissionLevels(List<PermissionLevel> permissionLevels){
		this.permissionLevels = permissionLevels;
	}

	// permissionOrder:
	public Integer getPermissionOrder(){
		return this.permissionOrder;
	}
	public void setPermissionOrder(Integer permissionOrder){
		this.permissionOrder = permissionOrder;
	}

	public void permissionOrder(String multirequestToken){
		setToken("permissionOrder", multirequestToken);
	}


	public PermissionLevelUserEntry() {
		super();
	}

	public PermissionLevelUserEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		permissionLevels = GsonParser.parseArray(jsonObject.getAsJsonArray("permissionLevels"), PermissionLevel.class);
		permissionOrder = GsonParser.parseInt(jsonObject.get("permissionOrder"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPermissionLevelUserEntry");
		kparams.add("permissionLevels", this.permissionLevels);
		kparams.add("permissionOrder", this.permissionOrder);
		return kparams;
	}


    public static final Creator<PermissionLevelUserEntry> CREATOR = new Creator<PermissionLevelUserEntry>() {
        @Override
        public PermissionLevelUserEntry createFromParcel(Parcel source) {
            return new PermissionLevelUserEntry(source);
        }

        @Override
        public PermissionLevelUserEntry[] newArray(int size) {
            return new PermissionLevelUserEntry[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.permissionLevels != null) {
            dest.writeInt(this.permissionLevels.size());
            dest.writeList(this.permissionLevels);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.permissionOrder);
    }

    public PermissionLevelUserEntry(Parcel in) {
        super(in);
        int permissionLevelsSize = in.readInt();
        if( permissionLevelsSize > -1) {
            this.permissionLevels = new ArrayList<>();
            in.readList(this.permissionLevels, PermissionLevel.class.getClassLoader());
        }
        this.permissionOrder = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

