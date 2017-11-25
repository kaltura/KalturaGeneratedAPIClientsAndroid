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
import com.kaltura.client.enums.BaseEntryCloneOptions;
import com.kaltura.client.enums.CloneComponentSelectorType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseEntryCloneOptionComponent.Tokenizer.class)
public class BaseEntryCloneOptionComponent extends BaseEntryCloneOptionItem {
	
	public interface Tokenizer extends BaseEntryCloneOptionItem.Tokenizer {
		String itemType();
		String rule();
	}

	private BaseEntryCloneOptions itemType;
	/**
	 * condition rule (include/exclude)
	 */
	private CloneComponentSelectorType rule;

	// itemType:
	public BaseEntryCloneOptions getItemType(){
		return this.itemType;
	}
	public void setItemType(BaseEntryCloneOptions itemType){
		this.itemType = itemType;
	}

	public void itemType(String multirequestToken){
		setToken("itemType", multirequestToken);
	}

	// rule:
	public CloneComponentSelectorType getRule(){
		return this.rule;
	}
	public void setRule(CloneComponentSelectorType rule){
		this.rule = rule;
	}

	public void rule(String multirequestToken){
		setToken("rule", multirequestToken);
	}


	public BaseEntryCloneOptionComponent() {
		super();
	}

	public BaseEntryCloneOptionComponent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		itemType = BaseEntryCloneOptions.get(GsonParser.parseString(jsonObject.get("itemType")));
		rule = CloneComponentSelectorType.get(GsonParser.parseString(jsonObject.get("rule")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseEntryCloneOptionComponent");
		kparams.add("itemType", this.itemType);
		kparams.add("rule", this.rule);
		return kparams;
	}


    public static final Creator<BaseEntryCloneOptionComponent> CREATOR = new Creator<BaseEntryCloneOptionComponent>() {
        @Override
        public BaseEntryCloneOptionComponent createFromParcel(Parcel source) {
            return new BaseEntryCloneOptionComponent(source);
        }

        @Override
        public BaseEntryCloneOptionComponent[] newArray(int size) {
            return new BaseEntryCloneOptionComponent[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.itemType == null ? -1 : this.itemType.ordinal());
        dest.writeInt(this.rule == null ? -1 : this.rule.ordinal());
    }

    public BaseEntryCloneOptionComponent(Parcel in) {
        super(in);
        int tmpItemType = in.readInt();
        this.itemType = tmpItemType == -1 ? null : BaseEntryCloneOptions.values()[tmpItemType];
        int tmpRule = in.readInt();
        this.rule = tmpRule == -1 ? null : CloneComponentSelectorType.values()[tmpRule];
    }
}

