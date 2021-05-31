package token_hiearchy;

public class Vardec extends Token {

    public Vardec()
    {
        super(); //calls parent's constructor
        actual = "a_number";

    }

    //is variable declaration return type an r or l val
    Vardec(String rest) //rest == the rest of the string for vriable declaration aka figuring out the idenfifier for this var
    {
        actual = "a_number";
        //lval = op1;
        //rval = op2;
    }
}
