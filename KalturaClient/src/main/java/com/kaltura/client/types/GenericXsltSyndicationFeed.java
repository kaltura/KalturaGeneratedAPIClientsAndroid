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
@MultiRequestBuilder.Tokenizer(GenericXsltSyndicationFeed.Tokenizer.class)
public class GenericXsltSyndicationFeed extends GenericSyndicationFeed {
	
	public interface Tokenizer extends GenericSyndicationFeed.Tokenizer {
		String xslt();
		RequestBuilder.ListTokenizer<ExtendingItemMrssParameter.Tokenizer> itemXpathsToExtend();
	}

	private String xslt;
	private List<ExtendingItemMrssParameter> itemXpathsToExtend;

	// xslt:
	public String getXslt(){
		return this.xslt;
	}
	public void setXslt(String xslt){
		this.xslt = xslt;
	}

	public void xslt(String multirequestToken){
		setToken("xslt", multirequestToken);
	}

	// itemXpathsToExtend:
	public List<ExtendingItemMrssParameter> getItemXpathsToExtend(){
		return this.itemXpathsToExtend;
	}
	public void setItemXpathsToExtend(List<ExtendingItemMrssParameter> itemXpathsToExtend){
		this.itemXpathsToExtend = itemXpathsToExtend;
	}


	public GenericXsltSyndicationFeed() {
		super();
	}

	public GenericXsltSyndicationFeed(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xslt = GsonParser.parseString(jsonObject.get("xslt"));
		itemXpathsToExtend = GsonParser.parseArray(jsonObject.getAsJsonArray("itemXpathsToExtend"), ExtendingItemMrssParameter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGenericXsltSyndicationFeed");
		kparams.add("xslt", this.xslt);
		kparams.add("itemXpathsToExtend", this.itemXpathsToExtend);
		return kparams;
	}


    public static final Creator<GenericXsltSyndicationFeed> CREATOR = new Creator<GenericXsltSyndicationFeed>() {
        @Override
        public GenericXsltSyndicationFeed createFromParcel(Parcel source) {
            return new GenericXsltSyndicationFeed(source);
        }

        @Override
        public GenericXsltSyndicationFeed[] newArray(int size) {
            return new GenericXsltSyndicationFeed[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.xslt);
        if(this.itemXpathsToExtend != null) {
            dest.writeInt(this.itemXpathsToExtend.size());
            dest.writeList(this.itemXpathsToExtend);
        } else {
            dest.writeInt(-1);
        }
    }

    public GenericXsltSyndicationFeed(Parcel in) {
        super(in);
        this.xslt = in.readString();
        int itemXpathsToExtendSize = in.readInt();
        if( itemXpathsToExtendSize > -1) {
            this.itemXpathsToExtend = new ArrayList<>();
            in.readList(this.itemXpathsToExtend, ExtendingItemMrssParameter.class.getClassLoader());
        }
    }
}

