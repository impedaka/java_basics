import java.util.Arrays;
import java.util.Scanner;

public class PracTest12 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        //String[] names = new String[5];
        String[] names = {"sam", "sally", "debra", "ann", "nick"};
        /* 
        for(int i=0; i<5; i++){
            names[i] = kb.nextLine();
        } */

        for (int i=0; i<names.length; i++){
            for (int j =0; j<names.length; j++){
                if (names[i] !=names[j]){
                    int count =0;
                    for (int f=0; f<names[i].length(); f++){
                        for (int p=0; p<names[j].length(); p++){
                            if (names[i].charAt(f) == names[j].charAt(p)){
                                if (f ==0 && p ==0){
                                    count+=5;
                                }
                                else {count++;}
                            }
                        }
                    }
                System.out.println(names[i]+" "+names[j]+" "+count);
                }
            }
        }
        kb.close();
    }
}
