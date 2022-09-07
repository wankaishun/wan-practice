package com.wan.nio.socket;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * @author wan
 * @Description: 客户端
 * @date 2021/7/10 15:11
 */
public class ClientChannel {
    public static void main(String[] args) throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(100);
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 8080));
        socketChannel.configureBlocking(false);

        if (socketChannel.finishConnect()){
            int i = 10;
            while(i != 0) {
                TimeUnit.SECONDS.sleep(1);

                i-- ;
                buffer.put(("this" + i+ "times").getBytes());
                buffer.flip();
                while(buffer.hasRemaining()){
                    socketChannel.write(buffer);
                }
                buffer.clear();
            }
        }
        socketChannel.close();
    }
}
