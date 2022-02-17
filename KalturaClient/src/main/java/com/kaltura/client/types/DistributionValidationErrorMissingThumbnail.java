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
import com.kaltura.client.types.DistributionThumbDimensions;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DistributionValidationErrorMissingThumbnail.Tokenizer.class)
public class DistributionValidationErrorMissingThumbnail extends DistributionValidationError {
	
	public interface Tokenizer extends DistributionValidationError.Tokenizer {
		DistributionThumbDimensions.Tokenizer dimensions();
	}

	private DistributionThumbDimensions dimensions;

	// dimensions:
	public DistributionThumbDimensions getDimensions(){
		return this.dimensions;
	}
	public void setDimensions(DistributionThumbDimensions dimensions){
		this.dimensions = dimensions;
	}


	public DistributionValidationErrorMissingThumbnail() {
		super();
	}

	public DistributionValidationErrorMissingThumbnail(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dimensions = GsonParser.parseObject(jsonObject.getAsJsonObject("dimensions"), DistributionThumbDimensions.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDistributionValidationErrorMissingThumbnail");
		kparams.add("dimensions", this.dimensions);
		return kparams;
	}


    public static final Creator<DistributionValidationErrorMissingThumbnail> CREATOR = new Creator<DistributionValidationErrorMissingThumbnail>() {
        @Override
        public DistributionValidationErrorMissingThumbnail createFromParcel(Parcel source) {
            return new DistributionValidationErrorMissingThumbnail(source);
        }

        @Override
        public DistributionValidationErrorMissingThumbnail[] newArray(int size) {
            return new DistributionValidationErrorMissingThumbnail[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.dimensions, flags);
    }

    public DistributionValidationErrorMissingThumbnail(Parcel in) {
        super(in);
        this.dimensions = in.readParcelable(DistributionThumbDimensions.class.getClassLoader());
    }
}

