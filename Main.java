package com.company;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("opening connection");
        URL url = new URL("https://digital.library.unt.edu/ark:/67531/metadc331136/m2/1/high_res_d/1002783810-Galloway.pdf?fbclid=IwAR2Nc3tTLLD9b0eRnsTdoUKXQC6zq55_y0fnQeuG9qo___H1-qqfJmvY2kc");
        InputStream in = url.openStream();
        FileOutputStream fos = new FileOutputStream(new File("d.pdf"));

        System.out.println("reading from resource and writing to file...");
        int length = -1;
        byte[] buffer = new byte[1024];// buffer for portion of data from connection
        while ((length = in.read(buffer)) > -1) {
            fos.write(buffer, 0, length);
        }
        fos.close();
        in.close();
        System.out.println("File downloaded");

    }}
