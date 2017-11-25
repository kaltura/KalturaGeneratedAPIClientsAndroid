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
import com.kaltura.client.enums.CaptionType;
import com.kaltura.client.enums.Language;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CaptionParams.Tokenizer.class)
public class CaptionParams extends AssetParams {
	
	public interface Tokenizer extends AssetParams.Tokenizer {
		String language();
		String isDefault();
		String label();
		String format();
		String sourceParamsId();
	}

	/**
	 * The language of the caption content
	 */
	private Language language;
	/**
	 * Is default caption asset of the entry
	 */
	private Boolean isDefault;
	/**
	 * Friendly label
	 */
	private String label;
	/**
	 * The caption format
	 */
	private CaptionType format;
	/**
	 * Id of the caption params or the flavor params to be used as source for the
	  caption creation
	 */
	private Integer sourceParamsId;

	// language:
	public Language getLanguage(){
		return this.language;
	}
	public void setLanguage(Language language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	public void isDefault(String multirequestToken){
		setToken("isDefault", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// format:
	public CaptionType getFormat(){
		return this.format;
	}
	public void setFormat(CaptionType format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// sourceParamsId:
	public Integer getSourceParamsId(){
		return this.sourceParamsId;
	}
	public void setSourceParamsId(Integer sourceParamsId){
		this.sourceParamsId = sourceParamsId;
	}

	public void sourceParamsId(String multirequestToken){
		setToken("sourceParamsId", multirequestToken);
	}


	public CaptionParams() {
		super();
	}

	public CaptionParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		language = Language.get(GsonParser.parseString(jsonObject.get("language")));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		label = GsonParser.parseString(jsonObject.get("label"));
		format = CaptionType.get(GsonParser.parseString(jsonObject.get("format")));
		sourceParamsId = GsonParser.parseInt(jsonObject.get("sourceParamsId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCaptionParams");
		kparams.add("language", this.language);
		kparams.add("isDefault", this.isDefault);
		kparams.add("label", this.label);
		kparams.add("format", this.format);
		kparams.add("sourceParamsId", this.sourceParamsId);
		return kparams;
	}


    public static final Creator<CaptionParams> CREATOR = new Creator<CaptionParams>() {
        @Override
        public CaptionParams createFromParcel(Parcel source) {
            return new CaptionParams(source);
        }

        @Override
        public CaptionParams[] newArray(int size) {
            return new CaptionParams[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.language == null ? -1 : this.language.ordinal());
        dest.writeInt(this.isDefault == null ? -1 : this.isDefault.ordinal());
        dest.writeString(this.label);
        dest.writeInt(this.format == null ? -1 : this.format.ordinal());
        dest.writeValue(this.sourceParamsId);
    }

    public CaptionParams(Parcel in) {
        super(in);
        int tmpLanguage = in.readInt();
        this.language = tmpLanguage == -1 ? null : Language.values()[tmpLanguage];
        int tmpIsDefault = in.readInt();
        this.isDefault = tmpIsDefault == -1 ? null : Boolean.values()[tmpIsDefault];
        this.label = in.readString();
        int tmpFormat = in.readInt();
        this.format = tmpFormat == -1 ? null : CaptionType.values()[tmpFormat];
        this.sourceParamsId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

