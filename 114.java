public int singleNumber(int[] A) 
{
	HashSet<Integer> set = new HashSet<Integer>();
	for (int n : A) 
  {
		if (!set.add(n))
			set.remove(n);
	}
	Iterator<Integer> it = set.iterator();
	return it.next();
}
