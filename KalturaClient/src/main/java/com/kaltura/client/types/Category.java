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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.AppearInListType;
import com.kaltura.client.enums.CategoryOrderBy;
import com.kaltura.client.enums.CategoryStatus;
import com.kaltura.client.enums.CategoryUserPermissionLevel;
import com.kaltura.client.enums.ContributionPolicyType;
import com.kaltura.client.enums.InheritanceType;
import com.kaltura.client.enums.PrivacyType;
import com.kaltura.client.enums.UserJoinPolicyType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Category.Tokenizer.class)
public class Category extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String parentId();
		String depth();
		String partnerId();
		String name();
		String fullName();
		String fullIds();
		String entriesCount();
		String createdAt();
		String updatedAt();
		String description();
		String tags();
		String appearInList();
		String privacy();
		String inheritanceType();
		String userJoinPolicy();
		String defaultPermissionLevel();
		String owner();
		String directEntriesCount();
		String referenceId();
		String contributionPolicy();
		String membersCount();
		String pendingMembersCount();
		String privacyContext();
		String privacyContexts();
		String status();
		String inheritedParentId();
		String partnerSortValue();
		String partnerData();
		String defaultOrderBy();
		String directSubCategoriesCount();
		String moderation();
		String pendingEntriesCount();
		String isAggregationCategory();
		String aggregationCategories();
	}

	/**
	 * The id of the Category
	 */
	private Integer id;
	private Integer parentId;
	private Integer depth;
	private Integer partnerId;
	/**
	 * The name of the Category.    The following characters are not allowed: '&lt;',
	  '&gt;', ','
	 */
	private String name;
	/**
	 * The full name of the Category
	 */
	private String fullName;
	/**
	 * The full ids of the Category
	 */
	private String fullIds;
	/**
	 * Number of entries in this Category (including child categories)
	 */
	private Integer entriesCount;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Update date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * Category description
	 */
	private String description;
	/**
	 * Category tags
	 */
	private String tags;
	/**
	 * If category will be returned for list action.
	 */
	private AppearInListType appearInList;
	/**
	 * defines the privacy of the entries that assigned to this category
	 */
	private PrivacyType privacy;
	/**
	 * If Category members are inherited from parent category or set manualy.
	 */
	private InheritanceType inheritanceType;
	/**
	 * Who can ask to join this category
	 */
	private UserJoinPolicyType userJoinPolicy;
	/**
	 * Default permissionLevel for new users
	 */
	private CategoryUserPermissionLevel defaultPermissionLevel;
	/**
	 * Category Owner (User id)
	 */
	private String owner;
	/**
	 * Number of entries that belong to this category directly
	 */
	private Integer directEntriesCount;
	/**
	 * Category external id, controlled and managed by the partner.
	 */
	private String referenceId;
	/**
	 * who can assign entries to this category
	 */
	private ContributionPolicyType contributionPolicy;
	/**
	 * Number of active members for this category
	 */
	private Integer membersCount;
	/**
	 * Number of pending members for this category
	 */
	private Integer pendingMembersCount;
	/**
	 * Set privacy context for search entries that assiged to private and public
	  categories. the entries will be private if the search context is set with those
	  categories.
	 */
	private String privacyContext;
	/**
	 * comma separated parents that defines a privacyContext for search
	 */
	private String privacyContexts;
	/**
	 * Status
	 */
	private CategoryStatus status;
	/**
	 * The category id that this category inherit its members and members permission
	  (for contribution and join)
	 */
	private Integer inheritedParentId;
	/**
	 * Can be used to store various partner related data as a numeric value
	 */
	private Integer partnerSortValue;
	/**
	 * Can be used to store various partner related data as a string
	 */
	private String partnerData;
	/**
	 * Enable client side applications to define how to sort the category child
	  categories
	 */
	private CategoryOrderBy defaultOrderBy;
	/**
	 * Number of direct children categories
	 */
	private Integer directSubCategoriesCount;
	/**
	 * Moderation to add entries to this category by users that are not of permission
	  level Manager or Moderator.
	 */
	private Boolean moderation;
	/**
	 * Nunber of pending moderation entries
	 */
	private Integer pendingEntriesCount;
	/**
	 * Flag indicating that the category is an aggregation category
	 */
	private Boolean isAggregationCategory;
	/**
	 * List of aggregation channels the category belongs to
	 */
	private String aggregationCategories;

	// id:
	public Integer getId(){
		return this.id;
	}
	// parentId:
	public Integer getParentId(){
		return this.parentId;
	}
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}

	public void parentId(String multirequestToken){
		setToken("parentId", multirequestToken);
	}

	// depth:
	public Integer getDepth(){
		return this.depth;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
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

	// fullName:
	public String getFullName(){
		return this.fullName;
	}
	// fullIds:
	public String getFullIds(){
		return this.fullIds;
	}
	// entriesCount:
	public Integer getEntriesCount(){
		return this.entriesCount;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
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

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// appearInList:
	public AppearInListType getAppearInList(){
		return this.appearInList;
	}
	public void setAppearInList(AppearInListType appearInList){
		this.appearInList = appearInList;
	}

	public void appearInList(String multirequestToken){
		setToken("appearInList", multirequestToken);
	}

	// privacy:
	public PrivacyType getPrivacy(){
		return this.privacy;
	}
	public void setPrivacy(PrivacyType privacy){
		this.privacy = privacy;
	}

	public void privacy(String multirequestToken){
		setToken("privacy", multirequestToken);
	}

	// inheritanceType:
	public InheritanceType getInheritanceType(){
		return this.inheritanceType;
	}
	public void setInheritanceType(InheritanceType inheritanceType){
		this.inheritanceType = inheritanceType;
	}

	public void inheritanceType(String multirequestToken){
		setToken("inheritanceType", multirequestToken);
	}

	// userJoinPolicy:
	public UserJoinPolicyType getUserJoinPolicy(){
		return this.userJoinPolicy;
	}
	// defaultPermissionLevel:
	public CategoryUserPermissionLevel getDefaultPermissionLevel(){
		return this.defaultPermissionLevel;
	}
	public void setDefaultPermissionLevel(CategoryUserPermissionLevel defaultPermissionLevel){
		this.defaultPermissionLevel = defaultPermissionLevel;
	}

	public void defaultPermissionLevel(String multirequestToken){
		setToken("defaultPermissionLevel", multirequestToken);
	}

	// owner:
	public String getOwner(){
		return this.owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}

	public void owner(String multirequestToken){
		setToken("owner", multirequestToken);
	}

	// directEntriesCount:
	public Integer getDirectEntriesCount(){
		return this.directEntriesCount;
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

	// contributionPolicy:
	public ContributionPolicyType getContributionPolicy(){
		return this.contributionPolicy;
	}
	public void setContributionPolicy(ContributionPolicyType contributionPolicy){
		this.contributionPolicy = contributionPolicy;
	}

	public void contributionPolicy(String multirequestToken){
		setToken("contributionPolicy", multirequestToken);
	}

	// membersCount:
	public Integer getMembersCount(){
		return this.membersCount;
	}
	// pendingMembersCount:
	public Integer getPendingMembersCount(){
		return this.pendingMembersCount;
	}
	// privacyContext:
	public String getPrivacyContext(){
		return this.privacyContext;
	}
	public void setPrivacyContext(String privacyContext){
		this.privacyContext = privacyContext;
	}

	public void privacyContext(String multirequestToken){
		setToken("privacyContext", multirequestToken);
	}

	// privacyContexts:
	public String getPrivacyContexts(){
		return this.privacyContexts;
	}
	// status:
	public CategoryStatus getStatus(){
		return this.status;
	}
	// inheritedParentId:
	public Integer getInheritedParentId(){
		return this.inheritedParentId;
	}
	// partnerSortValue:
	public Integer getPartnerSortValue(){
		return this.partnerSortValue;
	}
	public void setPartnerSortValue(Integer partnerSortValue){
		this.partnerSortValue = partnerSortValue;
	}

	public void partnerSortValue(String multirequestToken){
		setToken("partnerSortValue", multirequestToken);
	}

	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// defaultOrderBy:
	public CategoryOrderBy getDefaultOrderBy(){
		return this.defaultOrderBy;
	}
	public void setDefaultOrderBy(CategoryOrderBy defaultOrderBy){
		this.defaultOrderBy = defaultOrderBy;
	}

	public void defaultOrderBy(String multirequestToken){
		setToken("defaultOrderBy", multirequestToken);
	}

	// directSubCategoriesCount:
	public Integer getDirectSubCategoriesCount(){
		return this.directSubCategoriesCount;
	}
	// moderation:
	public Boolean getModeration(){
		return this.moderation;
	}
	public void setModeration(Boolean moderation){
		this.moderation = moderation;
	}

	public void moderation(String multirequestToken){
		setToken("moderation", multirequestToken);
	}

	// pendingEntriesCount:
	public Integer getPendingEntriesCount(){
		return this.pendingEntriesCount;
	}
	// isAggregationCategory:
	public Boolean getIsAggregationCategory(){
		return this.isAggregationCategory;
	}
	public void setIsAggregationCategory(Boolean isAggregationCategory){
		this.isAggregationCategory = isAggregationCategory;
	}

	public void isAggregationCategory(String multirequestToken){
		setToken("isAggregationCategory", multirequestToken);
	}

	// aggregationCategories:
	public String getAggregationCategories(){
		return this.aggregationCategories;
	}
	public void setAggregationCategories(String aggregationCategories){
		this.aggregationCategories = aggregationCategories;
	}

	public void aggregationCategories(String multirequestToken){
		setToken("aggregationCategories", multirequestToken);
	}


	public Category() {
		super();
	}

	public Category(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		parentId = GsonParser.parseInt(jsonObject.get("parentId"));
		depth = GsonParser.parseInt(jsonObject.get("depth"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		fullName = GsonParser.parseString(jsonObject.get("fullName"));
		fullIds = GsonParser.parseString(jsonObject.get("fullIds"));
		entriesCount = GsonParser.parseInt(jsonObject.get("entriesCount"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		description = GsonParser.parseString(jsonObject.get("description"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		appearInList = AppearInListType.get(GsonParser.parseInt(jsonObject.get("appearInList")));
		privacy = PrivacyType.get(GsonParser.parseInt(jsonObject.get("privacy")));
		inheritanceType = InheritanceType.get(GsonParser.parseInt(jsonObject.get("inheritanceType")));
		userJoinPolicy = UserJoinPolicyType.get(GsonParser.parseInt(jsonObject.get("userJoinPolicy")));
		defaultPermissionLevel = CategoryUserPermissionLevel.get(GsonParser.parseInt(jsonObject.get("defaultPermissionLevel")));
		owner = GsonParser.parseString(jsonObject.get("owner"));
		directEntriesCount = GsonParser.parseInt(jsonObject.get("directEntriesCount"));
		referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
		contributionPolicy = ContributionPolicyType.get(GsonParser.parseInt(jsonObject.get("contributionPolicy")));
		membersCount = GsonParser.parseInt(jsonObject.get("membersCount"));
		pendingMembersCount = GsonParser.parseInt(jsonObject.get("pendingMembersCount"));
		privacyContext = GsonParser.parseString(jsonObject.get("privacyContext"));
		privacyContexts = GsonParser.parseString(jsonObject.get("privacyContexts"));
		status = CategoryStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		inheritedParentId = GsonParser.parseInt(jsonObject.get("inheritedParentId"));
		partnerSortValue = GsonParser.parseInt(jsonObject.get("partnerSortValue"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		defaultOrderBy = CategoryOrderBy.get(GsonParser.parseString(jsonObject.get("defaultOrderBy")));
		directSubCategoriesCount = GsonParser.parseInt(jsonObject.get("directSubCategoriesCount"));
		moderation = GsonParser.parseBoolean(jsonObject.get("moderation"));
		pendingEntriesCount = GsonParser.parseInt(jsonObject.get("pendingEntriesCount"));
		isAggregationCategory = GsonParser.parseBoolean(jsonObject.get("isAggregationCategory"));
		aggregationCategories = GsonParser.parseString(jsonObject.get("aggregationCategories"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategory");
		kparams.add("parentId", this.parentId);
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("appearInList", this.appearInList);
		kparams.add("privacy", this.privacy);
		kparams.add("inheritanceType", this.inheritanceType);
		kparams.add("defaultPermissionLevel", this.defaultPermissionLevel);
		kparams.add("owner", this.owner);
		kparams.add("referenceId", this.referenceId);
		kparams.add("contributionPolicy", this.contributionPolicy);
		kparams.add("privacyContext", this.privacyContext);
		kparams.add("partnerSortValue", this.partnerSortValue);
		kparams.add("partnerData", this.partnerData);
		kparams.add("defaultOrderBy", this.defaultOrderBy);
		kparams.add("moderation", this.moderation);
		kparams.add("isAggregationCategory", this.isAggregationCategory);
		kparams.add("aggregationCategories", this.aggregationCategories);
		return kparams;
	}


    public static final Creator<Category> CREATOR = new Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel source) {
            return new Category(source);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.parentId);
        dest.writeValue(this.depth);
        dest.writeValue(this.partnerId);
        dest.writeString(this.name);
        dest.writeString(this.fullName);
        dest.writeString(this.fullIds);
        dest.writeValue(this.entriesCount);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeString(this.description);
        dest.writeString(this.tags);
        dest.writeInt(this.appearInList == null ? -1 : this.appearInList.ordinal());
        dest.writeInt(this.privacy == null ? -1 : this.privacy.ordinal());
        dest.writeInt(this.inheritanceType == null ? -1 : this.inheritanceType.ordinal());
        dest.writeInt(this.userJoinPolicy == null ? -1 : this.userJoinPolicy.ordinal());
        dest.writeInt(this.defaultPermissionLevel == null ? -1 : this.defaultPermissionLevel.ordinal());
        dest.writeString(this.owner);
        dest.writeValue(this.directEntriesCount);
        dest.writeString(this.referenceId);
        dest.writeInt(this.contributionPolicy == null ? -1 : this.contributionPolicy.ordinal());
        dest.writeValue(this.membersCount);
        dest.writeValue(this.pendingMembersCount);
        dest.writeString(this.privacyContext);
        dest.writeString(this.privacyContexts);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.inheritedParentId);
        dest.writeValue(this.partnerSortValue);
        dest.writeString(this.partnerData);
        dest.writeInt(this.defaultOrderBy == null ? -1 : this.defaultOrderBy.ordinal());
        dest.writeValue(this.directSubCategoriesCount);
        dest.writeValue(this.moderation);
        dest.writeValue(this.pendingEntriesCount);
        dest.writeValue(this.isAggregationCategory);
        dest.writeString(this.aggregationCategories);
    }

    public Category(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.parentId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.depth = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.fullName = in.readString();
        this.fullIds = in.readString();
        this.entriesCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.description = in.readString();
        this.tags = in.readString();
        int tmpAppearInList = in.readInt();
        this.appearInList = tmpAppearInList == -1 ? null : AppearInListType.values()[tmpAppearInList];
        int tmpPrivacy = in.readInt();
        this.privacy = tmpPrivacy == -1 ? null : PrivacyType.values()[tmpPrivacy];
        int tmpInheritanceType = in.readInt();
        this.inheritanceType = tmpInheritanceType == -1 ? null : InheritanceType.values()[tmpInheritanceType];
        int tmpUserJoinPolicy = in.readInt();
        this.userJoinPolicy = tmpUserJoinPolicy == -1 ? null : UserJoinPolicyType.values()[tmpUserJoinPolicy];
        int tmpDefaultPermissionLevel = in.readInt();
        this.defaultPermissionLevel = tmpDefaultPermissionLevel == -1 ? null : CategoryUserPermissionLevel.values()[tmpDefaultPermissionLevel];
        this.owner = in.readString();
        this.directEntriesCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.referenceId = in.readString();
        int tmpContributionPolicy = in.readInt();
        this.contributionPolicy = tmpContributionPolicy == -1 ? null : ContributionPolicyType.values()[tmpContributionPolicy];
        this.membersCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.pendingMembersCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.privacyContext = in.readString();
        this.privacyContexts = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : CategoryStatus.values()[tmpStatus];
        this.inheritedParentId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerSortValue = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerData = in.readString();
        int tmpDefaultOrderBy = in.readInt();
        this.defaultOrderBy = tmpDefaultOrderBy == -1 ? null : CategoryOrderBy.values()[tmpDefaultOrderBy];
        this.directSubCategoriesCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.moderation = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.pendingEntriesCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.isAggregationCategory = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.aggregationCategories = in.readString();
    }
}

