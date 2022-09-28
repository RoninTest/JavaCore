package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptions {
    public static void main(String[] args) throws IOException {


        String filePath="src/exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(filePath);
            int k=0;

            while((k= fis.read())!=-1){
                System.out.println((char)k);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) { // above exception is not essential.
            e.printStackTrace();
        }
    }
}
