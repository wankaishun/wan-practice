package com.wan.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wan
 * @Description: ceshi
 * @date 2021/7/10 14:43
 */
public class TestFileChannel1 {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream(new File("d://a.txt"));
        FileOutputStream outputStream = new FileOutputStream(new File("d://b.txt"));
        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(50);
        while(true) {
            int r = inputChannel.read(buffer);
            if(r == -1) {
                break;
            }
            buffer.flip();
            outputChannel.write(buffer);
            buffer.clear();
        }

    }
}
