import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {
    public static void main(String[] args) throws IOException {
        String path="/Users/ccadmin/Desktop/FL_insurance_sample.csv";
        String line="";
        try {
            BufferedReader br=new BufferedReader(new FileReader(path));

            while((line=br.readLine())!=null){
               String []values=line.split(",");
                System.out.println(values[1]+ "     "+values[0]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
