final String regExSpecialChars = "<([{\\^-=$!|]})?*+.>";
final String regExSpecialCharsRE = regExSpecialChars.replaceAll( ".", "\\\\$0");
final Pattern reCharsREP = Pattern.compile( "[" + regExSpecialCharsRE + "]");

String quoteRegExSpecialChars( String s)
{
    Matcher m = reCharsREP.matcher( s);
    return m.replaceAll( "\\\\$0");
}
