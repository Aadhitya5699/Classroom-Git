public class Pyramid {
    public static void main(String[] args) {
            //outer loop
        for(int i=1;i<=4;i++){
                //For Space
        for(int j=1;j<=4-i;j++){
                    System.out.print(" ");
                }
                //For Star
            for (int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }}


