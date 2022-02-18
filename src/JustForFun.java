import java.util.Arrays;
import java.util.Scanner;

public class JustForFun {

    public static void main(String[] args) {
        carsModelMethod(carsBrandMethod());
    }

    public static String carsBrandMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Brand Name: ");
        String carBrand = scanner.nextLine();

        String[] cars = {"Ford", "Mercedes", "Nissan"};

        if (!(cars[0].equals(carBrand) || cars[1].equals(carBrand) || cars[2].equals(carBrand))) {
            System.out.println("Not a valid entry. Please try something else");
            carsBrandMethod();
        }
        return carBrand;
    }

    public static void carsModelMethod(String carBrand){
        Scanner scanner = new Scanner(System.in);
        String[] cars = {"Ford", "Mercedes", "Nissan"};
            if (cars[0].equals(carBrand)) {

                String[] fordModels = {"Explorer", "Endeavour", "Fusion"};
                System.out.println(Arrays.toString(fordModels));
                System.out.println("Model Name: ");
                String models = scanner.nextLine();
                if ("Explorer".equals(models)) {
                    System.out.println("50000");

                } else if ("Endeavour".equals(models)) {
                    System.out.println("100000");
                } else if ("Fusion".equals(models)) {
                    System.out.println("100000");

                } else {
                    System.out.println("Eh gaddi ni haigi bhau");

                    carsModelMethod(carBrand);
                }

            } else if (cars[1].equals(carBrand)) {

                String[] merecedesModels = {"E-Class", "G-Class", "K-Class"};
                System.out.println(Arrays.toString(merecedesModels));


                System.out.println("Model Name: ");
                String mModels = scanner.nextLine();
                if ("E-Class".equals(mModels)) {
                    System.out.println("200");

                } else if ("G-Class".equals(mModels)) {
                    System.out.println("100");
                } else if ("K-Class".equals(mModels)) {
                    System.out.println("999999999");

                } else {
                    System.out.println("Eh gaddi ni haigi bhau");
                    carsModelMethod(carBrand);
                }

            } else if (cars[2].equals(carBrand)) {


                String[] nissanModels = {"Altima", "Altima Pro", "Altima Pro Max"};
                System.out.println(Arrays.toString(nissanModels));


                System.out.println("Model Name: ");
                String mModels = scanner.nextLine();
                if ("Altima".equals(mModels)) {
                    System.out.println("20000000");

                } else if ("Altima Pro".equals(mModels)) {
                    System.out.println("10000000");
                } else if ("Altima Pro Max".equals(mModels)) {
                    System.out.println("99999999900000");

                } else {
                    System.out.println("Eh gaddi ni haigi bhau");
                    carsModelMethod(carBrand);
                }
            }
        }
    }