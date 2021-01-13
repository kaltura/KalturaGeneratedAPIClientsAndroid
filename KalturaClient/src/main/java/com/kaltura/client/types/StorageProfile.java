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
import com.kaltura.client.enums.StorageProfileDeliveryStatus;
import com.kaltura.client.enums.StorageProfileProtocol;
import com.kaltura.client.enums.StorageProfileReadyBehavior;
import com.kaltura.client.enums.StorageProfileStatus;
import com.kaltura.client.types.ObjectBase;
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
@MultiRequestBuilder.Tokenizer(StorageProfile.Tokenizer.class)
public class StorageProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String updatedAt();
		String partnerId();
		String name();
		String systemName();
		String desciption();
		String status();
		String protocol();
		String storageUrl();
		String storageBaseDir();
		String pathPrefix();
		String storageUsername();
		String storagePassword();
		String storageFtpPassiveMode();
		String minFileSize();
		String maxFileSize();
		String flavorParamsIds();
		String maxConcurrentConnections();
		String pathManagerClass();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> pathManagerParams();
		String trigger();
		String deliveryPriority();
		String deliveryStatus();
		String readyBehavior();
		String allowAutoDelete();
		String createFileLink();
		RequestBuilder.ListTokenizer<Rule.Tokenizer> rules();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> deliveryProfileIds();
		String privateKey();
		String publicKey();
		String passPhrase();
		String shouldExportThumbs();
		String packagerUrl();
		String exportPeriodically();
		String excludedFlavorParamsIds();
		String shouldExportCaptions();
		String excludedEntryTypes();
	}

	private Integer id;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer partnerId;
	private String name;
	private String systemName;
	private String desciption;
	private StorageProfileStatus status;
	private StorageProfileProtocol protocol;
	private String storageUrl;
	private String storageBaseDir;
	private String pathPrefix;
	private String storageUsername;
	private String storagePassword;
	private Boolean storageFtpPassiveMode;
	private Integer minFileSize;
	private Integer maxFileSize;
	private String flavorParamsIds;
	private Integer maxConcurrentConnections;
	private String pathManagerClass;
	private List<KeyValue> pathManagerParams;
	/**
	 * No need to create enum for temp field
	 */
	private Integer trigger;
	/**
	 * Delivery Priority
	 */
	private Integer deliveryPriority;
	private StorageProfileDeliveryStatus deliveryStatus;
	private StorageProfileReadyBehavior readyBehavior;
	/**
	 * Flag sugnifying that the storage exported content should be deleted when soure
	  entry is deleted
	 */
	private Integer allowAutoDelete;
	/**
	 * Indicates to the local file transfer manager to create a link to the file
	  instead of copying it
	 */
	private Boolean createFileLink;
	/**
	 * Holds storage profile export rules
	 */
	private List<Rule> rules;
	/**
	 * Delivery profile ids
	 */
	private List<KeyValue> deliveryProfileIds;
	private String privateKey;
	private String publicKey;
	private String passPhrase;
	private Boolean shouldExportThumbs;
	private String packagerUrl;
	private Boolean exportPeriodically;
	private String excludedFlavorParamsIds;
	private Boolean shouldExportCaptions;
	private String excludedEntryTypes;

	// id:
	public Integer getId(){
		return this.id;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
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

	// desciption:
	public String getDesciption(){
		return this.desciption;
	}
	public void setDesciption(String desciption){
		this.desciption = desciption;
	}

	public void desciption(String multirequestToken){
		setToken("desciption", multirequestToken);
	}

	// status:
	public StorageProfileStatus getStatus(){
		return this.status;
	}
	public void setStatus(StorageProfileStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// protocol:
	public StorageProfileProtocol getProtocol(){
		return this.protocol;
	}
	public void setProtocol(StorageProfileProtocol protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
	}

	// storageUrl:
	public String getStorageUrl(){
		return this.storageUrl;
	}
	public void setStorageUrl(String storageUrl){
		this.storageUrl = storageUrl;
	}

	public void storageUrl(String multirequestToken){
		setToken("storageUrl", multirequestToken);
	}

	// storageBaseDir:
	public String getStorageBaseDir(){
		return this.storageBaseDir;
	}
	public void setStorageBaseDir(String storageBaseDir){
		this.storageBaseDir = storageBaseDir;
	}

	public void storageBaseDir(String multirequestToken){
		setToken("storageBaseDir", multirequestToken);
	}

	// pathPrefix:
	public String getPathPrefix(){
		return this.pathPrefix;
	}
	public void setPathPrefix(String pathPrefix){
		this.pathPrefix = pathPrefix;
	}

	public void pathPrefix(String multirequestToken){
		setToken("pathPrefix", multirequestToken);
	}

	// storageUsername:
	public String getStorageUsername(){
		return this.storageUsername;
	}
	public void setStorageUsername(String storageUsername){
		this.storageUsername = storageUsername;
	}

	public void storageUsername(String multirequestToken){
		setToken("storageUsername", multirequestToken);
	}

	// storagePassword:
	public String getStoragePassword(){
		return this.storagePassword;
	}
	public void setStoragePassword(String storagePassword){
		this.storagePassword = storagePassword;
	}

	public void storagePassword(String multirequestToken){
		setToken("storagePassword", multirequestToken);
	}

	// storageFtpPassiveMode:
	public Boolean getStorageFtpPassiveMode(){
		return this.storageFtpPassiveMode;
	}
	public void setStorageFtpPassiveMode(Boolean storageFtpPassiveMode){
		this.storageFtpPassiveMode = storageFtpPassiveMode;
	}

	public void storageFtpPassiveMode(String multirequestToken){
		setToken("storageFtpPassiveMode", multirequestToken);
	}

	// minFileSize:
	public Integer getMinFileSize(){
		return this.minFileSize;
	}
	public void setMinFileSize(Integer minFileSize){
		this.minFileSize = minFileSize;
	}

	public void minFileSize(String multirequestToken){
		setToken("minFileSize", multirequestToken);
	}

	// maxFileSize:
	public Integer getMaxFileSize(){
		return this.maxFileSize;
	}
	public void setMaxFileSize(Integer maxFileSize){
		this.maxFileSize = maxFileSize;
	}

	public void maxFileSize(String multirequestToken){
		setToken("maxFileSize", multirequestToken);
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

	// maxConcurrentConnections:
	public Integer getMaxConcurrentConnections(){
		return this.maxConcurrentConnections;
	}
	public void setMaxConcurrentConnections(Integer maxConcurrentConnections){
		this.maxConcurrentConnections = maxConcurrentConnections;
	}

	public void maxConcurrentConnections(String multirequestToken){
		setToken("maxConcurrentConnections", multirequestToken);
	}

	// pathManagerClass:
	public String getPathManagerClass(){
		return this.pathManagerClass;
	}
	public void setPathManagerClass(String pathManagerClass){
		this.pathManagerClass = pathManagerClass;
	}

	public void pathManagerClass(String multirequestToken){
		setToken("pathManagerClass", multirequestToken);
	}

	// pathManagerParams:
	public List<KeyValue> getPathManagerParams(){
		return this.pathManagerParams;
	}
	public void setPathManagerParams(List<KeyValue> pathManagerParams){
		this.pathManagerParams = pathManagerParams;
	}

	// trigger:
	public Integer getTrigger(){
		return this.trigger;
	}
	public void setTrigger(Integer trigger){
		this.trigger = trigger;
	}

	public void trigger(String multirequestToken){
		setToken("trigger", multirequestToken);
	}

	// deliveryPriority:
	public Integer getDeliveryPriority(){
		return this.deliveryPriority;
	}
	public void setDeliveryPriority(Integer deliveryPriority){
		this.deliveryPriority = deliveryPriority;
	}

	public void deliveryPriority(String multirequestToken){
		setToken("deliveryPriority", multirequestToken);
	}

	// deliveryStatus:
	public StorageProfileDeliveryStatus getDeliveryStatus(){
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(StorageProfileDeliveryStatus deliveryStatus){
		this.deliveryStatus = deliveryStatus;
	}

	public void deliveryStatus(String multirequestToken){
		setToken("deliveryStatus", multirequestToken);
	}

	// readyBehavior:
	public StorageProfileReadyBehavior getReadyBehavior(){
		return this.readyBehavior;
	}
	public void setReadyBehavior(StorageProfileReadyBehavior readyBehavior){
		this.readyBehavior = readyBehavior;
	}

	public void readyBehavior(String multirequestToken){
		setToken("readyBehavior", multirequestToken);
	}

	// allowAutoDelete:
	public Integer getAllowAutoDelete(){
		return this.allowAutoDelete;
	}
	public void setAllowAutoDelete(Integer allowAutoDelete){
		this.allowAutoDelete = allowAutoDelete;
	}

	public void allowAutoDelete(String multirequestToken){
		setToken("allowAutoDelete", multirequestToken);
	}

	// createFileLink:
	public Boolean getCreateFileLink(){
		return this.createFileLink;
	}
	public void setCreateFileLink(Boolean createFileLink){
		this.createFileLink = createFileLink;
	}

	public void createFileLink(String multirequestToken){
		setToken("createFileLink", multirequestToken);
	}

	// rules:
	public List<Rule> getRules(){
		return this.rules;
	}
	public void setRules(List<Rule> rules){
		this.rules = rules;
	}

	// deliveryProfileIds:
	public List<KeyValue> getDeliveryProfileIds(){
		return this.deliveryProfileIds;
	}
	public void setDeliveryProfileIds(List<KeyValue> deliveryProfileIds){
		this.deliveryProfileIds = deliveryProfileIds;
	}

	// privateKey:
	public String getPrivateKey(){
		return this.privateKey;
	}
	public void setPrivateKey(String privateKey){
		this.privateKey = privateKey;
	}

	public void privateKey(String multirequestToken){
		setToken("privateKey", multirequestToken);
	}

	// publicKey:
	public String getPublicKey(){
		return this.publicKey;
	}
	public void setPublicKey(String publicKey){
		this.publicKey = publicKey;
	}

	public void publicKey(String multirequestToken){
		setToken("publicKey", multirequestToken);
	}

	// passPhrase:
	public String getPassPhrase(){
		return this.passPhrase;
	}
	public void setPassPhrase(String passPhrase){
		this.passPhrase = passPhrase;
	}

	public void passPhrase(String multirequestToken){
		setToken("passPhrase", multirequestToken);
	}

	// shouldExportThumbs:
	public Boolean getShouldExportThumbs(){
		return this.shouldExportThumbs;
	}
	public void setShouldExportThumbs(Boolean shouldExportThumbs){
		this.shouldExportThumbs = shouldExportThumbs;
	}

	public void shouldExportThumbs(String multirequestToken){
		setToken("shouldExportThumbs", multirequestToken);
	}

	// packagerUrl:
	public String getPackagerUrl(){
		return this.packagerUrl;
	}
	public void setPackagerUrl(String packagerUrl){
		this.packagerUrl = packagerUrl;
	}

	public void packagerUrl(String multirequestToken){
		setToken("packagerUrl", multirequestToken);
	}

	// exportPeriodically:
	public Boolean getExportPeriodically(){
		return this.exportPeriodically;
	}
	public void setExportPeriodically(Boolean exportPeriodically){
		this.exportPeriodically = exportPeriodically;
	}

	public void exportPeriodically(String multirequestToken){
		setToken("exportPeriodically", multirequestToken);
	}

	// excludedFlavorParamsIds:
	public String getExcludedFlavorParamsIds(){
		return this.excludedFlavorParamsIds;
	}
	public void setExcludedFlavorParamsIds(String excludedFlavorParamsIds){
		this.excludedFlavorParamsIds = excludedFlavorParamsIds;
	}

	public void excludedFlavorParamsIds(String multirequestToken){
		setToken("excludedFlavorParamsIds", multirequestToken);
	}

	// shouldExportCaptions:
	public Boolean getShouldExportCaptions(){
		return this.shouldExportCaptions;
	}
	public void setShouldExportCaptions(Boolean shouldExportCaptions){
		this.shouldExportCaptions = shouldExportCaptions;
	}

	public void shouldExportCaptions(String multirequestToken){
		setToken("shouldExportCaptions", multirequestToken);
	}

	// excludedEntryTypes:
	public String getExcludedEntryTypes(){
		return this.excludedEntryTypes;
	}
	public void setExcludedEntryTypes(String excludedEntryTypes){
		this.excludedEntryTypes = excludedEntryTypes;
	}

	public void excludedEntryTypes(String multirequestToken){
		setToken("excludedEntryTypes", multirequestToken);
	}


	public StorageProfile() {
		super();
	}

	public StorageProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		desciption = GsonParser.parseString(jsonObject.get("desciption"));
		status = StorageProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		protocol = StorageProfileProtocol.get(GsonParser.parseString(jsonObject.get("protocol")));
		storageUrl = GsonParser.parseString(jsonObject.get("storageUrl"));
		storageBaseDir = GsonParser.parseString(jsonObject.get("storageBaseDir"));
		pathPrefix = GsonParser.parseString(jsonObject.get("pathPrefix"));
		storageUsername = GsonParser.parseString(jsonObject.get("storageUsername"));
		storagePassword = GsonParser.parseString(jsonObject.get("storagePassword"));
		storageFtpPassiveMode = GsonParser.parseBoolean(jsonObject.get("storageFtpPassiveMode"));
		minFileSize = GsonParser.parseInt(jsonObject.get("minFileSize"));
		maxFileSize = GsonParser.parseInt(jsonObject.get("maxFileSize"));
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
		maxConcurrentConnections = GsonParser.parseInt(jsonObject.get("maxConcurrentConnections"));
		pathManagerClass = GsonParser.parseString(jsonObject.get("pathManagerClass"));
		pathManagerParams = GsonParser.parseArray(jsonObject.getAsJsonArray("pathManagerParams"), KeyValue.class);
		trigger = GsonParser.parseInt(jsonObject.get("trigger"));
		deliveryPriority = GsonParser.parseInt(jsonObject.get("deliveryPriority"));
		deliveryStatus = StorageProfileDeliveryStatus.get(GsonParser.parseInt(jsonObject.get("deliveryStatus")));
		readyBehavior = StorageProfileReadyBehavior.get(GsonParser.parseInt(jsonObject.get("readyBehavior")));
		allowAutoDelete = GsonParser.parseInt(jsonObject.get("allowAutoDelete"));
		createFileLink = GsonParser.parseBoolean(jsonObject.get("createFileLink"));
		rules = GsonParser.parseArray(jsonObject.getAsJsonArray("rules"), Rule.class);
		deliveryProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryProfileIds"), KeyValue.class);
		privateKey = GsonParser.parseString(jsonObject.get("privateKey"));
		publicKey = GsonParser.parseString(jsonObject.get("publicKey"));
		passPhrase = GsonParser.parseString(jsonObject.get("passPhrase"));
		shouldExportThumbs = GsonParser.parseBoolean(jsonObject.get("shouldExportThumbs"));
		packagerUrl = GsonParser.parseString(jsonObject.get("packagerUrl"));
		exportPeriodically = GsonParser.parseBoolean(jsonObject.get("exportPeriodically"));
		excludedFlavorParamsIds = GsonParser.parseString(jsonObject.get("excludedFlavorParamsIds"));
		shouldExportCaptions = GsonParser.parseBoolean(jsonObject.get("shouldExportCaptions"));
		excludedEntryTypes = GsonParser.parseString(jsonObject.get("excludedEntryTypes"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStorageProfile");
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("desciption", this.desciption);
		kparams.add("status", this.status);
		kparams.add("protocol", this.protocol);
		kparams.add("storageUrl", this.storageUrl);
		kparams.add("storageBaseDir", this.storageBaseDir);
		kparams.add("pathPrefix", this.pathPrefix);
		kparams.add("storageUsername", this.storageUsername);
		kparams.add("storagePassword", this.storagePassword);
		kparams.add("storageFtpPassiveMode", this.storageFtpPassiveMode);
		kparams.add("minFileSize", this.minFileSize);
		kparams.add("maxFileSize", this.maxFileSize);
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		kparams.add("maxConcurrentConnections", this.maxConcurrentConnections);
		kparams.add("pathManagerClass", this.pathManagerClass);
		kparams.add("pathManagerParams", this.pathManagerParams);
		kparams.add("trigger", this.trigger);
		kparams.add("deliveryPriority", this.deliveryPriority);
		kparams.add("deliveryStatus", this.deliveryStatus);
		kparams.add("readyBehavior", this.readyBehavior);
		kparams.add("allowAutoDelete", this.allowAutoDelete);
		kparams.add("createFileLink", this.createFileLink);
		kparams.add("rules", this.rules);
		kparams.add("deliveryProfileIds", this.deliveryProfileIds);
		kparams.add("privateKey", this.privateKey);
		kparams.add("publicKey", this.publicKey);
		kparams.add("passPhrase", this.passPhrase);
		kparams.add("shouldExportThumbs", this.shouldExportThumbs);
		kparams.add("packagerUrl", this.packagerUrl);
		kparams.add("exportPeriodically", this.exportPeriodically);
		kparams.add("excludedFlavorParamsIds", this.excludedFlavorParamsIds);
		kparams.add("shouldExportCaptions", this.shouldExportCaptions);
		kparams.add("excludedEntryTypes", this.excludedEntryTypes);
		return kparams;
	}


    public static final Creator<StorageProfile> CREATOR = new Creator<StorageProfile>() {
        @Override
        public StorageProfile createFromParcel(Parcel source) {
            return new StorageProfile(source);
        }

        @Override
        public StorageProfile[] newArray(int size) {
            return new StorageProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeValue(this.partnerId);
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeString(this.desciption);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.protocol == null ? -1 : this.protocol.ordinal());
        dest.writeString(this.storageUrl);
        dest.writeString(this.storageBaseDir);
        dest.writeString(this.pathPrefix);
        dest.writeString(this.storageUsername);
        dest.writeString(this.storagePassword);
        dest.writeValue(this.storageFtpPassiveMode);
        dest.writeValue(this.minFileSize);
        dest.writeValue(this.maxFileSize);
        dest.writeString(this.flavorParamsIds);
        dest.writeValue(this.maxConcurrentConnections);
        dest.writeString(this.pathManagerClass);
        if(this.pathManagerParams != null) {
            dest.writeInt(this.pathManagerParams.size());
            dest.writeList(this.pathManagerParams);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.trigger);
        dest.writeValue(this.deliveryPriority);
        dest.writeInt(this.deliveryStatus == null ? -1 : this.deliveryStatus.ordinal());
        dest.writeInt(this.readyBehavior == null ? -1 : this.readyBehavior.ordinal());
        dest.writeValue(this.allowAutoDelete);
        dest.writeValue(this.createFileLink);
        if(this.rules != null) {
            dest.writeInt(this.rules.size());
            dest.writeList(this.rules);
        } else {
            dest.writeInt(-1);
        }
        if(this.deliveryProfileIds != null) {
            dest.writeInt(this.deliveryProfileIds.size());
            dest.writeList(this.deliveryProfileIds);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.privateKey);
        dest.writeString(this.publicKey);
        dest.writeString(this.passPhrase);
        dest.writeValue(this.shouldExportThumbs);
        dest.writeString(this.packagerUrl);
        dest.writeValue(this.exportPeriodically);
        dest.writeString(this.excludedFlavorParamsIds);
        dest.writeValue(this.shouldExportCaptions);
        dest.writeString(this.excludedEntryTypes);
    }

    public StorageProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.systemName = in.readString();
        this.desciption = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : StorageProfileStatus.values()[tmpStatus];
        int tmpProtocol = in.readInt();
        this.protocol = tmpProtocol == -1 ? null : StorageProfileProtocol.values()[tmpProtocol];
        this.storageUrl = in.readString();
        this.storageBaseDir = in.readString();
        this.pathPrefix = in.readString();
        this.storageUsername = in.readString();
        this.storagePassword = in.readString();
        this.storageFtpPassiveMode = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.minFileSize = (Integer)in.readValue(Integer.class.getClassLoader());
        this.maxFileSize = (Integer)in.readValue(Integer.class.getClassLoader());
        this.flavorParamsIds = in.readString();
        this.maxConcurrentConnections = (Integer)in.readValue(Integer.class.getClassLoader());
        this.pathManagerClass = in.readString();
        int pathManagerParamsSize = in.readInt();
        if( pathManagerParamsSize > -1) {
            this.pathManagerParams = new ArrayList<>();
            in.readList(this.pathManagerParams, KeyValue.class.getClassLoader());
        }
        this.trigger = (Integer)in.readValue(Integer.class.getClassLoader());
        this.deliveryPriority = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpDeliveryStatus = in.readInt();
        this.deliveryStatus = tmpDeliveryStatus == -1 ? null : StorageProfileDeliveryStatus.values()[tmpDeliveryStatus];
        int tmpReadyBehavior = in.readInt();
        this.readyBehavior = tmpReadyBehavior == -1 ? null : StorageProfileReadyBehavior.values()[tmpReadyBehavior];
        this.allowAutoDelete = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createFileLink = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int rulesSize = in.readInt();
        if( rulesSize > -1) {
            this.rules = new ArrayList<>();
            in.readList(this.rules, Rule.class.getClassLoader());
        }
        int deliveryProfileIdsSize = in.readInt();
        if( deliveryProfileIdsSize > -1) {
            this.deliveryProfileIds = new ArrayList<>();
            in.readList(this.deliveryProfileIds, KeyValue.class.getClassLoader());
        }
        this.privateKey = in.readString();
        this.publicKey = in.readString();
        this.passPhrase = in.readString();
        this.shouldExportThumbs = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.packagerUrl = in.readString();
        this.exportPeriodically = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.excludedFlavorParamsIds = in.readString();
        this.shouldExportCaptions = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.excludedEntryTypes = in.readString();
    }
}

