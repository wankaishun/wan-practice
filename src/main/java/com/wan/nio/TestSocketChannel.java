package com.wan.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author wan
 * @Description: -
 * @date 2021/7/9 16:13
 */
public class TestSocketChannel {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("jenkov.com", 80));
        ByteBuffer buffer = ByteBuffer.allocate(52);
        int bytesRead  = socketChannel.read(buffer);
        while(bytesRead != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            bytesRead = socketChannel.read(buffer);
        }
        socketChannel.close();

    }
}
