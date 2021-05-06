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
import com.kaltura.client.enums.FileSyncObjectType;
import com.kaltura.client.enums.FileSyncStatus;
import com.kaltura.client.enums.FileSyncType;
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
@MultiRequestBuilder.Tokenizer(FileSync.Tokenizer.class)
public class FileSync extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String fileObjectType();
		String objectId();
		String version();
		String objectSubType();
		String dc();
		String original();
		String createdAt();
		String updatedAt();
		String readyAt();
		String syncTime();
		String status();
		String fileType();
		String linkedId();
		String linkCount();
		String fileRoot();
		String filePath();
		String fileSize();
		String fileUrl();
		String fileContent();
		String fileDiscSize();
		String isCurrentDc();
		String isDir();
		String originalId();
		String srcPath();
		String srcEncKey();
		String storageClass();
	}

	private Long id;
	private Integer partnerId;
	private FileSyncObjectType fileObjectType;
	private String objectId;
	private String version;
	private Integer objectSubType;
	private String dc;
	private Integer original;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer readyAt;
	private Integer syncTime;
	private FileSyncStatus status;
	private FileSyncType fileType;
	private Integer linkedId;
	private Integer linkCount;
	private String fileRoot;
	private String filePath;
	private Double fileSize;
	private String fileUrl;
	private String fileContent;
	private Double fileDiscSize;
	private Boolean isCurrentDc;
	private Boolean isDir;
	private Integer originalId;
	private String srcPath;
	private String srcEncKey;
	private String storageClass;

	// id:
	public Long getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// fileObjectType:
	public FileSyncObjectType getFileObjectType(){
		return this.fileObjectType;
	}
	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	// version:
	public String getVersion(){
		return this.version;
	}
	// objectSubType:
	public Integer getObjectSubType(){
		return this.objectSubType;
	}
	// dc:
	public String getDc(){
		return this.dc;
	}
	// original:
	public Integer getOriginal(){
		return this.original;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// readyAt:
	public Integer getReadyAt(){
		return this.readyAt;
	}
	// syncTime:
	public Integer getSyncTime(){
		return this.syncTime;
	}
	// status:
	public FileSyncStatus getStatus(){
		return this.status;
	}
	public void setStatus(FileSyncStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// fileType:
	public FileSyncType getFileType(){
		return this.fileType;
	}
	// linkedId:
	public Integer getLinkedId(){
		return this.linkedId;
	}
	// linkCount:
	public Integer getLinkCount(){
		return this.linkCount;
	}
	// fileRoot:
	public String getFileRoot(){
		return this.fileRoot;
	}
	public void setFileRoot(String fileRoot){
		this.fileRoot = fileRoot;
	}

	public void fileRoot(String multirequestToken){
		setToken("fileRoot", multirequestToken);
	}

	// filePath:
	public String getFilePath(){
		return this.filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}

	public void filePath(String multirequestToken){
		setToken("filePath", multirequestToken);
	}

	// fileSize:
	public Double getFileSize(){
		return this.fileSize;
	}
	// fileUrl:
	public String getFileUrl(){
		return this.fileUrl;
	}
	// fileContent:
	public String getFileContent(){
		return this.fileContent;
	}
	// fileDiscSize:
	public Double getFileDiscSize(){
		return this.fileDiscSize;
	}
	// isCurrentDc:
	public Boolean getIsCurrentDc(){
		return this.isCurrentDc;
	}
	// isDir:
	public Boolean getIsDir(){
		return this.isDir;
	}
	// originalId:
	public Integer getOriginalId(){
		return this.originalId;
	}
	// srcPath:
	public String getSrcPath(){
		return this.srcPath;
	}
	public void setSrcPath(String srcPath){
		this.srcPath = srcPath;
	}

	public void srcPath(String multirequestToken){
		setToken("srcPath", multirequestToken);
	}

	// srcEncKey:
	public String getSrcEncKey(){
		return this.srcEncKey;
	}
	public void setSrcEncKey(String srcEncKey){
		this.srcEncKey = srcEncKey;
	}

	public void srcEncKey(String multirequestToken){
		setToken("srcEncKey", multirequestToken);
	}

	// storageClass:
	public String getStorageClass(){
		return this.storageClass;
	}
	public void setStorageClass(String storageClass){
		this.storageClass = storageClass;
	}

	public void storageClass(String multirequestToken){
		setToken("storageClass", multirequestToken);
	}


	public FileSync() {
		super();
	}

	public FileSync(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		fileObjectType = FileSyncObjectType.get(GsonParser.parseString(jsonObject.get("fileObjectType")));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		version = GsonParser.parseString(jsonObject.get("version"));
		objectSubType = GsonParser.parseInt(jsonObject.get("objectSubType"));
		dc = GsonParser.parseString(jsonObject.get("dc"));
		original = GsonParser.parseInt(jsonObject.get("original"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		readyAt = GsonParser.parseInt(jsonObject.get("readyAt"));
		syncTime = GsonParser.parseInt(jsonObject.get("syncTime"));
		status = FileSyncStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		fileType = FileSyncType.get(GsonParser.parseInt(jsonObject.get("fileType")));
		linkedId = GsonParser.parseInt(jsonObject.get("linkedId"));
		linkCount = GsonParser.parseInt(jsonObject.get("linkCount"));
		fileRoot = GsonParser.parseString(jsonObject.get("fileRoot"));
		filePath = GsonParser.parseString(jsonObject.get("filePath"));
		fileSize = GsonParser.parseDouble(jsonObject.get("fileSize"));
		fileUrl = GsonParser.parseString(jsonObject.get("fileUrl"));
		fileContent = GsonParser.parseString(jsonObject.get("fileContent"));
		fileDiscSize = GsonParser.parseDouble(jsonObject.get("fileDiscSize"));
		isCurrentDc = GsonParser.parseBoolean(jsonObject.get("isCurrentDc"));
		isDir = GsonParser.parseBoolean(jsonObject.get("isDir"));
		originalId = GsonParser.parseInt(jsonObject.get("originalId"));
		srcPath = GsonParser.parseString(jsonObject.get("srcPath"));
		srcEncKey = GsonParser.parseString(jsonObject.get("srcEncKey"));
		storageClass = GsonParser.parseString(jsonObject.get("storageClass"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileSync");
		kparams.add("status", this.status);
		kparams.add("fileRoot", this.fileRoot);
		kparams.add("filePath", this.filePath);
		kparams.add("srcPath", this.srcPath);
		kparams.add("srcEncKey", this.srcEncKey);
		kparams.add("storageClass", this.storageClass);
		return kparams;
	}


    public static final Creator<FileSync> CREATOR = new Creator<FileSync>() {
        @Override
        public FileSync createFromParcel(Parcel source) {
            return new FileSync(source);
        }

        @Override
        public FileSync[] newArray(int size) {
            return new FileSync[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeInt(this.fileObjectType == null ? -1 : this.fileObjectType.ordinal());
        dest.writeString(this.objectId);
        dest.writeString(this.version);
        dest.writeValue(this.objectSubType);
        dest.writeString(this.dc);
        dest.writeValue(this.original);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeValue(this.readyAt);
        dest.writeValue(this.syncTime);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.fileType == null ? -1 : this.fileType.ordinal());
        dest.writeValue(this.linkedId);
        dest.writeValue(this.linkCount);
        dest.writeString(this.fileRoot);
        dest.writeString(this.filePath);
        dest.writeValue(this.fileSize);
        dest.writeString(this.fileUrl);
        dest.writeString(this.fileContent);
        dest.writeValue(this.fileDiscSize);
        dest.writeValue(this.isCurrentDc);
        dest.writeValue(this.isDir);
        dest.writeValue(this.originalId);
        dest.writeString(this.srcPath);
        dest.writeString(this.srcEncKey);
        dest.writeString(this.storageClass);
    }

    public FileSync(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpFileObjectType = in.readInt();
        this.fileObjectType = tmpFileObjectType == -1 ? null : FileSyncObjectType.values()[tmpFileObjectType];
        this.objectId = in.readString();
        this.version = in.readString();
        this.objectSubType = (Integer)in.readValue(Integer.class.getClassLoader());
        this.dc = in.readString();
        this.original = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.readyAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.syncTime = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : FileSyncStatus.values()[tmpStatus];
        int tmpFileType = in.readInt();
        this.fileType = tmpFileType == -1 ? null : FileSyncType.values()[tmpFileType];
        this.linkedId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.linkCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.fileRoot = in.readString();
        this.filePath = in.readString();
        this.fileSize = (Double)in.readValue(Double.class.getClassLoader());
        this.fileUrl = in.readString();
        this.fileContent = in.readString();
        this.fileDiscSize = (Double)in.readValue(Double.class.getClassLoader());
        this.isCurrentDc = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.isDir = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.originalId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.srcPath = in.readString();
        this.srcEncKey = in.readString();
        this.storageClass = in.readString();
    }
}

