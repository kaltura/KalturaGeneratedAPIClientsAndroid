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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * JobData representing the static receipient array
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EmailNotificationStaticRecipientJobData.Tokenizer.class)
public class EmailNotificationStaticRecipientJobData extends EmailNotificationRecipientJobData {
	
	public interface Tokenizer extends EmailNotificationRecipientJobData.Tokenizer {
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> emailRecipients();
	}

	/**
	 * Email to emails and names
	 */
	private List<KeyValue> emailRecipients;

	// emailRecipients:
	public List<KeyValue> getEmailRecipients(){
		return this.emailRecipients;
	}
	public void setEmailRecipients(List<KeyValue> emailRecipients){
		this.emailRecipients = emailRecipients;
	}


	public EmailNotificationStaticRecipientJobData() {
		super();
	}

	public EmailNotificationStaticRecipientJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		emailRecipients = GsonParser.parseArray(jsonObject.getAsJsonArray("emailRecipients"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailNotificationStaticRecipientJobData");
		kparams.add("emailRecipients", this.emailRecipients);
		return kparams;
	}


    public static final Creator<EmailNotificationStaticRecipientJobData> CREATOR = new Creator<EmailNotificationStaticRecipientJobData>() {
        @Override
        public EmailNotificationStaticRecipientJobData createFromParcel(Parcel source) {
            return new EmailNotificationStaticRecipientJobData(source);
        }

        @Override
        public EmailNotificationStaticRecipientJobData[] newArray(int size) {
            return new EmailNotificationStaticRecipientJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.emailRecipients != null) {
            dest.writeInt(this.emailRecipients.size());
            dest.writeList(this.emailRecipients);
        } else {
            dest.writeInt(-1);
        }
    }

    public EmailNotificationStaticRecipientJobData(Parcel in) {
        super(in);
        int emailRecipientsSize = in.readInt();
        if( emailRecipientsSize > -1) {
            this.emailRecipients = new ArrayList<>();
            in.readList(this.emailRecipients, KeyValue.class.getClassLoader());
        }
    }
}

