import token_hiearchy.Token;
import java.util.ArrayList;
//this class contains the functinality for our actual paser
public class parser {
    tree parsetree;
    //takes in our stuff
    public parser()
    {
        parsetree = null;
    }
    public int parse(ArrayList<String> rawData)
    {
        int i = 0;
        while(i < rawData.size()) //this is going line by line through text
        {
            //System.out.println(rawData.get(i));
            var array =  rawData.get(i).split(" ");
            for(int e = 0; e < array.length; e++) {
                System.out.println("ii"); //this prints out each item of the array stringified
                System.out.println(array[e]); //this prints out each item of the array stringified
                System.out.println("ii"); //this prints out each item of the array stringified
            }

            //iterate through
            //for(int e = 0; e < array.length; e++)
            //{
            //    //print out the indidividual to be translated strings
            //    String[] subarray;
            //    subarray = array.split("");
            //    // System.out.println("lol");
            //}
            //System.out.println("lol");
            //go through array and parse your shit
            //for(int e = 0; e < array.length; e ++)
            //{
            //    //array[i] should be a string;
            //    //parse(array[i]);
            //}
            //array.foreeach( (i, ) => parseWord(i)); //
            //for the size of the array, parseWord(array[i]),  then insert it into the tree
            //an array of strings of the number of items in line to parse
            //split each radatData.get(i); for their individual words, then parse
            //parseWord(for each possible word in line)
            // dictionary.lookup(rawData.get(i));
            ++i;
        }
        //parse rawData line by line into tokens. insert those tokens.
       return 1;
    }
    public Token parseWord(String input)
    {
    Token newtoken = new Token();
    //write a prser than takes in a string, lookups up against disctionaryj
        // RETURNS THE KEY VALUE
        //if parseword finds another token it calls itself with the next token
        return newtoken; //by the end of this function we should have returned a fully constrcuted token
    }
}