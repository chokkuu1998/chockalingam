public static void countTriplets(int arr[], int index, int arr1[], int position)
{
    if (position == 2)
    {
        System.out.println(Arrays.toString(arr1));
        return;
    }
    for (int i = index; i < arr.length; i++)
    {
        arr1[position] = arr[i];
        countTriplets(arr, index + 1, arr1, position + 1);
    }
}
