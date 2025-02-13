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
import com.kaltura.client.types.IntegerField;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FieldCompareCondition.Tokenizer.class)
public class FieldCompareCondition extends CompareCondition {
	
	public interface Tokenizer extends CompareCondition.Tokenizer {
		IntegerField.Tokenizer field();
	}

	/**
	 * Field to evaluate
	 */
	private IntegerField field;

	// field:
	public IntegerField getField(){
		return this.field;
	}
	public void setField(IntegerField field){
		this.field = field;
	}


	public FieldCompareCondition() {
		super();
	}

	public FieldCompareCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		field = GsonParser.parseObject(jsonObject.getAsJsonObject("field"), IntegerField.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFieldCompareCondition");
		kparams.add("field", this.field);
		return kparams;
	}


    public static final Creator<FieldCompareCondition> CREATOR = new Creator<FieldCompareCondition>() {
        @Override
        public FieldCompareCondition createFromParcel(Parcel source) {
            return new FieldCompareCondition(source);
        }

        @Override
        public FieldCompareCondition[] newArray(int size) {
            return new FieldCompareCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.field, flags);
    }

    public FieldCompareCondition(Parcel in) {
        super(in);
        this.field = in.readParcelable(IntegerField.class.getClassLoader());
    }
}

