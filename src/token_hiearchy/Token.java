package token_hiearchy;

//this is the acbc
public class Token {
  //data members go here

    //does each token just own its own data?
    //will we soft/hard link to a dicitonary definition?
    //do we need to instn
    public String actual; //would character or string comparison be better for lookup
    protected static final String OPENDELIM = "{"; //WHERE SHOULD I GO
    protected static final String CLOSEDELIM = "}";
    public Token()
    {
        actual = null;
    }

    //

}
