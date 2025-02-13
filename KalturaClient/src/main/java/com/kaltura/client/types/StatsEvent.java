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
import com.kaltura.client.enums.StatsEventType;
import com.kaltura.client.enums.StatsFeatureType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Will hold data from the Kaltura UI components to be passed on to the reports and
  analytics system
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StatsEvent.Tokenizer.class)
public class StatsEvent extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String clientVer();
		String eventType();
		String eventTimestamp();
		String sessionId();
		String partnerId();
		String entryId();
		String uniqueViewer();
		String widgetId();
		String uiconfId();
		String userId();
		String currentPoint();
		String duration();
		String userIp();
		String processDuration();
		String controlId();
		String seek();
		String newPoint();
		String referrer();
		String isFirstInSession();
		String applicationId();
		String contextId();
		String featureType();
	}

	private String clientVer;
	private StatsEventType eventType;
	/**
	 * the client's timestamp of this event
	 */
	private Double eventTimestamp;
	/**
	 * a unique string generated by the client that will represent the client-side
	  session: the primary component will pass it on to other components that sprout
	  from it
	 */
	private String sessionId;
	private Integer partnerId;
	private String entryId;
	/**
	 * the UV cookie - creates in the operational system and should be passed on ofr
	  every event
	 */
	private String uniqueViewer;
	private String widgetId;
	private Integer uiconfId;
	/**
	 * the partner's user id
	 */
	private String userId;
	/**
	 * the timestamp along the video when the event happend
	 */
	private Integer currentPoint;
	/**
	 * the duration of the video in milliseconds - will make it much faster than
	  quering the db for each entry
	 */
	private Integer duration;
	/**
	 * will be retrieved from the request of the user
	 */
	private String userIp;
	/**
	 * the time in milliseconds the event took
	 */
	private Integer processDuration;
	/**
	 * the id of the GUI control - will be used in the future to better understand what
	  the user clicked
	 */
	private String controlId;
	/**
	 * true if the user ever used seek in this session
	 */
	private Boolean seek;
	/**
	 * timestamp of the new point on the timeline of the video after the user seeks
	 */
	private Integer newPoint;
	/**
	 * the referrer of the client
	 */
	private String referrer;
	/**
	 * will indicate if the event is thrown for the first video in the session
	 */
	private Boolean isFirstInSession;
	/**
	 * kaltura application name
	 */
	private String applicationId;
	private Integer contextId;
	private StatsFeatureType featureType;

	// clientVer:
	public String getClientVer(){
		return this.clientVer;
	}
	public void setClientVer(String clientVer){
		this.clientVer = clientVer;
	}

	public void clientVer(String multirequestToken){
		setToken("clientVer", multirequestToken);
	}

	// eventType:
	public StatsEventType getEventType(){
		return this.eventType;
	}
	public void setEventType(StatsEventType eventType){
		this.eventType = eventType;
	}

	public void eventType(String multirequestToken){
		setToken("eventType", multirequestToken);
	}

	// eventTimestamp:
	public Double getEventTimestamp(){
		return this.eventTimestamp;
	}
	public void setEventTimestamp(Double eventTimestamp){
		this.eventTimestamp = eventTimestamp;
	}

	public void eventTimestamp(String multirequestToken){
		setToken("eventTimestamp", multirequestToken);
	}

	// sessionId:
	public String getSessionId(){
		return this.sessionId;
	}
	public void setSessionId(String sessionId){
		this.sessionId = sessionId;
	}

	public void sessionId(String multirequestToken){
		setToken("sessionId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// uniqueViewer:
	public String getUniqueViewer(){
		return this.uniqueViewer;
	}
	public void setUniqueViewer(String uniqueViewer){
		this.uniqueViewer = uniqueViewer;
	}

	public void uniqueViewer(String multirequestToken){
		setToken("uniqueViewer", multirequestToken);
	}

	// widgetId:
	public String getWidgetId(){
		return this.widgetId;
	}
	public void setWidgetId(String widgetId){
		this.widgetId = widgetId;
	}

	public void widgetId(String multirequestToken){
		setToken("widgetId", multirequestToken);
	}

	// uiconfId:
	public Integer getUiconfId(){
		return this.uiconfId;
	}
	public void setUiconfId(Integer uiconfId){
		this.uiconfId = uiconfId;
	}

	public void uiconfId(String multirequestToken){
		setToken("uiconfId", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// currentPoint:
	public Integer getCurrentPoint(){
		return this.currentPoint;
	}
	public void setCurrentPoint(Integer currentPoint){
		this.currentPoint = currentPoint;
	}

	public void currentPoint(String multirequestToken){
		setToken("currentPoint", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}

	// userIp:
	public String getUserIp(){
		return this.userIp;
	}
	// processDuration:
	public Integer getProcessDuration(){
		return this.processDuration;
	}
	public void setProcessDuration(Integer processDuration){
		this.processDuration = processDuration;
	}

	public void processDuration(String multirequestToken){
		setToken("processDuration", multirequestToken);
	}

	// controlId:
	public String getControlId(){
		return this.controlId;
	}
	public void setControlId(String controlId){
		this.controlId = controlId;
	}

	public void controlId(String multirequestToken){
		setToken("controlId", multirequestToken);
	}

	// seek:
	public Boolean getSeek(){
		return this.seek;
	}
	public void setSeek(Boolean seek){
		this.seek = seek;
	}

	public void seek(String multirequestToken){
		setToken("seek", multirequestToken);
	}

	// newPoint:
	public Integer getNewPoint(){
		return this.newPoint;
	}
	public void setNewPoint(Integer newPoint){
		this.newPoint = newPoint;
	}

	public void newPoint(String multirequestToken){
		setToken("newPoint", multirequestToken);
	}

	// referrer:
	public String getReferrer(){
		return this.referrer;
	}
	public void setReferrer(String referrer){
		this.referrer = referrer;
	}

	public void referrer(String multirequestToken){
		setToken("referrer", multirequestToken);
	}

	// isFirstInSession:
	public Boolean getIsFirstInSession(){
		return this.isFirstInSession;
	}
	public void setIsFirstInSession(Boolean isFirstInSession){
		this.isFirstInSession = isFirstInSession;
	}

	public void isFirstInSession(String multirequestToken){
		setToken("isFirstInSession", multirequestToken);
	}

	// applicationId:
	public String getApplicationId(){
		return this.applicationId;
	}
	public void setApplicationId(String applicationId){
		this.applicationId = applicationId;
	}

	public void applicationId(String multirequestToken){
		setToken("applicationId", multirequestToken);
	}

	// contextId:
	public Integer getContextId(){
		return this.contextId;
	}
	public void setContextId(Integer contextId){
		this.contextId = contextId;
	}

	public void contextId(String multirequestToken){
		setToken("contextId", multirequestToken);
	}

	// featureType:
	public StatsFeatureType getFeatureType(){
		return this.featureType;
	}
	public void setFeatureType(StatsFeatureType featureType){
		this.featureType = featureType;
	}

	public void featureType(String multirequestToken){
		setToken("featureType", multirequestToken);
	}


	public StatsEvent() {
		super();
	}

	public StatsEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clientVer = GsonParser.parseString(jsonObject.get("clientVer"));
		eventType = StatsEventType.get(GsonParser.parseInt(jsonObject.get("eventType")));
		eventTimestamp = GsonParser.parseDouble(jsonObject.get("eventTimestamp"));
		sessionId = GsonParser.parseString(jsonObject.get("sessionId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		uniqueViewer = GsonParser.parseString(jsonObject.get("uniqueViewer"));
		widgetId = GsonParser.parseString(jsonObject.get("widgetId"));
		uiconfId = GsonParser.parseInt(jsonObject.get("uiconfId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		currentPoint = GsonParser.parseInt(jsonObject.get("currentPoint"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		userIp = GsonParser.parseString(jsonObject.get("userIp"));
		processDuration = GsonParser.parseInt(jsonObject.get("processDuration"));
		controlId = GsonParser.parseString(jsonObject.get("controlId"));
		seek = GsonParser.parseBoolean(jsonObject.get("seek"));
		newPoint = GsonParser.parseInt(jsonObject.get("newPoint"));
		referrer = GsonParser.parseString(jsonObject.get("referrer"));
		isFirstInSession = GsonParser.parseBoolean(jsonObject.get("isFirstInSession"));
		applicationId = GsonParser.parseString(jsonObject.get("applicationId"));
		contextId = GsonParser.parseInt(jsonObject.get("contextId"));
		featureType = StatsFeatureType.get(GsonParser.parseInt(jsonObject.get("featureType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStatsEvent");
		kparams.add("clientVer", this.clientVer);
		kparams.add("eventType", this.eventType);
		kparams.add("eventTimestamp", this.eventTimestamp);
		kparams.add("sessionId", this.sessionId);
		kparams.add("partnerId", this.partnerId);
		kparams.add("entryId", this.entryId);
		kparams.add("uniqueViewer", this.uniqueViewer);
		kparams.add("widgetId", this.widgetId);
		kparams.add("uiconfId", this.uiconfId);
		kparams.add("userId", this.userId);
		kparams.add("currentPoint", this.currentPoint);
		kparams.add("duration", this.duration);
		kparams.add("processDuration", this.processDuration);
		kparams.add("controlId", this.controlId);
		kparams.add("seek", this.seek);
		kparams.add("newPoint", this.newPoint);
		kparams.add("referrer", this.referrer);
		kparams.add("isFirstInSession", this.isFirstInSession);
		kparams.add("applicationId", this.applicationId);
		kparams.add("contextId", this.contextId);
		kparams.add("featureType", this.featureType);
		return kparams;
	}


    public static final Creator<StatsEvent> CREATOR = new Creator<StatsEvent>() {
        @Override
        public StatsEvent createFromParcel(Parcel source) {
            return new StatsEvent(source);
        }

        @Override
        public StatsEvent[] newArray(int size) {
            return new StatsEvent[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.clientVer);
        dest.writeInt(this.eventType == null ? -1 : this.eventType.ordinal());
        dest.writeValue(this.eventTimestamp);
        dest.writeString(this.sessionId);
        dest.writeValue(this.partnerId);
        dest.writeString(this.entryId);
        dest.writeString(this.uniqueViewer);
        dest.writeString(this.widgetId);
        dest.writeValue(this.uiconfId);
        dest.writeString(this.userId);
        dest.writeValue(this.currentPoint);
        dest.writeValue(this.duration);
        dest.writeString(this.userIp);
        dest.writeValue(this.processDuration);
        dest.writeString(this.controlId);
        dest.writeValue(this.seek);
        dest.writeValue(this.newPoint);
        dest.writeString(this.referrer);
        dest.writeValue(this.isFirstInSession);
        dest.writeString(this.applicationId);
        dest.writeValue(this.contextId);
        dest.writeInt(this.featureType == null ? -1 : this.featureType.ordinal());
    }

    public StatsEvent(Parcel in) {
        super(in);
        this.clientVer = in.readString();
        int tmpEventType = in.readInt();
        this.eventType = tmpEventType == -1 ? null : StatsEventType.values()[tmpEventType];
        this.eventTimestamp = (Double)in.readValue(Double.class.getClassLoader());
        this.sessionId = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryId = in.readString();
        this.uniqueViewer = in.readString();
        this.widgetId = in.readString();
        this.uiconfId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userId = in.readString();
        this.currentPoint = (Integer)in.readValue(Integer.class.getClassLoader());
        this.duration = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userIp = in.readString();
        this.processDuration = (Integer)in.readValue(Integer.class.getClassLoader());
        this.controlId = in.readString();
        this.seek = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.newPoint = (Integer)in.readValue(Integer.class.getClassLoader());
        this.referrer = in.readString();
        this.isFirstInSession = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.applicationId = in.readString();
        this.contextId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpFeatureType = in.readInt();
        this.featureType = tmpFeatureType == -1 ? null : StatsFeatureType.values()[tmpFeatureType];
    }
}

