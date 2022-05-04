public class EvenOdd {
    public static String evenodd(int x){
      if(x<0)
          return "neither even nor odd";
      else if (x% 2 ==0)
          return "even";
      else
          return "odd";
    }
}
