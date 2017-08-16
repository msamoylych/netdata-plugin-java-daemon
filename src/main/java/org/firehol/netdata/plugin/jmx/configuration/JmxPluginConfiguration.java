/*
 * Copyright (C) 2017 Simon Nagl
 *
 * netadata-plugin-java-daemon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.firehol.netdata.plugin.jmx.configuration;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Configuration scheme to configure
 * {@link org.firehol.netdata.plugin.jmx.JmxPlugin}
 * 
 * @author Simon Nagl
 */
@Getter
@Setter
public class JmxPluginConfiguration {
	private boolean autoMonitorLocalVirtualMachines = true;

	private List<JmxServerConfiguration> jmxServers = new ArrayList<>();

	private List<JmxChartConfiguration> commonCharts = new ArrayList<>();
}
