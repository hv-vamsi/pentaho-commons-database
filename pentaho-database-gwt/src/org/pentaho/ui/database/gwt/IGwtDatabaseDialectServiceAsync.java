/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
*/

package org.pentaho.ui.database.gwt;

import java.util.List;

import org.pentaho.database.IDatabaseDialect;
import org.pentaho.database.model.IDatabaseConnection;
import org.pentaho.database.model.IDatabaseType;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface IGwtDatabaseDialectServiceAsync {

  void registerDatabaseDialect(IDatabaseDialect databaseDialect, AsyncCallback<Void> callback);

  void registerDatabaseDialect(IDatabaseDialect databaseDialect, boolean validateClassExists, AsyncCallback<Void> callback);
  
  void getDialect(IDatabaseType databaseType, AsyncCallback<IDatabaseDialect> callback);
  
  void getDialect(IDatabaseConnection connection, AsyncCallback<IDatabaseDialect> callback);
  
  void getDatabaseDialects(AsyncCallback<List<IDatabaseDialect>> callback);
  
  void getDatabaseTypes(AsyncCallback<List<IDatabaseType>> callback);

  void validateJdbcDriverClassExists(String classname, AsyncCallback<Boolean> callback);
  
  void getBogoDatabase(AsyncCallback<IDatabaseDialect> databaseDialect);

}
