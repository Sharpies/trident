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
package org.trident.rs2;

/**
 * The position of the entity in our game world.
 * @author Ares_
 *
 */
public final class Position {

	/**
	 * The x coordinate
	 */
	private final short x;
	
	/**
	 * The y coordinate
	 */
	private final short y;
	
	/**
	 * The height
	 */
	private final byte z;
	
	/**
	 * Creates a new {@link Position}
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @param z The height 
	 */
	public Position(int x, int y, int z) {
		this.x = (short)x;
		this.y = (short)y;
		this.z = (byte)z;
	}

	/**
	 * Gets the x coordinate
	 * @return The x coordinate
	 */
	public short getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate
	 * @return The y coordinate
	 */
	public short getY() {
		return y;
	}
	
	/**
	 * Gets the height position
	 * @return The height position
	 */
	public byte getZ() {
		return z;
	}
	
}