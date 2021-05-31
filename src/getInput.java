import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class getInput {
    ArrayList<String> rawData; //does this array need to be initialized
    getInput()
    {
        rawData = new ArrayList<String>();
    }
    void pullfromText() {
        try {
            File myObj = new File("src/sampleCode.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                rawData.add(data);
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error, no file at location");
            e.printStackTrace();
        }

        //visual test to proove rawdata has real data
      int i = 0;
       // System.out.println("before");
       //while(i < rawData.size())
       //{
       //   System.out.println(rawData.get(i));
       //   ++i;
       //}
    }
}