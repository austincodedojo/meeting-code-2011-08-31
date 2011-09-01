/**
 * Copyright (C) cedarsoft GmbH.
 *
 * Licensed under the GNU General Public License version 3 (the "License")
 * with Classpath Exception; you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *         http://www.cedarsoft.org/gpl3ce
 *         (GPL 3 with Classpath Exception)
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation. cedarsoft GmbH designates this
 * particular file as subject to the "Classpath" exception as provided
 * by cedarsoft GmbH in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 3 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 3 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact cedarsoft GmbH, 72810 Gomaringen, Germany,
 * or visit www.cedarsoft.com if you need additional information or
 * have any questions.
 */

package austincodedojo;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RomanNumeralTest {

	@Test
	public void one_is_I() {
		assertThat(RomanNumerals.toRoman(1), is("I"));
	}

	@Test
	public void two_is_II() {
		assertThat(RomanNumerals.toRoman(2), is("II"));
	}
	
	@Test
	public void three_is_III() throws Exception {
		assertThat(RomanNumerals.toRoman(3), is("III"));
	}

	@Test
	public void five_is_V() throws Exception {
		assertThat(RomanNumerals.toRoman(5), is("V"));
	}

	@Test
	public void ten_is_X() throws Exception {
		assertThat(RomanNumerals.toRoman(10), is("X"));
	}
	
	@Test
	public void twenty_is_XX() throws Exception {
		assertThat(RomanNumerals.toRoman(20), is("XX"));
	}

	@Test
	public void thirty_is_XXX() throws Exception {
		assertThat(RomanNumerals.toRoman(30), is("XXX"));
	}
	@Test
	public void fifty_is_L() throws Exception {
		assertThat(RomanNumerals.toRoman(50), is("L"));
	}

	@Test
	public void one_hundred_is_C() throws Exception {
		assertThat(RomanNumerals.toRoman(100), is("C"));
	}
	
	@Test
	public void five_hundred_is_D() throws Exception {
		assertThat(RomanNumerals.toRoman(500), is("D"));
	}

	@Test
	public void one_thousand_is_M() throws Exception {
		assertThat(RomanNumerals.toRoman(1000), is("M"));
	}
	
	@Test
	public void four_is_IV() throws Exception {
		assertThat(RomanNumerals.toRoman(4), is("IV"));
	}
	
	@Test
	public void six_is_VI() throws Exception {
		assertThat(RomanNumerals.toRoman(6), is("VI"));
	}
	
	@Test
	public void eleven_is_XI() throws Exception {
		assertThat(RomanNumerals.toRoman(11), is("XI"));
	}
	
}
