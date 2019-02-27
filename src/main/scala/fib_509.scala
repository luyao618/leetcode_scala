/**
  * Created by luyao on 2019/2/22.
  */
object fib_509 {
  def fib(N: Int): Int = {
    if(N < 2){
      return N;
    }else{
      return fib(N-1) + fib(N-2);
    }
  }

}
