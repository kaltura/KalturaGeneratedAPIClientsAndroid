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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduleEventResource.Tokenizer.class)
public class ScheduleEventResource extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String eventId();
		String resourceId();
		String partnerId();
		String createdAt();
		String updatedAt();
	}

	private Integer eventId;
	private Integer resourceId;
	private Integer partnerId;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Last update as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;

	// eventId:
	public Integer getEventId(){
		return this.eventId;
	}
	public void setEventId(Integer eventId){
		this.eventId = eventId;
	}

	public void eventId(String multirequestToken){
		setToken("eventId", multirequestToken);
	}

	// resourceId:
	public Integer getResourceId(){
		return this.resourceId;
	}
	public void setResourceId(Integer resourceId){
		this.resourceId = resourceId;
	}

	public void resourceId(String multirequestToken){
		setToken("resourceId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}

	public ScheduleEventResource() {
		super();
	}

	public ScheduleEventResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventId = GsonParser.parseInt(jsonObject.get("eventId"));
		resourceId = GsonParser.parseInt(jsonObject.get("resourceId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleEventResource");
		kparams.add("eventId", this.eventId);
		kparams.add("resourceId", this.resourceId);
		return kparams;
	}


    public static final Creator<ScheduleEventResource> CREATOR = new Creator<ScheduleEventResource>() {
        @Override
        public ScheduleEventResource createFromParcel(Parcel source) {
            return new ScheduleEventResource(source);
        }

        @Override
        public ScheduleEventResource[] newArray(int size) {
            return new ScheduleEventResource[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.eventId);
        dest.writeValue(this.resourceId);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
    }

    public ScheduleEventResource(Parcel in) {
        super(in);
        this.eventId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.resourceId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

