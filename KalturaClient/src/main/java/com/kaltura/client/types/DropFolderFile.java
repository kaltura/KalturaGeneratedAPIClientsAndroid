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
import com.kaltura.client.enums.DropFolderFileErrorCode;
import com.kaltura.client.enums.DropFolderFileStatus;
import com.kaltura.client.enums.DropFolderType;
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
@MultiRequestBuilder.Tokenizer(DropFolderFile.Tokenizer.class)
public class DropFolderFile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String dropFolderId();
		String fileName();
		String fileSize();
		String fileSizeLastSetAt();
		String status();
		String type();
		String parsedSlug();
		String parsedFlavor();
		String parsedUserId();
		String leadDropFolderFileId();
		String deletedDropFolderFileId();
		String entryId();
		String errorCode();
		String errorDescription();
		String lastModificationTime();
		String createdAt();
		String updatedAt();
		String uploadStartDetectedAt();
		String uploadEndDetectedAt();
		String importStartedAt();
		String importEndedAt();
		String batchJobId();
	}

	private Integer id;
	private Integer partnerId;
	private Integer dropFolderId;
	private String fileName;
	private Double fileSize;
	private Integer fileSizeLastSetAt;
	private DropFolderFileStatus status;
	private DropFolderType type;
	private String parsedSlug;
	private String parsedFlavor;
	private String parsedUserId;
	private Integer leadDropFolderFileId;
	private Integer deletedDropFolderFileId;
	private String entryId;
	private DropFolderFileErrorCode errorCode;
	private String errorDescription;
	private String lastModificationTime;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer uploadStartDetectedAt;
	private Integer uploadEndDetectedAt;
	private Integer importStartedAt;
	private Integer importEndedAt;
	private Integer batchJobId;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// dropFolderId:
	public Integer getDropFolderId(){
		return this.dropFolderId;
	}
	public void setDropFolderId(Integer dropFolderId){
		this.dropFolderId = dropFolderId;
	}

	public void dropFolderId(String multirequestToken){
		setToken("dropFolderId", multirequestToken);
	}

	// fileName:
	public String getFileName(){
		return this.fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public void fileName(String multirequestToken){
		setToken("fileName", multirequestToken);
	}

	// fileSize:
	public Double getFileSize(){
		return this.fileSize;
	}
	public void setFileSize(Double fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}

	// fileSizeLastSetAt:
	public Integer getFileSizeLastSetAt(){
		return this.fileSizeLastSetAt;
	}
	// status:
	public DropFolderFileStatus getStatus(){
		return this.status;
	}
	// type:
	public DropFolderType getType(){
		return this.type;
	}
	// parsedSlug:
	public String getParsedSlug(){
		return this.parsedSlug;
	}
	public void setParsedSlug(String parsedSlug){
		this.parsedSlug = parsedSlug;
	}

	public void parsedSlug(String multirequestToken){
		setToken("parsedSlug", multirequestToken);
	}

	// parsedFlavor:
	public String getParsedFlavor(){
		return this.parsedFlavor;
	}
	public void setParsedFlavor(String parsedFlavor){
		this.parsedFlavor = parsedFlavor;
	}

	public void parsedFlavor(String multirequestToken){
		setToken("parsedFlavor", multirequestToken);
	}

	// parsedUserId:
	public String getParsedUserId(){
		return this.parsedUserId;
	}
	public void setParsedUserId(String parsedUserId){
		this.parsedUserId = parsedUserId;
	}

	public void parsedUserId(String multirequestToken){
		setToken("parsedUserId", multirequestToken);
	}

	// leadDropFolderFileId:
	public Integer getLeadDropFolderFileId(){
		return this.leadDropFolderFileId;
	}
	public void setLeadDropFolderFileId(Integer leadDropFolderFileId){
		this.leadDropFolderFileId = leadDropFolderFileId;
	}

	public void leadDropFolderFileId(String multirequestToken){
		setToken("leadDropFolderFileId", multirequestToken);
	}

	// deletedDropFolderFileId:
	public Integer getDeletedDropFolderFileId(){
		return this.deletedDropFolderFileId;
	}
	public void setDeletedDropFolderFileId(Integer deletedDropFolderFileId){
		this.deletedDropFolderFileId = deletedDropFolderFileId;
	}

	public void deletedDropFolderFileId(String multirequestToken){
		setToken("deletedDropFolderFileId", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// errorCode:
	public DropFolderFileErrorCode getErrorCode(){
		return this.errorCode;
	}
	public void setErrorCode(DropFolderFileErrorCode errorCode){
		this.errorCode = errorCode;
	}

	public void errorCode(String multirequestToken){
		setToken("errorCode", multirequestToken);
	}

	// errorDescription:
	public String getErrorDescription(){
		return this.errorDescription;
	}
	public void setErrorDescription(String errorDescription){
		this.errorDescription = errorDescription;
	}

	public void errorDescription(String multirequestToken){
		setToken("errorDescription", multirequestToken);
	}

	// lastModificationTime:
	public String getLastModificationTime(){
		return this.lastModificationTime;
	}
	public void setLastModificationTime(String lastModificationTime){
		this.lastModificationTime = lastModificationTime;
	}

	public void lastModificationTime(String multirequestToken){
		setToken("lastModificationTime", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// uploadStartDetectedAt:
	public Integer getUploadStartDetectedAt(){
		return this.uploadStartDetectedAt;
	}
	public void setUploadStartDetectedAt(Integer uploadStartDetectedAt){
		this.uploadStartDetectedAt = uploadStartDetectedAt;
	}

	public void uploadStartDetectedAt(String multirequestToken){
		setToken("uploadStartDetectedAt", multirequestToken);
	}

	// uploadEndDetectedAt:
	public Integer getUploadEndDetectedAt(){
		return this.uploadEndDetectedAt;
	}
	public void setUploadEndDetectedAt(Integer uploadEndDetectedAt){
		this.uploadEndDetectedAt = uploadEndDetectedAt;
	}

	public void uploadEndDetectedAt(String multirequestToken){
		setToken("uploadEndDetectedAt", multirequestToken);
	}

	// importStartedAt:
	public Integer getImportStartedAt(){
		return this.importStartedAt;
	}
	public void setImportStartedAt(Integer importStartedAt){
		this.importStartedAt = importStartedAt;
	}

	public void importStartedAt(String multirequestToken){
		setToken("importStartedAt", multirequestToken);
	}

	// importEndedAt:
	public Integer getImportEndedAt(){
		return this.importEndedAt;
	}
	public void setImportEndedAt(Integer importEndedAt){
		this.importEndedAt = importEndedAt;
	}

	public void importEndedAt(String multirequestToken){
		setToken("importEndedAt", multirequestToken);
	}

	// batchJobId:
	public Integer getBatchJobId(){
		return this.batchJobId;
	}

	public DropFolderFile() {
		super();
	}

	public DropFolderFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		dropFolderId = GsonParser.parseInt(jsonObject.get("dropFolderId"));
		fileName = GsonParser.parseString(jsonObject.get("fileName"));
		fileSize = GsonParser.parseDouble(jsonObject.get("fileSize"));
		fileSizeLastSetAt = GsonParser.parseInt(jsonObject.get("fileSizeLastSetAt"));
		status = DropFolderFileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		type = DropFolderType.get(GsonParser.parseString(jsonObject.get("type")));
		parsedSlug = GsonParser.parseString(jsonObject.get("parsedSlug"));
		parsedFlavor = GsonParser.parseString(jsonObject.get("parsedFlavor"));
		parsedUserId = GsonParser.parseString(jsonObject.get("parsedUserId"));
		leadDropFolderFileId = GsonParser.parseInt(jsonObject.get("leadDropFolderFileId"));
		deletedDropFolderFileId = GsonParser.parseInt(jsonObject.get("deletedDropFolderFileId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		errorCode = DropFolderFileErrorCode.get(GsonParser.parseString(jsonObject.get("errorCode")));
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));
		lastModificationTime = GsonParser.parseString(jsonObject.get("lastModificationTime"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		uploadStartDetectedAt = GsonParser.parseInt(jsonObject.get("uploadStartDetectedAt"));
		uploadEndDetectedAt = GsonParser.parseInt(jsonObject.get("uploadEndDetectedAt"));
		importStartedAt = GsonParser.parseInt(jsonObject.get("importStartedAt"));
		importEndedAt = GsonParser.parseInt(jsonObject.get("importEndedAt"));
		batchJobId = GsonParser.parseInt(jsonObject.get("batchJobId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderFile");
		kparams.add("dropFolderId", this.dropFolderId);
		kparams.add("fileName", this.fileName);
		kparams.add("fileSize", this.fileSize);
		kparams.add("parsedSlug", this.parsedSlug);
		kparams.add("parsedFlavor", this.parsedFlavor);
		kparams.add("parsedUserId", this.parsedUserId);
		kparams.add("leadDropFolderFileId", this.leadDropFolderFileId);
		kparams.add("deletedDropFolderFileId", this.deletedDropFolderFileId);
		kparams.add("entryId", this.entryId);
		kparams.add("errorCode", this.errorCode);
		kparams.add("errorDescription", this.errorDescription);
		kparams.add("lastModificationTime", this.lastModificationTime);
		kparams.add("uploadStartDetectedAt", this.uploadStartDetectedAt);
		kparams.add("uploadEndDetectedAt", this.uploadEndDetectedAt);
		kparams.add("importStartedAt", this.importStartedAt);
		kparams.add("importEndedAt", this.importEndedAt);
		return kparams;
	}


    public static final Creator<DropFolderFile> CREATOR = new Creator<DropFolderFile>() {
        @Override
        public DropFolderFile createFromParcel(Parcel source) {
            return new DropFolderFile(source);
        }

        @Override
        public DropFolderFile[] newArray(int size) {
            return new DropFolderFile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.dropFolderId);
        dest.writeString(this.fileName);
        dest.writeValue(this.fileSize);
        dest.writeValue(this.fileSizeLastSetAt);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeString(this.parsedSlug);
        dest.writeString(this.parsedFlavor);
        dest.writeString(this.parsedUserId);
        dest.writeValue(this.leadDropFolderFileId);
        dest.writeValue(this.deletedDropFolderFileId);
        dest.writeString(this.entryId);
        dest.writeInt(this.errorCode == null ? -1 : this.errorCode.ordinal());
        dest.writeString(this.errorDescription);
        dest.writeString(this.lastModificationTime);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeValue(this.uploadStartDetectedAt);
        dest.writeValue(this.uploadEndDetectedAt);
        dest.writeValue(this.importStartedAt);
        dest.writeValue(this.importEndedAt);
        dest.writeValue(this.batchJobId);
    }

    public DropFolderFile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.dropFolderId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.fileName = in.readString();
        this.fileSize = (Double)in.readValue(Double.class.getClassLoader());
        this.fileSizeLastSetAt = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : DropFolderFileStatus.values()[tmpStatus];
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : DropFolderType.values()[tmpType];
        this.parsedSlug = in.readString();
        this.parsedFlavor = in.readString();
        this.parsedUserId = in.readString();
        this.leadDropFolderFileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.deletedDropFolderFileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryId = in.readString();
        int tmpErrorCode = in.readInt();
        this.errorCode = tmpErrorCode == -1 ? null : DropFolderFileErrorCode.values()[tmpErrorCode];
        this.errorDescription = in.readString();
        this.lastModificationTime = in.readString();
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.uploadStartDetectedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.uploadEndDetectedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.importStartedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.importEndedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.batchJobId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

