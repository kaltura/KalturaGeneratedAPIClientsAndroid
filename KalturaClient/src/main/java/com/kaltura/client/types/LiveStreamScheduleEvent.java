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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamScheduleEvent.Tokenizer.class)
public class LiveStreamScheduleEvent extends BaseLiveScheduleEvent {
	
	public interface Tokenizer extends BaseLiveScheduleEvent.Tokenizer {
		String sourceEntryId();
		String projectedAudience();
		String preStartTime();
		String postEndTime();
		String preStartEntryId();
		String postEndEntryId();
		String isContentInterruptible();
		RequestBuilder.ListTokenizer<LiveFeature.Tokenizer> liveFeatures();
	}

	/**
	 * The entry ID of the source entry (for simulive)
	 */
	private String sourceEntryId;
	/**
	 * Defines the expected audience.
	 */
	private Integer projectedAudience;
	/**
	 * The time relative time before the startTime considered as preStart time
	 */
	private Integer preStartTime;
	/**
	 * The time relative time before the endTime considered as postEnd time
	 */
	private Integer postEndTime;
	/**
	 * The entry id of the pre start entry
	 */
	private String preStartEntryId;
	/**
	 * The entry id of the post end entry
	 */
	private String postEndEntryId;
	/**
	 * Detect whether "real" live can interrupt to the "main" content
	 */
	private Boolean isContentInterruptible;
	/**
	 * list of live features that apply to the event
	 */
	private List<LiveFeature> liveFeatures;

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

	// preStartEntryId:
	public String getPreStartEntryId(){
		return this.preStartEntryId;
	}
	public void setPreStartEntryId(String preStartEntryId){
		this.preStartEntryId = preStartEntryId;
	}

	public void preStartEntryId(String multirequestToken){
		setToken("preStartEntryId", multirequestToken);
	}

	// postEndEntryId:
	public String getPostEndEntryId(){
		return this.postEndEntryId;
	}
	public void setPostEndEntryId(String postEndEntryId){
		this.postEndEntryId = postEndEntryId;
	}

	public void postEndEntryId(String multirequestToken){
		setToken("postEndEntryId", multirequestToken);
	}

	// isContentInterruptible:
	public Boolean getIsContentInterruptible(){
		return this.isContentInterruptible;
	}
	public void setIsContentInterruptible(Boolean isContentInterruptible){
		this.isContentInterruptible = isContentInterruptible;
	}

	public void isContentInterruptible(String multirequestToken){
		setToken("isContentInterruptible", multirequestToken);
	}

	// liveFeatures:
	public List<LiveFeature> getLiveFeatures(){
		return this.liveFeatures;
	}
	public void setLiveFeatures(List<LiveFeature> liveFeatures){
		this.liveFeatures = liveFeatures;
	}


	public LiveStreamScheduleEvent() {
		super();
	}

	public LiveStreamScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sourceEntryId = GsonParser.parseString(jsonObject.get("sourceEntryId"));
		projectedAudience = GsonParser.parseInt(jsonObject.get("projectedAudience"));
		preStartTime = GsonParser.parseInt(jsonObject.get("preStartTime"));
		postEndTime = GsonParser.parseInt(jsonObject.get("postEndTime"));
		preStartEntryId = GsonParser.parseString(jsonObject.get("preStartEntryId"));
		postEndEntryId = GsonParser.parseString(jsonObject.get("postEndEntryId"));
		isContentInterruptible = GsonParser.parseBoolean(jsonObject.get("isContentInterruptible"));
		liveFeatures = GsonParser.parseArray(jsonObject.getAsJsonArray("liveFeatures"), LiveFeature.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamScheduleEvent");
		kparams.add("sourceEntryId", this.sourceEntryId);
		kparams.add("projectedAudience", this.projectedAudience);
		kparams.add("preStartTime", this.preStartTime);
		kparams.add("postEndTime", this.postEndTime);
		kparams.add("preStartEntryId", this.preStartEntryId);
		kparams.add("postEndEntryId", this.postEndEntryId);
		kparams.add("isContentInterruptible", this.isContentInterruptible);
		kparams.add("liveFeatures", this.liveFeatures);
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
        dest.writeString(this.sourceEntryId);
        dest.writeValue(this.projectedAudience);
        dest.writeValue(this.preStartTime);
        dest.writeValue(this.postEndTime);
        dest.writeString(this.preStartEntryId);
        dest.writeString(this.postEndEntryId);
        dest.writeValue(this.isContentInterruptible);
        if(this.liveFeatures != null) {
            dest.writeInt(this.liveFeatures.size());
            dest.writeList(this.liveFeatures);
        } else {
            dest.writeInt(-1);
        }
    }

    public LiveStreamScheduleEvent(Parcel in) {
        super(in);
        this.sourceEntryId = in.readString();
        this.projectedAudience = (Integer)in.readValue(Integer.class.getClassLoader());
        this.preStartTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.postEndTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.preStartEntryId = in.readString();
        this.postEndEntryId = in.readString();
        this.isContentInterruptible = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int liveFeaturesSize = in.readInt();
        if( liveFeaturesSize > -1) {
            this.liveFeatures = new ArrayList<>();
            in.readList(this.liveFeatures, LiveFeature.class.getClassLoader());
        }
    }
}

