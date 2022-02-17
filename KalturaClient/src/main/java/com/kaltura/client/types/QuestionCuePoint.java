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
import com.kaltura.client.enums.QuestionType;
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
@MultiRequestBuilder.Tokenizer(QuestionCuePoint.Tokenizer.class)
public class QuestionCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		RequestBuilder.ListTokenizer<OptionalAnswer.Tokenizer> optionalAnswers();
		String hint();
		String question();
		String explanation();
		String questionType();
		String presentationOrder();
		String excludeFromScore();
	}

	/**
	 * Array of key value answerKey-&gt;optionAnswer objects
	 */
	private List<OptionalAnswer> optionalAnswers;
	private String hint;
	private String question;
	private String explanation;
	private QuestionType questionType;
	private Integer presentationOrder;
	private Boolean excludeFromScore;

	// optionalAnswers:
	public List<OptionalAnswer> getOptionalAnswers(){
		return this.optionalAnswers;
	}
	public void setOptionalAnswers(List<OptionalAnswer> optionalAnswers){
		this.optionalAnswers = optionalAnswers;
	}

	// hint:
	public String getHint(){
		return this.hint;
	}
	public void setHint(String hint){
		this.hint = hint;
	}

	public void hint(String multirequestToken){
		setToken("hint", multirequestToken);
	}

	// question:
	public String getQuestion(){
		return this.question;
	}
	public void setQuestion(String question){
		this.question = question;
	}

	public void question(String multirequestToken){
		setToken("question", multirequestToken);
	}

	// explanation:
	public String getExplanation(){
		return this.explanation;
	}
	public void setExplanation(String explanation){
		this.explanation = explanation;
	}

	public void explanation(String multirequestToken){
		setToken("explanation", multirequestToken);
	}

	// questionType:
	public QuestionType getQuestionType(){
		return this.questionType;
	}
	public void setQuestionType(QuestionType questionType){
		this.questionType = questionType;
	}

	public void questionType(String multirequestToken){
		setToken("questionType", multirequestToken);
	}

	// presentationOrder:
	public Integer getPresentationOrder(){
		return this.presentationOrder;
	}
	public void setPresentationOrder(Integer presentationOrder){
		this.presentationOrder = presentationOrder;
	}

	public void presentationOrder(String multirequestToken){
		setToken("presentationOrder", multirequestToken);
	}

	// excludeFromScore:
	public Boolean getExcludeFromScore(){
		return this.excludeFromScore;
	}
	public void setExcludeFromScore(Boolean excludeFromScore){
		this.excludeFromScore = excludeFromScore;
	}

	public void excludeFromScore(String multirequestToken){
		setToken("excludeFromScore", multirequestToken);
	}


	public QuestionCuePoint() {
		super();
	}

	public QuestionCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		optionalAnswers = GsonParser.parseArray(jsonObject.getAsJsonArray("optionalAnswers"), OptionalAnswer.class);
		hint = GsonParser.parseString(jsonObject.get("hint"));
		question = GsonParser.parseString(jsonObject.get("question"));
		explanation = GsonParser.parseString(jsonObject.get("explanation"));
		questionType = QuestionType.get(GsonParser.parseInt(jsonObject.get("questionType")));
		presentationOrder = GsonParser.parseInt(jsonObject.get("presentationOrder"));
		excludeFromScore = GsonParser.parseBoolean(jsonObject.get("excludeFromScore"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuestionCuePoint");
		kparams.add("optionalAnswers", this.optionalAnswers);
		kparams.add("hint", this.hint);
		kparams.add("question", this.question);
		kparams.add("explanation", this.explanation);
		kparams.add("questionType", this.questionType);
		kparams.add("presentationOrder", this.presentationOrder);
		kparams.add("excludeFromScore", this.excludeFromScore);
		return kparams;
	}


    public static final Creator<QuestionCuePoint> CREATOR = new Creator<QuestionCuePoint>() {
        @Override
        public QuestionCuePoint createFromParcel(Parcel source) {
            return new QuestionCuePoint(source);
        }

        @Override
        public QuestionCuePoint[] newArray(int size) {
            return new QuestionCuePoint[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.optionalAnswers != null) {
            dest.writeInt(this.optionalAnswers.size());
            dest.writeList(this.optionalAnswers);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.hint);
        dest.writeString(this.question);
        dest.writeString(this.explanation);
        dest.writeInt(this.questionType == null ? -1 : this.questionType.ordinal());
        dest.writeValue(this.presentationOrder);
        dest.writeValue(this.excludeFromScore);
    }

    public QuestionCuePoint(Parcel in) {
        super(in);
        int optionalAnswersSize = in.readInt();
        if( optionalAnswersSize > -1) {
            this.optionalAnswers = new ArrayList<>();
            in.readList(this.optionalAnswers, OptionalAnswer.class.getClassLoader());
        }
        this.hint = in.readString();
        this.question = in.readString();
        this.explanation = in.readString();
        int tmpQuestionType = in.readInt();
        this.questionType = tmpQuestionType == -1 ? null : QuestionType.values()[tmpQuestionType];
        this.presentationOrder = (Integer)in.readValue(Integer.class.getClassLoader());
        this.excludeFromScore = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

