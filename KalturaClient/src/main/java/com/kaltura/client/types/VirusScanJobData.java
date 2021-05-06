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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.VirusFoundAction;
import com.kaltura.client.enums.VirusScanJobResult;
import com.kaltura.client.types.FileContainer;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VirusScanJobData.Tokenizer.class)
public class VirusScanJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		FileContainer.Tokenizer fileContainer();
		String flavorAssetId();
		String scanResult();
		String virusFoundAction();
	}

	private FileContainer fileContainer;
	private String flavorAssetId;
	private VirusScanJobResult scanResult;
	private VirusFoundAction virusFoundAction;

	// fileContainer:
	public FileContainer getFileContainer(){
		return this.fileContainer;
	}
	public void setFileContainer(FileContainer fileContainer){
		this.fileContainer = fileContainer;
	}

	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// scanResult:
	public VirusScanJobResult getScanResult(){
		return this.scanResult;
	}
	public void setScanResult(VirusScanJobResult scanResult){
		this.scanResult = scanResult;
	}

	public void scanResult(String multirequestToken){
		setToken("scanResult", multirequestToken);
	}

	// virusFoundAction:
	public VirusFoundAction getVirusFoundAction(){
		return this.virusFoundAction;
	}
	public void setVirusFoundAction(VirusFoundAction virusFoundAction){
		this.virusFoundAction = virusFoundAction;
	}

	public void virusFoundAction(String multirequestToken){
		setToken("virusFoundAction", multirequestToken);
	}


	public VirusScanJobData() {
		super();
	}

	public VirusScanJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileContainer = GsonParser.parseObject(jsonObject.getAsJsonObject("fileContainer"), FileContainer.class);
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		scanResult = VirusScanJobResult.get(GsonParser.parseInt(jsonObject.get("scanResult")));
		virusFoundAction = VirusFoundAction.get(GsonParser.parseInt(jsonObject.get("virusFoundAction")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVirusScanJobData");
		kparams.add("fileContainer", this.fileContainer);
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("scanResult", this.scanResult);
		kparams.add("virusFoundAction", this.virusFoundAction);
		return kparams;
	}


    public static final Creator<VirusScanJobData> CREATOR = new Creator<VirusScanJobData>() {
        @Override
        public VirusScanJobData createFromParcel(Parcel source) {
            return new VirusScanJobData(source);
        }

        @Override
        public VirusScanJobData[] newArray(int size) {
            return new VirusScanJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.fileContainer, flags);
        dest.writeString(this.flavorAssetId);
        dest.writeInt(this.scanResult == null ? -1 : this.scanResult.ordinal());
        dest.writeInt(this.virusFoundAction == null ? -1 : this.virusFoundAction.ordinal());
    }

    public VirusScanJobData(Parcel in) {
        super(in);
        this.fileContainer = in.readParcelable(FileContainer.class.getClassLoader());
        this.flavorAssetId = in.readString();
        int tmpScanResult = in.readInt();
        this.scanResult = tmpScanResult == -1 ? null : VirusScanJobResult.values()[tmpScanResult];
        int tmpVirusFoundAction = in.readInt();
        this.virusFoundAction = tmpVirusFoundAction == -1 ? null : VirusFoundAction.values()[tmpVirusFoundAction];
    }
}

