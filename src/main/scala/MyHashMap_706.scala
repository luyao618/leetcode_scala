import scala.collection.mutable.ArrayBuffer

/**
  * Created by luyao on 2019/2/19.
  */
object MyHashMap {
  def main(args: Array[String]): Unit = {
    val hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    println(hashMap.get(1));            // 返回 1
    println(hashMap.get(3));            // 返回 -1 (未找到)
    hashMap.put(2, 1);         // 更新已有的值
    hashMap.get(2);            // 返回 1
    hashMap.remove(2);         // 删除键为2的数据
    hashMap.get(2);            // 返回 -1 (未找到)

  }

}

class MyHashMap() {

  /** Initialize your data structure here. */

  var data:Array[Int] = new Array[Int](1000000)


  /** value will always be non-negative. */
  def put(key: Int, value: Int) {
    if(value == 0) data(key) = -1 else data(key) = value

  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  def get(key: Int): Int = {
    val res = data(key)
    if(res == 0) return -1
    if(res == -1) return 0
    res
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  def remove(key: Int) {
    data(key) = 0
  }

}

