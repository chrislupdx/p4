package token_hiearchy;

//a derived class of token
//This one is the token for = or the token_hiearchy.equality operator
public class Assignment extends Token {

   public Assignment()
   {
      actual = "=";
      //lval = op1;
      //rval = op2; //do we have r/w access to these
   }

   //op1 is the argument to the left of the operator, does this return here on this layer
   //public Assignment(Token op1, Token op2)
   //{
   //   actual = "=";
   //   lval = op1;
   //   rval = op2; //do we have r/w access to these
   //   //what else does an token_hiearchy.assignment operator need to know to operator?
   //}

}
