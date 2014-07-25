/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.contenttargeting.reports.usersegmentcontent.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UserSegmentContent service. Represents a row in the &quot;ContentTargeting_UserSegmentContent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.contenttargeting.reports.usersegmentcontent.model.impl.UserSegmentContentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.contenttargeting.reports.usersegmentcontent.model.impl.UserSegmentContentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserSegmentContent
 * @see com.liferay.contenttargeting.reports.usersegmentcontent.model.impl.UserSegmentContentImpl
 * @see com.liferay.contenttargeting.reports.usersegmentcontent.model.impl.UserSegmentContentModelImpl
 * @generated
 */
public interface UserSegmentContentModel extends BaseModel<UserSegmentContent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user segment content model instance should use the {@link UserSegmentContent} interface instead.
	 */

	/**
	 * Returns the primary key of this user segment content.
	 *
	 * @return the primary key of this user segment content
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user segment content.
	 *
	 * @param primaryKey the primary key of this user segment content
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user segment content ID of this user segment content.
	 *
	 * @return the user segment content ID of this user segment content
	 */
	public long getUserSegmentContentId();

	/**
	 * Sets the user segment content ID of this user segment content.
	 *
	 * @param userSegmentContentId the user segment content ID of this user segment content
	 */
	public void setUserSegmentContentId(long userSegmentContentId);

	/**
	 * Returns the user segment ID of this user segment content.
	 *
	 * @return the user segment ID of this user segment content
	 */
	public long getUserSegmentId();

	/**
	 * Sets the user segment ID of this user segment content.
	 *
	 * @param userSegmentId the user segment ID of this user segment content
	 */
	public void setUserSegmentId(long userSegmentId);

	/**
	 * Returns the class name of this user segment content.
	 *
	 * @return the class name of this user segment content
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this user segment content.
	 *
	 * @param className the class name of this user segment content
	 */
	public void setClassName(String className);

	/**
	 * Returns the class p k of this user segment content.
	 *
	 * @return the class p k of this user segment content
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this user segment content.
	 *
	 * @param classPK the class p k of this user segment content
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the event type of this user segment content.
	 *
	 * @return the event type of this user segment content
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this user segment content.
	 *
	 * @param eventType the event type of this user segment content
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the count of this user segment content.
	 *
	 * @return the count of this user segment content
	 */
	public int getCount();

	/**
	 * Sets the count of this user segment content.
	 *
	 * @param count the count of this user segment content
	 */
	public void setCount(int count);

	/**
	 * Returns the modified date of this user segment content.
	 *
	 * @return the modified date of this user segment content
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user segment content.
	 *
	 * @param modifiedDate the modified date of this user segment content
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(UserSegmentContent userSegmentContent);

	@Override
	public int hashCode();

	@Override
	public CacheModel<UserSegmentContent> toCacheModel();

	@Override
	public UserSegmentContent toEscapedModel();

	@Override
	public UserSegmentContent toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}