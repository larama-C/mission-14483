public class Calc {

    public static int run(String s)
    {
        String[] arr = s.split(" ");
        int result = Integer.parseInt(arr[0]);

        for(int i = 1; i < arr.length; i++)
        {
            if (arr[i].equals("+"))
            {
                result += Integer.parseInt(arr[i + 1]);
            }
            else if (arr[i].equals("-"))
            {
                result -= Integer.parseInt(arr[i + 1]);
            }
            else if (arr[i].equals("*"))
            {
                result *= Integer.parseInt(arr[i + 1]);
            }
            else if (arr[i].equals("/"))
            {
                result /= Integer.parseInt(arr[i + 1]);
            }
        }

        return result;
    }

}
