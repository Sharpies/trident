/**
 * Copyright (c) 2013, Lucas Beau
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
 * THE SOFTWARE.
 */
package org.trident.packet.util;

/**
 * Represents the different simple data types.
 * @author Graham
 */
public enum DataType {

	/**
	 * A byte.
	 */
	BYTE(1),

	/**
	 * A short.
	 */
	SHORT(2),

	/**
	 * A 'tri byte' - a group of three bytes.
	 */
	TRI_BYTE(3),

	/**
	 * An integer.
	 */
	INT(4),

	/**
	 * A long.
	 */
	LONG(8);

	/**
	 * The number of bytes this type occupies.
	 */
	private final int bytes;

	/**
	 * Creates a data type.
	 * @param bytes The number of bytes it occupies.
	 */
	private DataType(int bytes) {
		this.bytes = bytes;
	}

	/**
	 * Gets the number of bytes the data type occupies.
	 * @return The number of bytes.
	 */
	public int getBytes() {
		return bytes;
	}

}