int power_of_2(unsigned int x)
{
    int i, count = 0, result, shift_num;
 
    for (i = 0;i <= NUM_BITS_INT;i++)
    {
        shift_num = x >> i;
        result = shift_num & 1;
        if (result == 1)
            count++;
    }
    

    if (count % 2 == 1)
        printf("YES");
    else 
        printf("NO");
}
