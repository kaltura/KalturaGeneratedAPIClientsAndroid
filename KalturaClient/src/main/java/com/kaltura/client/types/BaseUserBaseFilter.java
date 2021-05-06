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
import com.kaltura.client.enums.UserStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseUserBaseFilter.Tokenizer.class)
public abstract class BaseUserBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String partnerIdEqual();
		String screenNameLike();
		String screenNameStartsWith();
		String emailLike();
		String emailStartsWith();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String statusEqual();
		String statusIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
	}

	private Integer partnerIdEqual;
	private String screenNameLike;
	private String screenNameStartsWith;
	private String emailLike;
	private String emailStartsWith;
	private String tagsMultiLikeOr;
	private String tagsMultiLikeAnd;
	private UserStatus statusEqual;
	private String statusIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// screenNameLike:
	public String getScreenNameLike(){
		return this.screenNameLike;
	}
	public void setScreenNameLike(String screenNameLike){
		this.screenNameLike = screenNameLike;
	}

	public void screenNameLike(String multirequestToken){
		setToken("screenNameLike", multirequestToken);
	}

	// screenNameStartsWith:
	public String getScreenNameStartsWith(){
		return this.screenNameStartsWith;
	}
	public void setScreenNameStartsWith(String screenNameStartsWith){
		this.screenNameStartsWith = screenNameStartsWith;
	}

	public void screenNameStartsWith(String multirequestToken){
		setToken("screenNameStartsWith", multirequestToken);
	}

	// emailLike:
	public String getEmailLike(){
		return this.emailLike;
	}
	public void setEmailLike(String emailLike){
		this.emailLike = emailLike;
	}

	public void emailLike(String multirequestToken){
		setToken("emailLike", multirequestToken);
	}

	// emailStartsWith:
	public String getEmailStartsWith(){
		return this.emailStartsWith;
	}
	public void setEmailStartsWith(String emailStartsWith){
		this.emailStartsWith = emailStartsWith;
	}

	public void emailStartsWith(String multirequestToken){
		setToken("emailStartsWith", multirequestToken);
	}

	// tagsMultiLikeOr:
	public String getTagsMultiLikeOr(){
		return this.tagsMultiLikeOr;
	}
	public void setTagsMultiLikeOr(String tagsMultiLikeOr){
		this.tagsMultiLikeOr = tagsMultiLikeOr;
	}

	public void tagsMultiLikeOr(String multirequestToken){
		setToken("tagsMultiLikeOr", multirequestToken);
	}

	// tagsMultiLikeAnd:
	public String getTagsMultiLikeAnd(){
		return this.tagsMultiLikeAnd;
	}
	public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
		this.tagsMultiLikeAnd = tagsMultiLikeAnd;
	}

	public void tagsMultiLikeAnd(String multirequestToken){
		setToken("tagsMultiLikeAnd", multirequestToken);
	}

	// statusEqual:
	public UserStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(UserStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}


	public BaseUserBaseFilter() {
		super();
	}

	public BaseUserBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		screenNameLike = GsonParser.parseString(jsonObject.get("screenNameLike"));
		screenNameStartsWith = GsonParser.parseString(jsonObject.get("screenNameStartsWith"));
		emailLike = GsonParser.parseString(jsonObject.get("emailLike"));
		emailStartsWith = GsonParser.parseString(jsonObject.get("emailStartsWith"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		statusEqual = UserStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseUserBaseFilter");
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("screenNameLike", this.screenNameLike);
		kparams.add("screenNameStartsWith", this.screenNameStartsWith);
		kparams.add("emailLike", this.emailLike);
		kparams.add("emailStartsWith", this.emailStartsWith);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.partnerIdEqual);
        dest.writeString(this.screenNameLike);
        dest.writeString(this.screenNameStartsWith);
        dest.writeString(this.emailLike);
        dest.writeString(this.emailStartsWith);
        dest.writeString(this.tagsMultiLikeOr);
        dest.writeString(this.tagsMultiLikeAnd);
        dest.writeInt(this.statusEqual == null ? -1 : this.statusEqual.ordinal());
        dest.writeString(this.statusIn);
        dest.writeValue(this.createdAtGreaterThanOrEqual);
        dest.writeValue(this.createdAtLessThanOrEqual);
        dest.writeValue(this.updatedAtGreaterThanOrEqual);
        dest.writeValue(this.updatedAtLessThanOrEqual);
    }

    public BaseUserBaseFilter(Parcel in) {
        super(in);
        this.partnerIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.screenNameLike = in.readString();
        this.screenNameStartsWith = in.readString();
        this.emailLike = in.readString();
        this.emailStartsWith = in.readString();
        this.tagsMultiLikeOr = in.readString();
        this.tagsMultiLikeAnd = in.readString();
        int tmpStatusEqual = in.readInt();
        this.statusEqual = tmpStatusEqual == -1 ? null : UserStatus.values()[tmpStatusEqual];
        this.statusIn = in.readString();
        this.createdAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

