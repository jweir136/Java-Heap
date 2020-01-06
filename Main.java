public class Main {
  public static void main(String[] args) {
    Integer[] arr = {1, 3, 5, 4};
    MaxHeap heap = new MaxHeap();

    for (Integer i : arr)
      heap.insert(i);

    System.out.println(heap);
  }
}
