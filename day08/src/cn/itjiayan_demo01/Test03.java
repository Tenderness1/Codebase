package cn.itjiayan_demo01;

import java.io.File;
import java.io.IOException;

public class Test03 {

    public static void main(String[] args) throws IOException {
        File f = new File("G://bbb");
        f.mkdir();
    }
}
