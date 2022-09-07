package com.wan.nio;

import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @author wan
 * @Description: 通道传输
 * @date 2021/7/9 14:32
 */
public class TestChannelTransfer {
    public static void main(String[] args) throws Exception{
        RandomAccessFile fromFile = new RandomAccessFile("E:\\账号管理.txt","rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("E:\\账号管理备份.txt","rw");
        FileChannel toChannel = toFile.getChannel();
        long  position = 0;
        long count = fromChannel.size();
        toChannel.transferFrom(fromChannel, position, count );
//        fromChannel.transferTo(position, count, toChannel);
    }
}
