import java.util.*;

public class MaxHeap {
  private List<Comparable> arr;
  private int size;

  public MaxHeap() {
    this.arr = new ArrayList<Comparable>();
    this.arr.add(0); // make sure that the first position can never be used.
    this.size = 0;
  }

  public void insert(Comparable[] value) {
    this.arr.add(value);
    this.size++;

    swim(this.size - 1);
  }

  public Comparable delMax() {
    // TODO
    return new Integer(1); // return a random placeholder to void compile-time error.
  }

  private void swap(int idx1, int idx2) {
    Comparable temp = this.arr.get(idx1);

    this.arr.set(idx1, this.arr.get(idx2));
    this.arr.set(idx2, temp);
  }

  private void sink(int k) {
    // TODO
  }

  private void swim(int k) {
    while (k > 1 && this.arr.get(k).compareTo(this.arr.get(k / 2)) > 0) {
      swap(k, k / 2);
      k /= 2;
    }
  }

  @Override
  public String toString() {
    String result = "[ ";

    for (int i = 1; i < this.size; i++)
      result += this.arr.get(i) + " ";

    return result += "]"
  }
}
