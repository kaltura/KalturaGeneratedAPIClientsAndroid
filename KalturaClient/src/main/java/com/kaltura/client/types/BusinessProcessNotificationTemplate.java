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
@MultiRequestBuilder.Tokenizer(BusinessProcessNotificationTemplate.Tokenizer.class)
public abstract class BusinessProcessNotificationTemplate extends EventNotificationTemplate {
	
	public interface Tokenizer extends EventNotificationTemplate.Tokenizer {
		String serverId();
		String processId();
		String mainObjectCode();
	}

	/**
	 * Define the integrated BPM server id
	 */
	private Integer serverId;
	/**
	 * Define the integrated BPM process id
	 */
	private String processId;
	/**
	 * Code to load the main triggering object
	 */
	private String mainObjectCode;

	// serverId:
	public Integer getServerId(){
		return this.serverId;
	}
	public void setServerId(Integer serverId){
		this.serverId = serverId;
	}

	public void serverId(String multirequestToken){
		setToken("serverId", multirequestToken);
	}

	// processId:
	public String getProcessId(){
		return this.processId;
	}
	public void setProcessId(String processId){
		this.processId = processId;
	}

	public void processId(String multirequestToken){
		setToken("processId", multirequestToken);
	}

	// mainObjectCode:
	public String getMainObjectCode(){
		return this.mainObjectCode;
	}
	public void setMainObjectCode(String mainObjectCode){
		this.mainObjectCode = mainObjectCode;
	}

	public void mainObjectCode(String multirequestToken){
		setToken("mainObjectCode", multirequestToken);
	}


	public BusinessProcessNotificationTemplate() {
		super();
	}

	public BusinessProcessNotificationTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		serverId = GsonParser.parseInt(jsonObject.get("serverId"));
		processId = GsonParser.parseString(jsonObject.get("processId"));
		mainObjectCode = GsonParser.parseString(jsonObject.get("mainObjectCode"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessProcessNotificationTemplate");
		kparams.add("serverId", this.serverId);
		kparams.add("processId", this.processId);
		kparams.add("mainObjectCode", this.mainObjectCode);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.serverId);
        dest.writeString(this.processId);
        dest.writeString(this.mainObjectCode);
    }

    public BusinessProcessNotificationTemplate(Parcel in) {
        super(in);
        this.serverId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.processId = in.readString();
        this.mainObjectCode = in.readString();
    }
}

