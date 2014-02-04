/*
 * RHQ Management Platform
 * Copyright (C) 2005-2010 Red Hat, Inc.
 * All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License, version 2, as
 * published by the Free Software Foundation, and/or the GNU Lesser
 * General Public License, version 2.1, also as published by the Free
 * Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License and the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License
 * and the GNU Lesser General Public License along with this program;
 * if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.rhq.enterprise.gui.coregui.client.dashboard;


/**
 * @author Simeon Pinder
 */
public interface AutoRefreshPortlet extends Portlet {

    /**
     * Each portlet implements to define the refresh cycle.  Note that once refresh is started it
     * should be canceled when the portlet goes out of scope (typically in an onDestroy() override).
     */
    void startRefreshCycle();

    /**     
     * @return true if the portlet is currently responding to a refresh (i.e. reloading data). This can be used
     * to ignore refresh requests until a prior request is completed. 
     */
    boolean isRefreshing();

    /**
     * Refresh this portlet, reload data, redraw widgets, whatever is needed to refresh the portlet
     */
    void refresh();

}