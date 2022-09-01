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
import com.kaltura.client.enums.EntryModerationStatus;
import com.kaltura.client.enums.EntryReplacementStatus;
import com.kaltura.client.enums.EntryStatus;
import com.kaltura.client.enums.EntryType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseEntryBaseFilter.Tokenizer.class)
public abstract class BaseEntryBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String idNotIn();
		String nameLike();
		String nameMultiLikeOr();
		String nameMultiLikeAnd();
		String nameEqual();
		String partnerIdEqual();
		String partnerIdIn();
		String userIdEqual();
		String userIdIn();
		String userIdNotIn();
		String creatorIdEqual();
		String tagsLike();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String adminTagsLike();
		String adminTagsMultiLikeOr();
		String adminTagsMultiLikeAnd();
		String categoriesMatchAnd();
		String categoriesMatchOr();
		String categoriesNotContains();
		String categoriesIdsMatchAnd();
		String categoriesIdsMatchOr();
		String categoriesIdsNotContains();
		String categoriesIdsEmpty();
		String statusEqual();
		String statusNotEqual();
		String statusIn();
		String statusNotIn();
		String moderationStatusEqual();
		String moderationStatusNotEqual();
		String moderationStatusIn();
		String moderationStatusNotIn();
		String typeEqual();
		String typeIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String rankLessThanOrEqual();
		String rankGreaterThanOrEqual();
		String totalRankLessThanOrEqual();
		String totalRankGreaterThanOrEqual();
		String groupIdEqual();
		String searchTextMatchAnd();
		String searchTextMatchOr();
		String accessControlIdEqual();
		String accessControlIdIn();
		String startDateGreaterThanOrEqual();
		String startDateLessThanOrEqual();
		String startDateGreaterThanOrEqualOrNull();
		String startDateLessThanOrEqualOrNull();
		String endDateGreaterThanOrEqual();
		String endDateLessThanOrEqual();
		String endDateGreaterThanOrEqualOrNull();
		String endDateLessThanOrEqualOrNull();
		String referenceIdEqual();
		String referenceIdIn();
		String replacingEntryIdEqual();
		String replacingEntryIdIn();
		String replacedEntryIdEqual();
		String replacedEntryIdIn();
		String replacementStatusEqual();
		String replacementStatusIn();
		String partnerSortValueGreaterThanOrEqual();
		String partnerSortValueLessThanOrEqual();
		String rootEntryIdEqual();
		String rootEntryIdIn();
		String parentEntryIdEqual();
		String entitledUsersEditMatchAnd();
		String entitledUsersEditMatchOr();
		String entitledUsersPublishMatchAnd();
		String entitledUsersPublishMatchOr();
		String entitledUsersViewMatchAnd();
		String entitledUsersViewMatchOr();
		String tagsNameMultiLikeOr();
		String tagsAdminTagsMultiLikeOr();
		String tagsAdminTagsNameMultiLikeOr();
		String tagsNameMultiLikeAnd();
		String tagsAdminTagsMultiLikeAnd();
		String tagsAdminTagsNameMultiLikeAnd();
	}

	/**
	 * This filter should be in use for retrieving only a specific entry (identified by
	  its entryId).
	 */
	private String idEqual;
	/**
	 * This filter should be in use for retrieving few specific entries (string should
	  include comma separated list of entryId strings).
	 */
	private String idIn;
	private String idNotIn;
	/**
	 * This filter should be in use for retrieving specific entries. It should include
	  only one string to search for in entry names (no wildcards, spaces are treated
	  as part of the string).
	 */
	private String nameLike;
	/**
	 * This filter should be in use for retrieving specific entries. It could include
	  few (comma separated) strings for searching in entry names, while applying an OR
	  logic to retrieve entries that contain at least one input string (no wildcards,
	  spaces are treated as part of the string).
	 */
	private String nameMultiLikeOr;
	/**
	 * This filter should be in use for retrieving specific entries. It could include
	  few (comma separated) strings for searching in entry names, while applying an
	  AND logic to retrieve entries that contain all input strings (no wildcards,
	  spaces are treated as part of the string).
	 */
	private String nameMultiLikeAnd;
	/**
	 * This filter should be in use for retrieving entries with a specific name.
	 */
	private String nameEqual;
	/**
	 * This filter should be in use for retrieving only entries which were uploaded
	  by/assigned to users of a specific Kaltura Partner (identified by Partner ID).
	 */
	private Integer partnerIdEqual;
	/**
	 * This filter should be in use for retrieving only entries within Kaltura network
	  which were uploaded by/assigned to users of few Kaltura Partners  (string should
	  include comma separated list of PartnerIDs)
	 */
	private String partnerIdIn;
	/**
	 * This filter parameter should be in use for retrieving only entries, uploaded
	  by/assigned to a specific user (identified by user Id).
	 */
	private String userIdEqual;
	private String userIdIn;
	private String userIdNotIn;
	private String creatorIdEqual;
	/**
	 * This filter should be in use for retrieving specific entries. It should include
	  only one string to search for in entry tags (no wildcards, spaces are treated as
	  part of the string).
	 */
	private String tagsLike;
	/**
	 * This filter should be in use for retrieving specific entries. It could include
	  few (comma separated) strings for searching in entry tags, while applying an OR
	  logic to retrieve entries that contain at least one input string (no wildcards,
	  spaces are treated as part of the string).
	 */
	private String tagsMultiLikeOr;
	/**
	 * This filter should be in use for retrieving specific entries. It could include
	  few (comma separated) strings for searching in entry tags, while applying an AND
	  logic to retrieve entries that contain all input strings (no wildcards, spaces
	  are treated as part of the string).
	 */
	private String tagsMultiLikeAnd;
	/**
	 * This filter should be in use for retrieving specific entries. It should include
	  only one string to search for in entry tags set by an ADMIN user (no wildcards,
	  spaces are treated as part of the string).
	 */
	private String adminTagsLike;
	/**
	 * This filter should be in use for retrieving specific entries. It could include
	  few (comma separated) strings for searching in entry tags, set by an ADMIN user,
	  while applying an OR logic to retrieve entries that contain at least one input
	  string (no wildcards, spaces are treated as part of the string).
	 */
	private String adminTagsMultiLikeOr;
	/**
	 * This filter should be in use for retrieving specific entries. It could include
	  few (comma separated) strings for searching in entry tags, set by an ADMIN user,
	  while applying an AND logic to retrieve entries that contain all input strings
	  (no wildcards, spaces are treated as part of the string).
	 */
	private String adminTagsMultiLikeAnd;
	private String categoriesMatchAnd;
	/**
	 * All entries within these categories or their child categories.
	 */
	private String categoriesMatchOr;
	private String categoriesNotContains;
	private String categoriesIdsMatchAnd;
	/**
	 * All entries of the categories, excluding their child categories.   To include
	  entries of the child categories, use categoryAncestorIdIn, or categoriesMatchOr.
	 */
	private String categoriesIdsMatchOr;
	private String categoriesIdsNotContains;
	private Boolean categoriesIdsEmpty;
	/**
	 * This filter should be in use for retrieving only entries, at a specific {
	 */
	private EntryStatus statusEqual;
	/**
	 * This filter should be in use for retrieving only entries, not at a specific {
	 */
	private EntryStatus statusNotEqual;
	/**
	 * This filter should be in use for retrieving only entries, at few specific {
	 */
	private String statusIn;
	/**
	 * This filter should be in use for retrieving only entries, not at few specific {
	 */
	private String statusNotIn;
	private EntryModerationStatus moderationStatusEqual;
	private EntryModerationStatus moderationStatusNotEqual;
	private String moderationStatusIn;
	private String moderationStatusNotIn;
	private EntryType typeEqual;
	/**
	 * This filter should be in use for retrieving entries of few {
	 */
	private String typeIn;
	/**
	 * This filter parameter should be in use for retrieving only entries which were
	  created at Kaltura system after a specific time/date (standard timestamp
	  format).
	 */
	private Integer createdAtGreaterThanOrEqual;
	/**
	 * This filter parameter should be in use for retrieving only entries which were
	  created at Kaltura system before a specific time/date (standard timestamp
	  format).
	 */
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Double rankLessThanOrEqual;
	private Double rankGreaterThanOrEqual;
	private Integer totalRankLessThanOrEqual;
	private Integer totalRankGreaterThanOrEqual;
	private Integer groupIdEqual;
	/**
	 * This filter should be in use for retrieving specific entries while search match
	  the input string within all of the following metadata attributes: name,
	  description, tags, adminTags.
	 */
	private String searchTextMatchAnd;
	/**
	 * This filter should be in use for retrieving specific entries while search match
	  the input string within at least one of the following metadata attributes: name,
	  description, tags, adminTags.
	 */
	private String searchTextMatchOr;
	private Integer accessControlIdEqual;
	private String accessControlIdIn;
	private Integer startDateGreaterThanOrEqual;
	private Integer startDateLessThanOrEqual;
	private Integer startDateGreaterThanOrEqualOrNull;
	private Integer startDateLessThanOrEqualOrNull;
	private Integer endDateGreaterThanOrEqual;
	private Integer endDateLessThanOrEqual;
	private Integer endDateGreaterThanOrEqualOrNull;
	private Integer endDateLessThanOrEqualOrNull;
	private String referenceIdEqual;
	private String referenceIdIn;
	private String replacingEntryIdEqual;
	private String replacingEntryIdIn;
	private String replacedEntryIdEqual;
	private String replacedEntryIdIn;
	private EntryReplacementStatus replacementStatusEqual;
	private String replacementStatusIn;
	private Integer partnerSortValueGreaterThanOrEqual;
	private Integer partnerSortValueLessThanOrEqual;
	private String rootEntryIdEqual;
	private String rootEntryIdIn;
	private String parentEntryIdEqual;
	private String entitledUsersEditMatchAnd;
	private String entitledUsersEditMatchOr;
	private String entitledUsersPublishMatchAnd;
	private String entitledUsersPublishMatchOr;
	private String entitledUsersViewMatchAnd;
	private String entitledUsersViewMatchOr;
	private String tagsNameMultiLikeOr;
	private String tagsAdminTagsMultiLikeOr;
	private String tagsAdminTagsNameMultiLikeOr;
	private String tagsNameMultiLikeAnd;
	private String tagsAdminTagsMultiLikeAnd;
	private String tagsAdminTagsNameMultiLikeAnd;

	// idEqual:
	public String getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(String idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// idNotIn:
	public String getIdNotIn(){
		return this.idNotIn;
	}
	public void setIdNotIn(String idNotIn){
		this.idNotIn = idNotIn;
	}

	public void idNotIn(String multirequestToken){
		setToken("idNotIn", multirequestToken);
	}

	// nameLike:
	public String getNameLike(){
		return this.nameLike;
	}
	public void setNameLike(String nameLike){
		this.nameLike = nameLike;
	}

	public void nameLike(String multirequestToken){
		setToken("nameLike", multirequestToken);
	}

	// nameMultiLikeOr:
	public String getNameMultiLikeOr(){
		return this.nameMultiLikeOr;
	}
	public void setNameMultiLikeOr(String nameMultiLikeOr){
		this.nameMultiLikeOr = nameMultiLikeOr;
	}

	public void nameMultiLikeOr(String multirequestToken){
		setToken("nameMultiLikeOr", multirequestToken);
	}

	// nameMultiLikeAnd:
	public String getNameMultiLikeAnd(){
		return this.nameMultiLikeAnd;
	}
	public void setNameMultiLikeAnd(String nameMultiLikeAnd){
		this.nameMultiLikeAnd = nameMultiLikeAnd;
	}

	public void nameMultiLikeAnd(String multirequestToken){
		setToken("nameMultiLikeAnd", multirequestToken);
	}

	// nameEqual:
	public String getNameEqual(){
		return this.nameEqual;
	}
	public void setNameEqual(String nameEqual){
		this.nameEqual = nameEqual;
	}

	public void nameEqual(String multirequestToken){
		setToken("nameEqual", multirequestToken);
	}

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// partnerIdIn:
	public String getPartnerIdIn(){
		return this.partnerIdIn;
	}
	public void setPartnerIdIn(String partnerIdIn){
		this.partnerIdIn = partnerIdIn;
	}

	public void partnerIdIn(String multirequestToken){
		setToken("partnerIdIn", multirequestToken);
	}

	// userIdEqual:
	public String getUserIdEqual(){
		return this.userIdEqual;
	}
	public void setUserIdEqual(String userIdEqual){
		this.userIdEqual = userIdEqual;
	}

	public void userIdEqual(String multirequestToken){
		setToken("userIdEqual", multirequestToken);
	}

	// userIdIn:
	public String getUserIdIn(){
		return this.userIdIn;
	}
	public void setUserIdIn(String userIdIn){
		this.userIdIn = userIdIn;
	}

	public void userIdIn(String multirequestToken){
		setToken("userIdIn", multirequestToken);
	}

	// userIdNotIn:
	public String getUserIdNotIn(){
		return this.userIdNotIn;
	}
	public void setUserIdNotIn(String userIdNotIn){
		this.userIdNotIn = userIdNotIn;
	}

	public void userIdNotIn(String multirequestToken){
		setToken("userIdNotIn", multirequestToken);
	}

	// creatorIdEqual:
	public String getCreatorIdEqual(){
		return this.creatorIdEqual;
	}
	public void setCreatorIdEqual(String creatorIdEqual){
		this.creatorIdEqual = creatorIdEqual;
	}

	public void creatorIdEqual(String multirequestToken){
		setToken("creatorIdEqual", multirequestToken);
	}

	// tagsLike:
	public String getTagsLike(){
		return this.tagsLike;
	}
	public void setTagsLike(String tagsLike){
		this.tagsLike = tagsLike;
	}

	public void tagsLike(String multirequestToken){
		setToken("tagsLike", multirequestToken);
	}

	// tagsMultiLikeOr:
	public String getTagsMultiLikeOr(){
		return this.tagsMultiLikeOr;
	}
	public void setTagsMultiLikeOr(String tagsMultiLikeOr){
		this.tagsMultiLikeOr = tagsMultiLikeOr;
	}

	public void tagsMultiLikeOr(String multirequestToken){
		setToken("tagsMultiLikeOr", multirequestToken);
	}

	// tagsMultiLikeAnd:
	public String getTagsMultiLikeAnd(){
		return this.tagsMultiLikeAnd;
	}
	public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
		this.tagsMultiLikeAnd = tagsMultiLikeAnd;
	}

	public void tagsMultiLikeAnd(String multirequestToken){
		setToken("tagsMultiLikeAnd", multirequestToken);
	}

	// adminTagsLike:
	public String getAdminTagsLike(){
		return this.adminTagsLike;
	}
	public void setAdminTagsLike(String adminTagsLike){
		this.adminTagsLike = adminTagsLike;
	}

	public void adminTagsLike(String multirequestToken){
		setToken("adminTagsLike", multirequestToken);
	}

	// adminTagsMultiLikeOr:
	public String getAdminTagsMultiLikeOr(){
		return this.adminTagsMultiLikeOr;
	}
	public void setAdminTagsMultiLikeOr(String adminTagsMultiLikeOr){
		this.adminTagsMultiLikeOr = adminTagsMultiLikeOr;
	}

	public void adminTagsMultiLikeOr(String multirequestToken){
		setToken("adminTagsMultiLikeOr", multirequestToken);
	}

	// adminTagsMultiLikeAnd:
	public String getAdminTagsMultiLikeAnd(){
		return this.adminTagsMultiLikeAnd;
	}
	public void setAdminTagsMultiLikeAnd(String adminTagsMultiLikeAnd){
		this.adminTagsMultiLikeAnd = adminTagsMultiLikeAnd;
	}

	public void adminTagsMultiLikeAnd(String multirequestToken){
		setToken("adminTagsMultiLikeAnd", multirequestToken);
	}

	// categoriesMatchAnd:
	public String getCategoriesMatchAnd(){
		return this.categoriesMatchAnd;
	}
	public void setCategoriesMatchAnd(String categoriesMatchAnd){
		this.categoriesMatchAnd = categoriesMatchAnd;
	}

	public void categoriesMatchAnd(String multirequestToken){
		setToken("categoriesMatchAnd", multirequestToken);
	}

	// categoriesMatchOr:
	public String getCategoriesMatchOr(){
		return this.categoriesMatchOr;
	}
	public void setCategoriesMatchOr(String categoriesMatchOr){
		this.categoriesMatchOr = categoriesMatchOr;
	}

	public void categoriesMatchOr(String multirequestToken){
		setToken("categoriesMatchOr", multirequestToken);
	}

	// categoriesNotContains:
	public String getCategoriesNotContains(){
		return this.categoriesNotContains;
	}
	public void setCategoriesNotContains(String categoriesNotContains){
		this.categoriesNotContains = categoriesNotContains;
	}

	public void categoriesNotContains(String multirequestToken){
		setToken("categoriesNotContains", multirequestToken);
	}

	// categoriesIdsMatchAnd:
	public String getCategoriesIdsMatchAnd(){
		return this.categoriesIdsMatchAnd;
	}
	public void setCategoriesIdsMatchAnd(String categoriesIdsMatchAnd){
		this.categoriesIdsMatchAnd = categoriesIdsMatchAnd;
	}

	public void categoriesIdsMatchAnd(String multirequestToken){
		setToken("categoriesIdsMatchAnd", multirequestToken);
	}

	// categoriesIdsMatchOr:
	public String getCategoriesIdsMatchOr(){
		return this.categoriesIdsMatchOr;
	}
	public void setCategoriesIdsMatchOr(String categoriesIdsMatchOr){
		this.categoriesIdsMatchOr = categoriesIdsMatchOr;
	}

	public void categoriesIdsMatchOr(String multirequestToken){
		setToken("categoriesIdsMatchOr", multirequestToken);
	}

	// categoriesIdsNotContains:
	public String getCategoriesIdsNotContains(){
		return this.categoriesIdsNotContains;
	}
	public void setCategoriesIdsNotContains(String categoriesIdsNotContains){
		this.categoriesIdsNotContains = categoriesIdsNotContains;
	}

	public void categoriesIdsNotContains(String multirequestToken){
		setToken("categoriesIdsNotContains", multirequestToken);
	}

	// categoriesIdsEmpty:
	public Boolean getCategoriesIdsEmpty(){
		return this.categoriesIdsEmpty;
	}
	public void setCategoriesIdsEmpty(Boolean categoriesIdsEmpty){
		this.categoriesIdsEmpty = categoriesIdsEmpty;
	}

	public void categoriesIdsEmpty(String multirequestToken){
		setToken("categoriesIdsEmpty", multirequestToken);
	}

	// statusEqual:
	public EntryStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(EntryStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusNotEqual:
	public EntryStatus getStatusNotEqual(){
		return this.statusNotEqual;
	}
	public void setStatusNotEqual(EntryStatus statusNotEqual){
		this.statusNotEqual = statusNotEqual;
	}

	public void statusNotEqual(String multirequestToken){
		setToken("statusNotEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// statusNotIn:
	public String getStatusNotIn(){
		return this.statusNotIn;
	}
	public void setStatusNotIn(String statusNotIn){
		this.statusNotIn = statusNotIn;
	}

	public void statusNotIn(String multirequestToken){
		setToken("statusNotIn", multirequestToken);
	}

	// moderationStatusEqual:
	public EntryModerationStatus getModerationStatusEqual(){
		return this.moderationStatusEqual;
	}
	public void setModerationStatusEqual(EntryModerationStatus moderationStatusEqual){
		this.moderationStatusEqual = moderationStatusEqual;
	}

	public void moderationStatusEqual(String multirequestToken){
		setToken("moderationStatusEqual", multirequestToken);
	}

	// moderationStatusNotEqual:
	public EntryModerationStatus getModerationStatusNotEqual(){
		return this.moderationStatusNotEqual;
	}
	public void setModerationStatusNotEqual(EntryModerationStatus moderationStatusNotEqual){
		this.moderationStatusNotEqual = moderationStatusNotEqual;
	}

	public void moderationStatusNotEqual(String multirequestToken){
		setToken("moderationStatusNotEqual", multirequestToken);
	}

	// moderationStatusIn:
	public String getModerationStatusIn(){
		return this.moderationStatusIn;
	}
	public void setModerationStatusIn(String moderationStatusIn){
		this.moderationStatusIn = moderationStatusIn;
	}

	public void moderationStatusIn(String multirequestToken){
		setToken("moderationStatusIn", multirequestToken);
	}

	// moderationStatusNotIn:
	public String getModerationStatusNotIn(){
		return this.moderationStatusNotIn;
	}
	public void setModerationStatusNotIn(String moderationStatusNotIn){
		this.moderationStatusNotIn = moderationStatusNotIn;
	}

	public void moderationStatusNotIn(String multirequestToken){
		setToken("moderationStatusNotIn", multirequestToken);
	}

	// typeEqual:
	public EntryType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(EntryType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// typeIn:
	public String getTypeIn(){
		return this.typeIn;
	}
	public void setTypeIn(String typeIn){
		this.typeIn = typeIn;
	}

	public void typeIn(String multirequestToken){
		setToken("typeIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// rankLessThanOrEqual:
	public Double getRankLessThanOrEqual(){
		return this.rankLessThanOrEqual;
	}
	public void setRankLessThanOrEqual(Double rankLessThanOrEqual){
		this.rankLessThanOrEqual = rankLessThanOrEqual;
	}

	public void rankLessThanOrEqual(String multirequestToken){
		setToken("rankLessThanOrEqual", multirequestToken);
	}

	// rankGreaterThanOrEqual:
	public Double getRankGreaterThanOrEqual(){
		return this.rankGreaterThanOrEqual;
	}
	public void setRankGreaterThanOrEqual(Double rankGreaterThanOrEqual){
		this.rankGreaterThanOrEqual = rankGreaterThanOrEqual;
	}

	public void rankGreaterThanOrEqual(String multirequestToken){
		setToken("rankGreaterThanOrEqual", multirequestToken);
	}

	// totalRankLessThanOrEqual:
	public Integer getTotalRankLessThanOrEqual(){
		return this.totalRankLessThanOrEqual;
	}
	public void setTotalRankLessThanOrEqual(Integer totalRankLessThanOrEqual){
		this.totalRankLessThanOrEqual = totalRankLessThanOrEqual;
	}

	public void totalRankLessThanOrEqual(String multirequestToken){
		setToken("totalRankLessThanOrEqual", multirequestToken);
	}

	// totalRankGreaterThanOrEqual:
	public Integer getTotalRankGreaterThanOrEqual(){
		return this.totalRankGreaterThanOrEqual;
	}
	public void setTotalRankGreaterThanOrEqual(Integer totalRankGreaterThanOrEqual){
		this.totalRankGreaterThanOrEqual = totalRankGreaterThanOrEqual;
	}

	public void totalRankGreaterThanOrEqual(String multirequestToken){
		setToken("totalRankGreaterThanOrEqual", multirequestToken);
	}

	// groupIdEqual:
	public Integer getGroupIdEqual(){
		return this.groupIdEqual;
	}
	public void setGroupIdEqual(Integer groupIdEqual){
		this.groupIdEqual = groupIdEqual;
	}

	public void groupIdEqual(String multirequestToken){
		setToken("groupIdEqual", multirequestToken);
	}

	// searchTextMatchAnd:
	public String getSearchTextMatchAnd(){
		return this.searchTextMatchAnd;
	}
	public void setSearchTextMatchAnd(String searchTextMatchAnd){
		this.searchTextMatchAnd = searchTextMatchAnd;
	}

	public void searchTextMatchAnd(String multirequestToken){
		setToken("searchTextMatchAnd", multirequestToken);
	}

	// searchTextMatchOr:
	public String getSearchTextMatchOr(){
		return this.searchTextMatchOr;
	}
	public void setSearchTextMatchOr(String searchTextMatchOr){
		this.searchTextMatchOr = searchTextMatchOr;
	}

	public void searchTextMatchOr(String multirequestToken){
		setToken("searchTextMatchOr", multirequestToken);
	}

	// accessControlIdEqual:
	public Integer getAccessControlIdEqual(){
		return this.accessControlIdEqual;
	}
	public void setAccessControlIdEqual(Integer accessControlIdEqual){
		this.accessControlIdEqual = accessControlIdEqual;
	}

	public void accessControlIdEqual(String multirequestToken){
		setToken("accessControlIdEqual", multirequestToken);
	}

	// accessControlIdIn:
	public String getAccessControlIdIn(){
		return this.accessControlIdIn;
	}
	public void setAccessControlIdIn(String accessControlIdIn){
		this.accessControlIdIn = accessControlIdIn;
	}

	public void accessControlIdIn(String multirequestToken){
		setToken("accessControlIdIn", multirequestToken);
	}

	// startDateGreaterThanOrEqual:
	public Integer getStartDateGreaterThanOrEqual(){
		return this.startDateGreaterThanOrEqual;
	}
	public void setStartDateGreaterThanOrEqual(Integer startDateGreaterThanOrEqual){
		this.startDateGreaterThanOrEqual = startDateGreaterThanOrEqual;
	}

	public void startDateGreaterThanOrEqual(String multirequestToken){
		setToken("startDateGreaterThanOrEqual", multirequestToken);
	}

	// startDateLessThanOrEqual:
	public Integer getStartDateLessThanOrEqual(){
		return this.startDateLessThanOrEqual;
	}
	public void setStartDateLessThanOrEqual(Integer startDateLessThanOrEqual){
		this.startDateLessThanOrEqual = startDateLessThanOrEqual;
	}

	public void startDateLessThanOrEqual(String multirequestToken){
		setToken("startDateLessThanOrEqual", multirequestToken);
	}

	// startDateGreaterThanOrEqualOrNull:
	public Integer getStartDateGreaterThanOrEqualOrNull(){
		return this.startDateGreaterThanOrEqualOrNull;
	}
	public void setStartDateGreaterThanOrEqualOrNull(Integer startDateGreaterThanOrEqualOrNull){
		this.startDateGreaterThanOrEqualOrNull = startDateGreaterThanOrEqualOrNull;
	}

	public void startDateGreaterThanOrEqualOrNull(String multirequestToken){
		setToken("startDateGreaterThanOrEqualOrNull", multirequestToken);
	}

	// startDateLessThanOrEqualOrNull:
	public Integer getStartDateLessThanOrEqualOrNull(){
		return this.startDateLessThanOrEqualOrNull;
	}
	public void setStartDateLessThanOrEqualOrNull(Integer startDateLessThanOrEqualOrNull){
		this.startDateLessThanOrEqualOrNull = startDateLessThanOrEqualOrNull;
	}

	public void startDateLessThanOrEqualOrNull(String multirequestToken){
		setToken("startDateLessThanOrEqualOrNull", multirequestToken);
	}

	// endDateGreaterThanOrEqual:
	public Integer getEndDateGreaterThanOrEqual(){
		return this.endDateGreaterThanOrEqual;
	}
	public void setEndDateGreaterThanOrEqual(Integer endDateGreaterThanOrEqual){
		this.endDateGreaterThanOrEqual = endDateGreaterThanOrEqual;
	}

	public void endDateGreaterThanOrEqual(String multirequestToken){
		setToken("endDateGreaterThanOrEqual", multirequestToken);
	}

	// endDateLessThanOrEqual:
	public Integer getEndDateLessThanOrEqual(){
		return this.endDateLessThanOrEqual;
	}
	public void setEndDateLessThanOrEqual(Integer endDateLessThanOrEqual){
		this.endDateLessThanOrEqual = endDateLessThanOrEqual;
	}

	public void endDateLessThanOrEqual(String multirequestToken){
		setToken("endDateLessThanOrEqual", multirequestToken);
	}

	// endDateGreaterThanOrEqualOrNull:
	public Integer getEndDateGreaterThanOrEqualOrNull(){
		return this.endDateGreaterThanOrEqualOrNull;
	}
	public void setEndDateGreaterThanOrEqualOrNull(Integer endDateGreaterThanOrEqualOrNull){
		this.endDateGreaterThanOrEqualOrNull = endDateGreaterThanOrEqualOrNull;
	}

	public void endDateGreaterThanOrEqualOrNull(String multirequestToken){
		setToken("endDateGreaterThanOrEqualOrNull", multirequestToken);
	}

	// endDateLessThanOrEqualOrNull:
	public Integer getEndDateLessThanOrEqualOrNull(){
		return this.endDateLessThanOrEqualOrNull;
	}
	public void setEndDateLessThanOrEqualOrNull(Integer endDateLessThanOrEqualOrNull){
		this.endDateLessThanOrEqualOrNull = endDateLessThanOrEqualOrNull;
	}

	public void endDateLessThanOrEqualOrNull(String multirequestToken){
		setToken("endDateLessThanOrEqualOrNull", multirequestToken);
	}

	// referenceIdEqual:
	public String getReferenceIdEqual(){
		return this.referenceIdEqual;
	}
	public void setReferenceIdEqual(String referenceIdEqual){
		this.referenceIdEqual = referenceIdEqual;
	}

	public void referenceIdEqual(String multirequestToken){
		setToken("referenceIdEqual", multirequestToken);
	}

	// referenceIdIn:
	public String getReferenceIdIn(){
		return this.referenceIdIn;
	}
	public void setReferenceIdIn(String referenceIdIn){
		this.referenceIdIn = referenceIdIn;
	}

	public void referenceIdIn(String multirequestToken){
		setToken("referenceIdIn", multirequestToken);
	}

	// replacingEntryIdEqual:
	public String getReplacingEntryIdEqual(){
		return this.replacingEntryIdEqual;
	}
	public void setReplacingEntryIdEqual(String replacingEntryIdEqual){
		this.replacingEntryIdEqual = replacingEntryIdEqual;
	}

	public void replacingEntryIdEqual(String multirequestToken){
		setToken("replacingEntryIdEqual", multirequestToken);
	}

	// replacingEntryIdIn:
	public String getReplacingEntryIdIn(){
		return this.replacingEntryIdIn;
	}
	public void setReplacingEntryIdIn(String replacingEntryIdIn){
		this.replacingEntryIdIn = replacingEntryIdIn;
	}

	public void replacingEntryIdIn(String multirequestToken){
		setToken("replacingEntryIdIn", multirequestToken);
	}

	// replacedEntryIdEqual:
	public String getReplacedEntryIdEqual(){
		return this.replacedEntryIdEqual;
	}
	public void setReplacedEntryIdEqual(String replacedEntryIdEqual){
		this.replacedEntryIdEqual = replacedEntryIdEqual;
	}

	public void replacedEntryIdEqual(String multirequestToken){
		setToken("replacedEntryIdEqual", multirequestToken);
	}

	// replacedEntryIdIn:
	public String getReplacedEntryIdIn(){
		return this.replacedEntryIdIn;
	}
	public void setReplacedEntryIdIn(String replacedEntryIdIn){
		this.replacedEntryIdIn = replacedEntryIdIn;
	}

	public void replacedEntryIdIn(String multirequestToken){
		setToken("replacedEntryIdIn", multirequestToken);
	}

	// replacementStatusEqual:
	public EntryReplacementStatus getReplacementStatusEqual(){
		return this.replacementStatusEqual;
	}
	public void setReplacementStatusEqual(EntryReplacementStatus replacementStatusEqual){
		this.replacementStatusEqual = replacementStatusEqual;
	}

	public void replacementStatusEqual(String multirequestToken){
		setToken("replacementStatusEqual", multirequestToken);
	}

	// replacementStatusIn:
	public String getReplacementStatusIn(){
		return this.replacementStatusIn;
	}
	public void setReplacementStatusIn(String replacementStatusIn){
		this.replacementStatusIn = replacementStatusIn;
	}

	public void replacementStatusIn(String multirequestToken){
		setToken("replacementStatusIn", multirequestToken);
	}

	// partnerSortValueGreaterThanOrEqual:
	public Integer getPartnerSortValueGreaterThanOrEqual(){
		return this.partnerSortValueGreaterThanOrEqual;
	}
	public void setPartnerSortValueGreaterThanOrEqual(Integer partnerSortValueGreaterThanOrEqual){
		this.partnerSortValueGreaterThanOrEqual = partnerSortValueGreaterThanOrEqual;
	}

	public void partnerSortValueGreaterThanOrEqual(String multirequestToken){
		setToken("partnerSortValueGreaterThanOrEqual", multirequestToken);
	}

	// partnerSortValueLessThanOrEqual:
	public Integer getPartnerSortValueLessThanOrEqual(){
		return this.partnerSortValueLessThanOrEqual;
	}
	public void setPartnerSortValueLessThanOrEqual(Integer partnerSortValueLessThanOrEqual){
		this.partnerSortValueLessThanOrEqual = partnerSortValueLessThanOrEqual;
	}

	public void partnerSortValueLessThanOrEqual(String multirequestToken){
		setToken("partnerSortValueLessThanOrEqual", multirequestToken);
	}

	// rootEntryIdEqual:
	public String getRootEntryIdEqual(){
		return this.rootEntryIdEqual;
	}
	public void setRootEntryIdEqual(String rootEntryIdEqual){
		this.rootEntryIdEqual = rootEntryIdEqual;
	}

	public void rootEntryIdEqual(String multirequestToken){
		setToken("rootEntryIdEqual", multirequestToken);
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

	// parentEntryIdEqual:
	public String getParentEntryIdEqual(){
		return this.parentEntryIdEqual;
	}
	public void setParentEntryIdEqual(String parentEntryIdEqual){
		this.parentEntryIdEqual = parentEntryIdEqual;
	}

	public void parentEntryIdEqual(String multirequestToken){
		setToken("parentEntryIdEqual", multirequestToken);
	}

	// entitledUsersEditMatchAnd:
	public String getEntitledUsersEditMatchAnd(){
		return this.entitledUsersEditMatchAnd;
	}
	public void setEntitledUsersEditMatchAnd(String entitledUsersEditMatchAnd){
		this.entitledUsersEditMatchAnd = entitledUsersEditMatchAnd;
	}

	public void entitledUsersEditMatchAnd(String multirequestToken){
		setToken("entitledUsersEditMatchAnd", multirequestToken);
	}

	// entitledUsersEditMatchOr:
	public String getEntitledUsersEditMatchOr(){
		return this.entitledUsersEditMatchOr;
	}
	public void setEntitledUsersEditMatchOr(String entitledUsersEditMatchOr){
		this.entitledUsersEditMatchOr = entitledUsersEditMatchOr;
	}

	public void entitledUsersEditMatchOr(String multirequestToken){
		setToken("entitledUsersEditMatchOr", multirequestToken);
	}

	// entitledUsersPublishMatchAnd:
	public String getEntitledUsersPublishMatchAnd(){
		return this.entitledUsersPublishMatchAnd;
	}
	public void setEntitledUsersPublishMatchAnd(String entitledUsersPublishMatchAnd){
		this.entitledUsersPublishMatchAnd = entitledUsersPublishMatchAnd;
	}

	public void entitledUsersPublishMatchAnd(String multirequestToken){
		setToken("entitledUsersPublishMatchAnd", multirequestToken);
	}

	// entitledUsersPublishMatchOr:
	public String getEntitledUsersPublishMatchOr(){
		return this.entitledUsersPublishMatchOr;
	}
	public void setEntitledUsersPublishMatchOr(String entitledUsersPublishMatchOr){
		this.entitledUsersPublishMatchOr = entitledUsersPublishMatchOr;
	}

	public void entitledUsersPublishMatchOr(String multirequestToken){
		setToken("entitledUsersPublishMatchOr", multirequestToken);
	}

	// entitledUsersViewMatchAnd:
	public String getEntitledUsersViewMatchAnd(){
		return this.entitledUsersViewMatchAnd;
	}
	public void setEntitledUsersViewMatchAnd(String entitledUsersViewMatchAnd){
		this.entitledUsersViewMatchAnd = entitledUsersViewMatchAnd;
	}

	public void entitledUsersViewMatchAnd(String multirequestToken){
		setToken("entitledUsersViewMatchAnd", multirequestToken);
	}

	// entitledUsersViewMatchOr:
	public String getEntitledUsersViewMatchOr(){
		return this.entitledUsersViewMatchOr;
	}
	public void setEntitledUsersViewMatchOr(String entitledUsersViewMatchOr){
		this.entitledUsersViewMatchOr = entitledUsersViewMatchOr;
	}

	public void entitledUsersViewMatchOr(String multirequestToken){
		setToken("entitledUsersViewMatchOr", multirequestToken);
	}

	// tagsNameMultiLikeOr:
	public String getTagsNameMultiLikeOr(){
		return this.tagsNameMultiLikeOr;
	}
	public void setTagsNameMultiLikeOr(String tagsNameMultiLikeOr){
		this.tagsNameMultiLikeOr = tagsNameMultiLikeOr;
	}

	public void tagsNameMultiLikeOr(String multirequestToken){
		setToken("tagsNameMultiLikeOr", multirequestToken);
	}

	// tagsAdminTagsMultiLikeOr:
	public String getTagsAdminTagsMultiLikeOr(){
		return this.tagsAdminTagsMultiLikeOr;
	}
	public void setTagsAdminTagsMultiLikeOr(String tagsAdminTagsMultiLikeOr){
		this.tagsAdminTagsMultiLikeOr = tagsAdminTagsMultiLikeOr;
	}

	public void tagsAdminTagsMultiLikeOr(String multirequestToken){
		setToken("tagsAdminTagsMultiLikeOr", multirequestToken);
	}

	// tagsAdminTagsNameMultiLikeOr:
	public String getTagsAdminTagsNameMultiLikeOr(){
		return this.tagsAdminTagsNameMultiLikeOr;
	}
	public void setTagsAdminTagsNameMultiLikeOr(String tagsAdminTagsNameMultiLikeOr){
		this.tagsAdminTagsNameMultiLikeOr = tagsAdminTagsNameMultiLikeOr;
	}

	public void tagsAdminTagsNameMultiLikeOr(String multirequestToken){
		setToken("tagsAdminTagsNameMultiLikeOr", multirequestToken);
	}

	// tagsNameMultiLikeAnd:
	public String getTagsNameMultiLikeAnd(){
		return this.tagsNameMultiLikeAnd;
	}
	public void setTagsNameMultiLikeAnd(String tagsNameMultiLikeAnd){
		this.tagsNameMultiLikeAnd = tagsNameMultiLikeAnd;
	}

	public void tagsNameMultiLikeAnd(String multirequestToken){
		setToken("tagsNameMultiLikeAnd", multirequestToken);
	}

	// tagsAdminTagsMultiLikeAnd:
	public String getTagsAdminTagsMultiLikeAnd(){
		return this.tagsAdminTagsMultiLikeAnd;
	}
	public void setTagsAdminTagsMultiLikeAnd(String tagsAdminTagsMultiLikeAnd){
		this.tagsAdminTagsMultiLikeAnd = tagsAdminTagsMultiLikeAnd;
	}

	public void tagsAdminTagsMultiLikeAnd(String multirequestToken){
		setToken("tagsAdminTagsMultiLikeAnd", multirequestToken);
	}

	// tagsAdminTagsNameMultiLikeAnd:
	public String getTagsAdminTagsNameMultiLikeAnd(){
		return this.tagsAdminTagsNameMultiLikeAnd;
	}
	public void setTagsAdminTagsNameMultiLikeAnd(String tagsAdminTagsNameMultiLikeAnd){
		this.tagsAdminTagsNameMultiLikeAnd = tagsAdminTagsNameMultiLikeAnd;
	}

	public void tagsAdminTagsNameMultiLikeAnd(String multirequestToken){
		setToken("tagsAdminTagsNameMultiLikeAnd", multirequestToken);
	}


	public BaseEntryBaseFilter() {
		super();
	}

	public BaseEntryBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
		nameLike = GsonParser.parseString(jsonObject.get("nameLike"));
		nameMultiLikeOr = GsonParser.parseString(jsonObject.get("nameMultiLikeOr"));
		nameMultiLikeAnd = GsonParser.parseString(jsonObject.get("nameMultiLikeAnd"));
		nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		userIdNotIn = GsonParser.parseString(jsonObject.get("userIdNotIn"));
		creatorIdEqual = GsonParser.parseString(jsonObject.get("creatorIdEqual"));
		tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		adminTagsLike = GsonParser.parseString(jsonObject.get("adminTagsLike"));
		adminTagsMultiLikeOr = GsonParser.parseString(jsonObject.get("adminTagsMultiLikeOr"));
		adminTagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("adminTagsMultiLikeAnd"));
		categoriesMatchAnd = GsonParser.parseString(jsonObject.get("categoriesMatchAnd"));
		categoriesMatchOr = GsonParser.parseString(jsonObject.get("categoriesMatchOr"));
		categoriesNotContains = GsonParser.parseString(jsonObject.get("categoriesNotContains"));
		categoriesIdsMatchAnd = GsonParser.parseString(jsonObject.get("categoriesIdsMatchAnd"));
		categoriesIdsMatchOr = GsonParser.parseString(jsonObject.get("categoriesIdsMatchOr"));
		categoriesIdsNotContains = GsonParser.parseString(jsonObject.get("categoriesIdsNotContains"));
		categoriesIdsEmpty = GsonParser.parseBoolean(jsonObject.get("categoriesIdsEmpty"));
		statusEqual = EntryStatus.get(GsonParser.parseString(jsonObject.get("statusEqual")));
		statusNotEqual = EntryStatus.get(GsonParser.parseString(jsonObject.get("statusNotEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));
		moderationStatusEqual = EntryModerationStatus.get(GsonParser.parseInt(jsonObject.get("moderationStatusEqual")));
		moderationStatusNotEqual = EntryModerationStatus.get(GsonParser.parseInt(jsonObject.get("moderationStatusNotEqual")));
		moderationStatusIn = GsonParser.parseString(jsonObject.get("moderationStatusIn"));
		moderationStatusNotIn = GsonParser.parseString(jsonObject.get("moderationStatusNotIn"));
		typeEqual = EntryType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		rankLessThanOrEqual = GsonParser.parseDouble(jsonObject.get("rankLessThanOrEqual"));
		rankGreaterThanOrEqual = GsonParser.parseDouble(jsonObject.get("rankGreaterThanOrEqual"));
		totalRankLessThanOrEqual = GsonParser.parseInt(jsonObject.get("totalRankLessThanOrEqual"));
		totalRankGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("totalRankGreaterThanOrEqual"));
		groupIdEqual = GsonParser.parseInt(jsonObject.get("groupIdEqual"));
		searchTextMatchAnd = GsonParser.parseString(jsonObject.get("searchTextMatchAnd"));
		searchTextMatchOr = GsonParser.parseString(jsonObject.get("searchTextMatchOr"));
		accessControlIdEqual = GsonParser.parseInt(jsonObject.get("accessControlIdEqual"));
		accessControlIdIn = GsonParser.parseString(jsonObject.get("accessControlIdIn"));
		startDateGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("startDateGreaterThanOrEqual"));
		startDateLessThanOrEqual = GsonParser.parseInt(jsonObject.get("startDateLessThanOrEqual"));
		startDateGreaterThanOrEqualOrNull = GsonParser.parseInt(jsonObject.get("startDateGreaterThanOrEqualOrNull"));
		startDateLessThanOrEqualOrNull = GsonParser.parseInt(jsonObject.get("startDateLessThanOrEqualOrNull"));
		endDateGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("endDateGreaterThanOrEqual"));
		endDateLessThanOrEqual = GsonParser.parseInt(jsonObject.get("endDateLessThanOrEqual"));
		endDateGreaterThanOrEqualOrNull = GsonParser.parseInt(jsonObject.get("endDateGreaterThanOrEqualOrNull"));
		endDateLessThanOrEqualOrNull = GsonParser.parseInt(jsonObject.get("endDateLessThanOrEqualOrNull"));
		referenceIdEqual = GsonParser.parseString(jsonObject.get("referenceIdEqual"));
		referenceIdIn = GsonParser.parseString(jsonObject.get("referenceIdIn"));
		replacingEntryIdEqual = GsonParser.parseString(jsonObject.get("replacingEntryIdEqual"));
		replacingEntryIdIn = GsonParser.parseString(jsonObject.get("replacingEntryIdIn"));
		replacedEntryIdEqual = GsonParser.parseString(jsonObject.get("replacedEntryIdEqual"));
		replacedEntryIdIn = GsonParser.parseString(jsonObject.get("replacedEntryIdIn"));
		replacementStatusEqual = EntryReplacementStatus.get(GsonParser.parseString(jsonObject.get("replacementStatusEqual")));
		replacementStatusIn = GsonParser.parseString(jsonObject.get("replacementStatusIn"));
		partnerSortValueGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueGreaterThanOrEqual"));
		partnerSortValueLessThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueLessThanOrEqual"));
		rootEntryIdEqual = GsonParser.parseString(jsonObject.get("rootEntryIdEqual"));
		rootEntryIdIn = GsonParser.parseString(jsonObject.get("rootEntryIdIn"));
		parentEntryIdEqual = GsonParser.parseString(jsonObject.get("parentEntryIdEqual"));
		entitledUsersEditMatchAnd = GsonParser.parseString(jsonObject.get("entitledUsersEditMatchAnd"));
		entitledUsersEditMatchOr = GsonParser.parseString(jsonObject.get("entitledUsersEditMatchOr"));
		entitledUsersPublishMatchAnd = GsonParser.parseString(jsonObject.get("entitledUsersPublishMatchAnd"));
		entitledUsersPublishMatchOr = GsonParser.parseString(jsonObject.get("entitledUsersPublishMatchOr"));
		entitledUsersViewMatchAnd = GsonParser.parseString(jsonObject.get("entitledUsersViewMatchAnd"));
		entitledUsersViewMatchOr = GsonParser.parseString(jsonObject.get("entitledUsersViewMatchOr"));
		tagsNameMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsNameMultiLikeOr"));
		tagsAdminTagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsAdminTagsMultiLikeOr"));
		tagsAdminTagsNameMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsAdminTagsNameMultiLikeOr"));
		tagsNameMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsNameMultiLikeAnd"));
		tagsAdminTagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsAdminTagsMultiLikeAnd"));
		tagsAdminTagsNameMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsAdminTagsNameMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseEntryBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idNotIn", this.idNotIn);
		kparams.add("nameLike", this.nameLike);
		kparams.add("nameMultiLikeOr", this.nameMultiLikeOr);
		kparams.add("nameMultiLikeAnd", this.nameMultiLikeAnd);
		kparams.add("nameEqual", this.nameEqual);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("userIdNotIn", this.userIdNotIn);
		kparams.add("creatorIdEqual", this.creatorIdEqual);
		kparams.add("tagsLike", this.tagsLike);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("adminTagsLike", this.adminTagsLike);
		kparams.add("adminTagsMultiLikeOr", this.adminTagsMultiLikeOr);
		kparams.add("adminTagsMultiLikeAnd", this.adminTagsMultiLikeAnd);
		kparams.add("categoriesMatchAnd", this.categoriesMatchAnd);
		kparams.add("categoriesMatchOr", this.categoriesMatchOr);
		kparams.add("categoriesNotContains", this.categoriesNotContains);
		kparams.add("categoriesIdsMatchAnd", this.categoriesIdsMatchAnd);
		kparams.add("categoriesIdsMatchOr", this.categoriesIdsMatchOr);
		kparams.add("categoriesIdsNotContains", this.categoriesIdsNotContains);
		kparams.add("categoriesIdsEmpty", this.categoriesIdsEmpty);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusNotEqual", this.statusNotEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("statusNotIn", this.statusNotIn);
		kparams.add("moderationStatusEqual", this.moderationStatusEqual);
		kparams.add("moderationStatusNotEqual", this.moderationStatusNotEqual);
		kparams.add("moderationStatusIn", this.moderationStatusIn);
		kparams.add("moderationStatusNotIn", this.moderationStatusNotIn);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("rankLessThanOrEqual", this.rankLessThanOrEqual);
		kparams.add("rankGreaterThanOrEqual", this.rankGreaterThanOrEqual);
		kparams.add("totalRankLessThanOrEqual", this.totalRankLessThanOrEqual);
		kparams.add("totalRankGreaterThanOrEqual", this.totalRankGreaterThanOrEqual);
		kparams.add("groupIdEqual", this.groupIdEqual);
		kparams.add("searchTextMatchAnd", this.searchTextMatchAnd);
		kparams.add("searchTextMatchOr", this.searchTextMatchOr);
		kparams.add("accessControlIdEqual", this.accessControlIdEqual);
		kparams.add("accessControlIdIn", this.accessControlIdIn);
		kparams.add("startDateGreaterThanOrEqual", this.startDateGreaterThanOrEqual);
		kparams.add("startDateLessThanOrEqual", this.startDateLessThanOrEqual);
		kparams.add("startDateGreaterThanOrEqualOrNull", this.startDateGreaterThanOrEqualOrNull);
		kparams.add("startDateLessThanOrEqualOrNull", this.startDateLessThanOrEqualOrNull);
		kparams.add("endDateGreaterThanOrEqual", this.endDateGreaterThanOrEqual);
		kparams.add("endDateLessThanOrEqual", this.endDateLessThanOrEqual);
		kparams.add("endDateGreaterThanOrEqualOrNull", this.endDateGreaterThanOrEqualOrNull);
		kparams.add("endDateLessThanOrEqualOrNull", this.endDateLessThanOrEqualOrNull);
		kparams.add("referenceIdEqual", this.referenceIdEqual);
		kparams.add("referenceIdIn", this.referenceIdIn);
		kparams.add("replacingEntryIdEqual", this.replacingEntryIdEqual);
		kparams.add("replacingEntryIdIn", this.replacingEntryIdIn);
		kparams.add("replacedEntryIdEqual", this.replacedEntryIdEqual);
		kparams.add("replacedEntryIdIn", this.replacedEntryIdIn);
		kparams.add("replacementStatusEqual", this.replacementStatusEqual);
		kparams.add("replacementStatusIn", this.replacementStatusIn);
		kparams.add("partnerSortValueGreaterThanOrEqual", this.partnerSortValueGreaterThanOrEqual);
		kparams.add("partnerSortValueLessThanOrEqual", this.partnerSortValueLessThanOrEqual);
		kparams.add("rootEntryIdEqual", this.rootEntryIdEqual);
		kparams.add("rootEntryIdIn", this.rootEntryIdIn);
		kparams.add("parentEntryIdEqual", this.parentEntryIdEqual);
		kparams.add("entitledUsersEditMatchAnd", this.entitledUsersEditMatchAnd);
		kparams.add("entitledUsersEditMatchOr", this.entitledUsersEditMatchOr);
		kparams.add("entitledUsersPublishMatchAnd", this.entitledUsersPublishMatchAnd);
		kparams.add("entitledUsersPublishMatchOr", this.entitledUsersPublishMatchOr);
		kparams.add("entitledUsersViewMatchAnd", this.entitledUsersViewMatchAnd);
		kparams.add("entitledUsersViewMatchOr", this.entitledUsersViewMatchOr);
		kparams.add("tagsNameMultiLikeOr", this.tagsNameMultiLikeOr);
		kparams.add("tagsAdminTagsMultiLikeOr", this.tagsAdminTagsMultiLikeOr);
		kparams.add("tagsAdminTagsNameMultiLikeOr", this.tagsAdminTagsNameMultiLikeOr);
		kparams.add("tagsNameMultiLikeAnd", this.tagsNameMultiLikeAnd);
		kparams.add("tagsAdminTagsMultiLikeAnd", this.tagsAdminTagsMultiLikeAnd);
		kparams.add("tagsAdminTagsNameMultiLikeAnd", this.tagsAdminTagsNameMultiLikeAnd);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.idEqual);
        dest.writeString(this.idIn);
        dest.writeString(this.idNotIn);
        dest.writeString(this.nameLike);
        dest.writeString(this.nameMultiLikeOr);
        dest.writeString(this.nameMultiLikeAnd);
        dest.writeString(this.nameEqual);
        dest.writeValue(this.partnerIdEqual);
        dest.writeString(this.partnerIdIn);
        dest.writeString(this.userIdEqual);
        dest.writeString(this.userIdIn);
        dest.writeString(this.userIdNotIn);
        dest.writeString(this.creatorIdEqual);
        dest.writeString(this.tagsLike);
        dest.writeString(this.tagsMultiLikeOr);
        dest.writeString(this.tagsMultiLikeAnd);
        dest.writeString(this.adminTagsLike);
        dest.writeString(this.adminTagsMultiLikeOr);
        dest.writeString(this.adminTagsMultiLikeAnd);
        dest.writeString(this.categoriesMatchAnd);
        dest.writeString(this.categoriesMatchOr);
        dest.writeString(this.categoriesNotContains);
        dest.writeString(this.categoriesIdsMatchAnd);
        dest.writeString(this.categoriesIdsMatchOr);
        dest.writeString(this.categoriesIdsNotContains);
        dest.writeValue(this.categoriesIdsEmpty);
        dest.writeInt(this.statusEqual == null ? -1 : this.statusEqual.ordinal());
        dest.writeInt(this.statusNotEqual == null ? -1 : this.statusNotEqual.ordinal());
        dest.writeString(this.statusIn);
        dest.writeString(this.statusNotIn);
        dest.writeInt(this.moderationStatusEqual == null ? -1 : this.moderationStatusEqual.ordinal());
        dest.writeInt(this.moderationStatusNotEqual == null ? -1 : this.moderationStatusNotEqual.ordinal());
        dest.writeString(this.moderationStatusIn);
        dest.writeString(this.moderationStatusNotIn);
        dest.writeInt(this.typeEqual == null ? -1 : this.typeEqual.ordinal());
        dest.writeString(this.typeIn);
        dest.writeValue(this.createdAtGreaterThanOrEqual);
        dest.writeValue(this.createdAtLessThanOrEqual);
        dest.writeValue(this.updatedAtGreaterThanOrEqual);
        dest.writeValue(this.updatedAtLessThanOrEqual);
        dest.writeValue(this.rankLessThanOrEqual);
        dest.writeValue(this.rankGreaterThanOrEqual);
        dest.writeValue(this.totalRankLessThanOrEqual);
        dest.writeValue(this.totalRankGreaterThanOrEqual);
        dest.writeValue(this.groupIdEqual);
        dest.writeString(this.searchTextMatchAnd);
        dest.writeString(this.searchTextMatchOr);
        dest.writeValue(this.accessControlIdEqual);
        dest.writeString(this.accessControlIdIn);
        dest.writeValue(this.startDateGreaterThanOrEqual);
        dest.writeValue(this.startDateLessThanOrEqual);
        dest.writeValue(this.startDateGreaterThanOrEqualOrNull);
        dest.writeValue(this.startDateLessThanOrEqualOrNull);
        dest.writeValue(this.endDateGreaterThanOrEqual);
        dest.writeValue(this.endDateLessThanOrEqual);
        dest.writeValue(this.endDateGreaterThanOrEqualOrNull);
        dest.writeValue(this.endDateLessThanOrEqualOrNull);
        dest.writeString(this.referenceIdEqual);
        dest.writeString(this.referenceIdIn);
        dest.writeString(this.replacingEntryIdEqual);
        dest.writeString(this.replacingEntryIdIn);
        dest.writeString(this.replacedEntryIdEqual);
        dest.writeString(this.replacedEntryIdIn);
        dest.writeInt(this.replacementStatusEqual == null ? -1 : this.replacementStatusEqual.ordinal());
        dest.writeString(this.replacementStatusIn);
        dest.writeValue(this.partnerSortValueGreaterThanOrEqual);
        dest.writeValue(this.partnerSortValueLessThanOrEqual);
        dest.writeString(this.rootEntryIdEqual);
        dest.writeString(this.rootEntryIdIn);
        dest.writeString(this.parentEntryIdEqual);
        dest.writeString(this.entitledUsersEditMatchAnd);
        dest.writeString(this.entitledUsersEditMatchOr);
        dest.writeString(this.entitledUsersPublishMatchAnd);
        dest.writeString(this.entitledUsersPublishMatchOr);
        dest.writeString(this.entitledUsersViewMatchAnd);
        dest.writeString(this.entitledUsersViewMatchOr);
        dest.writeString(this.tagsNameMultiLikeOr);
        dest.writeString(this.tagsAdminTagsMultiLikeOr);
        dest.writeString(this.tagsAdminTagsNameMultiLikeOr);
        dest.writeString(this.tagsNameMultiLikeAnd);
        dest.writeString(this.tagsAdminTagsMultiLikeAnd);
        dest.writeString(this.tagsAdminTagsNameMultiLikeAnd);
    }

    public BaseEntryBaseFilter(Parcel in) {
        super(in);
        this.idEqual = in.readString();
        this.idIn = in.readString();
        this.idNotIn = in.readString();
        this.nameLike = in.readString();
        this.nameMultiLikeOr = in.readString();
        this.nameMultiLikeAnd = in.readString();
        this.nameEqual = in.readString();
        this.partnerIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerIdIn = in.readString();
        this.userIdEqual = in.readString();
        this.userIdIn = in.readString();
        this.userIdNotIn = in.readString();
        this.creatorIdEqual = in.readString();
        this.tagsLike = in.readString();
        this.tagsMultiLikeOr = in.readString();
        this.tagsMultiLikeAnd = in.readString();
        this.adminTagsLike = in.readString();
        this.adminTagsMultiLikeOr = in.readString();
        this.adminTagsMultiLikeAnd = in.readString();
        this.categoriesMatchAnd = in.readString();
        this.categoriesMatchOr = in.readString();
        this.categoriesNotContains = in.readString();
        this.categoriesIdsMatchAnd = in.readString();
        this.categoriesIdsMatchOr = in.readString();
        this.categoriesIdsNotContains = in.readString();
        this.categoriesIdsEmpty = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpStatusEqual = in.readInt();
        this.statusEqual = tmpStatusEqual == -1 ? null : EntryStatus.values()[tmpStatusEqual];
        int tmpStatusNotEqual = in.readInt();
        this.statusNotEqual = tmpStatusNotEqual == -1 ? null : EntryStatus.values()[tmpStatusNotEqual];
        this.statusIn = in.readString();
        this.statusNotIn = in.readString();
        int tmpModerationStatusEqual = in.readInt();
        this.moderationStatusEqual = tmpModerationStatusEqual == -1 ? null : EntryModerationStatus.values()[tmpModerationStatusEqual];
        int tmpModerationStatusNotEqual = in.readInt();
        this.moderationStatusNotEqual = tmpModerationStatusNotEqual == -1 ? null : EntryModerationStatus.values()[tmpModerationStatusNotEqual];
        this.moderationStatusIn = in.readString();
        this.moderationStatusNotIn = in.readString();
        int tmpTypeEqual = in.readInt();
        this.typeEqual = tmpTypeEqual == -1 ? null : EntryType.values()[tmpTypeEqual];
        this.typeIn = in.readString();
        this.createdAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAtLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.rankLessThanOrEqual = (Double)in.readValue(Double.class.getClassLoader());
        this.rankGreaterThanOrEqual = (Double)in.readValue(Double.class.getClassLoader());
        this.totalRankLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.totalRankGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.groupIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.searchTextMatchAnd = in.readString();
        this.searchTextMatchOr = in.readString();
        this.accessControlIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.accessControlIdIn = in.readString();
        this.startDateGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.startDateLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.startDateGreaterThanOrEqualOrNull = (Integer)in.readValue(Integer.class.getClassLoader());
        this.startDateLessThanOrEqualOrNull = (Integer)in.readValue(Integer.class.getClassLoader());
        this.endDateGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.endDateLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.endDateGreaterThanOrEqualOrNull = (Integer)in.readValue(Integer.class.getClassLoader());
        this.endDateLessThanOrEqualOrNull = (Integer)in.readValue(Integer.class.getClassLoader());
        this.referenceIdEqual = in.readString();
        this.referenceIdIn = in.readString();
        this.replacingEntryIdEqual = in.readString();
        this.replacingEntryIdIn = in.readString();
        this.replacedEntryIdEqual = in.readString();
        this.replacedEntryIdIn = in.readString();
        int tmpReplacementStatusEqual = in.readInt();
        this.replacementStatusEqual = tmpReplacementStatusEqual == -1 ? null : EntryReplacementStatus.values()[tmpReplacementStatusEqual];
        this.replacementStatusIn = in.readString();
        this.partnerSortValueGreaterThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerSortValueLessThanOrEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.rootEntryIdEqual = in.readString();
        this.rootEntryIdIn = in.readString();
        this.parentEntryIdEqual = in.readString();
        this.entitledUsersEditMatchAnd = in.readString();
        this.entitledUsersEditMatchOr = in.readString();
        this.entitledUsersPublishMatchAnd = in.readString();
        this.entitledUsersPublishMatchOr = in.readString();
        this.entitledUsersViewMatchAnd = in.readString();
        this.entitledUsersViewMatchOr = in.readString();
        this.tagsNameMultiLikeOr = in.readString();
        this.tagsAdminTagsMultiLikeOr = in.readString();
        this.tagsAdminTagsNameMultiLikeOr = in.readString();
        this.tagsNameMultiLikeAnd = in.readString();
        this.tagsAdminTagsMultiLikeAnd = in.readString();
        this.tagsAdminTagsNameMultiLikeAnd = in.readString();
    }
}

