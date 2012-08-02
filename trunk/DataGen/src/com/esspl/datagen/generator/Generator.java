/**
 * Copyright (C) 2012 Enterprise System Solutions (P) Ltd. All rights reserved.
 *
 * This file is part of DATA Gen. http://testdatagen.sourceforge.net/
 *
 * DATA Gen is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DATA Gen is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.esspl.datagen.generator;

import java.util.ArrayList;

import com.esspl.datagen.DataGenApplication;
import com.esspl.datagen.common.GeneratorBean;

/**
 * @author tapasj
 *
 */
public interface Generator {
	
	/**
	 * Uses Command Design pattern. Concrete implementation should provide the logic for 
	 * specific data generation. e.g. sql, xml, excel.
	 */
	public String generate(DataGenApplication dataGenApplication, ArrayList<GeneratorBean> rowList);
	
}
