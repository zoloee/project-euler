/**
 * Created by zoloe on 2017. 03. 21..
 */
public class ConstructosExample {
    public static int co = 0;
    private ConstructosExample(){
        co ++;
    }
        public static void main(String[] args) {
            final ConstructosExample[] examples = new ConstructosExample[3];
            System.out.println(co);
            System.out.println(examples[1]);
        }
}


