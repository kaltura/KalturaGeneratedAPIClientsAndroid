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
@MultiRequestBuilder.Tokenizer(ApFeedDropFolder.Tokenizer.class)
public class ApFeedDropFolder extends FeedDropFolder {
	
	public interface Tokenizer extends FeedDropFolder.Tokenizer {
		String apApiKey();
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> itemsToExpand();
	}

	private String apApiKey;
	private List<StringValue> itemsToExpand;

	// apApiKey:
	public String getApApiKey(){
		return this.apApiKey;
	}
	public void setApApiKey(String apApiKey){
		this.apApiKey = apApiKey;
	}

	public void apApiKey(String multirequestToken){
		setToken("apApiKey", multirequestToken);
	}

	// itemsToExpand:
	public List<StringValue> getItemsToExpand(){
		return this.itemsToExpand;
	}
	public void setItemsToExpand(List<StringValue> itemsToExpand){
		this.itemsToExpand = itemsToExpand;
	}


	public ApFeedDropFolder() {
		super();
	}

	public ApFeedDropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		apApiKey = GsonParser.parseString(jsonObject.get("apApiKey"));
		itemsToExpand = GsonParser.parseArray(jsonObject.getAsJsonArray("itemsToExpand"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaApFeedDropFolder");
		kparams.add("apApiKey", this.apApiKey);
		kparams.add("itemsToExpand", this.itemsToExpand);
		return kparams;
	}


    public static final Creator<ApFeedDropFolder> CREATOR = new Creator<ApFeedDropFolder>() {
        @Override
        public ApFeedDropFolder createFromParcel(Parcel source) {
            return new ApFeedDropFolder(source);
        }

        @Override
        public ApFeedDropFolder[] newArray(int size) {
            return new ApFeedDropFolder[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.apApiKey);
        if(this.itemsToExpand != null) {
            dest.writeInt(this.itemsToExpand.size());
            dest.writeList(this.itemsToExpand);
        } else {
            dest.writeInt(-1);
        }
    }

    public ApFeedDropFolder(Parcel in) {
        super(in);
        this.apApiKey = in.readString();
        int itemsToExpandSize = in.readInt();
        if( itemsToExpandSize > -1) {
            this.itemsToExpand = new ArrayList<>();
            in.readList(this.itemsToExpand, StringValue.class.getClassLoader());
        }
    }
}

