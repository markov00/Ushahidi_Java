/*****************************************************************************
 ** Copyright (c) 2010 - 2012 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 **
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.
 **
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 **
 *****************************************************************************/
package com.ushahidi.java.sdk.api.task;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ushahidi.java.sdk.api.Category;
import com.ushahidi.java.sdk.api.tasks.CategoriesTask;

/**
 * @author eyedol
 * 
 */
public class CategoriesTaskTest extends BaseTaskTest {

	/** The categories task */
	private CategoriesTask task;

	/** Test category ID */
	private static final int CAT_ID = 1;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		task = factory.createCategoriesTask();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		task = null;
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.CategoriesTask#all()}.
	 */
	@Test
	public void testAll() {
		try {
			List<Category> categories = task.all();
			assertNotNullOrEmpty("Categories list cannot be null or empty",
					categories);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.CategoriesTask#catId(int)}.
	 */
	@Test
	public void testCatId() {
		try {
			Category category = task.catId(CAT_ID);
			assertNotNull("Category cannot be null ", category);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}