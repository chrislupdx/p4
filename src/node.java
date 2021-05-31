import token_hiearchy.Token;

public class node {
    //has a token in it
    Token data; //this is a virtual clasa and it can't be accessed from outside of package?
    node left;
    node right;
    public node()
    {
        super();
        data = null;
        left = null;
        right = null;
    }

    public node(Token newdata)
    {
        data = newdata; //deep copy yes no?A
        left = null;
        right = null;
    }

    //display data member and if i can, left and right's addresses
    public void display()
    {
        //this is for testint really
    }
}
