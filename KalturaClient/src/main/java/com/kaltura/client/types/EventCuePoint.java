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
import com.kaltura.client.enums.EventType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EventCuePoint.Tokenizer.class)
public class EventCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		String eventType();
	}

	private EventType eventType;

	// eventType:
	public EventType getEventType(){
		return this.eventType;
	}
	public void setEventType(EventType eventType){
		this.eventType = eventType;
	}

	public void eventType(String multirequestToken){
		setToken("eventType", multirequestToken);
	}


	public EventCuePoint() {
		super();
	}

	public EventCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventType = EventType.get(GsonParser.parseString(jsonObject.get("eventType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventCuePoint");
		kparams.add("eventType", this.eventType);
		return kparams;
	}


    public static final Creator<EventCuePoint> CREATOR = new Creator<EventCuePoint>() {
        @Override
        public EventCuePoint createFromParcel(Parcel source) {
            return new EventCuePoint(source);
        }

        @Override
        public EventCuePoint[] newArray(int size) {
            return new EventCuePoint[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.eventType == null ? -1 : this.eventType.ordinal());
    }

    public EventCuePoint(Parcel in) {
        super(in);
        int tmpEventType = in.readInt();
        this.eventType = tmpEventType == -1 ? null : EventType.values()[tmpEventType];
    }
}

