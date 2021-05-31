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
            System.out.println(rawData.get(i));

            //produce an array of
           //array =  rawData.get(i).split(" ");

            //for the size of the array, parseWord(array[i]),  then insert it into the tree
            //array.foreeach( (i, ) => parseWord(i)); //
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
