import token_hiearchy.*;

import java.util.Arrays;
import java.util.HashMap;

//this class does a lookup
public class Dictionary
{
    //this is a finite array of tokens, each of them in this case
    HashMap<String, Token> tokenlist;
    Token[] tlist;

    public static void lookup(String S)
    {
        //goes through stuff

    }

    //public void lookup()
    //{
    //}

    public Dictionary()
    {
        //Token add = new Add();
        //Token subtract = new subtract();
        //Token do_= new do_();
        //, assign, do_, equal, for_, ineq, output, scrptDelim, statementDelim, subtract, vardec, while_;
        tlist = new Token[]{
                new Add(), new Assignment(), new Do_(),
                new Equality(), new For_(), new Inequality(),
                new Output(), new ScriptDelim(), new StatementDelim(),
                new Vardec(), new Subtract(), new While_(),
        };

        tokenlist = new HashMap<>(tlist.length);
        //tokenlist = new HashMap< String, Token>(tlist.length);

        //tlist.foreach(map.put(tlist.i) i++);
        for (Token token : tlist) {
            tokenlist.put(token.actual, token); //put each item into the map
        }
        //System.out.println(Arrays.asList(tokenlist));
    }
}