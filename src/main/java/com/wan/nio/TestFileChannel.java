package com.wan.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wan
 * @Description: 测试FileChannel
 * @date 2021/7/8 16:07
 */
public class TestFileChannel {
    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("E:\\账号管理.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);
        int bytesRead = channel.read(buffer);
        while (bytesRead != -1) {
            System.out.println("Read" + bytesRead);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            bytesRead = channel.read(buffer);
        }
        file.close();
    }
}
