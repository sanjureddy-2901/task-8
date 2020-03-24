package com.epam.tdd_junit;


public class RemoveA
{
    public String removeA (String string)
    {
        StringBuilder answer = new StringBuilder(string);
        int length = answer.length();
        if (length >= 2)
        {
            byte number = 0;
            
            if (answer.charAt(number) == 'A' || answer.charAt(number) == 'a')
                answer.deleteCharAt(number);
            else
                number++;

            if(answer.charAt(number) == 'A' || answer.charAt(number) == 'a')
                answer.deleteCharAt(number);
        }
        else if (length == 1)
        {
            byte number = 0;
            
            if (answer.charAt(number) == 'A' || answer.charAt(number) == 'a')
                answer.deleteCharAt(number);
        }
        return answer.toString();
    }
}