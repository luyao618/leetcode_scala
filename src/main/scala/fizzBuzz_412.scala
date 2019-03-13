
/**
  * Created by luyao on 2019/3/13.
  */
object fizzBuzz_412 {

  def fizzBuzz(n: Int): List[String] = {
    var res = List[String]()
    for(i <- 1 to n){
      var add = ""
      if(i % 3 ==0 && i % 5 == 0){
        add = "FizzBuzz"
      }else{
        if(i % 3 == 0){
          add = "Fizz"
        }else if(i % 5 == 0 ){
          add = "Buzz"
        }else{
          add = i.toString
        }
      }
      res = res:::List[String](add)
    }
    res
  }

}
