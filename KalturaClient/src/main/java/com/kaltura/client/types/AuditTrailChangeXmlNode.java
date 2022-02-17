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
import com.kaltura.client.enums.AuditTrailChangeXmlNodeType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AuditTrailChangeXmlNode.Tokenizer.class)
public class AuditTrailChangeXmlNode extends AuditTrailChangeItem {
	
	public interface Tokenizer extends AuditTrailChangeItem.Tokenizer {
		String type();
	}

	private AuditTrailChangeXmlNodeType type;

	// type:
	public AuditTrailChangeXmlNodeType getType(){
		return this.type;
	}
	public void setType(AuditTrailChangeXmlNodeType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}


	public AuditTrailChangeXmlNode() {
		super();
	}

	public AuditTrailChangeXmlNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = AuditTrailChangeXmlNodeType.get(GsonParser.parseInt(jsonObject.get("type")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuditTrailChangeXmlNode");
		kparams.add("type", this.type);
		return kparams;
	}


    public static final Creator<AuditTrailChangeXmlNode> CREATOR = new Creator<AuditTrailChangeXmlNode>() {
        @Override
        public AuditTrailChangeXmlNode createFromParcel(Parcel source) {
            return new AuditTrailChangeXmlNode(source);
        }

        @Override
        public AuditTrailChangeXmlNode[] newArray(int size) {
            return new AuditTrailChangeXmlNode[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    public AuditTrailChangeXmlNode(Parcel in) {
        super(in);
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : AuditTrailChangeXmlNodeType.values()[tmpType];
    }
}

