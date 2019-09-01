class Fibonnaci{ 

  private static int recFib(int n){
     if (n==1 || n==2) return 1;
     else return (recFib(n-1)+recFib(n-2));
  }
 
  private static int iterFib(int n){
    int total = 0;
    int prevprevious = 1;
    int previous = 1;
    if (n > 1){
      for (int i=2; i<n; i++){
        total = previous + prevprevious;
        prevprevious = previous;
        previous = total;
      }
      return total;
    }
    else return 1;
  }

  private static int dynFib(int n, int[] mem){
     if (mem[n]==0){
        if (n==1||n==2){
          mem[n] = 1;
          return mem[n];
        }
        else{
          mem[n] = dynFib(n-1, mem)+dynFib(n-2, mem);
          return mem[n];
        }
     } else return mem[n];
  }

  private static int bottomupFib(int n){
    return 0;
  }

  public static void main(String[] args) {
    int i = 10;
    System.out.println(recFib(i));
    System.out.println(iterFib(i));
    int[] mem = new int[i+1];
    System.out.println(dynFib(i, mem));

  }
}