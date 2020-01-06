public class Main {
  public static void main(String[] args) {
    Integer[] arr = {1, 3, 5, 4};
    MinHeap heap = new MinHeap();

    for (Integer i : arr)
      heap.insert(i);

    System.out.println(heap);
    System.out.println();
    System.out.println(heap.delMin());
    System.out.println(heap.delMin());
    System.out.println(heap.delMin());
    System.out.println(heap.delMin());
  }
}
