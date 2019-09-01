class PalindromeCheck{ 

  public static boolean returnPalindrome(int a){
     int lastdigit,sum=0;
     int input = a;
     while (a>0){
       lastdigit = a%10;
       sum *= 10;
       sum = sum + lastdigit;
       a = a/10;
     }

     if (sum==input){
       return true;
     } else return false;

  }
  public static void doTest(int a){
     if (returnPalindrome(12321))System.out.print("All tests passed");
     else System.out.print("Test failed");
  }
  public static void main(String[] args) {
      doTest(12321);
  }
}