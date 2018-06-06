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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataProfileField.Tokenizer.class)
public class MetadataProfileField extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
	}

	private Integer id;
	private String xPath;
	private String key;
	private String label;

	// id:
	public Integer getId(){
		return this.id;
	}
	// xPath:
	public String getXPath(){
		return this.xPath;
	}
	// key:
	public String getKey(){
		return this.key;
	}
	// label:
	public String getLabel(){
		return this.label;
	}

	public MetadataProfileField() {
		super();
	}

	public MetadataProfileField(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		xPath = GsonParser.parseString(jsonObject.get("xPath"));
		key = GsonParser.parseString(jsonObject.get("key"));
		label = GsonParser.parseString(jsonObject.get("label"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataProfileField");
		return kparams;
	}


    public static final Creator<MetadataProfileField> CREATOR = new Creator<MetadataProfileField>() {
        @Override
        public MetadataProfileField createFromParcel(Parcel source) {
            return new MetadataProfileField(source);
        }

        @Override
        public MetadataProfileField[] newArray(int size) {
            return new MetadataProfileField[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.xPath);
        dest.writeString(this.key);
        dest.writeString(this.label);
    }

    public MetadataProfileField(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.xPath = in.readString();
        this.key = in.readString();
        this.label = in.readString();
    }
}

