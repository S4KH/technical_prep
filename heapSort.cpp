//Implementation of Heap Sort
#include <stdio.h>
#include <stdlib.h>

struct Heap
{
	int size;
	int* arr;
};

//Swap integers
void swap(int*a, int*b)
{
	*a+=*b;
	*b=*a-*b;
	*a=*a-*b;
}

//Maintain heap property
void maxHeapify(struct Heap* heap, int i)
{
	int max = i;
	int l = 2*i+1;
	int r = 2*i+2;

	//Check with left child
	if(l<heap->size && heap->arr[l]>heap->arr[max]){
		max = l;
	}

	//Check with right child
	if(r<heap->size && heap->arr[r]>heap->arr[max]){
		max = r;
	}

	//Change the root value
	if(max !=i){
		swap(&heap->arr[max], &heap->arr[i]);
		maxHeapify(heap, max);
	}
}

struct Heap* buildHeap(int *arr, int size)
{
	int i;
	struct Heap* heap = (Heap*)malloc(sizeof(Heap));
	heap->size = size;
	heap->arr = arr;

	for(i=(heap->size)/2;i>=0;i--){
		maxHeapify(heap, i);
	}

	return heap;
}

void heapSort(int *arr, int size)
{
	//initialize heap from input
	Heap* heap = buildHeap(arr, size);

	while(heap->size>1){

		swap(&heap->arr[0], &heap->arr[heap->size-1]);
		heap->size--;

		maxHeapify(heap, 0);
	}
}

//Print given array
void printArray(int* arr, int size)
{
    int i;
    for (i = 0; i < size; ++i)
        printf("%d ", arr[i]);
}
 
//Execution point
int main()
{
    int arr[] = {5, 3, 17, 10, 84, 19, 6, 22, 9};
    int size = sizeof(arr)/sizeof(arr[0]);
 
    printf("Given array is \n");
    printArray(arr, size);
 
    heapSort(arr, size);
 
    printf("\nSorted array is \n");
    printArray(arr, size);
    printf("\n");
    return 0;
}