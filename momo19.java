public class figures {

     public static int getLargest(int...f) {
          int[] score = new int[f.length];
          int largest=0;
          for(int x=0;x<f.length;x++) {
                for(int z=0;z<f.length;z++) {
                    if(f[x]>=f[z]) {
                    score[x]++;
                    }else if(f[x]<f[z]) {

                    }else {
                        continue;
                    }
                    if(z>=f.length) {
                    z=0;
                    break;
                    }
              }
       }
for(int fg=0;fg<f.length;fg++) {
    if(score[fg]==f.length) {
        largest = f[fg];
    }
}
return largest;
    }
}
share edit
