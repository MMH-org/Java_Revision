package src.Basic;

public class Continue {
    public static void main(String[] args) {
        //for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //using a continue statement
                continue;//it will skip the rest statement
            }
            System.out.print(i +" ");
        }
    }
}
