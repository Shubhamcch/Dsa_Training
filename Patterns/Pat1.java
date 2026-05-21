import java.util.*;
public class Pat1{
    public static void main(String[] args){
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<5; j++){
        //         System.out.print(i+""+j+" ");
        //     }
        //     System.out.println();
        // }   

        // for(int i = 0; i<=4; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }   

        // for(int i = 0; i<=4; i++){
        //     for(int j = 0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print(" ");
        // }

        // Solid Square
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<5; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Right Triangle
        // for(int i = 0; i<5; i++){
        //     for(int j =0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Inverted Right Triangle
        // for(int i =0; i<5; i++){
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();


        // }


        // binary triangle
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<=i; j++){
        //         if((i+j) % 2 == 0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        // number triangle
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<=i; j++){
        //         System.out.print(i+ " ");
        //     }
        //     System.out.println();
        // }



        // vertical 90 degree rotated triangle
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //  for (int i = 1; i <= 5; i++) {
            
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 5; i >= 1; i--) {
            
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }



        // print equilateral triangle (pyramid)
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // inverted pyramid
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // inverted $ pyramid
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print("$ ");
        //     }
        //     System.out.println();
        // }


        // kaju katli * pattern
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Print Alphabet Pattern
        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<=i; j++){
        //         System.out.print((char)('A' + j));
        //     }
        //     System.out.println();
        // }

        // inverted alphabet pattern
        for(int i = 5; i>0; i--){
            for(int j = 0; j<i; j++){

                
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }

    }
}
