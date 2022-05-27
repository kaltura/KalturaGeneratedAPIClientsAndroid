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
import com.kaltura.client.enums.StatsKmcEventType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Will hold data from the Kaltura UI components to be passed on to the reports and
  analytics system
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StatsKmcEvent.Tokenizer.class)
public class StatsKmcEvent extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String clientVer();
		String kmcEventActionPath();
		String kmcEventType();
		String eventTimestamp();
		String sessionId();
		String partnerId();
		String entryId();
		String widgetId();
		String uiconfId();
		String userId();
		String userIp();
	}

	private String clientVer;
	private String kmcEventActionPath;
	private StatsKmcEventType kmcEventType;
	/**
	 * the client's timestamp of this event
	 */
	private Integer eventTimestamp;
	/**
	 * a unique string generated by the client that will represent the client-side
	  session: the primary component will pass it on to other components that sprout
	  from it
	 */
	private String sessionId;
	private Integer partnerId;
	private String entryId;
	private String widgetId;
	private Integer uiconfId;
	/**
	 * the partner's user id
	 */
	private String userId;
	/**
	 * will be retrieved from the request of the user
	 */
	private String userIp;

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

	// kmcEventActionPath:
	public String getKmcEventActionPath(){
		return this.kmcEventActionPath;
	}
	public void setKmcEventActionPath(String kmcEventActionPath){
		this.kmcEventActionPath = kmcEventActionPath;
	}

	public void kmcEventActionPath(String multirequestToken){
		setToken("kmcEventActionPath", multirequestToken);
	}

	// kmcEventType:
	public StatsKmcEventType getKmcEventType(){
		return this.kmcEventType;
	}
	public void setKmcEventType(StatsKmcEventType kmcEventType){
		this.kmcEventType = kmcEventType;
	}

	public void kmcEventType(String multirequestToken){
		setToken("kmcEventType", multirequestToken);
	}

	// eventTimestamp:
	public Integer getEventTimestamp(){
		return this.eventTimestamp;
	}
	public void setEventTimestamp(Integer eventTimestamp){
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

	// userIp:
	public String getUserIp(){
		return this.userIp;
	}

	public StatsKmcEvent() {
		super();
	}

	public StatsKmcEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clientVer = GsonParser.parseString(jsonObject.get("clientVer"));
		kmcEventActionPath = GsonParser.parseString(jsonObject.get("kmcEventActionPath"));
		kmcEventType = StatsKmcEventType.get(GsonParser.parseInt(jsonObject.get("kmcEventType")));
		eventTimestamp = GsonParser.parseInt(jsonObject.get("eventTimestamp"));
		sessionId = GsonParser.parseString(jsonObject.get("sessionId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		widgetId = GsonParser.parseString(jsonObject.get("widgetId"));
		uiconfId = GsonParser.parseInt(jsonObject.get("uiconfId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		userIp = GsonParser.parseString(jsonObject.get("userIp"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStatsKmcEvent");
		kparams.add("clientVer", this.clientVer);
		kparams.add("kmcEventActionPath", this.kmcEventActionPath);
		kparams.add("kmcEventType", this.kmcEventType);
		kparams.add("eventTimestamp", this.eventTimestamp);
		kparams.add("sessionId", this.sessionId);
		kparams.add("partnerId", this.partnerId);
		kparams.add("entryId", this.entryId);
		kparams.add("widgetId", this.widgetId);
		kparams.add("uiconfId", this.uiconfId);
		kparams.add("userId", this.userId);
		return kparams;
	}


    public static final Creator<StatsKmcEvent> CREATOR = new Creator<StatsKmcEvent>() {
        @Override
        public StatsKmcEvent createFromParcel(Parcel source) {
            return new StatsKmcEvent(source);
        }

        @Override
        public StatsKmcEvent[] newArray(int size) {
            return new StatsKmcEvent[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.clientVer);
        dest.writeString(this.kmcEventActionPath);
        dest.writeInt(this.kmcEventType == null ? -1 : this.kmcEventType.ordinal());
        dest.writeValue(this.eventTimestamp);
        dest.writeString(this.sessionId);
        dest.writeValue(this.partnerId);
        dest.writeString(this.entryId);
        dest.writeString(this.widgetId);
        dest.writeValue(this.uiconfId);
        dest.writeString(this.userId);
        dest.writeString(this.userIp);
    }

    public StatsKmcEvent(Parcel in) {
        super(in);
        this.clientVer = in.readString();
        this.kmcEventActionPath = in.readString();
        int tmpKmcEventType = in.readInt();
        this.kmcEventType = tmpKmcEventType == -1 ? null : StatsKmcEventType.values()[tmpKmcEventType];
        this.eventTimestamp = (Integer)in.readValue(Integer.class.getClassLoader());
        this.sessionId = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryId = in.readString();
        this.widgetId = in.readString();
        this.uiconfId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userId = in.readString();
        this.userIp = in.readString();
    }
}

