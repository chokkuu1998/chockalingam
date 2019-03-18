public static void main(String[] args)
    {
    String s = "abacuusttlvbnc";
    int k=3;
    char[] sArr = s.toCharArray();
    int strLen = sArr.length;
    Set<Character> set = new LinkedHashSet<Character>();
    int l=0;
    int r=0;

    while(l<=strLen-k)
    { 
        for(int i=0;i<k;i++)
        {   
            set.add(sArr[l]);
            l++;
        }
        if(set.size()==k){
            System.out.println("substring : " + set);
        }
        set.clear();
        r++;
        l= r;
     }
  }
}
