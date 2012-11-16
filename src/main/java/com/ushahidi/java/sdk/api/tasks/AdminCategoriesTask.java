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
package com.ushahidi.java.sdk.api.tasks;

import com.ushahidi.java.sdk.api.CategoryFields;
import com.ushahidi.java.sdk.api.json.Response;

/**
 * Administrative tasks on categories
 */
public class AdminCategoriesTask extends AdminBaseTask {

	private static final String TASK = "category";

	/**
	 * 
	 * @param url
	 * 
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	public AdminCategoriesTask(String url, String username, String password) {
		super(url, TASK, username, password);
	}

	/**
	 * 
	 * @param fields
	 *            CategoryFields
	 * @return response
	 */
	public Response add(CategoryFields fields) {
		return fromString(
				client.sendPostRequest(url, fields.getParameters(fields)),
				Response.class);
	}

	/**
	 * 
	 * @param id
	 *            Report ID
	 * @return
	 */
	public Response delete(int id) {
		client.setRequestParameters("action", "delete");
		client.setRequestParameters("category_id", String.valueOf(id));
		return fromString(client.sendPostRequest(url, null), Response.class);
	}

	/**
	 * 
	 * @param fields
	 * @return
	 */
	public Response edit(CategoryFields fields) {
		client.setRequestParameters("action", "edit");
		return fromString(
				client.sendPostRequest(url, fields.getParameters(fields)),
				Response.class);
	}

}