import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;


	private static final class MultiMap
  {
		private final Map fMap= new LinkedHashMap();

	
		public void put(Object key, Object val)
    {
			Set values= (Set) fMap.get(key);
			if (values == null) {
				values= new LinkedHashSet();
				fMap.put(key, values);
			}
			if (val != null)
				values.add(val);
		}

		public Set get(Object key)
    {
			Set values= (Set) fMap.get(key);
			return values == null ? Collections.EMPTY_SET : values;
		}

		public Set keySet()
    {
			return fMap.keySet();
		}

		
		public Set removeAll(Object key)
    {
			Set values= (Set) fMap.remove(key);
			return values == null ? Collections.EMPTY_SET : values;
		}

		public void remove(Object key, Object val) 
    {
			Set values= (Set) fMap.get(key);
			if (values != null)
				values.remove(val);
		}
		
		/*
		 * @see java.lang.Object#toString()
		 */
		public String toString()
    {
			return fMap.toString();
		}
	}

	private final MultiMap fOut= new MultiMap();
	private final MultiMap fIn= new MultiMap();


	public boolean addEdge(Object origin, Object target)
  {
		Assert.isLegal(origin != null);
		Assert.isLegal(target != null);

		if (hasPath(target, origin))
			return false;

		fOut.put(origin, target);
		fOut.put(target, null);
		fIn.put(target, origin);
		fIn.put(origin, null);
		return true;
	}

	
	public void addVertex(Object vertex) {
		Assert.isLegal(vertex != null);
		fOut.put(vertex, null);
		fIn.put(vertex, null);
	}

	
	public void removeVertex(Object vertex) 
  {
		Set targets= fOut.removeAll(vertex);
		for (Iterator it= targets.iterator(); it.hasNext();)
			fIn.remove(it.next(), vertex);
		Set origins= fIn.removeAll(vertex);
		for (Iterator it= origins.iterator(); it.hasNext();)
			fOut.remove(it.next(), vertex);
	}


	public Set getSources() 
  {
		return computeZeroEdgeVertices(fIn);
	}


	public Set getSinks()
  {
		return computeZeroEdgeVertices(fOut);
	}

	private Set computeZeroEdgeVertices(MultiMap map) 
  {
		Set candidates= map.keySet();
		Set roots= new LinkedHashSet(candidates.size());
		for (Iterator it= candidates.iterator(); it.hasNext();) 
    {
			Object candidate= it.next();
			if (map.get(candidate).isEmpty())
				roots.add(candidate);
		}
		return roots;
	}


	public Set getChildren(Object vertex)
  {
		return Collections.unmodifiableSet(fOut.get(vertex));
	}

	private boolean hasPath(Object start, Object end)
  {
		
		if (start == end)
			return true;

		Set children= fOut.get(start);
		for (Iterator it= children.iterator(); it.hasNext();)

			if (hasPath(it.next(), end))
				return true;
		return false;
	}
	


	public String toString()
  {
		return "Out: " + fOut.toString() + " In: " + fIn.toString(); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
