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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(PlayerEmbedCodeType.Tokenizer.class)
public class PlayerEmbedCodeType extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String label();
		String entryOnly();
		String minVersion();
	}

	private String id;
	private String label;
	private Boolean entryOnly;
	private String minVersion;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// entryOnly:
	public Boolean getEntryOnly(){
		return this.entryOnly;
	}
	public void setEntryOnly(Boolean entryOnly){
		this.entryOnly = entryOnly;
	}

	public void entryOnly(String multirequestToken){
		setToken("entryOnly", multirequestToken);
	}

	// minVersion:
	public String getMinVersion(){
		return this.minVersion;
	}
	public void setMinVersion(String minVersion){
		this.minVersion = minVersion;
	}

	public void minVersion(String multirequestToken){
		setToken("minVersion", multirequestToken);
	}


	public PlayerEmbedCodeType() {
		super();
	}

	public PlayerEmbedCodeType(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		label = GsonParser.parseString(jsonObject.get("label"));
		entryOnly = GsonParser.parseBoolean(jsonObject.get("entryOnly"));
		minVersion = GsonParser.parseString(jsonObject.get("minVersion"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayerEmbedCodeType");
		kparams.add("id", this.id);
		kparams.add("label", this.label);
		kparams.add("entryOnly", this.entryOnly);
		kparams.add("minVersion", this.minVersion);
		return kparams;
	}


    public static final Creator<PlayerEmbedCodeType> CREATOR = new Creator<PlayerEmbedCodeType>() {
        @Override
        public PlayerEmbedCodeType createFromParcel(Parcel source) {
            return new PlayerEmbedCodeType(source);
        }

        @Override
        public PlayerEmbedCodeType[] newArray(int size) {
            return new PlayerEmbedCodeType[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.label);
        dest.writeValue(this.entryOnly);
        dest.writeString(this.minVersion);
    }

    public PlayerEmbedCodeType(Parcel in) {
        super(in);
        this.id = in.readString();
        this.label = in.readString();
        this.entryOnly = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.minVersion = in.readString();
    }
}

