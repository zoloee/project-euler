/**
 * Created by zoloe on 2017. 03. 28..
 */

class TextInput {
    public String inputText = new String("") ;

    public void add(char c){
        String ch = Character.toString(c);
        inputText += ch;
    }
    public String getValue(){
        return inputText;
    }
}

class NumericInput extends TextInput {
    @Override
    public void add(char c){
        if (Character.isDigit(c)){
            String ch = Character.toString(c);
            inputText += ch;
        }
    }
}

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}


