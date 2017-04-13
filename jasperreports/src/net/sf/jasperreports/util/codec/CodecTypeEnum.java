/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2016 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.util.codec;

import net.sf.jasperreports.engine.type.NamedEnum;
import net.sf.jasperreports.engine.type.EnumUtil;

/**
 * @author Sanda Zaharia (shertage@users.sourceforge.net)
 */
public enum CodecTypeEnum implements NamedEnum
{
	/**
	 *
	 */ 
	COMMONS("Commons"),
	
	/**
	 *
	 */ 
	JAVA("Java");
	
	/**
	 *
	 */
	private final transient String name;

	private CodecTypeEnum(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}
	
	/**
	 *
	 */
	public static CodecTypeEnum getByName(String name)
	{
		return EnumUtil.getEnumByName(values(), name);
	}
}