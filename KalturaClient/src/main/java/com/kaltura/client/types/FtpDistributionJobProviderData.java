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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FtpDistributionJobProviderData.Tokenizer.class)
public class FtpDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		RequestBuilder.ListTokenizer<FtpDistributionFile.Tokenizer> filesForDistribution();
	}

	private List<FtpDistributionFile> filesForDistribution;

	// filesForDistribution:
	public List<FtpDistributionFile> getFilesForDistribution(){
		return this.filesForDistribution;
	}
	public void setFilesForDistribution(List<FtpDistributionFile> filesForDistribution){
		this.filesForDistribution = filesForDistribution;
	}


	public FtpDistributionJobProviderData() {
		super();
	}

	public FtpDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filesForDistribution = GsonParser.parseArray(jsonObject.getAsJsonArray("filesForDistribution"), FtpDistributionFile.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFtpDistributionJobProviderData");
		kparams.add("filesForDistribution", this.filesForDistribution);
		return kparams;
	}


    public static final Creator<FtpDistributionJobProviderData> CREATOR = new Creator<FtpDistributionJobProviderData>() {
        @Override
        public FtpDistributionJobProviderData createFromParcel(Parcel source) {
            return new FtpDistributionJobProviderData(source);
        }

        @Override
        public FtpDistributionJobProviderData[] newArray(int size) {
            return new FtpDistributionJobProviderData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.filesForDistribution != null) {
            dest.writeInt(this.filesForDistribution.size());
            dest.writeList(this.filesForDistribution);
        } else {
            dest.writeInt(-1);
        }
    }

    public FtpDistributionJobProviderData(Parcel in) {
        super(in);
        int filesForDistributionSize = in.readInt();
        if( filesForDistributionSize > -1) {
            this.filesForDistribution = new ArrayList<>();
            in.readList(this.filesForDistribution, FtpDistributionFile.class.getClassLoader());
        }
    }
}

