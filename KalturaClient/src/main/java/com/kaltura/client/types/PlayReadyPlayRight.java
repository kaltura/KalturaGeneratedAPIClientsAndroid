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
import com.kaltura.client.enums.PlayReadyAnalogVideoOPL;
import com.kaltura.client.enums.PlayReadyCompressedDigitalVideoOPL;
import com.kaltura.client.enums.PlayReadyDigitalAudioOPL;
import com.kaltura.client.enums.PlayReadyUncompressedDigitalVideoOPL;
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
@MultiRequestBuilder.Tokenizer(PlayReadyPlayRight.Tokenizer.class)
public class PlayReadyPlayRight extends PlayReadyRight {
	
	public interface Tokenizer extends PlayReadyRight.Tokenizer {
		String analogVideoOPL();
		RequestBuilder.ListTokenizer<PlayReadyAnalogVideoOPIdHolder.Tokenizer> analogVideoOutputProtectionList();
		String compressedDigitalAudioOPL();
		String compressedDigitalVideoOPL();
		RequestBuilder.ListTokenizer<PlayReadyDigitalAudioOPIdHolder.Tokenizer> digitalAudioOutputProtectionList();
		String uncompressedDigitalAudioOPL();
		String uncompressedDigitalVideoOPL();
		String firstPlayExpiration();
		RequestBuilder.ListTokenizer<PlayReadyPlayEnablerHolder.Tokenizer> playEnablers();
	}

	private PlayReadyAnalogVideoOPL analogVideoOPL;
	private List<PlayReadyAnalogVideoOPIdHolder> analogVideoOutputProtectionList;
	private PlayReadyDigitalAudioOPL compressedDigitalAudioOPL;
	private PlayReadyCompressedDigitalVideoOPL compressedDigitalVideoOPL;
	private List<PlayReadyDigitalAudioOPIdHolder> digitalAudioOutputProtectionList;
	private PlayReadyDigitalAudioOPL uncompressedDigitalAudioOPL;
	private PlayReadyUncompressedDigitalVideoOPL uncompressedDigitalVideoOPL;
	private Integer firstPlayExpiration;
	private List<PlayReadyPlayEnablerHolder> playEnablers;

	// analogVideoOPL:
	public PlayReadyAnalogVideoOPL getAnalogVideoOPL(){
		return this.analogVideoOPL;
	}
	public void setAnalogVideoOPL(PlayReadyAnalogVideoOPL analogVideoOPL){
		this.analogVideoOPL = analogVideoOPL;
	}

	public void analogVideoOPL(String multirequestToken){
		setToken("analogVideoOPL", multirequestToken);
	}

	// analogVideoOutputProtectionList:
	public List<PlayReadyAnalogVideoOPIdHolder> getAnalogVideoOutputProtectionList(){
		return this.analogVideoOutputProtectionList;
	}
	public void setAnalogVideoOutputProtectionList(List<PlayReadyAnalogVideoOPIdHolder> analogVideoOutputProtectionList){
		this.analogVideoOutputProtectionList = analogVideoOutputProtectionList;
	}

	// compressedDigitalAudioOPL:
	public PlayReadyDigitalAudioOPL getCompressedDigitalAudioOPL(){
		return this.compressedDigitalAudioOPL;
	}
	public void setCompressedDigitalAudioOPL(PlayReadyDigitalAudioOPL compressedDigitalAudioOPL){
		this.compressedDigitalAudioOPL = compressedDigitalAudioOPL;
	}

	public void compressedDigitalAudioOPL(String multirequestToken){
		setToken("compressedDigitalAudioOPL", multirequestToken);
	}

	// compressedDigitalVideoOPL:
	public PlayReadyCompressedDigitalVideoOPL getCompressedDigitalVideoOPL(){
		return this.compressedDigitalVideoOPL;
	}
	public void setCompressedDigitalVideoOPL(PlayReadyCompressedDigitalVideoOPL compressedDigitalVideoOPL){
		this.compressedDigitalVideoOPL = compressedDigitalVideoOPL;
	}

	public void compressedDigitalVideoOPL(String multirequestToken){
		setToken("compressedDigitalVideoOPL", multirequestToken);
	}

	// digitalAudioOutputProtectionList:
	public List<PlayReadyDigitalAudioOPIdHolder> getDigitalAudioOutputProtectionList(){
		return this.digitalAudioOutputProtectionList;
	}
	public void setDigitalAudioOutputProtectionList(List<PlayReadyDigitalAudioOPIdHolder> digitalAudioOutputProtectionList){
		this.digitalAudioOutputProtectionList = digitalAudioOutputProtectionList;
	}

	// uncompressedDigitalAudioOPL:
	public PlayReadyDigitalAudioOPL getUncompressedDigitalAudioOPL(){
		return this.uncompressedDigitalAudioOPL;
	}
	public void setUncompressedDigitalAudioOPL(PlayReadyDigitalAudioOPL uncompressedDigitalAudioOPL){
		this.uncompressedDigitalAudioOPL = uncompressedDigitalAudioOPL;
	}

	public void uncompressedDigitalAudioOPL(String multirequestToken){
		setToken("uncompressedDigitalAudioOPL", multirequestToken);
	}

	// uncompressedDigitalVideoOPL:
	public PlayReadyUncompressedDigitalVideoOPL getUncompressedDigitalVideoOPL(){
		return this.uncompressedDigitalVideoOPL;
	}
	public void setUncompressedDigitalVideoOPL(PlayReadyUncompressedDigitalVideoOPL uncompressedDigitalVideoOPL){
		this.uncompressedDigitalVideoOPL = uncompressedDigitalVideoOPL;
	}

	public void uncompressedDigitalVideoOPL(String multirequestToken){
		setToken("uncompressedDigitalVideoOPL", multirequestToken);
	}

	// firstPlayExpiration:
	public Integer getFirstPlayExpiration(){
		return this.firstPlayExpiration;
	}
	public void setFirstPlayExpiration(Integer firstPlayExpiration){
		this.firstPlayExpiration = firstPlayExpiration;
	}

	public void firstPlayExpiration(String multirequestToken){
		setToken("firstPlayExpiration", multirequestToken);
	}

	// playEnablers:
	public List<PlayReadyPlayEnablerHolder> getPlayEnablers(){
		return this.playEnablers;
	}
	public void setPlayEnablers(List<PlayReadyPlayEnablerHolder> playEnablers){
		this.playEnablers = playEnablers;
	}


	public PlayReadyPlayRight() {
		super();
	}

	public PlayReadyPlayRight(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		analogVideoOPL = PlayReadyAnalogVideoOPL.get(GsonParser.parseInt(jsonObject.get("analogVideoOPL")));
		analogVideoOutputProtectionList = GsonParser.parseArray(jsonObject.getAsJsonArray("analogVideoOutputProtectionList"), PlayReadyAnalogVideoOPIdHolder.class);
		compressedDigitalAudioOPL = PlayReadyDigitalAudioOPL.get(GsonParser.parseInt(jsonObject.get("compressedDigitalAudioOPL")));
		compressedDigitalVideoOPL = PlayReadyCompressedDigitalVideoOPL.get(GsonParser.parseInt(jsonObject.get("compressedDigitalVideoOPL")));
		digitalAudioOutputProtectionList = GsonParser.parseArray(jsonObject.getAsJsonArray("digitalAudioOutputProtectionList"), PlayReadyDigitalAudioOPIdHolder.class);
		uncompressedDigitalAudioOPL = PlayReadyDigitalAudioOPL.get(GsonParser.parseInt(jsonObject.get("uncompressedDigitalAudioOPL")));
		uncompressedDigitalVideoOPL = PlayReadyUncompressedDigitalVideoOPL.get(GsonParser.parseInt(jsonObject.get("uncompressedDigitalVideoOPL")));
		firstPlayExpiration = GsonParser.parseInt(jsonObject.get("firstPlayExpiration"));
		playEnablers = GsonParser.parseArray(jsonObject.getAsJsonArray("playEnablers"), PlayReadyPlayEnablerHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayReadyPlayRight");
		kparams.add("analogVideoOPL", this.analogVideoOPL);
		kparams.add("analogVideoOutputProtectionList", this.analogVideoOutputProtectionList);
		kparams.add("compressedDigitalAudioOPL", this.compressedDigitalAudioOPL);
		kparams.add("compressedDigitalVideoOPL", this.compressedDigitalVideoOPL);
		kparams.add("digitalAudioOutputProtectionList", this.digitalAudioOutputProtectionList);
		kparams.add("uncompressedDigitalAudioOPL", this.uncompressedDigitalAudioOPL);
		kparams.add("uncompressedDigitalVideoOPL", this.uncompressedDigitalVideoOPL);
		kparams.add("firstPlayExpiration", this.firstPlayExpiration);
		kparams.add("playEnablers", this.playEnablers);
		return kparams;
	}


    public static final Creator<PlayReadyPlayRight> CREATOR = new Creator<PlayReadyPlayRight>() {
        @Override
        public PlayReadyPlayRight createFromParcel(Parcel source) {
            return new PlayReadyPlayRight(source);
        }

        @Override
        public PlayReadyPlayRight[] newArray(int size) {
            return new PlayReadyPlayRight[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.analogVideoOPL == null ? -1 : this.analogVideoOPL.ordinal());
        if(this.analogVideoOutputProtectionList != null) {
            dest.writeInt(this.analogVideoOutputProtectionList.size());
            dest.writeList(this.analogVideoOutputProtectionList);
        } else {
            dest.writeInt(-1);
        }
        dest.writeInt(this.compressedDigitalAudioOPL == null ? -1 : this.compressedDigitalAudioOPL.ordinal());
        dest.writeInt(this.compressedDigitalVideoOPL == null ? -1 : this.compressedDigitalVideoOPL.ordinal());
        if(this.digitalAudioOutputProtectionList != null) {
            dest.writeInt(this.digitalAudioOutputProtectionList.size());
            dest.writeList(this.digitalAudioOutputProtectionList);
        } else {
            dest.writeInt(-1);
        }
        dest.writeInt(this.uncompressedDigitalAudioOPL == null ? -1 : this.uncompressedDigitalAudioOPL.ordinal());
        dest.writeInt(this.uncompressedDigitalVideoOPL == null ? -1 : this.uncompressedDigitalVideoOPL.ordinal());
        dest.writeValue(this.firstPlayExpiration);
        if(this.playEnablers != null) {
            dest.writeInt(this.playEnablers.size());
            dest.writeList(this.playEnablers);
        } else {
            dest.writeInt(-1);
        }
    }

    public PlayReadyPlayRight(Parcel in) {
        super(in);
        int tmpAnalogVideoOPL = in.readInt();
        this.analogVideoOPL = tmpAnalogVideoOPL == -1 ? null : PlayReadyAnalogVideoOPL.values()[tmpAnalogVideoOPL];
        int analogVideoOutputProtectionListSize = in.readInt();
        if( analogVideoOutputProtectionListSize > -1) {
            this.analogVideoOutputProtectionList = new ArrayList<>();
            in.readList(this.analogVideoOutputProtectionList, PlayReadyAnalogVideoOPIdHolder.class.getClassLoader());
        }
        int tmpCompressedDigitalAudioOPL = in.readInt();
        this.compressedDigitalAudioOPL = tmpCompressedDigitalAudioOPL == -1 ? null : PlayReadyDigitalAudioOPL.values()[tmpCompressedDigitalAudioOPL];
        int tmpCompressedDigitalVideoOPL = in.readInt();
        this.compressedDigitalVideoOPL = tmpCompressedDigitalVideoOPL == -1 ? null : PlayReadyCompressedDigitalVideoOPL.values()[tmpCompressedDigitalVideoOPL];
        int digitalAudioOutputProtectionListSize = in.readInt();
        if( digitalAudioOutputProtectionListSize > -1) {
            this.digitalAudioOutputProtectionList = new ArrayList<>();
            in.readList(this.digitalAudioOutputProtectionList, PlayReadyDigitalAudioOPIdHolder.class.getClassLoader());
        }
        int tmpUncompressedDigitalAudioOPL = in.readInt();
        this.uncompressedDigitalAudioOPL = tmpUncompressedDigitalAudioOPL == -1 ? null : PlayReadyDigitalAudioOPL.values()[tmpUncompressedDigitalAudioOPL];
        int tmpUncompressedDigitalVideoOPL = in.readInt();
        this.uncompressedDigitalVideoOPL = tmpUncompressedDigitalVideoOPL == -1 ? null : PlayReadyUncompressedDigitalVideoOPL.values()[tmpUncompressedDigitalVideoOPL];
        this.firstPlayExpiration = (Integer)in.readValue(Integer.class.getClassLoader());
        int playEnablersSize = in.readInt();
        if( playEnablersSize > -1) {
            this.playEnablers = new ArrayList<>();
            in.readList(this.playEnablers, PlayReadyPlayEnablerHolder.class.getClassLoader());
        }
    }
}

