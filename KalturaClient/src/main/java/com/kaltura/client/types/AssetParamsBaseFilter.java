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
// Copyright (C) 2006-2020  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetParamsBaseFilter.Tokenizer.class)
public abstract class AssetParamsBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String systemNameEqual();
		String systemNameIn();
		String isSystemDefaultEqual();
		String tagsEqual();
	}

	private Integer idEqual;
	private String idIn;
	private String systemNameEqual;
	private String systemNameIn;
	private Boolean isSystemDefaultEqual;
	private String tagsEqual;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// systemNameEqual:
	public String getSystemNameEqual(){
		return this.systemNameEqual;
	}
	public void setSystemNameEqual(String systemNameEqual){
		this.systemNameEqual = systemNameEqual;
	}

	public void systemNameEqual(String multirequestToken){
		setToken("systemNameEqual", multirequestToken);
	}

	// systemNameIn:
	public String getSystemNameIn(){
		return this.systemNameIn;
	}
	public void setSystemNameIn(String systemNameIn){
		this.systemNameIn = systemNameIn;
	}

	public void systemNameIn(String multirequestToken){
		setToken("systemNameIn", multirequestToken);
	}

	// isSystemDefaultEqual:
	public Boolean getIsSystemDefaultEqual(){
		return this.isSystemDefaultEqual;
	}
	public void setIsSystemDefaultEqual(Boolean isSystemDefaultEqual){
		this.isSystemDefaultEqual = isSystemDefaultEqual;
	}

	public void isSystemDefaultEqual(String multirequestToken){
		setToken("isSystemDefaultEqual", multirequestToken);
	}

	// tagsEqual:
	public String getTagsEqual(){
		return this.tagsEqual;
	}
	public void setTagsEqual(String tagsEqual){
		this.tagsEqual = tagsEqual;
	}

	public void tagsEqual(String multirequestToken){
		setToken("tagsEqual", multirequestToken);
	}


	public AssetParamsBaseFilter() {
		super();
	}

	public AssetParamsBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
		isSystemDefaultEqual = GsonParser.parseBoolean(jsonObject.get("isSystemDefaultEqual"));
		tagsEqual = GsonParser.parseString(jsonObject.get("tagsEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetParamsBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		kparams.add("isSystemDefaultEqual", this.isSystemDefaultEqual);
		kparams.add("tagsEqual", this.tagsEqual);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.idEqual);
        dest.writeString(this.idIn);
        dest.writeString(this.systemNameEqual);
        dest.writeString(this.systemNameIn);
        dest.writeValue(this.isSystemDefaultEqual);
        dest.writeString(this.tagsEqual);
    }

    public AssetParamsBaseFilter(Parcel in) {
        super(in);
        this.idEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.idIn = in.readString();
        this.systemNameEqual = in.readString();
        this.systemNameIn = in.readString();
        this.isSystemDefaultEqual = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.tagsEqual = in.readString();
    }
}

