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

package com.liferay.portal.contenttargeting.report.campaigntrackingaction.service.persistence;

import com.liferay.portal.contenttargeting.report.campaigntrackingaction.model.CampaignTrackingAction;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import java.util.Date;
import java.util.List;

/**
 * @author Eduardo Lundgren
 * @author Fabio Pezzutto
 */
public class CampaignTrackingActionFinderImpl
	extends BasePersistenceImpl<CampaignTrackingAction>
	implements CampaignTrackingActionFinder {

	public static final String FIND_BY_ANALYICS_WITH_CLASS_NAME =
		CampaignTrackingActionFinder.class.getName() +
			".findByAnalyticsWithClassName";

	public static final String FIND_BY_ANALYICS_WITH_ELEMENT_ID =
		CampaignTrackingActionFinder.class.getName() +
			".findByAnalyticsWithElementId";

	@Override
	public List<Object[]> findByAnalyticsWithClassName(
			long campaignId, Date modifiedDate)
		throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND_BY_ANALYICS_WITH_CLASS_NAME);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar("referrerClassPK", Type.LONG);
			q.addScalar("className", Type.STRING);
			q.addScalar("classPK", Type.LONG);
			q.addScalar("eventType", Type.STRING);
			q.addScalar("alias", Type.STRING);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(campaignId);
			qPos.add(modifiedDate);

			return q.list();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	public List<Object[]> findByAnalyticsWithElementId(
			long campaignId, Date modifiedDate)
		throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND_BY_ANALYICS_WITH_ELEMENT_ID);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar("referrerClassPK", Type.LONG);
			q.addScalar("elementId", Type.STRING);
			q.addScalar("eventType", Type.STRING);
			q.addScalar("alias", Type.STRING);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(campaignId);
			qPos.add(modifiedDate);

			return q.list();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
	}

}