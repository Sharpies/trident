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
package org.trident.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.trident.rs2.GameConstants;

/**
 * Handles binding our networking related tasks
 * @author Ares_
 *
 */
public final class GameServerBootstrap {

	/**
	 * The {@link Logger} instance for the {@link GameServerBootstrap} class.
	 */
	private static Logger logger = Logger.getLogger(GameServerBootstrap.class.getName());

	/**
	 * The {@link ExecutorService} and {@link Executors}
	 */
	private ExecutorService executor = Executors.newCachedThreadPool();
			
	/**
	 * The {@link ServerBoostrap} so we can bind our networking.
	 */
	private ServerBootstrap bootstrap = new ServerBootstrap();
	
	/**
	 * Create a new {@link GameServerBootstrap}
	 */
	public GameServerBootstrap() throws IOException {
		
	}
	
	/**
	 * We begin binding the networking for our {@link Application}
	 */
	public void bind() {
		logger.info("Starting the networking...");
		
		// We set the netty up now
		bootstrap.setFactory(new NioServerSocketChannelFactory(executor, executor));
		bootstrap.setPipelineFactory(new GameServerPipelineFactory());
		
		// The address the server will be listening too
		SocketAddress game = new InetSocketAddress(GameConstants.PORT);
		
		logger.info("The game server is now listening to " +GameConstants.PORT+ ".");
		// we now are listening on this port
		bootstrap.bind(game);
	}
	
}