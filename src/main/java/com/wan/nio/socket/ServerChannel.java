package com.wan.nio.socket;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wan
 * @Description: serverchannel
 * @date 2021/7/10 16:09
 */
public class ServerChannel {
    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8080));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true) {
            //三秒内没有连接进行下一次循环
            if (selector.select(3000) == 0) {
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    handleAcceptable(selectionKey);
                } else if (selectionKey.isReadable()) {
                    handleRead(selectionKey);
                } else if (selectionKey.isWritable()) {
                    handleWrite(selectionKey);
                } else if (selectionKey.isConnectable()) {
                    System.out.println("isConnectable = true");
                }
                iterator.remove();
            }
        }
    }
    public static void handleWrite(SelectionKey selectionKey) throws Exception {
        SocketChannel socketChannel = (SocketChannel)selectionKey.channel();
        ByteBuffer buffer = (ByteBuffer)selectionKey.attachment();
        buffer.flip();
        while(buffer.hasRemaining()) {
            socketChannel.write(buffer);
        }
        buffer.compact();

    }
    public static void handleAcceptable(SelectionKey selectionKey) throws Exception {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel)selectionKey.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        socketChannel.register(selectionKey.selector(), SelectionKey.OP_READ, ByteBuffer.allocateDirect(1024));

    }
    public static void handleRead(SelectionKey selectionKey) throws Exception{
            SocketChannel socketChannel = (SocketChannel)selectionKey.channel();
            ByteBuffer buffer = (ByteBuffer)selectionKey.attachment();
            long bytesRead = socketChannel.read(buffer);
            while(bytesRead > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char)buffer.get());
                }
                System.out.println();
                buffer.clear();
                bytesRead = socketChannel.read(buffer);
            }
    }
}
