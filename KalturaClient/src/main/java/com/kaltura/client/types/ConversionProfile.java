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
import com.kaltura.client.enums.ConversionProfileStatus;
import com.kaltura.client.enums.ConversionProfileType;
import com.kaltura.client.enums.Language;
import com.kaltura.client.enums.MediaParserType;
import com.kaltura.client.types.CropDimensions;
import com.kaltura.client.types.EntryReplacementOptions;
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
@MultiRequestBuilder.Tokenizer(ConversionProfile.Tokenizer.class)
public class ConversionProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String status();
		String type();
		String name();
		String systemName();
		String tags();
		String description();
		String defaultEntryId();
		String createdAt();
		String flavorParamsIds();
		String isDefault();
		String isPartnerDefault();
		CropDimensions.Tokenizer cropDimensions();
		String clipStart();
		String clipDuration();
		String xslTransformation();
		String storageProfileId();
		String mediaParserType();
		String calculateComplexity();
		String collectionTags();
		String conditionalProfiles();
		String detectGOP();
		String mediaInfoXslTransformation();
		EntryReplacementOptions.Tokenizer defaultReplacementOptions();
		String defaultAudioLang();
	}

	/**
	 * The id of the Conversion Profile
	 */
	private Integer id;
	private Integer partnerId;
	private ConversionProfileStatus status;
	private ConversionProfileType type;
	/**
	 * The name of the Conversion Profile
	 */
	private String name;
	/**
	 * System name of the Conversion Profile
	 */
	private String systemName;
	/**
	 * Comma separated tags
	 */
	private String tags;
	/**
	 * The description of the Conversion Profile
	 */
	private String description;
	/**
	 * ID of the default entry to be used for template data
	 */
	private String defaultEntryId;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * List of included flavor ids (comma separated)
	 */
	private String flavorParamsIds;
	/**
	 * Indicates that this conversion profile is system default
	 */
	private Boolean isDefault;
	/**
	 * Indicates that this conversion profile is partner default
	 */
	private Boolean isPartnerDefault;
	/**
	 * Cropping dimensions
	 */
	private CropDimensions cropDimensions;
	/**
	 * Clipping start position (in miliseconds)
	 */
	private Integer clipStart;
	/**
	 * Clipping duration (in miliseconds)
	 */
	private Integer clipDuration;
	/**
	 * XSL to transform ingestion MRSS XML
	 */
	private String xslTransformation;
	/**
	 * ID of default storage profile to be used for linked net-storage file syncs
	 */
	private Integer storageProfileId;
	/**
	 * Media parser type to be used for extract media
	 */
	private MediaParserType mediaParserType;
	/**
	 * Should calculate file conversion complexity
	 */
	private Boolean calculateComplexity;
	/**
	 * Defines the tags that should be used to define 'collective'/group/multi-flavor
	  processing,   like 'mbr' or 'ism'
	 */
	private String collectionTags;
	/**
	 * JSON string with array of "condition,profile-id" pairs.
	 */
	private String conditionalProfiles;
	/**
	 * When set, the ExtractMedia job should detect the source file GOP using this
	  value as the max calculated period
	 */
	private Integer detectGOP;
	/**
	 * XSL to transform ingestion Media Info XML
	 */
	private String mediaInfoXslTransformation;
	/**
	 * Default replacement options to be applied to entries
	 */
	private EntryReplacementOptions defaultReplacementOptions;
	private Language defaultAudioLang;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// status:
	public ConversionProfileStatus getStatus(){
		return this.status;
	}
	public void setStatus(ConversionProfileStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// type:
	public ConversionProfileType getType(){
		return this.type;
	}
	public void setType(ConversionProfileType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// defaultEntryId:
	public String getDefaultEntryId(){
		return this.defaultEntryId;
	}
	public void setDefaultEntryId(String defaultEntryId){
		this.defaultEntryId = defaultEntryId;
	}

	public void defaultEntryId(String multirequestToken){
		setToken("defaultEntryId", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// flavorParamsIds:
	public String getFlavorParamsIds(){
		return this.flavorParamsIds;
	}
	public void setFlavorParamsIds(String flavorParamsIds){
		this.flavorParamsIds = flavorParamsIds;
	}

	public void flavorParamsIds(String multirequestToken){
		setToken("flavorParamsIds", multirequestToken);
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

	// isPartnerDefault:
	public Boolean getIsPartnerDefault(){
		return this.isPartnerDefault;
	}
	// cropDimensions:
	public CropDimensions getCropDimensions(){
		return this.cropDimensions;
	}
	public void setCropDimensions(CropDimensions cropDimensions){
		this.cropDimensions = cropDimensions;
	}

	// clipStart:
	public Integer getClipStart(){
		return this.clipStart;
	}
	public void setClipStart(Integer clipStart){
		this.clipStart = clipStart;
	}

	public void clipStart(String multirequestToken){
		setToken("clipStart", multirequestToken);
	}

	// clipDuration:
	public Integer getClipDuration(){
		return this.clipDuration;
	}
	public void setClipDuration(Integer clipDuration){
		this.clipDuration = clipDuration;
	}

	public void clipDuration(String multirequestToken){
		setToken("clipDuration", multirequestToken);
	}

	// xslTransformation:
	public String getXslTransformation(){
		return this.xslTransformation;
	}
	public void setXslTransformation(String xslTransformation){
		this.xslTransformation = xslTransformation;
	}

	public void xslTransformation(String multirequestToken){
		setToken("xslTransformation", multirequestToken);
	}

	// storageProfileId:
	public Integer getStorageProfileId(){
		return this.storageProfileId;
	}
	public void setStorageProfileId(Integer storageProfileId){
		this.storageProfileId = storageProfileId;
	}

	public void storageProfileId(String multirequestToken){
		setToken("storageProfileId", multirequestToken);
	}

	// mediaParserType:
	public MediaParserType getMediaParserType(){
		return this.mediaParserType;
	}
	public void setMediaParserType(MediaParserType mediaParserType){
		this.mediaParserType = mediaParserType;
	}

	public void mediaParserType(String multirequestToken){
		setToken("mediaParserType", multirequestToken);
	}

	// calculateComplexity:
	public Boolean getCalculateComplexity(){
		return this.calculateComplexity;
	}
	public void setCalculateComplexity(Boolean calculateComplexity){
		this.calculateComplexity = calculateComplexity;
	}

	public void calculateComplexity(String multirequestToken){
		setToken("calculateComplexity", multirequestToken);
	}

	// collectionTags:
	public String getCollectionTags(){
		return this.collectionTags;
	}
	public void setCollectionTags(String collectionTags){
		this.collectionTags = collectionTags;
	}

	public void collectionTags(String multirequestToken){
		setToken("collectionTags", multirequestToken);
	}

	// conditionalProfiles:
	public String getConditionalProfiles(){
		return this.conditionalProfiles;
	}
	public void setConditionalProfiles(String conditionalProfiles){
		this.conditionalProfiles = conditionalProfiles;
	}

	public void conditionalProfiles(String multirequestToken){
		setToken("conditionalProfiles", multirequestToken);
	}

	// detectGOP:
	public Integer getDetectGOP(){
		return this.detectGOP;
	}
	public void setDetectGOP(Integer detectGOP){
		this.detectGOP = detectGOP;
	}

	public void detectGOP(String multirequestToken){
		setToken("detectGOP", multirequestToken);
	}

	// mediaInfoXslTransformation:
	public String getMediaInfoXslTransformation(){
		return this.mediaInfoXslTransformation;
	}
	public void setMediaInfoXslTransformation(String mediaInfoXslTransformation){
		this.mediaInfoXslTransformation = mediaInfoXslTransformation;
	}

	public void mediaInfoXslTransformation(String multirequestToken){
		setToken("mediaInfoXslTransformation", multirequestToken);
	}

	// defaultReplacementOptions:
	public EntryReplacementOptions getDefaultReplacementOptions(){
		return this.defaultReplacementOptions;
	}
	public void setDefaultReplacementOptions(EntryReplacementOptions defaultReplacementOptions){
		this.defaultReplacementOptions = defaultReplacementOptions;
	}

	// defaultAudioLang:
	public Language getDefaultAudioLang(){
		return this.defaultAudioLang;
	}
	public void setDefaultAudioLang(Language defaultAudioLang){
		this.defaultAudioLang = defaultAudioLang;
	}

	public void defaultAudioLang(String multirequestToken){
		setToken("defaultAudioLang", multirequestToken);
	}


	public ConversionProfile() {
		super();
	}

	public ConversionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		status = ConversionProfileStatus.get(GsonParser.parseString(jsonObject.get("status")));
		type = ConversionProfileType.get(GsonParser.parseString(jsonObject.get("type")));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		description = GsonParser.parseString(jsonObject.get("description"));
		defaultEntryId = GsonParser.parseString(jsonObject.get("defaultEntryId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		isPartnerDefault = GsonParser.parseBoolean(jsonObject.get("isPartnerDefault"));
		cropDimensions = GsonParser.parseObject(jsonObject.getAsJsonObject("cropDimensions"), CropDimensions.class);
		clipStart = GsonParser.parseInt(jsonObject.get("clipStart"));
		clipDuration = GsonParser.parseInt(jsonObject.get("clipDuration"));
		xslTransformation = GsonParser.parseString(jsonObject.get("xslTransformation"));
		storageProfileId = GsonParser.parseInt(jsonObject.get("storageProfileId"));
		mediaParserType = MediaParserType.get(GsonParser.parseString(jsonObject.get("mediaParserType")));
		calculateComplexity = GsonParser.parseBoolean(jsonObject.get("calculateComplexity"));
		collectionTags = GsonParser.parseString(jsonObject.get("collectionTags"));
		conditionalProfiles = GsonParser.parseString(jsonObject.get("conditionalProfiles"));
		detectGOP = GsonParser.parseInt(jsonObject.get("detectGOP"));
		mediaInfoXslTransformation = GsonParser.parseString(jsonObject.get("mediaInfoXslTransformation"));
		defaultReplacementOptions = GsonParser.parseObject(jsonObject.getAsJsonObject("defaultReplacementOptions"), EntryReplacementOptions.class);
		defaultAudioLang = Language.get(GsonParser.parseString(jsonObject.get("defaultAudioLang")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConversionProfile");
		kparams.add("status", this.status);
		kparams.add("type", this.type);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("tags", this.tags);
		kparams.add("description", this.description);
		kparams.add("defaultEntryId", this.defaultEntryId);
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		kparams.add("isDefault", this.isDefault);
		kparams.add("cropDimensions", this.cropDimensions);
		kparams.add("clipStart", this.clipStart);
		kparams.add("clipDuration", this.clipDuration);
		kparams.add("xslTransformation", this.xslTransformation);
		kparams.add("storageProfileId", this.storageProfileId);
		kparams.add("mediaParserType", this.mediaParserType);
		kparams.add("calculateComplexity", this.calculateComplexity);
		kparams.add("collectionTags", this.collectionTags);
		kparams.add("conditionalProfiles", this.conditionalProfiles);
		kparams.add("detectGOP", this.detectGOP);
		kparams.add("mediaInfoXslTransformation", this.mediaInfoXslTransformation);
		kparams.add("defaultReplacementOptions", this.defaultReplacementOptions);
		kparams.add("defaultAudioLang", this.defaultAudioLang);
		return kparams;
	}


    public static final Creator<ConversionProfile> CREATOR = new Creator<ConversionProfile>() {
        @Override
        public ConversionProfile createFromParcel(Parcel source) {
            return new ConversionProfile(source);
        }

        @Override
        public ConversionProfile[] newArray(int size) {
            return new ConversionProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeString(this.tags);
        dest.writeString(this.description);
        dest.writeString(this.defaultEntryId);
        dest.writeValue(this.createdAt);
        dest.writeString(this.flavorParamsIds);
        dest.writeValue(this.isDefault);
        dest.writeValue(this.isPartnerDefault);
        dest.writeParcelable(this.cropDimensions, flags);
        dest.writeValue(this.clipStart);
        dest.writeValue(this.clipDuration);
        dest.writeString(this.xslTransformation);
        dest.writeValue(this.storageProfileId);
        dest.writeInt(this.mediaParserType == null ? -1 : this.mediaParserType.ordinal());
        dest.writeValue(this.calculateComplexity);
        dest.writeString(this.collectionTags);
        dest.writeString(this.conditionalProfiles);
        dest.writeValue(this.detectGOP);
        dest.writeString(this.mediaInfoXslTransformation);
        dest.writeParcelable(this.defaultReplacementOptions, flags);
        dest.writeInt(this.defaultAudioLang == null ? -1 : this.defaultAudioLang.ordinal());
    }

    public ConversionProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : ConversionProfileStatus.values()[tmpStatus];
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : ConversionProfileType.values()[tmpType];
        this.name = in.readString();
        this.systemName = in.readString();
        this.tags = in.readString();
        this.description = in.readString();
        this.defaultEntryId = in.readString();
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.flavorParamsIds = in.readString();
        this.isDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.isPartnerDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.cropDimensions = in.readParcelable(CropDimensions.class.getClassLoader());
        this.clipStart = (Integer)in.readValue(Integer.class.getClassLoader());
        this.clipDuration = (Integer)in.readValue(Integer.class.getClassLoader());
        this.xslTransformation = in.readString();
        this.storageProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpMediaParserType = in.readInt();
        this.mediaParserType = tmpMediaParserType == -1 ? null : MediaParserType.values()[tmpMediaParserType];
        this.calculateComplexity = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.collectionTags = in.readString();
        this.conditionalProfiles = in.readString();
        this.detectGOP = (Integer)in.readValue(Integer.class.getClassLoader());
        this.mediaInfoXslTransformation = in.readString();
        this.defaultReplacementOptions = in.readParcelable(EntryReplacementOptions.class.getClassLoader());
        int tmpDefaultAudioLang = in.readInt();
        this.defaultAudioLang = tmpDefaultAudioLang == -1 ? null : Language.values()[tmpDefaultAudioLang];
    }
}

