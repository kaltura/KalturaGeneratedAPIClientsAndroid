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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.enums.LiveReportOrderBy;
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
@MultiRequestBuilder.Tokenizer(LiveReportInputFilter.Tokenizer.class)
public class LiveReportInputFilter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String entryIds();
		String fromTime();
		String toTime();
		String live();
		String orderBy();
	}

	private String entryIds;
	private Integer fromTime;
	private Integer toTime;
	private Boolean live;
	private LiveReportOrderBy orderBy;

	// entryIds:
	public String getEntryIds(){
		return this.entryIds;
	}
	public void setEntryIds(String entryIds){
		this.entryIds = entryIds;
	}

	public void entryIds(String multirequestToken){
		setToken("entryIds", multirequestToken);
	}

	// fromTime:
	public Integer getFromTime(){
		return this.fromTime;
	}
	public void setFromTime(Integer fromTime){
		this.fromTime = fromTime;
	}

	public void fromTime(String multirequestToken){
		setToken("fromTime", multirequestToken);
	}

	// toTime:
	public Integer getToTime(){
		return this.toTime;
	}
	public void setToTime(Integer toTime){
		this.toTime = toTime;
	}

	public void toTime(String multirequestToken){
		setToken("toTime", multirequestToken);
	}

	// live:
	public Boolean getLive(){
		return this.live;
	}
	public void setLive(Boolean live){
		this.live = live;
	}

	public void live(String multirequestToken){
		setToken("live", multirequestToken);
	}

	// orderBy:
	public LiveReportOrderBy getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(LiveReportOrderBy orderBy){
		this.orderBy = orderBy;
	}

	public void orderBy(String multirequestToken){
		setToken("orderBy", multirequestToken);
	}


	public LiveReportInputFilter() {
		super();
	}

	public LiveReportInputFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
		fromTime = GsonParser.parseInt(jsonObject.get("fromTime"));
		toTime = GsonParser.parseInt(jsonObject.get("toTime"));
		live = GsonParser.parseBoolean(jsonObject.get("live"));
		orderBy = LiveReportOrderBy.get(GsonParser.parseString(jsonObject.get("orderBy")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveReportInputFilter");
		kparams.add("entryIds", this.entryIds);
		kparams.add("fromTime", this.fromTime);
		kparams.add("toTime", this.toTime);
		kparams.add("live", this.live);
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}


    public static final Creator<LiveReportInputFilter> CREATOR = new Creator<LiveReportInputFilter>() {
        @Override
        public LiveReportInputFilter createFromParcel(Parcel source) {
            return new LiveReportInputFilter(source);
        }

        @Override
        public LiveReportInputFilter[] newArray(int size) {
            return new LiveReportInputFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.entryIds);
        dest.writeValue(this.fromTime);
        dest.writeValue(this.toTime);
        dest.writeInt(this.live == null ? -1 : this.live.ordinal());
        dest.writeInt(this.orderBy == null ? -1 : this.orderBy.ordinal());
    }

    public LiveReportInputFilter(Parcel in) {
        super(in);
        this.entryIds = in.readString();
        this.fromTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.toTime = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpLive = in.readInt();
        this.live = tmpLive == -1 ? null : Boolean.values()[tmpLive];
        int tmpOrderBy = in.readInt();
        this.orderBy = tmpOrderBy == -1 ? null : LiveReportOrderBy.values()[tmpOrderBy];
    }
}

