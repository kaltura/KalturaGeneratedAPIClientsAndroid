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
@MultiRequestBuilder.Tokenizer(CategoryUserAdvancedFilter.Tokenizer.class)
public class CategoryUserAdvancedFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String memberIdEq();
		String memberIdIn();
		String memberPermissionsMatchOr();
		String memberPermissionsMatchAnd();
	}

	private String memberIdEq;
	private String memberIdIn;
	private String memberPermissionsMatchOr;
	private String memberPermissionsMatchAnd;

	// memberIdEq:
	public String getMemberIdEq(){
		return this.memberIdEq;
	}
	public void setMemberIdEq(String memberIdEq){
		this.memberIdEq = memberIdEq;
	}

	public void memberIdEq(String multirequestToken){
		setToken("memberIdEq", multirequestToken);
	}

	// memberIdIn:
	public String getMemberIdIn(){
		return this.memberIdIn;
	}
	public void setMemberIdIn(String memberIdIn){
		this.memberIdIn = memberIdIn;
	}

	public void memberIdIn(String multirequestToken){
		setToken("memberIdIn", multirequestToken);
	}

	// memberPermissionsMatchOr:
	public String getMemberPermissionsMatchOr(){
		return this.memberPermissionsMatchOr;
	}
	public void setMemberPermissionsMatchOr(String memberPermissionsMatchOr){
		this.memberPermissionsMatchOr = memberPermissionsMatchOr;
	}

	public void memberPermissionsMatchOr(String multirequestToken){
		setToken("memberPermissionsMatchOr", multirequestToken);
	}

	// memberPermissionsMatchAnd:
	public String getMemberPermissionsMatchAnd(){
		return this.memberPermissionsMatchAnd;
	}
	public void setMemberPermissionsMatchAnd(String memberPermissionsMatchAnd){
		this.memberPermissionsMatchAnd = memberPermissionsMatchAnd;
	}

	public void memberPermissionsMatchAnd(String multirequestToken){
		setToken("memberPermissionsMatchAnd", multirequestToken);
	}


	public CategoryUserAdvancedFilter() {
		super();
	}

	public CategoryUserAdvancedFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		memberIdEq = GsonParser.parseString(jsonObject.get("memberIdEq"));
		memberIdIn = GsonParser.parseString(jsonObject.get("memberIdIn"));
		memberPermissionsMatchOr = GsonParser.parseString(jsonObject.get("memberPermissionsMatchOr"));
		memberPermissionsMatchAnd = GsonParser.parseString(jsonObject.get("memberPermissionsMatchAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryUserAdvancedFilter");
		kparams.add("memberIdEq", this.memberIdEq);
		kparams.add("memberIdIn", this.memberIdIn);
		kparams.add("memberPermissionsMatchOr", this.memberPermissionsMatchOr);
		kparams.add("memberPermissionsMatchAnd", this.memberPermissionsMatchAnd);
		return kparams;
	}


    public static final Creator<CategoryUserAdvancedFilter> CREATOR = new Creator<CategoryUserAdvancedFilter>() {
        @Override
        public CategoryUserAdvancedFilter createFromParcel(Parcel source) {
            return new CategoryUserAdvancedFilter(source);
        }

        @Override
        public CategoryUserAdvancedFilter[] newArray(int size) {
            return new CategoryUserAdvancedFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.memberIdEq);
        dest.writeString(this.memberIdIn);
        dest.writeString(this.memberPermissionsMatchOr);
        dest.writeString(this.memberPermissionsMatchAnd);
    }

    public CategoryUserAdvancedFilter(Parcel in) {
        super(in);
        this.memberIdEq = in.readString();
        this.memberIdIn = in.readString();
        this.memberPermissionsMatchOr = in.readString();
        this.memberPermissionsMatchAnd = in.readString();
    }
}

