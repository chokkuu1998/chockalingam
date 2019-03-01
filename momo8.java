String repeatNTimes(String s, int n) 
{
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++)
    {
        builder.append(s);
    }
    return builder.toString();
}
