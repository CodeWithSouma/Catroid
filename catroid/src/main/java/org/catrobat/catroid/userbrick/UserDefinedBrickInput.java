/*
 * Catroid: An on-device visual programming system for Android devices
 * Copyright (C) 2010-2020 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * An additional term exception under section 7 of the GNU Affero
 * General Public License, version 3, is available at
 * http://developer.catrobat.org/license_additional_term
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catrobat.catroid.userbrick;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

import static org.catrobat.catroid.userbrick.UserDefinedBrickData.UserDefinedBrickDataType.INPUT;

@XStreamAlias("userDefinedBrickInput")
public class UserDefinedBrickInput extends UserDefinedBrickData implements Serializable {

	@XStreamAlias("input")
	InputFormulaField input;

	public UserDefinedBrickInput(String input) {
		this.input = new InputFormulaField(input);
		this.type = INPUT;
	}

	public UserDefinedBrickInput(UserDefinedBrickInput userDefinedBrickInput) {
		this.input = userDefinedBrickInput.input;
		this.type = INPUT;
	}

	@Override
	public String getName() {
		return this.input.toString();
	}

	public InputFormulaField getInputFormulaField() {
		return this.input;
	}
}

