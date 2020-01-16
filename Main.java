public class Main {
  public static void main(String[] args) {
    Integer[] arr = {1, 3, 5, 4};
    MaxHeap heap = new MaxHeap();

    for (Integer i : arr)
      heap.insert(i);

    for (Integer i : arr)
      System.out.println(i);

    System.out.println(heap);
    System.out.println();
    System.out.println(heap.delMax());
    System.out.println(heap.delMax());
    System.out.println(heap.delMax());
    System.out.println(heap.delMax());
  }
}
