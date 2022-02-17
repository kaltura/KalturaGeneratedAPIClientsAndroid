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
@MultiRequestBuilder.Tokenizer(DeliveryServerNode.Tokenizer.class)
public abstract class DeliveryServerNode extends ServerNode {
	
	public interface Tokenizer extends ServerNode.Tokenizer {
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> deliveryProfileIds();
		String config();
	}

	/**
	 * Delivery profile ids
	 */
	private List<KeyValue> deliveryProfileIds;
	/**
	 * Override server node default configuration - json format
	 */
	private String config;

	// deliveryProfileIds:
	public List<KeyValue> getDeliveryProfileIds(){
		return this.deliveryProfileIds;
	}
	public void setDeliveryProfileIds(List<KeyValue> deliveryProfileIds){
		this.deliveryProfileIds = deliveryProfileIds;
	}

	// config:
	public String getConfig(){
		return this.config;
	}
	public void setConfig(String config){
		this.config = config;
	}

	public void config(String multirequestToken){
		setToken("config", multirequestToken);
	}


	public DeliveryServerNode() {
		super();
	}

	public DeliveryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		deliveryProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryProfileIds"), KeyValue.class);
		config = GsonParser.parseString(jsonObject.get("config"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryServerNode");
		kparams.add("deliveryProfileIds", this.deliveryProfileIds);
		kparams.add("config", this.config);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.deliveryProfileIds != null) {
            dest.writeInt(this.deliveryProfileIds.size());
            dest.writeList(this.deliveryProfileIds);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.config);
    }

    public DeliveryServerNode(Parcel in) {
        super(in);
        int deliveryProfileIdsSize = in.readInt();
        if( deliveryProfileIdsSize > -1) {
            this.deliveryProfileIds = new ArrayList<>();
            in.readList(this.deliveryProfileIds, KeyValue.class.getClassLoader());
        }
        this.config = in.readString();
    }
}

