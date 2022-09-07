package com.wan.reactor;

import io.netty.buffer.ByteBuf;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wan
 * @Description: nio server
 * @date 2021/10/25 9:42
 */
public class NIOServer {
    public static void testServer() throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //设置为非阻塞
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8080));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while(selector.select()>0) {
            Set<SelectionKey> sets = selector.selectedKeys();
            Iterator<SelectionKey> iterator = sets.iterator();
            while(iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if(selectionKey.isAcceptable()) {
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                }else if(selectionKey.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel)selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(100);
                    int length = 0;
                    while((length = socketChannel.read(byteBuffer) )!= -1) {
                        byteBuffer.flip();
                        System.out.println(new String(byteBuffer.array(), 0, length));
                        byteBuffer.clear();
                    }
                    socketChannel.close();
                }
                // 15、移除选择键
                iterator.remove();
            }
        }
        // 7、关闭连接
        serverSocketChannel.close();
    }
    public static void main(String[] args) throws IOException
    {
        testServer();
    }
}
