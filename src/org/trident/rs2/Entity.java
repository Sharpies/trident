/**
 * Copyright (c) 2012, Lucas Beau
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
 * An entity or know as a {@link Position} in the world
 * @author Ares_
 *
 */
public abstract class Entity {

	/**
	 * The position of the entity 
	 */
	private Position position;

	/**
	 * The entity index
	 */
	private transient int index;
	
	/**
	 * Gets the entitys index
	 * @return The index
	 */
	public final int getIndex() {
		synchronized(this) {
			return index;
		}
	}
	
	/**
	 * Sets the entity index
	 * @param index The index
	 */
	public final void setIndex(int index) {
		synchronized(this) {
			this.index = index;
		}
	}
	
	/**
	 * The position of the entity
	 * @return The position
	 */
	public Position getPosition() {
		return position;
	}

}