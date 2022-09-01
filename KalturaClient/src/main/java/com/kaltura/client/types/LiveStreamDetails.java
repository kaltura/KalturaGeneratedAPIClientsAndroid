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
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.LiveStreamBroadcastStatus;
import com.kaltura.client.enums.ViewMode;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamDetails.Tokenizer.class)
public class LiveStreamDetails extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String primaryStreamStatus();
		String secondaryStreamStatus();
		String viewMode();
		String wasBroadcast();
		String broadcastStatus();
	}

	/**
	 * The status of the primary stream
	 */
	private EntryServerNodeStatus primaryStreamStatus;
	/**
	 * The status of the secondary stream
	 */
	private EntryServerNodeStatus secondaryStreamStatus;
	private ViewMode viewMode;
	private Boolean wasBroadcast;
	private LiveStreamBroadcastStatus broadcastStatus;

	// primaryStreamStatus:
	public EntryServerNodeStatus getPrimaryStreamStatus(){
		return this.primaryStreamStatus;
	}
	public void setPrimaryStreamStatus(EntryServerNodeStatus primaryStreamStatus){
		this.primaryStreamStatus = primaryStreamStatus;
	}

	public void primaryStreamStatus(String multirequestToken){
		setToken("primaryStreamStatus", multirequestToken);
	}

	// secondaryStreamStatus:
	public EntryServerNodeStatus getSecondaryStreamStatus(){
		return this.secondaryStreamStatus;
	}
	public void setSecondaryStreamStatus(EntryServerNodeStatus secondaryStreamStatus){
		this.secondaryStreamStatus = secondaryStreamStatus;
	}

	public void secondaryStreamStatus(String multirequestToken){
		setToken("secondaryStreamStatus", multirequestToken);
	}

	// viewMode:
	public ViewMode getViewMode(){
		return this.viewMode;
	}
	public void setViewMode(ViewMode viewMode){
		this.viewMode = viewMode;
	}

	public void viewMode(String multirequestToken){
		setToken("viewMode", multirequestToken);
	}

	// wasBroadcast:
	public Boolean getWasBroadcast(){
		return this.wasBroadcast;
	}
	public void setWasBroadcast(Boolean wasBroadcast){
		this.wasBroadcast = wasBroadcast;
	}

	public void wasBroadcast(String multirequestToken){
		setToken("wasBroadcast", multirequestToken);
	}

	// broadcastStatus:
	public LiveStreamBroadcastStatus getBroadcastStatus(){
		return this.broadcastStatus;
	}
	public void setBroadcastStatus(LiveStreamBroadcastStatus broadcastStatus){
		this.broadcastStatus = broadcastStatus;
	}

	public void broadcastStatus(String multirequestToken){
		setToken("broadcastStatus", multirequestToken);
	}


	public LiveStreamDetails() {
		super();
	}

	public LiveStreamDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		primaryStreamStatus = EntryServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("primaryStreamStatus")));
		secondaryStreamStatus = EntryServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("secondaryStreamStatus")));
		viewMode = ViewMode.get(GsonParser.parseInt(jsonObject.get("viewMode")));
		wasBroadcast = GsonParser.parseBoolean(jsonObject.get("wasBroadcast"));
		broadcastStatus = LiveStreamBroadcastStatus.get(GsonParser.parseInt(jsonObject.get("broadcastStatus")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamDetails");
		kparams.add("primaryStreamStatus", this.primaryStreamStatus);
		kparams.add("secondaryStreamStatus", this.secondaryStreamStatus);
		kparams.add("viewMode", this.viewMode);
		kparams.add("wasBroadcast", this.wasBroadcast);
		kparams.add("broadcastStatus", this.broadcastStatus);
		return kparams;
	}


    public static final Creator<LiveStreamDetails> CREATOR = new Creator<LiveStreamDetails>() {
        @Override
        public LiveStreamDetails createFromParcel(Parcel source) {
            return new LiveStreamDetails(source);
        }

        @Override
        public LiveStreamDetails[] newArray(int size) {
            return new LiveStreamDetails[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.primaryStreamStatus == null ? -1 : this.primaryStreamStatus.ordinal());
        dest.writeInt(this.secondaryStreamStatus == null ? -1 : this.secondaryStreamStatus.ordinal());
        dest.writeInt(this.viewMode == null ? -1 : this.viewMode.ordinal());
        dest.writeValue(this.wasBroadcast);
        dest.writeInt(this.broadcastStatus == null ? -1 : this.broadcastStatus.ordinal());
    }

    public LiveStreamDetails(Parcel in) {
        super(in);
        int tmpPrimaryStreamStatus = in.readInt();
        this.primaryStreamStatus = tmpPrimaryStreamStatus == -1 ? null : EntryServerNodeStatus.values()[tmpPrimaryStreamStatus];
        int tmpSecondaryStreamStatus = in.readInt();
        this.secondaryStreamStatus = tmpSecondaryStreamStatus == -1 ? null : EntryServerNodeStatus.values()[tmpSecondaryStreamStatus];
        int tmpViewMode = in.readInt();
        this.viewMode = tmpViewMode == -1 ? null : ViewMode.values()[tmpViewMode];
        this.wasBroadcast = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpBroadcastStatus = in.readInt();
        this.broadcastStatus = tmpBroadcastStatus == -1 ? null : LiveStreamBroadcastStatus.values()[tmpBroadcastStatus];
    }
}

