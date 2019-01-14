import java.util.Comparator;

public class compPopulation implements Comparator<Country>
{
    public int compare(Country a, Country b)
    {
        if (a.getPopulation() > b.getPopulation())
            return -1; // highest value first
        if (a.getPopulation() == b.Population())
            return 0;
        return 1;
    }
}
