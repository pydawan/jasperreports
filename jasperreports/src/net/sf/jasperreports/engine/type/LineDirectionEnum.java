/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2019 TIBCO Software Inc. All rights reserved.
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
package net.sf.jasperreports.engine.type;


/**
 * @author sanda zaharia (shertage@users.sourceforge.net)
 */
public enum LineDirectionEnum implements JREnum
{
	/**
	 * Constant used for specifying that the line starts from the top and goes towards the bottom.
	 */
	TOP_DOWN((byte)1, "TopDown"),

	/**
	 * Constant used for specifying that the line starts from the bottom and goes towards the top.
	 */
	BOTTOM_UP((byte)2, "BottomUp");
	
	/**
	 *
	 */
	private final transient byte value;
	private final transient String name;

	private LineDirectionEnum(byte value, String name)
	{
		this.value = value;
		this.name = name;
	}

	/**
	 * @deprecated Used only by deprecated serialized fields.
	 */
	@Override
	public Byte getValueByte()
	{
		return value;
	}
	
	/**
	 * @deprecated Used only by deprecated serialized fields.
	 */
	@Override
	public final byte getValue()
	{
		return value;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	/**
	 *
	 */
	public static LineDirectionEnum getByName(String name)
	{
		return EnumUtil.getEnumByName(values(), name);
	}
	
	/**
	 * @deprecated Used only by deprecated serialized fields.
	 */
	public static LineDirectionEnum getByValue(Byte value)
	{
		return (LineDirectionEnum)EnumUtil.getByValue(values(), value);
	}
	
	/**
	 * @deprecated Used only by deprecated serialized fields.
	 */
	public static LineDirectionEnum getByValue(byte value)
	{
		return getByValue((Byte)value);
	}
}
