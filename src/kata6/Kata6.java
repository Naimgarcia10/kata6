package kata6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class Kata6 {

    public static void main(String[] args) {
        String json = "";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("superHeroe.json")));
            String line = "";
            while ((line = reader.readLine()) != null){
                json += line;
            }
            reader.close();
                    
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
        Gson gson = new Gson();
        
        SuperHeroe sp = gson.fromJson(json, SuperHeroe.class);
        
        System.out.println(sp);
    }

    
}
