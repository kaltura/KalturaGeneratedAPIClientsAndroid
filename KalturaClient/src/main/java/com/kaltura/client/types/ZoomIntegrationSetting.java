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
import com.kaltura.client.enums.ZoomGroupParticipationType;
import com.kaltura.client.enums.ZoomUsersMatching;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ZoomIntegrationSetting.Tokenizer.class)
public class ZoomIntegrationSetting extends IntegrationSetting {
	
	public interface Tokenizer extends IntegrationSetting.Tokenizer {
		String zoomCategory();
		String enableRecordingUpload();
		String zoomUserMatchingMode();
		String zoomUserPostfix();
		String zoomWebinarCategory();
		String enableWebinarUploads();
		String jwtToken();
		String enableZoomTranscription();
		String zoomAccountDescription();
		String enableMeetingUpload();
		String optOutGroupNames();
		String optInGroupNames();
		String groupParticipationType();
	}

	private String zoomCategory;
	private Boolean enableRecordingUpload;
	private ZoomUsersMatching zoomUserMatchingMode;
	private String zoomUserPostfix;
	private String zoomWebinarCategory;
	private Boolean enableWebinarUploads;
	private String jwtToken;
	private Boolean enableZoomTranscription;
	private String zoomAccountDescription;
	private Boolean enableMeetingUpload;
	private String optOutGroupNames;
	private String optInGroupNames;
	private ZoomGroupParticipationType groupParticipationType;

	// zoomCategory:
	public String getZoomCategory(){
		return this.zoomCategory;
	}
	public void setZoomCategory(String zoomCategory){
		this.zoomCategory = zoomCategory;
	}

	public void zoomCategory(String multirequestToken){
		setToken("zoomCategory", multirequestToken);
	}

	// enableRecordingUpload:
	public Boolean getEnableRecordingUpload(){
		return this.enableRecordingUpload;
	}
	public void setEnableRecordingUpload(Boolean enableRecordingUpload){
		this.enableRecordingUpload = enableRecordingUpload;
	}

	public void enableRecordingUpload(String multirequestToken){
		setToken("enableRecordingUpload", multirequestToken);
	}

	// zoomUserMatchingMode:
	public ZoomUsersMatching getZoomUserMatchingMode(){
		return this.zoomUserMatchingMode;
	}
	public void setZoomUserMatchingMode(ZoomUsersMatching zoomUserMatchingMode){
		this.zoomUserMatchingMode = zoomUserMatchingMode;
	}

	public void zoomUserMatchingMode(String multirequestToken){
		setToken("zoomUserMatchingMode", multirequestToken);
	}

	// zoomUserPostfix:
	public String getZoomUserPostfix(){
		return this.zoomUserPostfix;
	}
	public void setZoomUserPostfix(String zoomUserPostfix){
		this.zoomUserPostfix = zoomUserPostfix;
	}

	public void zoomUserPostfix(String multirequestToken){
		setToken("zoomUserPostfix", multirequestToken);
	}

	// zoomWebinarCategory:
	public String getZoomWebinarCategory(){
		return this.zoomWebinarCategory;
	}
	public void setZoomWebinarCategory(String zoomWebinarCategory){
		this.zoomWebinarCategory = zoomWebinarCategory;
	}

	public void zoomWebinarCategory(String multirequestToken){
		setToken("zoomWebinarCategory", multirequestToken);
	}

	// enableWebinarUploads:
	public Boolean getEnableWebinarUploads(){
		return this.enableWebinarUploads;
	}
	public void setEnableWebinarUploads(Boolean enableWebinarUploads){
		this.enableWebinarUploads = enableWebinarUploads;
	}

	public void enableWebinarUploads(String multirequestToken){
		setToken("enableWebinarUploads", multirequestToken);
	}

	// jwtToken:
	public String getJwtToken(){
		return this.jwtToken;
	}
	public void setJwtToken(String jwtToken){
		this.jwtToken = jwtToken;
	}

	public void jwtToken(String multirequestToken){
		setToken("jwtToken", multirequestToken);
	}

	// enableZoomTranscription:
	public Boolean getEnableZoomTranscription(){
		return this.enableZoomTranscription;
	}
	public void setEnableZoomTranscription(Boolean enableZoomTranscription){
		this.enableZoomTranscription = enableZoomTranscription;
	}

	public void enableZoomTranscription(String multirequestToken){
		setToken("enableZoomTranscription", multirequestToken);
	}

	// zoomAccountDescription:
	public String getZoomAccountDescription(){
		return this.zoomAccountDescription;
	}
	public void setZoomAccountDescription(String zoomAccountDescription){
		this.zoomAccountDescription = zoomAccountDescription;
	}

	public void zoomAccountDescription(String multirequestToken){
		setToken("zoomAccountDescription", multirequestToken);
	}

	// enableMeetingUpload:
	public Boolean getEnableMeetingUpload(){
		return this.enableMeetingUpload;
	}
	public void setEnableMeetingUpload(Boolean enableMeetingUpload){
		this.enableMeetingUpload = enableMeetingUpload;
	}

	public void enableMeetingUpload(String multirequestToken){
		setToken("enableMeetingUpload", multirequestToken);
	}

	// optOutGroupNames:
	public String getOptOutGroupNames(){
		return this.optOutGroupNames;
	}
	public void setOptOutGroupNames(String optOutGroupNames){
		this.optOutGroupNames = optOutGroupNames;
	}

	public void optOutGroupNames(String multirequestToken){
		setToken("optOutGroupNames", multirequestToken);
	}

	// optInGroupNames:
	public String getOptInGroupNames(){
		return this.optInGroupNames;
	}
	public void setOptInGroupNames(String optInGroupNames){
		this.optInGroupNames = optInGroupNames;
	}

	public void optInGroupNames(String multirequestToken){
		setToken("optInGroupNames", multirequestToken);
	}

	// groupParticipationType:
	public ZoomGroupParticipationType getGroupParticipationType(){
		return this.groupParticipationType;
	}
	public void setGroupParticipationType(ZoomGroupParticipationType groupParticipationType){
		this.groupParticipationType = groupParticipationType;
	}

	public void groupParticipationType(String multirequestToken){
		setToken("groupParticipationType", multirequestToken);
	}


	public ZoomIntegrationSetting() {
		super();
	}

	public ZoomIntegrationSetting(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		zoomCategory = GsonParser.parseString(jsonObject.get("zoomCategory"));
		enableRecordingUpload = GsonParser.parseBoolean(jsonObject.get("enableRecordingUpload"));
		zoomUserMatchingMode = ZoomUsersMatching.get(GsonParser.parseInt(jsonObject.get("zoomUserMatchingMode")));
		zoomUserPostfix = GsonParser.parseString(jsonObject.get("zoomUserPostfix"));
		zoomWebinarCategory = GsonParser.parseString(jsonObject.get("zoomWebinarCategory"));
		enableWebinarUploads = GsonParser.parseBoolean(jsonObject.get("enableWebinarUploads"));
		jwtToken = GsonParser.parseString(jsonObject.get("jwtToken"));
		enableZoomTranscription = GsonParser.parseBoolean(jsonObject.get("enableZoomTranscription"));
		zoomAccountDescription = GsonParser.parseString(jsonObject.get("zoomAccountDescription"));
		enableMeetingUpload = GsonParser.parseBoolean(jsonObject.get("enableMeetingUpload"));
		optOutGroupNames = GsonParser.parseString(jsonObject.get("optOutGroupNames"));
		optInGroupNames = GsonParser.parseString(jsonObject.get("optInGroupNames"));
		groupParticipationType = ZoomGroupParticipationType.get(GsonParser.parseInt(jsonObject.get("groupParticipationType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaZoomIntegrationSetting");
		kparams.add("zoomCategory", this.zoomCategory);
		kparams.add("enableRecordingUpload", this.enableRecordingUpload);
		kparams.add("zoomUserMatchingMode", this.zoomUserMatchingMode);
		kparams.add("zoomUserPostfix", this.zoomUserPostfix);
		kparams.add("zoomWebinarCategory", this.zoomWebinarCategory);
		kparams.add("enableWebinarUploads", this.enableWebinarUploads);
		kparams.add("jwtToken", this.jwtToken);
		kparams.add("enableZoomTranscription", this.enableZoomTranscription);
		kparams.add("zoomAccountDescription", this.zoomAccountDescription);
		kparams.add("enableMeetingUpload", this.enableMeetingUpload);
		kparams.add("optOutGroupNames", this.optOutGroupNames);
		kparams.add("optInGroupNames", this.optInGroupNames);
		kparams.add("groupParticipationType", this.groupParticipationType);
		return kparams;
	}


    public static final Creator<ZoomIntegrationSetting> CREATOR = new Creator<ZoomIntegrationSetting>() {
        @Override
        public ZoomIntegrationSetting createFromParcel(Parcel source) {
            return new ZoomIntegrationSetting(source);
        }

        @Override
        public ZoomIntegrationSetting[] newArray(int size) {
            return new ZoomIntegrationSetting[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.zoomCategory);
        dest.writeValue(this.enableRecordingUpload);
        dest.writeInt(this.zoomUserMatchingMode == null ? -1 : this.zoomUserMatchingMode.ordinal());
        dest.writeString(this.zoomUserPostfix);
        dest.writeString(this.zoomWebinarCategory);
        dest.writeValue(this.enableWebinarUploads);
        dest.writeString(this.jwtToken);
        dest.writeValue(this.enableZoomTranscription);
        dest.writeString(this.zoomAccountDescription);
        dest.writeValue(this.enableMeetingUpload);
        dest.writeString(this.optOutGroupNames);
        dest.writeString(this.optInGroupNames);
        dest.writeInt(this.groupParticipationType == null ? -1 : this.groupParticipationType.ordinal());
    }

    public ZoomIntegrationSetting(Parcel in) {
        super(in);
        this.zoomCategory = in.readString();
        this.enableRecordingUpload = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpZoomUserMatchingMode = in.readInt();
        this.zoomUserMatchingMode = tmpZoomUserMatchingMode == -1 ? null : ZoomUsersMatching.values()[tmpZoomUserMatchingMode];
        this.zoomUserPostfix = in.readString();
        this.zoomWebinarCategory = in.readString();
        this.enableWebinarUploads = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.jwtToken = in.readString();
        this.enableZoomTranscription = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.zoomAccountDescription = in.readString();
        this.enableMeetingUpload = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.optOutGroupNames = in.readString();
        this.optInGroupNames = in.readString();
        int tmpGroupParticipationType = in.readInt();
        this.groupParticipationType = tmpGroupParticipationType == -1 ? null : ZoomGroupParticipationType.values()[tmpGroupParticipationType];
    }
}

