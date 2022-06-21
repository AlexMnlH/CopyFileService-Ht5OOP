package net.ukr.ahavrykin;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File folderIn = new File("\\Старые д-ты");

        File folderOut = new File("\\Новая папка");
        folderOut.mkdirs();

        try {
            FileCopyService.folderCopy(folderIn, folderOut,"jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
