class Solution {
    public void heapify(int[] arr, int n, int i) {
        int largest = i;          // assume root is largest
        int left = 2 * i + 1;     // left child
        int right = 2 * i + 2;    // right child

        // if left child is bigger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // if right child is bigger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // if largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    public void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (max) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public int[] sortArray(int[] nums) {
        heapSort(nums);
        return nums;
    }
}
