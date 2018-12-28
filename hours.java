private static String timeConversion(int totalSeconds) 
{

    final int MINUTES_IN_AN_HOUR = 60;
    final int SECONDS_IN_A_MINUTE = 60;

    int seconds = totalSeconds % SECONDS_IN_A_MINUTE;
    int totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
    int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
    int hours = totalMinutes / MINUTES_IN_AN_HOUR;

    return hours + " hours " + minutes + " minutes " + seconds + " seconds";
}
