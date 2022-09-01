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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduleEventResourceFilter.Tokenizer.class)
public class ScheduleEventResourceFilter extends ScheduleEventResourceBaseFilter {
	
	public interface Tokenizer extends ScheduleEventResourceBaseFilter.Tokenizer {
		String eventIdOrItsParentIdEqual();
	}

	/**
	 * Find event-resource objects that associated with the event, if none found, find
	  by its parent event
	 */
	private Integer eventIdOrItsParentIdEqual;

	// eventIdOrItsParentIdEqual:
	public Integer getEventIdOrItsParentIdEqual(){
		return this.eventIdOrItsParentIdEqual;
	}
	public void setEventIdOrItsParentIdEqual(Integer eventIdOrItsParentIdEqual){
		this.eventIdOrItsParentIdEqual = eventIdOrItsParentIdEqual;
	}

	public void eventIdOrItsParentIdEqual(String multirequestToken){
		setToken("eventIdOrItsParentIdEqual", multirequestToken);
	}


	public ScheduleEventResourceFilter() {
		super();
	}

	public ScheduleEventResourceFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventIdOrItsParentIdEqual = GsonParser.parseInt(jsonObject.get("eventIdOrItsParentIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleEventResourceFilter");
		kparams.add("eventIdOrItsParentIdEqual", this.eventIdOrItsParentIdEqual);
		return kparams;
	}


    public static final Creator<ScheduleEventResourceFilter> CREATOR = new Creator<ScheduleEventResourceFilter>() {
        @Override
        public ScheduleEventResourceFilter createFromParcel(Parcel source) {
            return new ScheduleEventResourceFilter(source);
        }

        @Override
        public ScheduleEventResourceFilter[] newArray(int size) {
            return new ScheduleEventResourceFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.eventIdOrItsParentIdEqual);
    }

    public ScheduleEventResourceFilter(Parcel in) {
        super(in);
        this.eventIdOrItsParentIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

