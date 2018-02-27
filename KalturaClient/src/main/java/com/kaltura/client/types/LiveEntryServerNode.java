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
// Copyright (C) 2006-2018  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveEntryServerNode.Tokenizer.class)
public class LiveEntryServerNode extends EntryServerNode {
	
	public interface Tokenizer extends EntryServerNode.Tokenizer {
		RequestBuilder.ListTokenizer<LiveStreamParams.Tokenizer> streams();
		RequestBuilder.ListTokenizer<LiveEntryServerNodeRecordingInfo.Tokenizer> recordingInfo();
		String isPlayableUser();
	}

	/**
	 * parameters of the stream we got
	 */
	private List<LiveStreamParams> streams;
	private List<LiveEntryServerNodeRecordingInfo> recordingInfo;
	private Boolean isPlayableUser;

	// streams:
	public List<LiveStreamParams> getStreams(){
		return this.streams;
	}
	public void setStreams(List<LiveStreamParams> streams){
		this.streams = streams;
	}

	// recordingInfo:
	public List<LiveEntryServerNodeRecordingInfo> getRecordingInfo(){
		return this.recordingInfo;
	}
	public void setRecordingInfo(List<LiveEntryServerNodeRecordingInfo> recordingInfo){
		this.recordingInfo = recordingInfo;
	}

	// isPlayableUser:
	public Boolean getIsPlayableUser(){
		return this.isPlayableUser;
	}
	public void setIsPlayableUser(Boolean isPlayableUser){
		this.isPlayableUser = isPlayableUser;
	}

	public void isPlayableUser(String multirequestToken){
		setToken("isPlayableUser", multirequestToken);
	}


	public LiveEntryServerNode() {
		super();
	}

	public LiveEntryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		streams = GsonParser.parseArray(jsonObject.getAsJsonArray("streams"), LiveStreamParams.class);
		recordingInfo = GsonParser.parseArray(jsonObject.getAsJsonArray("recordingInfo"), LiveEntryServerNodeRecordingInfo.class);
		isPlayableUser = GsonParser.parseBoolean(jsonObject.get("isPlayableUser"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveEntryServerNode");
		kparams.add("streams", this.streams);
		kparams.add("recordingInfo", this.recordingInfo);
		kparams.add("isPlayableUser", this.isPlayableUser);
		return kparams;
	}


    public static final Creator<LiveEntryServerNode> CREATOR = new Creator<LiveEntryServerNode>() {
        @Override
        public LiveEntryServerNode createFromParcel(Parcel source) {
            return new LiveEntryServerNode(source);
        }

        @Override
        public LiveEntryServerNode[] newArray(int size) {
            return new LiveEntryServerNode[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.streams != null) {
            dest.writeInt(this.streams.size());
            dest.writeList(this.streams);
        } else {
            dest.writeInt(-1);
        }
        if(this.recordingInfo != null) {
            dest.writeInt(this.recordingInfo.size());
            dest.writeList(this.recordingInfo);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.isPlayableUser);
    }

    public LiveEntryServerNode(Parcel in) {
        super(in);
        int streamsSize = in.readInt();
        if( streamsSize > -1) {
            this.streams = new ArrayList<>();
            in.readList(this.streams, LiveStreamParams.class.getClassLoader());
        }
        int recordingInfoSize = in.readInt();
        if( recordingInfoSize > -1) {
            this.recordingInfo = new ArrayList<>();
            in.readList(this.recordingInfo, LiveEntryServerNodeRecordingInfo.class.getClassLoader());
        }
        this.isPlayableUser = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

