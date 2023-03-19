package com.mashibing.demo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xjl
 * @date 2023/3/13
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\user\\Desktop\\git\\a");
        file.mkdir();
        InputStream in = System.in;
        int read = in.read();
        System.out.println(read);


    }


}
