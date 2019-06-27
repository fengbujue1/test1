package main.java.com.fengbujue.test.Util;

import java.io.File;

public class TestUtil {
    private static final String SystemResource = ClassLoader.getSystemResource("").toString();
    private static final String ABSOLUT_PATH = SystemResource.substring(6,SystemResource.length());
    public static void main(String[] args){
        testFileCompressUtil();
    }
    private static void testFileCompressUtil(){
        File file = new File(ABSOLUT_PATH );
        FileCompressUtil.zip(ABSOLUT_PATH,"F:\\idea_project\\tempDir\\zip1.zip");
    }
}
