import token_hiearchy.*;
import java.util.Arrays;
import java.util.HashMap;
//this class does a lookup
public class Dictionary
{
    //this is a finite array of tokens, each of them in this case
    HashMap<String, Token> tokenlist; //we could make this map a tree instead
    Token[] tlist;
    //this function is called tokenize
    public void lookup(String S) //have this tree to retreive and create a token
    {
        System.out.println("ugh");
        //goes through stuff
    }
    //takes srchVal and goes through the dictionary
    //public void lookup(String srcVal)
    //{
    //create a local variable of type token
    //if srcVal matches any key
            //call the constructor of what you just called and assign it to the localvar
            //return that localvar
    //else figure out what else it could be if it isn't a reserved word
        //is namespace?
        //is punctuation/formatting?
    //find a valid start token, what can follow them
        //look for ends and stuff
    //if i i am a name token my next must be a namespace
    //if i a m
    //grammar are specifically pattersn of toens
    //else (check that it should be a namespace otherwise
    //}
    public Dictionary()
    {
        tlist = new Token[]{
                new Add(), new Assignment(), new Do_(),
                new Equality(), new For_(), new Inequality(),
                new Output(), new ScriptDelim(), new StatementDelim(),
                new Vardec(), new Subtract(), new While_(),
        };

        //tokenlist = new HashMap<>(tlist.length);
        //tokenlist = new HashMap< String, Token>(tlist.length);
        tokenlist = new TokenTree();
        //tlist.foreach(map.put(tlist.i) i++);
        for (Token token : tlist) {
            tokenlist.insert(token.actual); //put each item into the map
        }
        //System.out.println(Arrays.asList(tokenlist));
        //so lookup is going to go in and call each token's matchactual
    }
}