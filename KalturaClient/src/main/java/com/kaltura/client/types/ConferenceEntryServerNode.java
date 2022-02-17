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
import com.kaltura.client.enums.ConferenceRoomStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConferenceEntryServerNode.Tokenizer.class)
public class ConferenceEntryServerNode extends EntryServerNode {
	
	public interface Tokenizer extends EntryServerNode.Tokenizer {
		String confRoomStatus();
		String registered();
	}

	private ConferenceRoomStatus confRoomStatus;
	private Integer registered;

	// confRoomStatus:
	public ConferenceRoomStatus getConfRoomStatus(){
		return this.confRoomStatus;
	}
	// registered:
	public Integer getRegistered(){
		return this.registered;
	}

	public ConferenceEntryServerNode() {
		super();
	}

	public ConferenceEntryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		confRoomStatus = ConferenceRoomStatus.get(GsonParser.parseInt(jsonObject.get("confRoomStatus")));
		registered = GsonParser.parseInt(jsonObject.get("registered"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConferenceEntryServerNode");
		return kparams;
	}


    public static final Creator<ConferenceEntryServerNode> CREATOR = new Creator<ConferenceEntryServerNode>() {
        @Override
        public ConferenceEntryServerNode createFromParcel(Parcel source) {
            return new ConferenceEntryServerNode(source);
        }

        @Override
        public ConferenceEntryServerNode[] newArray(int size) {
            return new ConferenceEntryServerNode[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.confRoomStatus == null ? -1 : this.confRoomStatus.ordinal());
        dest.writeValue(this.registered);
    }

    public ConferenceEntryServerNode(Parcel in) {
        super(in);
        int tmpConfRoomStatus = in.readInt();
        this.confRoomStatus = tmpConfRoomStatus == -1 ? null : ConferenceRoomStatus.values()[tmpConfRoomStatus];
        this.registered = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

