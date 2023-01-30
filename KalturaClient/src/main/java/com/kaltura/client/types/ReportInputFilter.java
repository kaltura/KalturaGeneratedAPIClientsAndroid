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
import com.kaltura.client.enums.ReportInterval;
import com.kaltura.client.types.ESearchEntryOperator;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportInputFilter.Tokenizer.class)
public class ReportInputFilter extends ReportInputBaseFilter {
	
	public interface Tokenizer extends ReportInputBaseFilter.Tokenizer {
		String keywords();
		String searchInTags();
		String searchInAdminTags();
		String categories();
		String categoriesIdsIn();
		String customVar1In();
		String customVar2In();
		String customVar3In();
		String deviceIn();
		String countryIn();
		String regionIn();
		String citiesIn();
		String operatingSystemFamilyIn();
		String operatingSystemIn();
		String browserFamilyIn();
		String browserIn();
		String timeZoneOffset();
		String interval();
		String mediaTypeIn();
		String sourceTypeIn();
		String ownerIdsIn();
		ESearchEntryOperator.Tokenizer entryOperator();
		String entryCreatedAtGreaterThanOrEqual();
		String entryCreatedAtLessThanOrEqual();
		String entryIdIn();
		String playbackTypeIn();
		String playbackContextIdsIn();
		String rootEntryIdIn();
		String errorCodeIn();
		String playerVersionIn();
		String ispIn();
		String applicationVersionIn();
		String nodeIdsIn();
		String categoriesAncestorIdIn();
		String hotspotIdIn();
		String crmIdIn();
		String playlistIdIn();
		String domainIn();
		String canonicalUrlIn();
		String virtualEventIdIn();
		String originIn();
		String uiConfIdIn();
	}

	/**
	 * Search keywords to filter objects
	 */
	private String keywords;
	/**
	 * Search keywords in objects tags
	 */
	private Boolean searchInTags;
	/**
	 * Search keywords in objects admin tags
	 */
	private Boolean searchInAdminTags;
	/**
	 * Search objects in specified categories
	 */
	private String categories;
	/**
	 * Search objects in specified category ids
	 */
	private String categoriesIdsIn;
	/**
	 * Filter by customVar1
	 */
	private String customVar1In;
	/**
	 * Filter by customVar2
	 */
	private String customVar2In;
	/**
	 * Filter by customVar3
	 */
	private String customVar3In;
	/**
	 * Filter by device
	 */
	private String deviceIn;
	/**
	 * Filter by country
	 */
	private String countryIn;
	/**
	 * Filter by region
	 */
	private String regionIn;
	/**
	 * Filter by city
	 */
	private String citiesIn;
	/**
	 * Filter by operating system family
	 */
	private String operatingSystemFamilyIn;
	/**
	 * Filter by operating system
	 */
	private String operatingSystemIn;
	/**
	 * Filter by browser family
	 */
	private String browserFamilyIn;
	/**
	 * Filter by browser
	 */
	private String browserIn;
	/**
	 * Time zone offset in minutes
	 */
	private Integer timeZoneOffset;
	/**
	 * Aggregated results according to interval
	 */
	private ReportInterval interval;
	/**
	 * Filter by media types
	 */
	private String mediaTypeIn;
	/**
	 * Filter by source types
	 */
	private String sourceTypeIn;
	/**
	 * Filter by entry owner
	 */
	private String ownerIdsIn;
	private ESearchEntryOperator entryOperator;
	/**
	 * Entry created at greater than or equal as Unix timestamp
	 */
	private Integer entryCreatedAtGreaterThanOrEqual;
	/**
	 * Entry created at less than or equal as Unix timestamp
	 */
	private Integer entryCreatedAtLessThanOrEqual;
	private String entryIdIn;
	private String playbackTypeIn;
	/**
	 * filter by playback context ids
	 */
	private String playbackContextIdsIn;
	/**
	 * filter by root entry ids
	 */
	private String rootEntryIdIn;
	/**
	 * filter by error code
	 */
	private String errorCodeIn;
	/**
	 * filter by player version
	 */
	private String playerVersionIn;
	/**
	 * filter by isp
	 */
	private String ispIn;
	/**
	 * filter by application version
	 */
	private String applicationVersionIn;
	/**
	 * filter by node id
	 */
	private String nodeIdsIn;
	/**
	 * filter by categories ancestor
	 */
	private String categoriesAncestorIdIn;
	/**
	 * filter by hotspot id
	 */
	private String hotspotIdIn;
	/**
	 * filter by crm id
	 */
	private String crmIdIn;
	/**
	 * filter by playlist id
	 */
	private String playlistIdIn;
	/**
	 * filter by domain
	 */
	private String domainIn;
	/**
	 * filter by canonical url
	 */
	private String canonicalUrlIn;
	/**
	 * filter by virtual event id
	 */
	private String virtualEventIdIn;
	/**
	 * filter by origin
	 */
	private String originIn;
	/**
	 * filter by ui conf id
	 */
	private String uiConfIdIn;

	// keywords:
	public String getKeywords(){
		return this.keywords;
	}
	public void setKeywords(String keywords){
		this.keywords = keywords;
	}

	public void keywords(String multirequestToken){
		setToken("keywords", multirequestToken);
	}

	// searchInTags:
	public Boolean getSearchInTags(){
		return this.searchInTags;
	}
	public void setSearchInTags(Boolean searchInTags){
		this.searchInTags = searchInTags;
	}

	public void searchInTags(String multirequestToken){
		setToken("searchInTags", multirequestToken);
	}

	// searchInAdminTags:
	public Boolean getSearchInAdminTags(){
		return this.searchInAdminTags;
	}
	public void setSearchInAdminTags(Boolean searchInAdminTags){
		this.searchInAdminTags = searchInAdminTags;
	}

	public void searchInAdminTags(String multirequestToken){
		setToken("searchInAdminTags", multirequestToken);
	}

	// categories:
	public String getCategories(){
		return this.categories;
	}
	public void setCategories(String categories){
		this.categories = categories;
	}

	public void categories(String multirequestToken){
		setToken("categories", multirequestToken);
	}

	// categoriesIdsIn:
	public String getCategoriesIdsIn(){
		return this.categoriesIdsIn;
	}
	public void setCategoriesIdsIn(String categoriesIdsIn){
		this.categoriesIdsIn = categoriesIdsIn;
	}

	public void categoriesIdsIn(String multirequestToken){
		setToken("categoriesIdsIn", multirequestToken);
	}

	// customVar1In:
	public String getCustomVar1In(){
		return this.customVar1In;
	}
	public void setCustomVar1In(String customVar1In){
		this.customVar1In = customVar1In;
	}

	public void customVar1In(String multirequestToken){
		setToken("customVar1In", multirequestToken);
	}

	// customVar2In:
	public String getCustomVar2In(){
		return this.customVar2In;
	}
	public void setCustomVar2In(String customVar2In){
		this.customVar2In = customVar2In;
	}

	public void customVar2In(String multirequestToken){
		setToken("customVar2In", multirequestToken);
	}

	// customVar3In:
	public String getCustomVar3In(){
		return this.customVar3In;
	}
	public void setCustomVar3In(String customVar3In){
		this.customVar3In = customVar3In;
	}

	public void customVar3In(String multirequestToken){
		setToken("customVar3In", multirequestToken);
	}

	// deviceIn:
	public String getDeviceIn(){
		return this.deviceIn;
	}
	public void setDeviceIn(String deviceIn){
		this.deviceIn = deviceIn;
	}

	public void deviceIn(String multirequestToken){
		setToken("deviceIn", multirequestToken);
	}

	// countryIn:
	public String getCountryIn(){
		return this.countryIn;
	}
	public void setCountryIn(String countryIn){
		this.countryIn = countryIn;
	}

	public void countryIn(String multirequestToken){
		setToken("countryIn", multirequestToken);
	}

	// regionIn:
	public String getRegionIn(){
		return this.regionIn;
	}
	public void setRegionIn(String regionIn){
		this.regionIn = regionIn;
	}

	public void regionIn(String multirequestToken){
		setToken("regionIn", multirequestToken);
	}

	// citiesIn:
	public String getCitiesIn(){
		return this.citiesIn;
	}
	public void setCitiesIn(String citiesIn){
		this.citiesIn = citiesIn;
	}

	public void citiesIn(String multirequestToken){
		setToken("citiesIn", multirequestToken);
	}

	// operatingSystemFamilyIn:
	public String getOperatingSystemFamilyIn(){
		return this.operatingSystemFamilyIn;
	}
	public void setOperatingSystemFamilyIn(String operatingSystemFamilyIn){
		this.operatingSystemFamilyIn = operatingSystemFamilyIn;
	}

	public void operatingSystemFamilyIn(String multirequestToken){
		setToken("operatingSystemFamilyIn", multirequestToken);
	}

	// operatingSystemIn:
	public String getOperatingSystemIn(){
		return this.operatingSystemIn;
	}
	public void setOperatingSystemIn(String operatingSystemIn){
		this.operatingSystemIn = operatingSystemIn;
	}

	public void operatingSystemIn(String multirequestToken){
		setToken("operatingSystemIn", multirequestToken);
	}

	// browserFamilyIn:
	public String getBrowserFamilyIn(){
		return this.browserFamilyIn;
	}
	public void setBrowserFamilyIn(String browserFamilyIn){
		this.browserFamilyIn = browserFamilyIn;
	}

	public void browserFamilyIn(String multirequestToken){
		setToken("browserFamilyIn", multirequestToken);
	}

	// browserIn:
	public String getBrowserIn(){
		return this.browserIn;
	}
	public void setBrowserIn(String browserIn){
		this.browserIn = browserIn;
	}

	public void browserIn(String multirequestToken){
		setToken("browserIn", multirequestToken);
	}

	// timeZoneOffset:
	public Integer getTimeZoneOffset(){
		return this.timeZoneOffset;
	}
	public void setTimeZoneOffset(Integer timeZoneOffset){
		this.timeZoneOffset = timeZoneOffset;
	}

	public void timeZoneOffset(String multirequestToken){
		setToken("timeZoneOffset", multirequestToken);
	}

	// interval:
	public ReportInterval getInterval(){
		return this.interval;
	}
	public void setInterval(ReportInterval interval){
		this.interval = interval;
	}

	public void interval(String multirequestToken){
		setToken("interval", multirequestToken);
	}

	// mediaTypeIn:
	public String getMediaTypeIn(){
		return this.mediaTypeIn;
	}
	public void setMediaTypeIn(String mediaTypeIn){
		this.mediaTypeIn = mediaTypeIn;
	}

	public void mediaTypeIn(String multirequestToken){
		setToken("mediaTypeIn", multirequestToken);
	}

	// sourceTypeIn:
	public String getSourceTypeIn(){
		return this.sourceTypeIn;
	}
	public void setSourceTypeIn(String sourceTypeIn){
		this.sourceTypeIn = sourceTypeIn;
	}

	public void sourceTypeIn(String multirequestToken){
		setToken("sourceTypeIn", multirequestToken);
	}

	// ownerIdsIn:
	public String getOwnerIdsIn(){
		return this.ownerIdsIn;
	}
	public void setOwnerIdsIn(String ownerIdsIn){
		this.ownerIdsIn = ownerIdsIn;
	}

	public void ownerIdsIn(String multirequestToken){
		setToken("ownerIdsIn", multirequestToken);
	}

	// entryOperator:
	public ESearchEntryOperator getEntryOperator(){
		return this.entryOperator;
	}
	public void setEntryOperator(ESearchEntryOperator entryOperator){
		this.entryOperator = entryOperator;
	}

	// entryCreatedAtGreaterThanOrEqual:
	public Integer getEntryCreatedAtGreaterThanOrEqual(){
		return this.entryCreatedAtGreaterThanOrEqual;
	}
	public void setEntryCreatedAtGreaterThanOrEqual(Integer entryCreatedAtGreaterThanOrEqual){
		this.entryCreatedAtGreaterThanOrEqual = entryCreatedAtGreaterThanOrEqual;
	}

	public void entryCreatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("entryCreatedAtGreaterThanOrEqual", multirequestToken);
	}

	// entryCreatedAtLessThanOrEqual:
	public Integer getEntryCreatedAtLessThanOrEqual(){
		return this.entryCreatedAtLessThanOrEqual;
	}
	public void setEntryCreatedAtLessThanOrEqual(Integer entryCreatedAtLessThanOrEqual){
		this.entryCreatedAtLessThanOrEqual = entryCreatedAtLessThanOrEqual;
	}

	public void entryCreatedAtLessThanOrEqual(String multirequestToken){
		setToken("entryCreatedAtLessThanOrEqual", multirequestToken);
	}

	// entryIdIn:
	public String getEntryIdIn(){
		return this.entryIdIn;
	}
	public void setEntryIdIn(String entryIdIn){
		this.entryIdIn = entryIdIn;
	}

	public void entryIdIn(String multirequestToken){
		setToken("entryIdIn", multirequestToken);
	}

	// playbackTypeIn:
	public String getPlaybackTypeIn(){
		return this.playbackTypeIn;
	}
	public void setPlaybackTypeIn(String playbackTypeIn){
		this.playbackTypeIn = playbackTypeIn;
	}

	public void playbackTypeIn(String multirequestToken){
		setToken("playbackTypeIn", multirequestToken);
	}

	// playbackContextIdsIn:
	public String getPlaybackContextIdsIn(){
		return this.playbackContextIdsIn;
	}
	public void setPlaybackContextIdsIn(String playbackContextIdsIn){
		this.playbackContextIdsIn = playbackContextIdsIn;
	}

	public void playbackContextIdsIn(String multirequestToken){
		setToken("playbackContextIdsIn", multirequestToken);
	}

	// rootEntryIdIn:
	public String getRootEntryIdIn(){
		return this.rootEntryIdIn;
	}
	public void setRootEntryIdIn(String rootEntryIdIn){
		this.rootEntryIdIn = rootEntryIdIn;
	}

	public void rootEntryIdIn(String multirequestToken){
		setToken("rootEntryIdIn", multirequestToken);
	}

	// errorCodeIn:
	public String getErrorCodeIn(){
		return this.errorCodeIn;
	}
	public void setErrorCodeIn(String errorCodeIn){
		this.errorCodeIn = errorCodeIn;
	}

	public void errorCodeIn(String multirequestToken){
		setToken("errorCodeIn", multirequestToken);
	}

	// playerVersionIn:
	public String getPlayerVersionIn(){
		return this.playerVersionIn;
	}
	public void setPlayerVersionIn(String playerVersionIn){
		this.playerVersionIn = playerVersionIn;
	}

	public void playerVersionIn(String multirequestToken){
		setToken("playerVersionIn", multirequestToken);
	}

	// ispIn:
	public String getIspIn(){
		return this.ispIn;
	}
	public void setIspIn(String ispIn){
		this.ispIn = ispIn;
	}

	public void ispIn(String multirequestToken){
		setToken("ispIn", multirequestToken);
	}

	// applicationVersionIn:
	public String getApplicationVersionIn(){
		return this.applicationVersionIn;
	}
	public void setApplicationVersionIn(String applicationVersionIn){
		this.applicationVersionIn = applicationVersionIn;
	}

	public void applicationVersionIn(String multirequestToken){
		setToken("applicationVersionIn", multirequestToken);
	}

	// nodeIdsIn:
	public String getNodeIdsIn(){
		return this.nodeIdsIn;
	}
	public void setNodeIdsIn(String nodeIdsIn){
		this.nodeIdsIn = nodeIdsIn;
	}

	public void nodeIdsIn(String multirequestToken){
		setToken("nodeIdsIn", multirequestToken);
	}

	// categoriesAncestorIdIn:
	public String getCategoriesAncestorIdIn(){
		return this.categoriesAncestorIdIn;
	}
	public void setCategoriesAncestorIdIn(String categoriesAncestorIdIn){
		this.categoriesAncestorIdIn = categoriesAncestorIdIn;
	}

	public void categoriesAncestorIdIn(String multirequestToken){
		setToken("categoriesAncestorIdIn", multirequestToken);
	}

	// hotspotIdIn:
	public String getHotspotIdIn(){
		return this.hotspotIdIn;
	}
	public void setHotspotIdIn(String hotspotIdIn){
		this.hotspotIdIn = hotspotIdIn;
	}

	public void hotspotIdIn(String multirequestToken){
		setToken("hotspotIdIn", multirequestToken);
	}

	// crmIdIn:
	public String getCrmIdIn(){
		return this.crmIdIn;
	}
	public void setCrmIdIn(String crmIdIn){
		this.crmIdIn = crmIdIn;
	}

	public void crmIdIn(String multirequestToken){
		setToken("crmIdIn", multirequestToken);
	}

	// playlistIdIn:
	public String getPlaylistIdIn(){
		return this.playlistIdIn;
	}
	public void setPlaylistIdIn(String playlistIdIn){
		this.playlistIdIn = playlistIdIn;
	}

	public void playlistIdIn(String multirequestToken){
		setToken("playlistIdIn", multirequestToken);
	}

	// domainIn:
	public String getDomainIn(){
		return this.domainIn;
	}
	public void setDomainIn(String domainIn){
		this.domainIn = domainIn;
	}

	public void domainIn(String multirequestToken){
		setToken("domainIn", multirequestToken);
	}

	// canonicalUrlIn:
	public String getCanonicalUrlIn(){
		return this.canonicalUrlIn;
	}
	public void setCanonicalUrlIn(String canonicalUrlIn){
		this.canonicalUrlIn = canonicalUrlIn;
	}

	public void canonicalUrlIn(String multirequestToken){
		setToken("canonicalUrlIn", multirequestToken);
	}

	// virtualEventIdIn:
	public String getVirtualEventIdIn(){
		return this.virtualEventIdIn;
	}
	public void setVirtualEventIdIn(String virtualEventIdIn){
		this.virtualEventIdIn = virtualEventIdIn;
	}

	public void virtualEventIdIn(String multirequestToken){
		setToken("virtualEventIdIn", multirequestToken);
	}

	// originIn:
	public String getOriginIn(){
		return this.originIn;
	}
	public void setOriginIn(String originIn){
		this.originIn = originIn;
	}

	public void originIn(String multirequestToken){
		setToken("originIn", multirequestToken);
	}

	// uiConfIdIn:
	public String getUiConfIdIn(){
		return this.uiConfIdIn;
	}
	public void setUiConfIdIn(String uiConfIdIn){
		this.uiConfIdIn = uiConfIdIn;
	}

	public void uiConfIdIn(String multirequestToken){
		setToken("uiConfIdIn", multirequestToken);
	}


	public ReportInputFilter() {
		super();
	}

	public ReportInputFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		keywords = GsonParser.parseString(jsonObject.get("keywords"));
		searchInTags = GsonParser.parseBoolean(jsonObject.get("searchInTags"));
		searchInAdminTags = GsonParser.parseBoolean(jsonObject.get("searchInAdminTags"));
		categories = GsonParser.parseString(jsonObject.get("categories"));
		categoriesIdsIn = GsonParser.parseString(jsonObject.get("categoriesIdsIn"));
		customVar1In = GsonParser.parseString(jsonObject.get("customVar1In"));
		customVar2In = GsonParser.parseString(jsonObject.get("customVar2In"));
		customVar3In = GsonParser.parseString(jsonObject.get("customVar3In"));
		deviceIn = GsonParser.parseString(jsonObject.get("deviceIn"));
		countryIn = GsonParser.parseString(jsonObject.get("countryIn"));
		regionIn = GsonParser.parseString(jsonObject.get("regionIn"));
		citiesIn = GsonParser.parseString(jsonObject.get("citiesIn"));
		operatingSystemFamilyIn = GsonParser.parseString(jsonObject.get("operatingSystemFamilyIn"));
		operatingSystemIn = GsonParser.parseString(jsonObject.get("operatingSystemIn"));
		browserFamilyIn = GsonParser.parseString(jsonObject.get("browserFamilyIn"));
		browserIn = GsonParser.parseString(jsonObject.get("browserIn"));
		timeZoneOffset = GsonParser.parseInt(jsonObject.get("timeZoneOffset"));
		interval = ReportInterval.get(GsonParser.parseString(jsonObject.get("interval")));
		mediaTypeIn = GsonParser.parseString(jsonObject.get("mediaTypeIn"));
		sourceTypeIn = GsonParser.parseString(jsonObject.get("sourceTypeIn"));
		ownerIdsIn = GsonParser.parseString(jsonObject.get("ownerIdsIn"));
		entryOperator = GsonParser.parseObject(jsonObject.getAsJsonObject("entryOperator"), ESearchEntryOperator.class);
		entryCreatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("entryCreatedAtGreaterThanOrEqual"));
		entryCreatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("entryCreatedAtLessThanOrEqual"));
		entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
		playbackTypeIn = GsonParser.parseString(jsonObject.get("playbackTypeIn"));
		playbackContextIdsIn = GsonParser.parseString(jsonObject.get("playbackContextIdsIn"));
		rootEntryIdIn = GsonParser.parseString(jsonObject.get("rootEntryIdIn"));
		errorCodeIn = GsonParser.parseString(jsonObject.get("errorCodeIn"));
		playerVersionIn = GsonParser.parseString(jsonObject.get("playerVersionIn"));
		ispIn = GsonParser.parseString(jsonObject.get("ispIn"));
		applicationVersionIn = GsonParser.parseString(jsonObject.get("applicationVersionIn"));
		nodeIdsIn = GsonParser.parseString(jsonObject.get("nodeIdsIn"));
		categoriesAncestorIdIn = GsonParser.parseString(jsonObject.get("categoriesAncestorIdIn"));
		hotspotIdIn = GsonParser.parseString(jsonObject.get("hotspotIdIn"));
		crmIdIn = GsonParser.parseString(jsonObject.get("crmIdIn"));
		playlistIdIn = GsonParser.parseString(jsonObject.get("playlistIdIn"));
		domainIn = GsonParser.parseString(jsonObject.get("domainIn"));
		canonicalUrlIn = GsonParser.parseString(jsonObject.get("canonicalUrlIn"));
		virtualEventIdIn = GsonParser.parseString(jsonObject.get("virtualEventIdIn"));
		originIn = GsonParser.parseString(jsonObject.get("originIn"));
		uiConfIdIn = GsonParser.parseString(jsonObject.get("uiConfIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportInputFilter");
		kparams.add("keywords", this.keywords);
		kparams.add("searchInTags", this.searchInTags);
		kparams.add("searchInAdminTags", this.searchInAdminTags);
		kparams.add("categories", this.categories);
		kparams.add("categoriesIdsIn", this.categoriesIdsIn);
		kparams.add("customVar1In", this.customVar1In);
		kparams.add("customVar2In", this.customVar2In);
		kparams.add("customVar3In", this.customVar3In);
		kparams.add("deviceIn", this.deviceIn);
		kparams.add("countryIn", this.countryIn);
		kparams.add("regionIn", this.regionIn);
		kparams.add("citiesIn", this.citiesIn);
		kparams.add("operatingSystemFamilyIn", this.operatingSystemFamilyIn);
		kparams.add("operatingSystemIn", this.operatingSystemIn);
		kparams.add("browserFamilyIn", this.browserFamilyIn);
		kparams.add("browserIn", this.browserIn);
		kparams.add("timeZoneOffset", this.timeZoneOffset);
		kparams.add("interval", this.interval);
		kparams.add("mediaTypeIn", this.mediaTypeIn);
		kparams.add("sourceTypeIn", this.sourceTypeIn);
		kparams.add("ownerIdsIn", this.ownerIdsIn);
		kparams.add("entryOperator", this.entryOperator);
		kparams.add("entryCreatedAtGreaterThanOrEqual", this.entryCreatedAtGreaterThanOrEqual);
		kparams.add("entryCreatedAtLessThanOrEqual", this.entryCreatedAtLessThanOrEqual);
		kparams.add("entryIdIn", this.entryIdIn);
		kparams.add("playbackTypeIn", this.playbackTypeIn);
		kparams.add("playbackContextIdsIn", this.playbackContextIdsIn);
		kparams.add("rootEntryIdIn", this.rootEntryIdIn);
		kparams.add("errorCodeIn", this.errorCodeIn);
		kparams.add("playerVersionIn", this.playerVersionIn);
		kparams.add("ispIn", this.ispIn);
		kparams.add("applicationVersionIn", this.applicationVersionIn);
		kparams.add("nodeIdsIn", this.nodeIdsIn);
		kparams.add("categoriesAncestorIdIn", this.categoriesAncestorIdIn);
		kparams.add("hotspotIdIn", this.hotspotIdIn);
		kparams.add("crmIdIn", this.crmIdIn);
		kparams.add("playlistIdIn", this.playlistIdIn);
		kparams.add("domainIn", this.domainIn);
		kparams.add("canonicalUrlIn", this.canonicalUrlIn);
		kparams.add("virtualEventIdIn", this.virtualEventIdIn);
		kparams.add("originIn", this.originIn);
		kparams.add("uiConfIdIn", this.uiConfIdIn);
		return kparams;
	}


    public static final Creator<ReportInputFilter> CREATOR = new Creator<ReportInputFilter>() {
        @Override
        public ReportInputFilter createFromParcel(Parcel source) {
            return new ReportInputFilter(source);
        }

        @Override
        public ReportInputFilter[] newArray(int size) {
            return new ReportInputFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.keywords);
        dest.writeValue(this.searchInTags);
        dest.writeValue(this.searchInAdminTags);
        dest.writeString(this.categories);
        dest.writeString(this.categoriesIdsIn);
        dest.writeString(this.customVar1In);
        dest.writeString(this.customVar2In);
        dest.writeString(this.customVar3In);
        dest.writeString(this.deviceIn);
        dest.writeString(this.countryIn);
        dest.writeString(this.regionIn);
        dest.writeString(this.citiesIn);
        dest.writeString(this.operatingSystemFamilyIn);
        dest.writeString(this.operatingSystemIn);
        dest.writeString(this.browserFamilyIn);
        dest.writeString(this.browserIn);
        dest.writeValue(this.timeZoneOffset);
        dest.writeInt(this.interval == null ? -1 : this.interval.ordinal());
        dest.writeString(this.mediaTypeIn);
        dest.writeString(this.sourceTypeIn);
        dest.writeString(this.ownerIdsIn);
        dest.writeParcelable(this.entryOperator, flags);
        dest.writeValue(this.entryCreatedAtGreaterThanOrEqual);
        dest.writeValue(this.entryCreatedAtLessThanOrEqual);
        dest.writeString(this.entryIdIn);
        dest.writeString(this.playbackTypeIn);
        dest.writeString(this.playbackContextIdsIn);
        dest.writeString(this.rootEntryIdIn);
        dest.writeString(this.errorCodeIn);
        dest.writeString(this.playerVersionIn);
        dest.writeString(this.ispIn);
        dest.writeString(this.applicationVersionIn);
        dest.writeString(this.nodeIdsIn);
        dest.writeString(this.categoriesAncestorIdIn);
        dest.writeString(this.hotspotIdIn);
        dest.writeString(this.crmIdIn);
        dest.writeString(this.playlistIdIn);
        dest.writeString(this.domainIn);
        dest.writeString(this.canonicalUrlIn);
        dest.writeString(this.virtualEventIdIn);
        dest.writeString(this.originIn);
        dest.writeString(this.uiConfIdIn);
    }

    public ReportInputFilter(Parcel in) {
        super(in);
        this.keywords = in.readString();
        this.searchInTags = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.searchInAdminTags = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.categories = in.readString();
        this.categoriesIdsIn = in.readString();
        this.customVar1In = in.readString();
        this.customVar2In = in.readString();
        this.customVar3In = in.readString();
        this.deviceIn = in.readString();
        this.countryIn = in.readString();
        this.regionIn = in.readString();
        this.citiesIn = in.readString();
        this.operatingSystemFamilyIn = in.readString();
        this.operatingSystemIn = in.readString();
        this.browserFamilyIn = in.readString();
        this.browserIn = in.readString();
        this.timeZoneOffset = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpInterval = in.readInt();
        this.interval = tmpInterval == -1 ? null : ReportInterval.values()[tmpInterval];
        this.mediaTypeIn = in.readString();
        this.sourceTypeIn = in.readString();
        this.ownerIdsIn = in.readString();
        this.entryOperator = in.readParcelable(ESearchEntryOperator.class.getClassLoader());
        this.entryCreatedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryCreatedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryIdIn = in.readString();
        this.playbackTypeIn = in.readString();
        this.playbackContextIdsIn = in.readString();
        this.rootEntryIdIn = in.readString();
        this.errorCodeIn = in.readString();
        this.playerVersionIn = in.readString();
        this.ispIn = in.readString();
        this.applicationVersionIn = in.readString();
        this.nodeIdsIn = in.readString();
        this.categoriesAncestorIdIn = in.readString();
        this.hotspotIdIn = in.readString();
        this.crmIdIn = in.readString();
        this.playlistIdIn = in.readString();
        this.domainIn = in.readString();
        this.canonicalUrlIn = in.readString();
        this.virtualEventIdIn = in.readString();
        this.originIn = in.readString();
        this.uiConfIdIn = in.readString();
    }
}

