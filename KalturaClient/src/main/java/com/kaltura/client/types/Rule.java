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
@MultiRequestBuilder.Tokenizer(Rule.Tokenizer.class)
public class Rule extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String description();
		String ruleData();
		String message();
		String code();
		RequestBuilder.ListTokenizer<RuleAction.Tokenizer> actions();
		RequestBuilder.ListTokenizer<Condition.Tokenizer> conditions();
		RequestBuilder.ListTokenizer<ContextTypeHolder.Tokenizer> contexts();
		String stopProcessing();
		String forceAdminValidation();
	}

	/**
	 * Short Rule Description
	 */
	private String description;
	/**
	 * Rule Custom Data to allow saving rule specific information
	 */
	private String ruleData;
	/**
	 * Message to be thrown to the player in case the rule is fulfilled
	 */
	private String message;
	/**
	 * Code to be thrown to the player in case the rule is fulfilled
	 */
	private String code;
	/**
	 * Actions to be performed by the player in case the rule is fulfilled
	 */
	private List<RuleAction> actions;
	/**
	 * Conditions to validate the rule
	 */
	private List<Condition> conditions;
	/**
	 * Indicates what contexts should be tested by this rule
	 */
	private List<ContextTypeHolder> contexts;
	/**
	 * Indicates that this rule is enough and no need to continue checking the rest of
	  the rules
	 */
	private Boolean stopProcessing;
	/**
	 * Indicates if we should force ks validation for admin ks users as well
	 */
	private Boolean forceAdminValidation;

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// ruleData:
	public String getRuleData(){
		return this.ruleData;
	}
	public void setRuleData(String ruleData){
		this.ruleData = ruleData;
	}

	public void ruleData(String multirequestToken){
		setToken("ruleData", multirequestToken);
	}

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}

	// actions:
	public List<RuleAction> getActions(){
		return this.actions;
	}
	public void setActions(List<RuleAction> actions){
		this.actions = actions;
	}

	// conditions:
	public List<Condition> getConditions(){
		return this.conditions;
	}
	public void setConditions(List<Condition> conditions){
		this.conditions = conditions;
	}

	// contexts:
	public List<ContextTypeHolder> getContexts(){
		return this.contexts;
	}
	public void setContexts(List<ContextTypeHolder> contexts){
		this.contexts = contexts;
	}

	// stopProcessing:
	public Boolean getStopProcessing(){
		return this.stopProcessing;
	}
	public void setStopProcessing(Boolean stopProcessing){
		this.stopProcessing = stopProcessing;
	}

	public void stopProcessing(String multirequestToken){
		setToken("stopProcessing", multirequestToken);
	}

	// forceAdminValidation:
	public Boolean getForceAdminValidation(){
		return this.forceAdminValidation;
	}
	public void setForceAdminValidation(Boolean forceAdminValidation){
		this.forceAdminValidation = forceAdminValidation;
	}

	public void forceAdminValidation(String multirequestToken){
		setToken("forceAdminValidation", multirequestToken);
	}


	public Rule() {
		super();
	}

	public Rule(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		description = GsonParser.parseString(jsonObject.get("description"));
		ruleData = GsonParser.parseString(jsonObject.get("ruleData"));
		message = GsonParser.parseString(jsonObject.get("message"));
		code = GsonParser.parseString(jsonObject.get("code"));
		actions = GsonParser.parseArray(jsonObject.getAsJsonArray("actions"), RuleAction.class);
		conditions = GsonParser.parseArray(jsonObject.getAsJsonArray("conditions"), Condition.class);
		contexts = GsonParser.parseArray(jsonObject.getAsJsonArray("contexts"), ContextTypeHolder.class);
		stopProcessing = GsonParser.parseBoolean(jsonObject.get("stopProcessing"));
		forceAdminValidation = GsonParser.parseBoolean(jsonObject.get("forceAdminValidation"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRule");
		kparams.add("description", this.description);
		kparams.add("ruleData", this.ruleData);
		kparams.add("message", this.message);
		kparams.add("code", this.code);
		kparams.add("actions", this.actions);
		kparams.add("conditions", this.conditions);
		kparams.add("contexts", this.contexts);
		kparams.add("stopProcessing", this.stopProcessing);
		kparams.add("forceAdminValidation", this.forceAdminValidation);
		return kparams;
	}


    public static final Creator<Rule> CREATOR = new Creator<Rule>() {
        @Override
        public Rule createFromParcel(Parcel source) {
            return new Rule(source);
        }

        @Override
        public Rule[] newArray(int size) {
            return new Rule[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.description);
        dest.writeString(this.ruleData);
        dest.writeString(this.message);
        dest.writeString(this.code);
        if(this.actions != null) {
            dest.writeInt(this.actions.size());
            dest.writeList(this.actions);
        } else {
            dest.writeInt(-1);
        }
        if(this.conditions != null) {
            dest.writeInt(this.conditions.size());
            dest.writeList(this.conditions);
        } else {
            dest.writeInt(-1);
        }
        if(this.contexts != null) {
            dest.writeInt(this.contexts.size());
            dest.writeList(this.contexts);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.stopProcessing);
        dest.writeBoolean(this.forceAdminValidation);
    }

    public Rule(Parcel in) {
        super(in);
        this.description = in.readString();
        this.ruleData = in.readString();
        this.message = in.readString();
        this.code = in.readString();
        int actionsSize = in.readInt();
        if( actionsSize > -1) {
            this.actions = new ArrayList<>();
            in.readList(this.actions, RuleAction.class.getClassLoader());
        }
        int conditionsSize = in.readInt();
        if( conditionsSize > -1) {
            this.conditions = new ArrayList<>();
            in.readList(this.conditions, Condition.class.getClassLoader());
        }
        int contextsSize = in.readInt();
        if( contextsSize > -1) {
            this.contexts = new ArrayList<>();
            in.readList(this.contexts, ContextTypeHolder.class.getClassLoader());
        }
        this.stopProcessing = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.forceAdminValidation = in.readBoolean();
    }
}

