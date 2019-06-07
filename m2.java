package com.mkyong;

public class SplitByNewLineExample 
{

    public static void main(String[] args)
    {

        StringBuilder sb = new StringBuilder("");
        sb.append("aaa \n");
        sb.append("bbb   \r\n");
        sb.append("ccc\n");
        sb.append("\n");
        sb.append("ddd\r\n");
        sb.append("\r\n");
        sb.append("eee\n");

        String text = sb.toString();
        System.out.println("---Original---");
        System.out.println(text);

        System.out.println("---Split---");
        int count = 1;

        // split by new line
        String[] lines = text.split("\\r?\\n");
        for (String line : lines) {
            System.out.println("line " + count++ + " : " + line);
        }
    }

}
