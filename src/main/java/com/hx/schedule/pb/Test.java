package com.hx.schedule.pb;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author xiongyu
 * @date 2022/3/1 2:06 下午
 */
public class Test {
    private static final String dir = "/Users/Jeff/Downloads/data/miniodata/";

    public static void main(String[] args) {
        try {
            String d = dir + "test" + "/";
            String fileUrl = d + "1646115273448.png";
            File f = new File(fileUrl);
            if (f.exists() && !f.isDirectory()) {
                FileUtils.deleteQuietly(f);
            }

            File directory = new File(d);
            if (directory.isDirectory() && directory.listFiles().length == 0) {
                FileUtils.deleteDirectory(directory);
            }

        } catch (Exception e) {
            System.out.println("FileServiceImpl.removeFile:cleanDirectory");
        }
    }

    public static void putfile(String[] args) {
        try {
            String oldFileName = "fafafaf.png";
            String fileName = System.currentTimeMillis() + ((oldFileName.lastIndexOf(".") > 0) ? oldFileName.substring(oldFileName.lastIndexOf(".")) : "");
            String fileUrl = "/Users/Jeff/Downloads" + dir + "test" + "/" + fileName;
            File file = new File("/Users/Jeff/Downloads/581.png");
            FileInputStream inputStream = new FileInputStream(file);
            FileUtils.writeByteArrayToFile(new File(fileUrl), IOUtils.toByteArray(inputStream));
        } catch (Exception e) {
            System.out.println("FileServiceImpl.putFile:writeByteArrayToFile异常");
        }
    }
}
