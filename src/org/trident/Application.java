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
package org.trident;

import java.io.IOException;
import java.util.logging.Logger;

import org.trident.net.GameServerBootstrap;

/**
 * The entry point for our RuneScape emulator application
 * @author Ares_
 *
 */
public final class Application {

	/**
	 * The {@link Logger} instance for our {@link Application} class.
	 */
	private static Logger logger = Logger.getLogger(Application.class.getName());
	
	/**
	 * The entry point for our server application
	 * @param args The program arguments
	 */
	public static void main(String[] args) {
		logger.info("Starting the server application...");
		
		// we load the networking related stuff now	
		try {
			new GameServerBootstrap().bind();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}