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
package org.trident.rs2.model;

import java.util.BitSet;

/**
 * The Update Flags used by both {@link Player} & {@link Mob}
 * @author Ares_
 *
 */
public final class UpdateFlags {

	/**
	 * The {@link BitSet} of {@link UpdateFlags}.
	 */
	private final BitSet flags = new BitSet();
	
	/**
	 * An enumeration of the update flags
	 * @author Ares_
	 *
	 */
	public static enum UpdateFlag {
		
		/**
		 * Appearance update.
		 */
		APPEARANCE,

		/**
		 * Chat update.
		 */
		CHAT,

		/**
		 * Graphics update.
		 */
		GRAPHICS,

		/**
		 * Animation update.
		 */
		ANIMATION,

		/**
		 * Forced chat update.
		 */
		FORCED_CHAT,

		/**
		 * Interacting actor update.
		 */
		FACE_ACTOR,

		/**
		 * Face coordinate actor update.
		 */
		FACE_COORDINATE,

		/**
		 * Hit update.
		 */
		HIT,

		/**
		 * Hit 2 update/
		 */
		HIT_2,

		/**
		 * Update flag used to transform npc to another.
		 */
		TRANSFORM,

		/**
		 * Forces the player to walk from a given coordinate to a given coordinate.
		 */
		FORCE_WALK
		
	}

	/**
	 * We check if an update is required or not
	 * @return If the update is required
	 */
	public boolean isUpdateRequired() {
		return !flags.isEmpty();
	}
	
}