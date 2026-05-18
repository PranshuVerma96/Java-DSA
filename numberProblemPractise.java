public class PrintDigitOfNumber {
    static void printDigits(int num){
        while (num !=0){
            int digit = num % 10;
            //System.out.println(digit);

//            last digit ko remove karta he
            num = num /10;
        }
    }

//    count digit from the number
    static  int countDigits(int num){
        int count = 0;
        while (num!=0){
            int digit = num % 10;
            count++;

            num = num /10;


        }
        return  count;
    }

//    sum digit from the number
    static int sumDigits(int num){
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

//    reverse of number
    static  int reverseDigit(int num){
        int reverse = 0;
        while (num!=0){
            int digit = num % 10;
            reverse = reverse *10 + digit;
            num = num /10;
        }
        return  reverse;
    }

//    check number is paildrome or not
    static  boolean isPalindrome(int num){
        int reverse = 0;
        int ornignal = num;
        while (num != 0){
            int digit = num % 10;
            reverse = reverse *10 + digit;
            num = num / 10;

        }
        if(reverse == ornignal){
            System.out.println("the number is paildrome number ");
            return  true;
        }
        else {
            System.out.println("number is not paildrome");
            return  false;
        }

    }

//    check nuber is prime or not
    static boolean isPrimeornot(int num){
        if(num<=1){
            System.out.println("the number is not prime number ");
            return false;
        }
        boolean isPrime = true;

        for(int i = 2; i*i < num; i++){
            if( num%i == 0 ){
                isPrime =false;
                break;
            }
        }
//
//        for(int i = 2; i< num-1; i++){
//            if( num%i == 0 ){
//                isPrime =false;
//                break;
//            }
//
//        }
        if(isPrime){
            System.out.println("The Given number is prime number");
        }
        else {
            System.out.println("the given number is not a prime number ");
        }
        return isPrime;
    }

//    find gcd from the number
    static  int getGCD(int a , int b){
        while (b != 0){
            int oldValueOfb = b;
            b = a%b;
            a= oldValueOfb;
        }
        int ans = a;
        return  ans;
    }

//    get lcm
    static  int getLCM(int a, int b){
        int gcd = getGCD(a , b);
        int product = a* b;
        int lcm = product /gcd;
        return  lcm ;
    }

//    get anstrong number

    static boolean isArmostrong(int num){
        int sum = 0;
        int oringnal = num;
        while (num != 0){
            int digit = num % 10;
            int cubDigit = digit*digit*digit;
            sum = sum + cubDigit;
            num = num /10;
        }
        if(sum == oringnal){
            System.out.println("the number is armstrong ");
            return  true;
        }
        else {
            System.out.println("the number is not armstrong");
            return  false;
        }
    }

//    get perfect number
    static  boolean checkPerfectNumber(int num){
        int sum = 1;
        for(int i = 2; i*i<=num; i++){
            if(num % i==0){
                int firstfactor = i;
                int secondfacot = num/i;
             sum =sum + firstfactor + secondfacot;
            }
        }
        if(sum == num){
            return  true;
        }else {
            return  false;
        }
    }

//    get all prime from 1 to n
    static  void printAllPrime(int n){

        for(int i =2; i<=n; i++){
            boolean isPrimeornot = isPrimeornot(i);
            if(isPrimeornot == true){
                System.out.println(i);
            }
        }
    }

    static void main() {

        printAllPrime(10);
//        System.out.println(checkPerfectNumber(61));
      //  isArmostrong(370);
//        System.out.println(getGCD(12, 18));
//        System.out.println(getLCM(18, 12));
//        int num = 4039552;
//        printDigits(num);
//
//        int ans = countDigits(num);
        //System.out.println("the digit is " + ans);

//        int num2 = 1234567891;
//        int answer = sumDigits(num2);
//       // System.out.println("the sum of all digits is :==> " + answer);
//
//        int answer2 = reverseDigit(num2);
//        System.out.println(answer2);
//
//   boolean ans = isPalindrome(12231);
//        System.out.println(ans);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int num = sc.nextInt();
//        isPrime(num);

    }
}
