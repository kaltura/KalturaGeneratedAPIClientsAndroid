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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(Quiz.Tokenizer.class)
public class Quiz extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String version();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> uiAttributes();
		String showResultOnAnswer();
		String showCorrectKeyOnAnswer();
		String allowAnswerUpdate();
		String showCorrectAfterSubmission();
		String allowDownload();
		String showGradeAfterSubmission();
	}

	private Integer version;
	/**
	 * Array of key value ui related objects
	 */
	private List<KeyValue> uiAttributes;
	private Boolean showResultOnAnswer;
	private Boolean showCorrectKeyOnAnswer;
	private Boolean allowAnswerUpdate;
	private Boolean showCorrectAfterSubmission;
	private Boolean allowDownload;
	private Boolean showGradeAfterSubmission;

	// version:
	public Integer getVersion(){
		return this.version;
	}
	// uiAttributes:
	public List<KeyValue> getUiAttributes(){
		return this.uiAttributes;
	}
	public void setUiAttributes(List<KeyValue> uiAttributes){
		this.uiAttributes = uiAttributes;
	}

	// showResultOnAnswer:
	public Boolean getShowResultOnAnswer(){
		return this.showResultOnAnswer;
	}
	public void setShowResultOnAnswer(Boolean showResultOnAnswer){
		this.showResultOnAnswer = showResultOnAnswer;
	}

	public void showResultOnAnswer(String multirequestToken){
		setToken("showResultOnAnswer", multirequestToken);
	}

	// showCorrectKeyOnAnswer:
	public Boolean getShowCorrectKeyOnAnswer(){
		return this.showCorrectKeyOnAnswer;
	}
	public void setShowCorrectKeyOnAnswer(Boolean showCorrectKeyOnAnswer){
		this.showCorrectKeyOnAnswer = showCorrectKeyOnAnswer;
	}

	public void showCorrectKeyOnAnswer(String multirequestToken){
		setToken("showCorrectKeyOnAnswer", multirequestToken);
	}

	// allowAnswerUpdate:
	public Boolean getAllowAnswerUpdate(){
		return this.allowAnswerUpdate;
	}
	public void setAllowAnswerUpdate(Boolean allowAnswerUpdate){
		this.allowAnswerUpdate = allowAnswerUpdate;
	}

	public void allowAnswerUpdate(String multirequestToken){
		setToken("allowAnswerUpdate", multirequestToken);
	}

	// showCorrectAfterSubmission:
	public Boolean getShowCorrectAfterSubmission(){
		return this.showCorrectAfterSubmission;
	}
	public void setShowCorrectAfterSubmission(Boolean showCorrectAfterSubmission){
		this.showCorrectAfterSubmission = showCorrectAfterSubmission;
	}

	public void showCorrectAfterSubmission(String multirequestToken){
		setToken("showCorrectAfterSubmission", multirequestToken);
	}

	// allowDownload:
	public Boolean getAllowDownload(){
		return this.allowDownload;
	}
	public void setAllowDownload(Boolean allowDownload){
		this.allowDownload = allowDownload;
	}

	public void allowDownload(String multirequestToken){
		setToken("allowDownload", multirequestToken);
	}

	// showGradeAfterSubmission:
	public Boolean getShowGradeAfterSubmission(){
		return this.showGradeAfterSubmission;
	}
	public void setShowGradeAfterSubmission(Boolean showGradeAfterSubmission){
		this.showGradeAfterSubmission = showGradeAfterSubmission;
	}

	public void showGradeAfterSubmission(String multirequestToken){
		setToken("showGradeAfterSubmission", multirequestToken);
	}


	public Quiz() {
		super();
	}

	public Quiz(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		version = GsonParser.parseInt(jsonObject.get("version"));
		uiAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("uiAttributes"), KeyValue.class);
		showResultOnAnswer = GsonParser.parseBoolean(jsonObject.get("showResultOnAnswer"));
		showCorrectKeyOnAnswer = GsonParser.parseBoolean(jsonObject.get("showCorrectKeyOnAnswer"));
		allowAnswerUpdate = GsonParser.parseBoolean(jsonObject.get("allowAnswerUpdate"));
		showCorrectAfterSubmission = GsonParser.parseBoolean(jsonObject.get("showCorrectAfterSubmission"));
		allowDownload = GsonParser.parseBoolean(jsonObject.get("allowDownload"));
		showGradeAfterSubmission = GsonParser.parseBoolean(jsonObject.get("showGradeAfterSubmission"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuiz");
		kparams.add("uiAttributes", this.uiAttributes);
		kparams.add("showResultOnAnswer", this.showResultOnAnswer);
		kparams.add("showCorrectKeyOnAnswer", this.showCorrectKeyOnAnswer);
		kparams.add("allowAnswerUpdate", this.allowAnswerUpdate);
		kparams.add("showCorrectAfterSubmission", this.showCorrectAfterSubmission);
		kparams.add("allowDownload", this.allowDownload);
		kparams.add("showGradeAfterSubmission", this.showGradeAfterSubmission);
		return kparams;
	}


    public static final Creator<Quiz> CREATOR = new Creator<Quiz>() {
        @Override
        public Quiz createFromParcel(Parcel source) {
            return new Quiz(source);
        }

        @Override
        public Quiz[] newArray(int size) {
            return new Quiz[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.version);
        if(this.uiAttributes != null) {
            dest.writeInt(this.uiAttributes.size());
            dest.writeList(this.uiAttributes);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.showResultOnAnswer);
        dest.writeValue(this.showCorrectKeyOnAnswer);
        dest.writeValue(this.allowAnswerUpdate);
        dest.writeValue(this.showCorrectAfterSubmission);
        dest.writeValue(this.allowDownload);
        dest.writeValue(this.showGradeAfterSubmission);
    }

    public Quiz(Parcel in) {
        super(in);
        this.version = (Integer)in.readValue(Integer.class.getClassLoader());
        int uiAttributesSize = in.readInt();
        if( uiAttributesSize > -1) {
            this.uiAttributes = new ArrayList<>();
            in.readList(this.uiAttributes, KeyValue.class.getClassLoader());
        }
        this.showResultOnAnswer = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.showCorrectKeyOnAnswer = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.allowAnswerUpdate = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.showCorrectAfterSubmission = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.allowDownload = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.showGradeAfterSubmission = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

