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

public class RSSConfig {
    String config_file = "C:\\Users\\x\\Documents\\GitHub\\QlRSS\\rss_config.txt";
    List<String> config = new ArrayList<String>();

    public void load_config(){
        FileInputStream file = null;
        BufferedReader reader = null;
        System.out.println("Loading file");
        try {
            file = new FileInputStream(config_file);
            reader = new BufferedReader(new InputStreamReader(file));

            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
                config.add(line);
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

    public void print_config(){
        for (int i = 0; i < config.size(); i++ ){
            System.out.println( config.get(i));
        }
    }

    public List<String> get_list(){
        for (int i = 0; i < config.size(); i++){
            System.out.println(config.get(i));
        }
        return config;
    }

    public String print(){
        return "test";
    }
}
