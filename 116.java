 public class homework1 {
            public static void main(String[] args){
                    // input from user
                    Scanner input = new Scanner(System.in);
                    int [] numbers = new int[10];
                    boolean[] distinct = new boolean[10];
                    System.out.println("Enter ten numbers");
                    for (int i=0; i<numbers.length; i++){
                            System.out.println("Number " + (i + 1) +":  ");
                            numbers [i] = input.nextInt();
                            distinct[i] = true;
                            for(int j = 0;j<10; j++){
                                    if(numbers[i] == numbers[j] && i != j) {
                                            distinct[i] = false;
                                            }
                                    }
                            }
    
                    int count=0;
                    for(int j = 0;j<10; j++){
                         if (distinct[j]){
                              numbers[count]=distinct.length;
                              count++;
                         }
                    }
                    System.out.println("The number of distinct number is: "+numbers[count]);
                    System.out.println("The distinct numbers are: ");
                    for(int i= 0; i < 10; i++) {
                            if(distinct[i]) {
                                    System.out.print(numbers[i] + " ");
                                    }
                            }
                            System.out.println();
            }
    }
