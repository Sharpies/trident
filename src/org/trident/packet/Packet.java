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
package org.trident.packet;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * The packet structure
 * @author Ares_
 *
 */
public class Packet {

	/**
	 * The op code of the packet
	 */
	private final short opcode;
	
	/**
	 * The type of a packet
	 */
	private PacketType type;
	
	/**
	 * The payload
	 */
	private ChannelBuffer payload;
	
	/**
	 * Constructs a new {@link Packet}
	 * @param opcode the opcode for packet
	 * @param type the type of packet
	 * @param payload the payload
	 */
	public Packet(int opcode, PacketType type, ChannelBuffer payload) {
		this.opcode = (short)opcode;
		this.type = type;
		this.payload = payload;
	}
	
	/**
	 * Gets the opcode for the packet
	 * @return The opcode for the packet
	 */
	public short getOpcode() {
		return opcode;
	}
	
	/**
	 * Gets the packet type
	 * @return The packet type
	 */
	public PacketType getType() {
		return type;
	}
	
	/**
	 * The payload
	 * @return The payload
	 */
	public ChannelBuffer getPayload() {
		return payload;
	}
	
}