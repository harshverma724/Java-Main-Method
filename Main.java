public class Main

{

    public static void main(String args[])

    {
        if (args.length > 0) {
            int a = args.length;
            for (int i = 0; i < a; i++) {
                System.out.println(args[i]);
            }

        } else
            System.out.println("Args has no value");

    }

}
