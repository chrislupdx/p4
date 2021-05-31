import token_hiearchy.*;
import java.util.HashMap;
//this class does a lookup
public class dictionary {
    //this is a finite array of tokens, each of them in this case
    HashMap<String, Token> tokenlist;
    Token[] tlist;

    public static void lookup(String S)
    {

    }

    //
    //public void lookup()
    //{
    //}

    public dictionary()
    {
        //Token add = new Add();
        //Token subtract = new subtract();
        //Token do_= new do_();
        //, assign, do_, equal, for_, ineq, output, scrptDelim, statementDelim, subtract, vardec, while_;
        tlist = new Token[]{new Add(), new Do_(), new Vardec()};
        tokenlist = new HashMap< String, Token>(tlist.length);

        //tlist.foreach(map.put(tlist.i) i++);
        for( int i = 0; i < tlist.length; i++)
        {
        tokenlist.put( tlist[i].actual, tlist[i]); //put each item into the map
        }
    }
}