public class Day5_Loops {
    static void main() {

        for(int i = 1; i<=5; i++){
            //System.out.println(i);
        }

        for (int i = 1; i <=14 ; i++) {
            //System.out.println("Pranshu verma");
        }
//        odd number

        for(int i = 1; i<= 20; i+=2){
//            System.out.println(i);
        }

        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                //System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                //System.out.println("i = " +i + " j = " + j);
            }
        }

//        break keyword loop ko terminate kardeta he
        for(int i = 1; i<=10; i++){
            if(i==5){
                break;
            }
          //  System.out.println(i);
        }

// continue keyword skip the perticular interation
        for(int i = 1; i<=20; i++){
            if(i==10 || i==15){
                continue;
            }
         //   System.out.println(i);

        }
//        while loop

        int i = 1;
        while (i<=5){
           // System.out.println("Pranshu verma");
            i++;
        }

// do while loop

        int k = 1;
         do{
             System.out.println(k );
             k++;
         }while (k<=5);
    }
}
