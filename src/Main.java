// Схематично изобразите 5 классов
// get & set
// 5 method
// 4 field
// 2 refresh method


public class Main {


    void openCalculator() {
        System.out.println("Open");
    }
    void closeCalculator() {
        System.out.println("Close");
    }
    void rollupCalculator() {
        System.out.println("Roll Up");
    }
    void skipCalculator() {
        System.out.println("Skip");
    }
    void rememberCalculator() {
        System.out.println("remember");
    }

    public static void main(String[] args) {
        double a = 545.54;
        double b = 453.47;
        double c = 53.96;
        double d = 43.83;



        Button button = new Button();
        button.setJbutton0("- keep it up");
        String change = button.getJbutton0();
        System.out.println("You the best teacher " + change);

        Button buttonOne = new Button();
        buttonOne.setJbutton1("- (NO)");
        String name = buttonOne.getJbutton1();
        System.out.println("I am the best in java  " + name);





    }
}
