import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Weather w = new Weather();

        while (true) {
            System.out.println("----Weather ----");
            System.out.println("Choose Option");
            System.out.println("1. Get Weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");
            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            if(n==0)
            {
                System.exit(0);
            }
            System.out.println("Enter the Date in format yyyy-mm-dd(2019-03-27)");
            String date = in.nextLine().trim();
            switch (n) {
                case 1:
                    w.getWeather(date);
                    break;
                case 2:
                    w.getWindSpeed(date);
                    break;
                case 3:
                    w.getPressure(date);
                    break;
                default:
                    System.out.print("Invalid Choice");

            }

        }
    }
}
