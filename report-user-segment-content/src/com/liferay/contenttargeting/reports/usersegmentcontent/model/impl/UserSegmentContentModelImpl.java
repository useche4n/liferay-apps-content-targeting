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

package com.liferay.contenttargeting.reports.usersegmentcontent.model.impl;

import com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent;
import com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContentModel;
import com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContentSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the UserSegmentContent service. Represents a row in the &quot;ContentTargeting_UserSegmentContent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserSegmentContentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserSegmentContentImpl
 * @see com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent
 * @see com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContentModel
 * @generated
 */
@JSON(strict = true)
public class UserSegmentContentModelImpl extends BaseModelImpl<UserSegmentContent>
	implements UserSegmentContentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user segment content model instance should use the {@link com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent} interface instead.
	 */
	public static final String TABLE_NAME = "ContentTargeting_UserSegmentContent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userSegmentContentId", Types.BIGINT },
			{ "userSegmentId", Types.BIGINT },
			{ "className", Types.VARCHAR },
			{ "classPK", Types.BIGINT },
			{ "eventType", Types.VARCHAR },
			{ "count", Types.INTEGER },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table ContentTargeting_UserSegmentContent (userSegmentContentId LONG not null primary key,userSegmentId LONG,className VARCHAR(75) null,classPK LONG,eventType VARCHAR(75) null,count INTEGER,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table ContentTargeting_UserSegmentContent";
	public static final String ORDER_BY_JPQL = " ORDER BY userSegmentContent.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY ContentTargeting_UserSegmentContent.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent"),
			true);
	public static long CLASSNAME_COLUMN_BITMASK = 1L;
	public static long CLASSPK_COLUMN_BITMASK = 2L;
	public static long EVENTTYPE_COLUMN_BITMASK = 4L;
	public static long MODIFIEDDATE_COLUMN_BITMASK = 8L;
	public static long USERSEGMENTID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static UserSegmentContent toModel(UserSegmentContentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserSegmentContent model = new UserSegmentContentImpl();

		model.setUserSegmentContentId(soapModel.getUserSegmentContentId());
		model.setUserSegmentId(soapModel.getUserSegmentId());
		model.setClassName(soapModel.getClassName());
		model.setClassPK(soapModel.getClassPK());
		model.setEventType(soapModel.getEventType());
		model.setCount(soapModel.getCount());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UserSegmentContent> toModels(
		UserSegmentContentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserSegmentContent> models = new ArrayList<UserSegmentContent>(soapModels.length);

		for (UserSegmentContentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent"));

	public UserSegmentContentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userSegmentContentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserSegmentContentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userSegmentContentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserSegmentContent.class;
	}

	@Override
	public String getModelClassName() {
		return UserSegmentContent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userSegmentContentId", getUserSegmentContentId());
		attributes.put("userSegmentId", getUserSegmentId());
		attributes.put("className", getClassName());
		attributes.put("classPK", getClassPK());
		attributes.put("eventType", getEventType());
		attributes.put("count", getCount());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userSegmentContentId = (Long)attributes.get("userSegmentContentId");

		if (userSegmentContentId != null) {
			setUserSegmentContentId(userSegmentContentId);
		}

		Long userSegmentId = (Long)attributes.get("userSegmentId");

		if (userSegmentId != null) {
			setUserSegmentId(userSegmentId);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@JSON
	@Override
	public long getUserSegmentContentId() {
		return _userSegmentContentId;
	}

	@Override
	public void setUserSegmentContentId(long userSegmentContentId) {
		_userSegmentContentId = userSegmentContentId;
	}

	@JSON
	@Override
	public long getUserSegmentId() {
		return _userSegmentId;
	}

	@Override
	public void setUserSegmentId(long userSegmentId) {
		_columnBitmask |= USERSEGMENTID_COLUMN_BITMASK;

		if (!_setOriginalUserSegmentId) {
			_setOriginalUserSegmentId = true;

			_originalUserSegmentId = _userSegmentId;
		}

		_userSegmentId = userSegmentId;
	}

	public long getOriginalUserSegmentId() {
		return _originalUserSegmentId;
	}

	@JSON
	@Override
	public String getClassName() {
		if (_className == null) {
			return StringPool.BLANK;
		}
		else {
			return _className;
		}
	}

	@Override
	public void setClassName(String className) {
		_columnBitmask |= CLASSNAME_COLUMN_BITMASK;

		if (_originalClassName == null) {
			_originalClassName = _className;
		}

		_className = className;
	}

	public String getOriginalClassName() {
		return GetterUtil.getString(_originalClassName);
	}

	@JSON
	@Override
	public long getClassPK() {
		return _classPK;
	}

	@Override
	public void setClassPK(long classPK) {
		_columnBitmask |= CLASSPK_COLUMN_BITMASK;

		if (!_setOriginalClassPK) {
			_setOriginalClassPK = true;

			_originalClassPK = _classPK;
		}

		_classPK = classPK;
	}

	public long getOriginalClassPK() {
		return _originalClassPK;
	}

	@JSON
	@Override
	public String getEventType() {
		if (_eventType == null) {
			return StringPool.BLANK;
		}
		else {
			return _eventType;
		}
	}

	@Override
	public void setEventType(String eventType) {
		_columnBitmask |= EVENTTYPE_COLUMN_BITMASK;

		if (_originalEventType == null) {
			_originalEventType = _eventType;
		}

		_eventType = eventType;
	}

	public String getOriginalEventType() {
		return GetterUtil.getString(_originalEventType);
	}

	@JSON
	@Override
	public int getCount() {
		return _count;
	}

	@Override
	public void setCount(int count) {
		_count = count;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_columnBitmask = -1L;

		if (_originalModifiedDate == null) {
			_originalModifiedDate = _modifiedDate;
		}

		_modifiedDate = modifiedDate;
	}

	public Date getOriginalModifiedDate() {
		return _originalModifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			UserSegmentContent.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserSegmentContent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserSegmentContent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserSegmentContentImpl userSegmentContentImpl = new UserSegmentContentImpl();

		userSegmentContentImpl.setUserSegmentContentId(getUserSegmentContentId());
		userSegmentContentImpl.setUserSegmentId(getUserSegmentId());
		userSegmentContentImpl.setClassName(getClassName());
		userSegmentContentImpl.setClassPK(getClassPK());
		userSegmentContentImpl.setEventType(getEventType());
		userSegmentContentImpl.setCount(getCount());
		userSegmentContentImpl.setModifiedDate(getModifiedDate());

		userSegmentContentImpl.resetOriginalValues();

		return userSegmentContentImpl;
	}

	@Override
	public int compareTo(UserSegmentContent userSegmentContent) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				userSegmentContent.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserSegmentContent)) {
			return false;
		}

		UserSegmentContent userSegmentContent = (UserSegmentContent)obj;

		long primaryKey = userSegmentContent.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		UserSegmentContentModelImpl userSegmentContentModelImpl = this;

		userSegmentContentModelImpl._originalUserSegmentId = userSegmentContentModelImpl._userSegmentId;

		userSegmentContentModelImpl._setOriginalUserSegmentId = false;

		userSegmentContentModelImpl._originalClassName = userSegmentContentModelImpl._className;

		userSegmentContentModelImpl._originalClassPK = userSegmentContentModelImpl._classPK;

		userSegmentContentModelImpl._setOriginalClassPK = false;

		userSegmentContentModelImpl._originalEventType = userSegmentContentModelImpl._eventType;

		userSegmentContentModelImpl._originalModifiedDate = userSegmentContentModelImpl._modifiedDate;

		userSegmentContentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserSegmentContent> toCacheModel() {
		UserSegmentContentCacheModel userSegmentContentCacheModel = new UserSegmentContentCacheModel();

		userSegmentContentCacheModel.userSegmentContentId = getUserSegmentContentId();

		userSegmentContentCacheModel.userSegmentId = getUserSegmentId();

		userSegmentContentCacheModel.className = getClassName();

		String className = userSegmentContentCacheModel.className;

		if ((className != null) && (className.length() == 0)) {
			userSegmentContentCacheModel.className = null;
		}

		userSegmentContentCacheModel.classPK = getClassPK();

		userSegmentContentCacheModel.eventType = getEventType();

		String eventType = userSegmentContentCacheModel.eventType;

		if ((eventType != null) && (eventType.length() == 0)) {
			userSegmentContentCacheModel.eventType = null;
		}

		userSegmentContentCacheModel.count = getCount();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			userSegmentContentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			userSegmentContentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return userSegmentContentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{userSegmentContentId=");
		sb.append(getUserSegmentContentId());
		sb.append(", userSegmentId=");
		sb.append(getUserSegmentId());
		sb.append(", className=");
		sb.append(getClassName());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", eventType=");
		sb.append(getEventType());
		sb.append(", count=");
		sb.append(getCount());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.contenttargeting.reports.usersegmentcontent.model.UserSegmentContent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userSegmentContentId</column-name><column-value><![CDATA[");
		sb.append(getUserSegmentContentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userSegmentId</column-name><column-value><![CDATA[");
		sb.append(getUserSegmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>className</column-name><column-value><![CDATA[");
		sb.append(getClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventType</column-name><column-value><![CDATA[");
		sb.append(getEventType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>count</column-name><column-value><![CDATA[");
		sb.append(getCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserSegmentContent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserSegmentContent.class
		};
	private long _userSegmentContentId;
	private long _userSegmentId;
	private long _originalUserSegmentId;
	private boolean _setOriginalUserSegmentId;
	private String _className;
	private String _originalClassName;
	private long _classPK;
	private long _originalClassPK;
	private boolean _setOriginalClassPK;
	private String _eventType;
	private String _originalEventType;
	private int _count;
	private Date _modifiedDate;
	private Date _originalModifiedDate;
	private long _columnBitmask;
	private UserSegmentContent _escapedModel;
}