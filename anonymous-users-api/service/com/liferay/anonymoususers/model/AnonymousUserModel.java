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

package com.liferay.anonymoususers.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedAuditedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AnonymousUser service. Represents a row in the &quot;ContentTargeting_AnonymousUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.anonymoususers.model.impl.AnonymousUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.anonymoususers.model.impl.AnonymousUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnonymousUser
 * @see com.liferay.anonymoususers.model.impl.AnonymousUserImpl
 * @see com.liferay.anonymoususers.model.impl.AnonymousUserModelImpl
 * @generated
 */
public interface AnonymousUserModel extends BaseModel<AnonymousUser>,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a anonymous user model instance should use the {@link AnonymousUser} interface instead.
	 */

	/**
	 * Returns the primary key of this anonymous user.
	 *
	 * @return the primary key of this anonymous user
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this anonymous user.
	 *
	 * @param primaryKey the primary key of this anonymous user
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this anonymous user.
	 *
	 * @return the uuid of this anonymous user
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this anonymous user.
	 *
	 * @param uuid the uuid of this anonymous user
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the anonymous user ID of this anonymous user.
	 *
	 * @return the anonymous user ID of this anonymous user
	 */
	public long getAnonymousUserId();

	/**
	 * Sets the anonymous user ID of this anonymous user.
	 *
	 * @param anonymousUserId the anonymous user ID of this anonymous user
	 */
	public void setAnonymousUserId(long anonymousUserId);

	/**
	 * Returns the anonymous user uuid of this anonymous user.
	 *
	 * @return the anonymous user uuid of this anonymous user
	 * @throws SystemException if a system exception occurred
	 */
	public String getAnonymousUserUuid() throws SystemException;

	/**
	 * Sets the anonymous user uuid of this anonymous user.
	 *
	 * @param anonymousUserUuid the anonymous user uuid of this anonymous user
	 */
	public void setAnonymousUserUuid(String anonymousUserUuid);

	/**
	 * Returns the company ID of this anonymous user.
	 *
	 * @return the company ID of this anonymous user
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this anonymous user.
	 *
	 * @param companyId the company ID of this anonymous user
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this anonymous user.
	 *
	 * @return the user ID of this anonymous user
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this anonymous user.
	 *
	 * @param userId the user ID of this anonymous user
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this anonymous user.
	 *
	 * @return the user uuid of this anonymous user
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this anonymous user.
	 *
	 * @param userUuid the user uuid of this anonymous user
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this anonymous user.
	 *
	 * @return the user name of this anonymous user
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this anonymous user.
	 *
	 * @param userName the user name of this anonymous user
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this anonymous user.
	 *
	 * @return the create date of this anonymous user
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this anonymous user.
	 *
	 * @param createDate the create date of this anonymous user
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this anonymous user.
	 *
	 * @return the modified date of this anonymous user
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this anonymous user.
	 *
	 * @param modifiedDate the modified date of this anonymous user
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the last ip of this anonymous user.
	 *
	 * @return the last ip of this anonymous user
	 */
	@AutoEscape
	public String getLastIp();

	/**
	 * Sets the last ip of this anonymous user.
	 *
	 * @param lastIp the last ip of this anonymous user
	 */
	public void setLastIp(String lastIp);

	/**
	 * Returns the type settings of this anonymous user.
	 *
	 * @return the type settings of this anonymous user
	 */
	@AutoEscape
	public String getTypeSettings();

	/**
	 * Sets the type settings of this anonymous user.
	 *
	 * @param typeSettings the type settings of this anonymous user
	 */
	public void setTypeSettings(String typeSettings);

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
	public int compareTo(AnonymousUser anonymousUser);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AnonymousUser> toCacheModel();

	@Override
	public AnonymousUser toEscapedModel();

	@Override
	public AnonymousUser toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}