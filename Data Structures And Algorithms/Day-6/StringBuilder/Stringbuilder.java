

public class Stringbuilder {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("");           // the stringbuilder is used for creating string object.
                                                            //  you can create the object and change it according to you want
        for(char i = 'a';  i <= 'z'; i++){
            sb.append(i);
        }

        System.out.println(sb);
    }
}
