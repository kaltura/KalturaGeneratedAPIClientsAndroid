// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2020  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamScheduleEvent.Tokenizer.class)
public class LiveStreamScheduleEvent extends EntryScheduleEvent {
	
	public interface Tokenizer extends EntryScheduleEvent.Tokenizer {
		String projectedAudience();
		String sourceEntryId();
		String preStartTime();
		String postEndTime();
	}

	/**
	 * Defines the expected audience.
	 */
	private Integer projectedAudience;
	/**
	 * The entry ID of the source entry (for simulive)
	 */
	private String sourceEntryId;
	/**
	 * The time relative time before the startTime considered as preStart time
	 */
	private Integer preStartTime;
	/**
	 * The time relative time before the endTime considered as postEnd time
	 */
	private Integer postEndTime;

	// projectedAudience:
	public Integer getProjectedAudience(){
		return this.projectedAudience;
	}
	public void setProjectedAudience(Integer projectedAudience){
		this.projectedAudience = projectedAudience;
	}

	public void projectedAudience(String multirequestToken){
		setToken("projectedAudience", multirequestToken);
	}

	// sourceEntryId:
	public String getSourceEntryId(){
		return this.sourceEntryId;
	}
	public void setSourceEntryId(String sourceEntryId){
		this.sourceEntryId = sourceEntryId;
	}

	public void sourceEntryId(String multirequestToken){
		setToken("sourceEntryId", multirequestToken);
	}

	// preStartTime:
	public Integer getPreStartTime(){
		return this.preStartTime;
	}
	public void setPreStartTime(Integer preStartTime){
		this.preStartTime = preStartTime;
	}

	public void preStartTime(String multirequestToken){
		setToken("preStartTime", multirequestToken);
	}

	// postEndTime:
	public Integer getPostEndTime(){
		return this.postEndTime;
	}
	public void setPostEndTime(Integer postEndTime){
		this.postEndTime = postEndTime;
	}

	public void postEndTime(String multirequestToken){
		setToken("postEndTime", multirequestToken);
	}


	public LiveStreamScheduleEvent() {
		super();
	}

	public LiveStreamScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		projectedAudience = GsonParser.parseInt(jsonObject.get("projectedAudience"));
		sourceEntryId = GsonParser.parseString(jsonObject.get("sourceEntryId"));
		preStartTime = GsonParser.parseInt(jsonObject.get("preStartTime"));
		postEndTime = GsonParser.parseInt(jsonObject.get("postEndTime"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamScheduleEvent");
		kparams.add("projectedAudience", this.projectedAudience);
		kparams.add("sourceEntryId", this.sourceEntryId);
		kparams.add("preStartTime", this.preStartTime);
		kparams.add("postEndTime", this.postEndTime);
		return kparams;
	}


    public static final Creator<LiveStreamScheduleEvent> CREATOR = new Creator<LiveStreamScheduleEvent>() {
        @Override
        public LiveStreamScheduleEvent createFromParcel(Parcel source) {
            return new LiveStreamScheduleEvent(source);
        }

        @Override
        public LiveStreamScheduleEvent[] newArray(int size) {
            return new LiveStreamScheduleEvent[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.projectedAudience);
        dest.writeString(this.sourceEntryId);
        dest.writeValue(this.preStartTime);
        dest.writeValue(this.postEndTime);
    }

    public LiveStreamScheduleEvent(Parcel in) {
        super(in);
        this.projectedAudience = (Integer)in.readValue(Integer.class.getClassLoader());
        this.sourceEntryId = in.readString();
        this.preStartTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.postEndTime = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

