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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Evaluates PHP statement, depends on the execution context
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EvalBooleanField.Tokenizer.class)
public class EvalBooleanField extends BooleanField {
	
	public interface Tokenizer extends BooleanField.Tokenizer {
		String code();
	}

	/**
	 * PHP code
	 */
	private String code;

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}


	public EvalBooleanField() {
		super();
	}

	public EvalBooleanField(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		code = GsonParser.parseString(jsonObject.get("code"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEvalBooleanField");
		kparams.add("code", this.code);
		return kparams;
	}


    public static final Creator<EvalBooleanField> CREATOR = new Creator<EvalBooleanField>() {
        @Override
        public EvalBooleanField createFromParcel(Parcel source) {
            return new EvalBooleanField(source);
        }

        @Override
        public EvalBooleanField[] newArray(int size) {
            return new EvalBooleanField[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.code);
    }

    public EvalBooleanField(Parcel in) {
        super(in);
        this.code = in.readString();
    }
}

