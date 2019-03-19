public static void searchSales(int search[]
){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sales figure you want to find: ");
        int target = input.nextInt();
        int index = -1;
        for (int i=0; i<search.length; i++)
        {
            if (search[i] == target){
                index=i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Sales figure not found");
        }
        else {
            System.out.printf("Sales figure found at branch %d",index+1);
        }
    }
