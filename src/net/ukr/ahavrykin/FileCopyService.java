package net.ukr.ahavrykin;

import java.io.*;

public class FileCopyService {

    //method implements copying files from adress to adress
    public static void copyFile(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
            long copyByte = is.transferTo(os);
            System.out.println(copyByte + " copy");
        } catch (IOException e) {

            throw e;
        }
    }

    public static void folderCopy(File folderIn, File folderOut, String tipeFile) throws IOException {
        MyFileFilter mFF = new MyFileFilter(tipeFile);
        File[] files = folderIn.listFiles(mFF);
        for (File file : files) {
            if (file.isFile()) {
                File out = new File(folderOut, file.getName());
                copyFile(file, out);
            }
        }
    }

}
