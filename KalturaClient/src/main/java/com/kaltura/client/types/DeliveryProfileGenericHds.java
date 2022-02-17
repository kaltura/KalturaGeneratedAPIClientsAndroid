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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileGenericHds.Tokenizer.class)
public class DeliveryProfileGenericHds extends DeliveryProfile {
	
	public interface Tokenizer extends DeliveryProfile.Tokenizer {
		String pattern();
		String rendererClass();
	}

	private String pattern;
	/**
	 * rendererClass
	 */
	private String rendererClass;

	// pattern:
	public String getPattern(){
		return this.pattern;
	}
	public void setPattern(String pattern){
		this.pattern = pattern;
	}

	public void pattern(String multirequestToken){
		setToken("pattern", multirequestToken);
	}

	// rendererClass:
	public String getRendererClass(){
		return this.rendererClass;
	}
	public void setRendererClass(String rendererClass){
		this.rendererClass = rendererClass;
	}

	public void rendererClass(String multirequestToken){
		setToken("rendererClass", multirequestToken);
	}


	public DeliveryProfileGenericHds() {
		super();
	}

	public DeliveryProfileGenericHds(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		pattern = GsonParser.parseString(jsonObject.get("pattern"));
		rendererClass = GsonParser.parseString(jsonObject.get("rendererClass"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileGenericHds");
		kparams.add("pattern", this.pattern);
		kparams.add("rendererClass", this.rendererClass);
		return kparams;
	}


    public static final Creator<DeliveryProfileGenericHds> CREATOR = new Creator<DeliveryProfileGenericHds>() {
        @Override
        public DeliveryProfileGenericHds createFromParcel(Parcel source) {
            return new DeliveryProfileGenericHds(source);
        }

        @Override
        public DeliveryProfileGenericHds[] newArray(int size) {
            return new DeliveryProfileGenericHds[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.pattern);
        dest.writeString(this.rendererClass);
    }

    public DeliveryProfileGenericHds(Parcel in) {
        super(in);
        this.pattern = in.readString();
        this.rendererClass = in.readString();
    }
}

