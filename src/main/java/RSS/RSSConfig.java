package RSS;

/**
 * Created by x on 6/19/2014.
 */
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class RSSConfig {
    String config_file = "rss_config.txt";
    List<String> config = new ArrayList<String>();

    public void loadConfig(){

        FileInputStream file = null;
        BufferedReader reader = null;
        System.out.println("Loading file");
        try {
            file = new FileInputStream(config_file);
            reader = new BufferedReader(new InputStreamReader(file));

            String line = reader.readLine();
            System.out.println(line);
            while(line != null){
                if (line.length() > 5){
                    config.add(line);
                }
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(" ", ex.getMessage());
        }
        catch (IOException ex) {
            Logger.getLogger(" ", ex.getMessage());
        }
        finally {
            try {
                reader.close();
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(" ", ex.getMessage());
            }
        }
    }

    public void printConfig(){
        for (int i = 0; i < config.size(); i++ ){
            System.out.println( config.get(i));
        }
    }

    public List<String> getList(){
        for (int i = 0; i < config.size(); i++){
            System.out.println(config.get(i));
        }
        return config;
    }

    public void addSource( String source ){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(config_file, true)));
            out.println(source);
        }catch (IOException e) {
            System.out.println("Oups. Exception while adding new RSS source to file.");
        }
    }

    public void removeSource( int id ){

    }

    public String print(){
        return "test";
    }
}
