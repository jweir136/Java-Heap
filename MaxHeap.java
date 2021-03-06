import java.util.*;

public class MaxHeap {
  private List<Comparable> arr;
  private int size;

  public MaxHeap() {
    this.arr = new ArrayList<Comparable>();
    this.size = 0;
    this.arr.add(Integer.MAX_VALUE); // make sure that the first position can never be used.
  }

  public int parent(int pos){
    return pos / 2;
  }

  public void insert(Comparable value) {
    this.arr.add(value);

    for (int i = this.arr.size() - 1; this.arr.get(i).compareTo(this.arr.get(parent(i))) > 0; i = parent(i))
      swap(i, parent(i));
  }

  public void print() {
    for (int i = 1; i <= this.arr.size()-1; i++)
      System.out.println(" node : " + this.arr.get(i));
  }

  public Comparable delMax() {
    return null;
    // TODO
  }

  private void swap(int idx1, int idx2) {
    Comparable temp = this.arr.get(idx1);

    this.arr.set(idx1, this.arr.get(idx2));
    this.arr.set(idx2, temp);
  }
}

