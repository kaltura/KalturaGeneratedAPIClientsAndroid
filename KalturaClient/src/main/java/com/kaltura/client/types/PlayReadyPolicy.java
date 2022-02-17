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
import com.kaltura.client.enums.PlayReadyLicenseRemovalPolicy;
import com.kaltura.client.enums.PlayReadyMinimumLicenseSecurityLevel;
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
@MultiRequestBuilder.Tokenizer(PlayReadyPolicy.Tokenizer.class)
public class PlayReadyPolicy extends DrmPolicy {
	
	public interface Tokenizer extends DrmPolicy.Tokenizer {
		String gracePeriod();
		String licenseRemovalPolicy();
		String licenseRemovalDuration();
		String minSecurityLevel();
		RequestBuilder.ListTokenizer<PlayReadyRight.Tokenizer> rights();
	}

	private Integer gracePeriod;
	private PlayReadyLicenseRemovalPolicy licenseRemovalPolicy;
	private Integer licenseRemovalDuration;
	private PlayReadyMinimumLicenseSecurityLevel minSecurityLevel;
	private List<PlayReadyRight> rights;

	// gracePeriod:
	public Integer getGracePeriod(){
		return this.gracePeriod;
	}
	public void setGracePeriod(Integer gracePeriod){
		this.gracePeriod = gracePeriod;
	}

	public void gracePeriod(String multirequestToken){
		setToken("gracePeriod", multirequestToken);
	}

	// licenseRemovalPolicy:
	public PlayReadyLicenseRemovalPolicy getLicenseRemovalPolicy(){
		return this.licenseRemovalPolicy;
	}
	public void setLicenseRemovalPolicy(PlayReadyLicenseRemovalPolicy licenseRemovalPolicy){
		this.licenseRemovalPolicy = licenseRemovalPolicy;
	}

	public void licenseRemovalPolicy(String multirequestToken){
		setToken("licenseRemovalPolicy", multirequestToken);
	}

	// licenseRemovalDuration:
	public Integer getLicenseRemovalDuration(){
		return this.licenseRemovalDuration;
	}
	public void setLicenseRemovalDuration(Integer licenseRemovalDuration){
		this.licenseRemovalDuration = licenseRemovalDuration;
	}

	public void licenseRemovalDuration(String multirequestToken){
		setToken("licenseRemovalDuration", multirequestToken);
	}

	// minSecurityLevel:
	public PlayReadyMinimumLicenseSecurityLevel getMinSecurityLevel(){
		return this.minSecurityLevel;
	}
	public void setMinSecurityLevel(PlayReadyMinimumLicenseSecurityLevel minSecurityLevel){
		this.minSecurityLevel = minSecurityLevel;
	}

	public void minSecurityLevel(String multirequestToken){
		setToken("minSecurityLevel", multirequestToken);
	}

	// rights:
	public List<PlayReadyRight> getRights(){
		return this.rights;
	}
	public void setRights(List<PlayReadyRight> rights){
		this.rights = rights;
	}


	public PlayReadyPolicy() {
		super();
	}

	public PlayReadyPolicy(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		gracePeriod = GsonParser.parseInt(jsonObject.get("gracePeriod"));
		licenseRemovalPolicy = PlayReadyLicenseRemovalPolicy.get(GsonParser.parseInt(jsonObject.get("licenseRemovalPolicy")));
		licenseRemovalDuration = GsonParser.parseInt(jsonObject.get("licenseRemovalDuration"));
		minSecurityLevel = PlayReadyMinimumLicenseSecurityLevel.get(GsonParser.parseInt(jsonObject.get("minSecurityLevel")));
		rights = GsonParser.parseArray(jsonObject.getAsJsonArray("rights"), PlayReadyRight.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayReadyPolicy");
		kparams.add("gracePeriod", this.gracePeriod);
		kparams.add("licenseRemovalPolicy", this.licenseRemovalPolicy);
		kparams.add("licenseRemovalDuration", this.licenseRemovalDuration);
		kparams.add("minSecurityLevel", this.minSecurityLevel);
		kparams.add("rights", this.rights);
		return kparams;
	}


    public static final Creator<PlayReadyPolicy> CREATOR = new Creator<PlayReadyPolicy>() {
        @Override
        public PlayReadyPolicy createFromParcel(Parcel source) {
            return new PlayReadyPolicy(source);
        }

        @Override
        public PlayReadyPolicy[] newArray(int size) {
            return new PlayReadyPolicy[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.gracePeriod);
        dest.writeInt(this.licenseRemovalPolicy == null ? -1 : this.licenseRemovalPolicy.ordinal());
        dest.writeValue(this.licenseRemovalDuration);
        dest.writeInt(this.minSecurityLevel == null ? -1 : this.minSecurityLevel.ordinal());
        if(this.rights != null) {
            dest.writeInt(this.rights.size());
            dest.writeList(this.rights);
        } else {
            dest.writeInt(-1);
        }
    }

    public PlayReadyPolicy(Parcel in) {
        super(in);
        this.gracePeriod = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpLicenseRemovalPolicy = in.readInt();
        this.licenseRemovalPolicy = tmpLicenseRemovalPolicy == -1 ? null : PlayReadyLicenseRemovalPolicy.values()[tmpLicenseRemovalPolicy];
        this.licenseRemovalDuration = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpMinSecurityLevel = in.readInt();
        this.minSecurityLevel = tmpMinSecurityLevel == -1 ? null : PlayReadyMinimumLicenseSecurityLevel.values()[tmpMinSecurityLevel];
        int rightsSize = in.readInt();
        if( rightsSize > -1) {
            this.rights = new ArrayList<>();
            in.readList(this.rights, PlayReadyRight.class.getClassLoader());
        }
    }
}

