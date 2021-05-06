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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.CommercialUseType;
import com.kaltura.client.enums.PartnerAuthenticationType;
import com.kaltura.client.enums.PartnerGroupType;
import com.kaltura.client.enums.PartnerStatus;
import com.kaltura.client.enums.PartnerType;
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
@MultiRequestBuilder.Tokenizer(Partner.Tokenizer.class)
public class Partner extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String website();
		String notificationUrl();
		String appearInSearch();
		String createdAt();
		String adminName();
		String adminEmail();
		String description();
		String commercialUse();
		String landingPage();
		String userLandingPage();
		String contentCategories();
		String type();
		String phone();
		String describeYourself();
		String adultContent();
		String defConversionProfileType();
		String notify_();
		String status();
		String allowQuickEdit();
		String mergeEntryLists();
		String notificationsConfig();
		String allowedFromEmailWhiteList();
		String maxUploadSize();
		String partnerPackage();
		String secret();
		String adminSecret();
		String cmsPassword();
		String allowMultiNotification();
		String adminLoginUsersQuota();
		String adminUserId();
		String firstName();
		String lastName();
		String country();
		String state();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> additionalParams();
		String publishersQuota();
		String partnerGroupType();
		String defaultEntitlementEnforcement();
		String defaultDeliveryType();
		String defaultEmbedCodeType();
		RequestBuilder.ListTokenizer<PlayerDeliveryType.Tokenizer> deliveryTypes();
		RequestBuilder.ListTokenizer<PlayerEmbedCodeType.Tokenizer> embedCodeTypes();
		String templatePartnerId();
		String ignoreSeoLinks();
		String blockDirectLogin();
		String host();
		String cdnHost();
		String isFirstLogin();
		String logoutUrl();
		String partnerParentId();
		String crmId();
		String referenceId();
		String timeAlignedRenditions();
		String publisherEnvironmentType();
		String ovpEnvironmentUrl();
		String ottEnvironmentUrl();
		RequestBuilder.ListTokenizer<ESearchLanguageItem.Tokenizer> eSearchLanguages();
		String authenticationType();
		String extendedFreeTrailExpiryReason();
		String extendedFreeTrailExpiryDate();
		String extendedFreeTrail();
		String extendedFreeTrailEndsWarning();
		String eightyPercentWarning();
		String usageLimitWarning();
		String lastFreeTrialNotificationDay();
		String monitorUsage();
	}

	private Integer id;
	private String name;
	private String website;
	private String notificationUrl;
	private Integer appearInSearch;
	private Integer createdAt;
	/**
	 * deprecated - lastName and firstName replaces this field
	 */
	private String adminName;
	private String adminEmail;
	private String description;
	private CommercialUseType commercialUse;
	private String landingPage;
	private String userLandingPage;
	private String contentCategories;
	private PartnerType type;
	private String phone;
	private String describeYourself;
	private Boolean adultContent;
	private String defConversionProfileType;
	private Integer notify;
	private PartnerStatus status;
	private Integer allowQuickEdit;
	private Integer mergeEntryLists;
	private String notificationsConfig;
	private String allowedFromEmailWhiteList;
	private Integer maxUploadSize;
	private Integer partnerPackage;
	private String secret;
	private String adminSecret;
	private String cmsPassword;
	private Integer allowMultiNotification;
	private Integer adminLoginUsersQuota;
	private String adminUserId;
	/**
	 * firstName and lastName replace the old (deprecated) adminName
	 */
	private String firstName;
	/**
	 * lastName and firstName replace the old (deprecated) adminName
	 */
	private String lastName;
	/**
	 * country code (2char) - this field is optional
	 */
	private String country;
	/**
	 * state code (2char) - this field is optional
	 */
	private String state;
	private List<KeyValue> additionalParams;
	private Integer publishersQuota;
	private PartnerGroupType partnerGroupType;
	private Boolean defaultEntitlementEnforcement;
	private String defaultDeliveryType;
	private String defaultEmbedCodeType;
	private List<PlayerDeliveryType> deliveryTypes;
	private List<PlayerEmbedCodeType> embedCodeTypes;
	private Integer templatePartnerId;
	private Boolean ignoreSeoLinks;
	private Boolean blockDirectLogin;
	private String host;
	private String cdnHost;
	private Boolean isFirstLogin;
	private String logoutUrl;
	private Integer partnerParentId;
	private String crmId;
	private String referenceId;
	private Boolean timeAlignedRenditions;
	private Integer publisherEnvironmentType;
	private String ovpEnvironmentUrl;
	private String ottEnvironmentUrl;
	private List<ESearchLanguageItem> eSearchLanguages;
	private PartnerAuthenticationType authenticationType;
	private String extendedFreeTrailExpiryReason;
	/**
	 * Unix timestamp (In seconds)
	 */
	private Integer extendedFreeTrailExpiryDate;
	private Integer extendedFreeTrail;
	private Boolean extendedFreeTrailEndsWarning;
	private Integer eightyPercentWarning;
	private Integer usageLimitWarning;
	private Integer lastFreeTrialNotificationDay;
	private Integer monitorUsage;

	// id:
	public Integer getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// website:
	public String getWebsite(){
		return this.website;
	}
	public void setWebsite(String website){
		this.website = website;
	}

	public void website(String multirequestToken){
		setToken("website", multirequestToken);
	}

	// notificationUrl:
	public String getNotificationUrl(){
		return this.notificationUrl;
	}
	public void setNotificationUrl(String notificationUrl){
		this.notificationUrl = notificationUrl;
	}

	public void notificationUrl(String multirequestToken){
		setToken("notificationUrl", multirequestToken);
	}

	// appearInSearch:
	public Integer getAppearInSearch(){
		return this.appearInSearch;
	}
	public void setAppearInSearch(Integer appearInSearch){
		this.appearInSearch = appearInSearch;
	}

	public void appearInSearch(String multirequestToken){
		setToken("appearInSearch", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// adminName:
	public String getAdminName(){
		return this.adminName;
	}
	public void setAdminName(String adminName){
		this.adminName = adminName;
	}

	public void adminName(String multirequestToken){
		setToken("adminName", multirequestToken);
	}

	// adminEmail:
	public String getAdminEmail(){
		return this.adminEmail;
	}
	public void setAdminEmail(String adminEmail){
		this.adminEmail = adminEmail;
	}

	public void adminEmail(String multirequestToken){
		setToken("adminEmail", multirequestToken);
	}

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

	// commercialUse:
	public CommercialUseType getCommercialUse(){
		return this.commercialUse;
	}
	public void setCommercialUse(CommercialUseType commercialUse){
		this.commercialUse = commercialUse;
	}

	public void commercialUse(String multirequestToken){
		setToken("commercialUse", multirequestToken);
	}

	// landingPage:
	public String getLandingPage(){
		return this.landingPage;
	}
	public void setLandingPage(String landingPage){
		this.landingPage = landingPage;
	}

	public void landingPage(String multirequestToken){
		setToken("landingPage", multirequestToken);
	}

	// userLandingPage:
	public String getUserLandingPage(){
		return this.userLandingPage;
	}
	public void setUserLandingPage(String userLandingPage){
		this.userLandingPage = userLandingPage;
	}

	public void userLandingPage(String multirequestToken){
		setToken("userLandingPage", multirequestToken);
	}

	// contentCategories:
	public String getContentCategories(){
		return this.contentCategories;
	}
	public void setContentCategories(String contentCategories){
		this.contentCategories = contentCategories;
	}

	public void contentCategories(String multirequestToken){
		setToken("contentCategories", multirequestToken);
	}

	// type:
	public PartnerType getType(){
		return this.type;
	}
	public void setType(PartnerType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// phone:
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	public void phone(String multirequestToken){
		setToken("phone", multirequestToken);
	}

	// describeYourself:
	public String getDescribeYourself(){
		return this.describeYourself;
	}
	public void setDescribeYourself(String describeYourself){
		this.describeYourself = describeYourself;
	}

	public void describeYourself(String multirequestToken){
		setToken("describeYourself", multirequestToken);
	}

	// adultContent:
	public Boolean getAdultContent(){
		return this.adultContent;
	}
	public void setAdultContent(Boolean adultContent){
		this.adultContent = adultContent;
	}

	public void adultContent(String multirequestToken){
		setToken("adultContent", multirequestToken);
	}

	// defConversionProfileType:
	public String getDefConversionProfileType(){
		return this.defConversionProfileType;
	}
	public void setDefConversionProfileType(String defConversionProfileType){
		this.defConversionProfileType = defConversionProfileType;
	}

	public void defConversionProfileType(String multirequestToken){
		setToken("defConversionProfileType", multirequestToken);
	}

	// notify:
	public Integer getNotify(){
		return this.notify;
	}
	public void setNotify(Integer notify){
		this.notify = notify;
	}

	public void notify(String multirequestToken){
		setToken("notify", multirequestToken);
	}

	// status:
	public PartnerStatus getStatus(){
		return this.status;
	}
	// allowQuickEdit:
	public Integer getAllowQuickEdit(){
		return this.allowQuickEdit;
	}
	public void setAllowQuickEdit(Integer allowQuickEdit){
		this.allowQuickEdit = allowQuickEdit;
	}

	public void allowQuickEdit(String multirequestToken){
		setToken("allowQuickEdit", multirequestToken);
	}

	// mergeEntryLists:
	public Integer getMergeEntryLists(){
		return this.mergeEntryLists;
	}
	public void setMergeEntryLists(Integer mergeEntryLists){
		this.mergeEntryLists = mergeEntryLists;
	}

	public void mergeEntryLists(String multirequestToken){
		setToken("mergeEntryLists", multirequestToken);
	}

	// notificationsConfig:
	public String getNotificationsConfig(){
		return this.notificationsConfig;
	}
	public void setNotificationsConfig(String notificationsConfig){
		this.notificationsConfig = notificationsConfig;
	}

	public void notificationsConfig(String multirequestToken){
		setToken("notificationsConfig", multirequestToken);
	}

	// allowedFromEmailWhiteList:
	public String getAllowedFromEmailWhiteList(){
		return this.allowedFromEmailWhiteList;
	}
	public void setAllowedFromEmailWhiteList(String allowedFromEmailWhiteList){
		this.allowedFromEmailWhiteList = allowedFromEmailWhiteList;
	}

	public void allowedFromEmailWhiteList(String multirequestToken){
		setToken("allowedFromEmailWhiteList", multirequestToken);
	}

	// maxUploadSize:
	public Integer getMaxUploadSize(){
		return this.maxUploadSize;
	}
	public void setMaxUploadSize(Integer maxUploadSize){
		this.maxUploadSize = maxUploadSize;
	}

	public void maxUploadSize(String multirequestToken){
		setToken("maxUploadSize", multirequestToken);
	}

	// partnerPackage:
	public Integer getPartnerPackage(){
		return this.partnerPackage;
	}
	public void setPartnerPackage(Integer partnerPackage){
		this.partnerPackage = partnerPackage;
	}

	public void partnerPackage(String multirequestToken){
		setToken("partnerPackage", multirequestToken);
	}

	// secret:
	public String getSecret(){
		return this.secret;
	}
	// adminSecret:
	public String getAdminSecret(){
		return this.adminSecret;
	}
	// cmsPassword:
	public String getCmsPassword(){
		return this.cmsPassword;
	}
	// allowMultiNotification:
	public Integer getAllowMultiNotification(){
		return this.allowMultiNotification;
	}
	public void setAllowMultiNotification(Integer allowMultiNotification){
		this.allowMultiNotification = allowMultiNotification;
	}

	public void allowMultiNotification(String multirequestToken){
		setToken("allowMultiNotification", multirequestToken);
	}

	// adminLoginUsersQuota:
	public Integer getAdminLoginUsersQuota(){
		return this.adminLoginUsersQuota;
	}
	// adminUserId:
	public String getAdminUserId(){
		return this.adminUserId;
	}
	public void setAdminUserId(String adminUserId){
		this.adminUserId = adminUserId;
	}

	public void adminUserId(String multirequestToken){
		setToken("adminUserId", multirequestToken);
	}

	// firstName:
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void firstName(String multirequestToken){
		setToken("firstName", multirequestToken);
	}

	// lastName:
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void lastName(String multirequestToken){
		setToken("lastName", multirequestToken);
	}

	// country:
	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country = country;
	}

	public void country(String multirequestToken){
		setToken("country", multirequestToken);
	}

	// state:
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}

	public void state(String multirequestToken){
		setToken("state", multirequestToken);
	}

	// additionalParams:
	public List<KeyValue> getAdditionalParams(){
		return this.additionalParams;
	}
	public void setAdditionalParams(List<KeyValue> additionalParams){
		this.additionalParams = additionalParams;
	}

	// publishersQuota:
	public Integer getPublishersQuota(){
		return this.publishersQuota;
	}
	// partnerGroupType:
	public PartnerGroupType getPartnerGroupType(){
		return this.partnerGroupType;
	}
	// defaultEntitlementEnforcement:
	public Boolean getDefaultEntitlementEnforcement(){
		return this.defaultEntitlementEnforcement;
	}
	// defaultDeliveryType:
	public String getDefaultDeliveryType(){
		return this.defaultDeliveryType;
	}
	// defaultEmbedCodeType:
	public String getDefaultEmbedCodeType(){
		return this.defaultEmbedCodeType;
	}
	// deliveryTypes:
	public List<PlayerDeliveryType> getDeliveryTypes(){
		return this.deliveryTypes;
	}
	// embedCodeTypes:
	public List<PlayerEmbedCodeType> getEmbedCodeTypes(){
		return this.embedCodeTypes;
	}
	// templatePartnerId:
	public Integer getTemplatePartnerId(){
		return this.templatePartnerId;
	}
	// ignoreSeoLinks:
	public Boolean getIgnoreSeoLinks(){
		return this.ignoreSeoLinks;
	}
	// blockDirectLogin:
	public Boolean getBlockDirectLogin(){
		return this.blockDirectLogin;
	}
	// host:
	public String getHost(){
		return this.host;
	}
	// cdnHost:
	public String getCdnHost(){
		return this.cdnHost;
	}
	// isFirstLogin:
	public Boolean getIsFirstLogin(){
		return this.isFirstLogin;
	}
	// logoutUrl:
	public String getLogoutUrl(){
		return this.logoutUrl;
	}
	// partnerParentId:
	public Integer getPartnerParentId(){
		return this.partnerParentId;
	}
	public void setPartnerParentId(Integer partnerParentId){
		this.partnerParentId = partnerParentId;
	}

	public void partnerParentId(String multirequestToken){
		setToken("partnerParentId", multirequestToken);
	}

	// crmId:
	public String getCrmId(){
		return this.crmId;
	}
	// referenceId:
	public String getReferenceId(){
		return this.referenceId;
	}
	public void setReferenceId(String referenceId){
		this.referenceId = referenceId;
	}

	public void referenceId(String multirequestToken){
		setToken("referenceId", multirequestToken);
	}

	// timeAlignedRenditions:
	public Boolean getTimeAlignedRenditions(){
		return this.timeAlignedRenditions;
	}
	// publisherEnvironmentType:
	public Integer getPublisherEnvironmentType(){
		return this.publisherEnvironmentType;
	}
	// ovpEnvironmentUrl:
	public String getOvpEnvironmentUrl(){
		return this.ovpEnvironmentUrl;
	}
	// ottEnvironmentUrl:
	public String getOttEnvironmentUrl(){
		return this.ottEnvironmentUrl;
	}
	// eSearchLanguages:
	public List<ESearchLanguageItem> getESearchLanguages(){
		return this.eSearchLanguages;
	}
	public void setESearchLanguages(List<ESearchLanguageItem> eSearchLanguages){
		this.eSearchLanguages = eSearchLanguages;
	}

	// authenticationType:
	public PartnerAuthenticationType getAuthenticationType(){
		return this.authenticationType;
	}
	// extendedFreeTrailExpiryReason:
	public String getExtendedFreeTrailExpiryReason(){
		return this.extendedFreeTrailExpiryReason;
	}
	// extendedFreeTrailExpiryDate:
	public Integer getExtendedFreeTrailExpiryDate(){
		return this.extendedFreeTrailExpiryDate;
	}
	// extendedFreeTrail:
	public Integer getExtendedFreeTrail(){
		return this.extendedFreeTrail;
	}
	// extendedFreeTrailEndsWarning:
	public Boolean getExtendedFreeTrailEndsWarning(){
		return this.extendedFreeTrailEndsWarning;
	}
	// eightyPercentWarning:
	public Integer getEightyPercentWarning(){
		return this.eightyPercentWarning;
	}
	// usageLimitWarning:
	public Integer getUsageLimitWarning(){
		return this.usageLimitWarning;
	}
	// lastFreeTrialNotificationDay:
	public Integer getLastFreeTrialNotificationDay(){
		return this.lastFreeTrialNotificationDay;
	}
	// monitorUsage:
	public Integer getMonitorUsage(){
		return this.monitorUsage;
	}

	public Partner() {
		super();
	}

	public Partner(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		website = GsonParser.parseString(jsonObject.get("website"));
		notificationUrl = GsonParser.parseString(jsonObject.get("notificationUrl"));
		appearInSearch = GsonParser.parseInt(jsonObject.get("appearInSearch"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		adminName = GsonParser.parseString(jsonObject.get("adminName"));
		adminEmail = GsonParser.parseString(jsonObject.get("adminEmail"));
		description = GsonParser.parseString(jsonObject.get("description"));
		commercialUse = CommercialUseType.get(GsonParser.parseInt(jsonObject.get("commercialUse")));
		landingPage = GsonParser.parseString(jsonObject.get("landingPage"));
		userLandingPage = GsonParser.parseString(jsonObject.get("userLandingPage"));
		contentCategories = GsonParser.parseString(jsonObject.get("contentCategories"));
		type = PartnerType.get(GsonParser.parseInt(jsonObject.get("type")));
		phone = GsonParser.parseString(jsonObject.get("phone"));
		describeYourself = GsonParser.parseString(jsonObject.get("describeYourself"));
		adultContent = GsonParser.parseBoolean(jsonObject.get("adultContent"));
		defConversionProfileType = GsonParser.parseString(jsonObject.get("defConversionProfileType"));
		notify = GsonParser.parseInt(jsonObject.get("notify"));
		status = PartnerStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		allowQuickEdit = GsonParser.parseInt(jsonObject.get("allowQuickEdit"));
		mergeEntryLists = GsonParser.parseInt(jsonObject.get("mergeEntryLists"));
		notificationsConfig = GsonParser.parseString(jsonObject.get("notificationsConfig"));
		allowedFromEmailWhiteList = GsonParser.parseString(jsonObject.get("allowedFromEmailWhiteList"));
		maxUploadSize = GsonParser.parseInt(jsonObject.get("maxUploadSize"));
		partnerPackage = GsonParser.parseInt(jsonObject.get("partnerPackage"));
		secret = GsonParser.parseString(jsonObject.get("secret"));
		adminSecret = GsonParser.parseString(jsonObject.get("adminSecret"));
		cmsPassword = GsonParser.parseString(jsonObject.get("cmsPassword"));
		allowMultiNotification = GsonParser.parseInt(jsonObject.get("allowMultiNotification"));
		adminLoginUsersQuota = GsonParser.parseInt(jsonObject.get("adminLoginUsersQuota"));
		adminUserId = GsonParser.parseString(jsonObject.get("adminUserId"));
		firstName = GsonParser.parseString(jsonObject.get("firstName"));
		lastName = GsonParser.parseString(jsonObject.get("lastName"));
		country = GsonParser.parseString(jsonObject.get("country"));
		state = GsonParser.parseString(jsonObject.get("state"));
		additionalParams = GsonParser.parseArray(jsonObject.getAsJsonArray("additionalParams"), KeyValue.class);
		publishersQuota = GsonParser.parseInt(jsonObject.get("publishersQuota"));
		partnerGroupType = PartnerGroupType.get(GsonParser.parseInt(jsonObject.get("partnerGroupType")));
		defaultEntitlementEnforcement = GsonParser.parseBoolean(jsonObject.get("defaultEntitlementEnforcement"));
		defaultDeliveryType = GsonParser.parseString(jsonObject.get("defaultDeliveryType"));
		defaultEmbedCodeType = GsonParser.parseString(jsonObject.get("defaultEmbedCodeType"));
		deliveryTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryTypes"), PlayerDeliveryType.class);
		embedCodeTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("embedCodeTypes"), PlayerEmbedCodeType.class);
		templatePartnerId = GsonParser.parseInt(jsonObject.get("templatePartnerId"));
		ignoreSeoLinks = GsonParser.parseBoolean(jsonObject.get("ignoreSeoLinks"));
		blockDirectLogin = GsonParser.parseBoolean(jsonObject.get("blockDirectLogin"));
		host = GsonParser.parseString(jsonObject.get("host"));
		cdnHost = GsonParser.parseString(jsonObject.get("cdnHost"));
		isFirstLogin = GsonParser.parseBoolean(jsonObject.get("isFirstLogin"));
		logoutUrl = GsonParser.parseString(jsonObject.get("logoutUrl"));
		partnerParentId = GsonParser.parseInt(jsonObject.get("partnerParentId"));
		crmId = GsonParser.parseString(jsonObject.get("crmId"));
		referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
		timeAlignedRenditions = GsonParser.parseBoolean(jsonObject.get("timeAlignedRenditions"));
		publisherEnvironmentType = GsonParser.parseInt(jsonObject.get("publisherEnvironmentType"));
		ovpEnvironmentUrl = GsonParser.parseString(jsonObject.get("ovpEnvironmentUrl"));
		ottEnvironmentUrl = GsonParser.parseString(jsonObject.get("ottEnvironmentUrl"));
		eSearchLanguages = GsonParser.parseArray(jsonObject.getAsJsonArray("eSearchLanguages"), ESearchLanguageItem.class);
		authenticationType = PartnerAuthenticationType.get(GsonParser.parseInt(jsonObject.get("authenticationType")));
		extendedFreeTrailExpiryReason = GsonParser.parseString(jsonObject.get("extendedFreeTrailExpiryReason"));
		extendedFreeTrailExpiryDate = GsonParser.parseInt(jsonObject.get("extendedFreeTrailExpiryDate"));
		extendedFreeTrail = GsonParser.parseInt(jsonObject.get("extendedFreeTrail"));
		extendedFreeTrailEndsWarning = GsonParser.parseBoolean(jsonObject.get("extendedFreeTrailEndsWarning"));
		eightyPercentWarning = GsonParser.parseInt(jsonObject.get("eightyPercentWarning"));
		usageLimitWarning = GsonParser.parseInt(jsonObject.get("usageLimitWarning"));
		lastFreeTrialNotificationDay = GsonParser.parseInt(jsonObject.get("lastFreeTrialNotificationDay"));
		monitorUsage = GsonParser.parseInt(jsonObject.get("monitorUsage"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPartner");
		kparams.add("name", this.name);
		kparams.add("website", this.website);
		kparams.add("notificationUrl", this.notificationUrl);
		kparams.add("appearInSearch", this.appearInSearch);
		kparams.add("adminName", this.adminName);
		kparams.add("adminEmail", this.adminEmail);
		kparams.add("description", this.description);
		kparams.add("commercialUse", this.commercialUse);
		kparams.add("landingPage", this.landingPage);
		kparams.add("userLandingPage", this.userLandingPage);
		kparams.add("contentCategories", this.contentCategories);
		kparams.add("type", this.type);
		kparams.add("phone", this.phone);
		kparams.add("describeYourself", this.describeYourself);
		kparams.add("adultContent", this.adultContent);
		kparams.add("defConversionProfileType", this.defConversionProfileType);
		kparams.add("notify", this.notify);
		kparams.add("allowQuickEdit", this.allowQuickEdit);
		kparams.add("mergeEntryLists", this.mergeEntryLists);
		kparams.add("notificationsConfig", this.notificationsConfig);
		kparams.add("allowedFromEmailWhiteList", this.allowedFromEmailWhiteList);
		kparams.add("maxUploadSize", this.maxUploadSize);
		kparams.add("partnerPackage", this.partnerPackage);
		kparams.add("allowMultiNotification", this.allowMultiNotification);
		kparams.add("adminUserId", this.adminUserId);
		kparams.add("firstName", this.firstName);
		kparams.add("lastName", this.lastName);
		kparams.add("country", this.country);
		kparams.add("state", this.state);
		kparams.add("additionalParams", this.additionalParams);
		kparams.add("partnerParentId", this.partnerParentId);
		kparams.add("referenceId", this.referenceId);
		kparams.add("eSearchLanguages", this.eSearchLanguages);
		return kparams;
	}


    public static final Creator<Partner> CREATOR = new Creator<Partner>() {
        @Override
        public Partner createFromParcel(Parcel source) {
            return new Partner(source);
        }

        @Override
        public Partner[] newArray(int size) {
            return new Partner[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.website);
        dest.writeString(this.notificationUrl);
        dest.writeValue(this.appearInSearch);
        dest.writeValue(this.createdAt);
        dest.writeString(this.adminName);
        dest.writeString(this.adminEmail);
        dest.writeString(this.description);
        dest.writeInt(this.commercialUse == null ? -1 : this.commercialUse.ordinal());
        dest.writeString(this.landingPage);
        dest.writeString(this.userLandingPage);
        dest.writeString(this.contentCategories);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeString(this.phone);
        dest.writeString(this.describeYourself);
        dest.writeValue(this.adultContent);
        dest.writeString(this.defConversionProfileType);
        dest.writeValue(this.notify);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.allowQuickEdit);
        dest.writeValue(this.mergeEntryLists);
        dest.writeString(this.notificationsConfig);
        dest.writeString(this.allowedFromEmailWhiteList);
        dest.writeValue(this.maxUploadSize);
        dest.writeValue(this.partnerPackage);
        dest.writeString(this.secret);
        dest.writeString(this.adminSecret);
        dest.writeString(this.cmsPassword);
        dest.writeValue(this.allowMultiNotification);
        dest.writeValue(this.adminLoginUsersQuota);
        dest.writeString(this.adminUserId);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.country);
        dest.writeString(this.state);
        if(this.additionalParams != null) {
            dest.writeInt(this.additionalParams.size());
            dest.writeList(this.additionalParams);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.publishersQuota);
        dest.writeInt(this.partnerGroupType == null ? -1 : this.partnerGroupType.ordinal());
        dest.writeValue(this.defaultEntitlementEnforcement);
        dest.writeString(this.defaultDeliveryType);
        dest.writeString(this.defaultEmbedCodeType);
        if(this.deliveryTypes != null) {
            dest.writeInt(this.deliveryTypes.size());
            dest.writeList(this.deliveryTypes);
        } else {
            dest.writeInt(-1);
        }
        if(this.embedCodeTypes != null) {
            dest.writeInt(this.embedCodeTypes.size());
            dest.writeList(this.embedCodeTypes);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.templatePartnerId);
        dest.writeValue(this.ignoreSeoLinks);
        dest.writeValue(this.blockDirectLogin);
        dest.writeString(this.host);
        dest.writeString(this.cdnHost);
        dest.writeValue(this.isFirstLogin);
        dest.writeString(this.logoutUrl);
        dest.writeValue(this.partnerParentId);
        dest.writeString(this.crmId);
        dest.writeString(this.referenceId);
        dest.writeValue(this.timeAlignedRenditions);
        dest.writeValue(this.publisherEnvironmentType);
        dest.writeString(this.ovpEnvironmentUrl);
        dest.writeString(this.ottEnvironmentUrl);
        if(this.eSearchLanguages != null) {
            dest.writeInt(this.eSearchLanguages.size());
            dest.writeList(this.eSearchLanguages);
        } else {
            dest.writeInt(-1);
        }
        dest.writeInt(this.authenticationType == null ? -1 : this.authenticationType.ordinal());
        dest.writeString(this.extendedFreeTrailExpiryReason);
        dest.writeValue(this.extendedFreeTrailExpiryDate);
        dest.writeValue(this.extendedFreeTrail);
        dest.writeValue(this.extendedFreeTrailEndsWarning);
        dest.writeValue(this.eightyPercentWarning);
        dest.writeValue(this.usageLimitWarning);
        dest.writeValue(this.lastFreeTrialNotificationDay);
        dest.writeValue(this.monitorUsage);
    }

    public Partner(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.website = in.readString();
        this.notificationUrl = in.readString();
        this.appearInSearch = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.adminName = in.readString();
        this.adminEmail = in.readString();
        this.description = in.readString();
        int tmpCommercialUse = in.readInt();
        this.commercialUse = tmpCommercialUse == -1 ? null : CommercialUseType.values()[tmpCommercialUse];
        this.landingPage = in.readString();
        this.userLandingPage = in.readString();
        this.contentCategories = in.readString();
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : PartnerType.values()[tmpType];
        this.phone = in.readString();
        this.describeYourself = in.readString();
        this.adultContent = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.defConversionProfileType = in.readString();
        this.notify = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : PartnerStatus.values()[tmpStatus];
        this.allowQuickEdit = (Integer)in.readValue(Integer.class.getClassLoader());
        this.mergeEntryLists = (Integer)in.readValue(Integer.class.getClassLoader());
        this.notificationsConfig = in.readString();
        this.allowedFromEmailWhiteList = in.readString();
        this.maxUploadSize = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerPackage = (Integer)in.readValue(Integer.class.getClassLoader());
        this.secret = in.readString();
        this.adminSecret = in.readString();
        this.cmsPassword = in.readString();
        this.allowMultiNotification = (Integer)in.readValue(Integer.class.getClassLoader());
        this.adminLoginUsersQuota = (Integer)in.readValue(Integer.class.getClassLoader());
        this.adminUserId = in.readString();
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.country = in.readString();
        this.state = in.readString();
        int additionalParamsSize = in.readInt();
        if( additionalParamsSize > -1) {
            this.additionalParams = new ArrayList<>();
            in.readList(this.additionalParams, KeyValue.class.getClassLoader());
        }
        this.publishersQuota = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpPartnerGroupType = in.readInt();
        this.partnerGroupType = tmpPartnerGroupType == -1 ? null : PartnerGroupType.values()[tmpPartnerGroupType];
        this.defaultEntitlementEnforcement = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.defaultDeliveryType = in.readString();
        this.defaultEmbedCodeType = in.readString();
        int deliveryTypesSize = in.readInt();
        if( deliveryTypesSize > -1) {
            this.deliveryTypes = new ArrayList<>();
            in.readList(this.deliveryTypes, PlayerDeliveryType.class.getClassLoader());
        }
        int embedCodeTypesSize = in.readInt();
        if( embedCodeTypesSize > -1) {
            this.embedCodeTypes = new ArrayList<>();
            in.readList(this.embedCodeTypes, PlayerEmbedCodeType.class.getClassLoader());
        }
        this.templatePartnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.ignoreSeoLinks = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.blockDirectLogin = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.host = in.readString();
        this.cdnHost = in.readString();
        this.isFirstLogin = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.logoutUrl = in.readString();
        this.partnerParentId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.crmId = in.readString();
        this.referenceId = in.readString();
        this.timeAlignedRenditions = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.publisherEnvironmentType = (Integer)in.readValue(Integer.class.getClassLoader());
        this.ovpEnvironmentUrl = in.readString();
        this.ottEnvironmentUrl = in.readString();
        int eSearchLanguagesSize = in.readInt();
        if( eSearchLanguagesSize > -1) {
            this.eSearchLanguages = new ArrayList<>();
            in.readList(this.eSearchLanguages, ESearchLanguageItem.class.getClassLoader());
        }
        int tmpAuthenticationType = in.readInt();
        this.authenticationType = tmpAuthenticationType == -1 ? null : PartnerAuthenticationType.values()[tmpAuthenticationType];
        this.extendedFreeTrailExpiryReason = in.readString();
        this.extendedFreeTrailExpiryDate = (Integer)in.readValue(Integer.class.getClassLoader());
        this.extendedFreeTrail = (Integer)in.readValue(Integer.class.getClassLoader());
        this.extendedFreeTrailEndsWarning = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.eightyPercentWarning = (Integer)in.readValue(Integer.class.getClassLoader());
        this.usageLimitWarning = (Integer)in.readValue(Integer.class.getClassLoader());
        this.lastFreeTrialNotificationDay = (Integer)in.readValue(Integer.class.getClassLoader());
        this.monitorUsage = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

