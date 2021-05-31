public class main {
    //calls in our parser here
    //parser the_parser;

    public static void main(String[] args){
        getInput input = new getInput();
        input.pullfromText();

        parser a_parser = new parser();
        a_parser.parse(input.rawData);
        //dictionary a_dict = new dictionary();
    }

}
