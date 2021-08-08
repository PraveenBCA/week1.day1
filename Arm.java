package welcome;

public class Arm 
{
	public static void main(String[] args) {
	   int number = 107, Number, remainder, result = 0;

        Number = number;

        while (Number != 0)
        {
            remainder = Number % 10;
            result =result+(number*number*number);
           Number /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}


