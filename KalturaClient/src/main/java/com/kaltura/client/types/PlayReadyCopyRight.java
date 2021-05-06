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
// Copyright (C) 2006-2021  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PlayReadyCopyRight.Tokenizer.class)
public class PlayReadyCopyRight extends PlayReadyRight {
	
	public interface Tokenizer extends PlayReadyRight.Tokenizer {
		String copyCount();
		RequestBuilder.ListTokenizer<PlayReadyCopyEnablerHolder.Tokenizer> copyEnablers();
	}

	private Integer copyCount;
	private List<PlayReadyCopyEnablerHolder> copyEnablers;

	// copyCount:
	public Integer getCopyCount(){
		return this.copyCount;
	}
	public void setCopyCount(Integer copyCount){
		this.copyCount = copyCount;
	}

	public void copyCount(String multirequestToken){
		setToken("copyCount", multirequestToken);
	}

	// copyEnablers:
	public List<PlayReadyCopyEnablerHolder> getCopyEnablers(){
		return this.copyEnablers;
	}
	public void setCopyEnablers(List<PlayReadyCopyEnablerHolder> copyEnablers){
		this.copyEnablers = copyEnablers;
	}


	public PlayReadyCopyRight() {
		super();
	}

	public PlayReadyCopyRight(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		copyCount = GsonParser.parseInt(jsonObject.get("copyCount"));
		copyEnablers = GsonParser.parseArray(jsonObject.getAsJsonArray("copyEnablers"), PlayReadyCopyEnablerHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayReadyCopyRight");
		kparams.add("copyCount", this.copyCount);
		kparams.add("copyEnablers", this.copyEnablers);
		return kparams;
	}


    public static final Creator<PlayReadyCopyRight> CREATOR = new Creator<PlayReadyCopyRight>() {
        @Override
        public PlayReadyCopyRight createFromParcel(Parcel source) {
            return new PlayReadyCopyRight(source);
        }

        @Override
        public PlayReadyCopyRight[] newArray(int size) {
            return new PlayReadyCopyRight[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.copyCount);
        if(this.copyEnablers != null) {
            dest.writeInt(this.copyEnablers.size());
            dest.writeList(this.copyEnablers);
        } else {
            dest.writeInt(-1);
        }
    }

    public PlayReadyCopyRight(Parcel in) {
        super(in);
        this.copyCount = (Integer)in.readValue(Integer.class.getClassLoader());
        int copyEnablersSize = in.readInt();
        if( copyEnablersSize > -1) {
            this.copyEnablers = new ArrayList<>();
            in.readList(this.copyEnablers, PlayReadyCopyEnablerHolder.class.getClassLoader());
        }
    }
}

