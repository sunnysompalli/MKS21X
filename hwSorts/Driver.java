public class Driver{

    public static void main(String[]args){
	int[]ary1 = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray(ary1);
	Sorts.insertionSort(ary1);
	Sorts.printArray(ary1);

	int[]ary2 = { 3, 5, 1, 6, 9};
	int[]ary3 = {10, 2, 6, 1, 7, -5};
	int[]ary4 = {0, 4, 3, 6, 4, 0};
	int[]ary5 = {10, 3, 6, 2, 9, 10};
	int[]ary6 = {-2, 4, 2, 6, 3, 7, -2};
	
	Sorts.printArray(ary2);
        Sorts.selectionSort(ary2);
	Sorts.printArray(ary2);

	Sorts.printArray(ary3);
        Sorts.selectionSort(ary3);
	Sorts.printArray(ary3);

	Sorts.printArray(ary4);
        Sorts.selectionSort(ary4);
	Sorts.printArray(ary4);

	Sorts.printArray(ary5);
        Sorts.selectionSort(ary5);
	Sorts.printArray(ary5);

	Sorts.printArray(ary6);
        Sorts.selectionSort(ary6);
	Sorts.printArray(ary6);
    }
}
