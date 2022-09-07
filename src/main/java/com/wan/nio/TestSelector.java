package com.wan.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wan
 * @Description: selector 使用
 * @date 2021/7/9 14:45
 */
public class TestSelector {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("www.baidu.com", 80));
        Selector selector = Selector.open();
        SelectionKey key1 = socketChannel.register(selector,  SelectionKey.OP_READ);
        while (true) {
            int readyChannels = selector.select();
            if(readyChannels == 0) continue;
            Set selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
            while(keyIterator.hasNext()) {
                SelectionKey key =  keyIterator.next();
                if(key.isAcceptable()) {
                    SelectableChannel channel = key.channel();

                } else if (key.isConnectable()) {
                } else if (key.isReadable()) {
                } else if (key.isWritable()) {
                }
                keyIterator.remove();
            }

        }
    }
}
