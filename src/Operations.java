// Схематично изобразите 5 классов





public class Operations {
    private double NumberA = 545.54;
    private double NumberB = 453.47;
    private double NumberC = 53.96;
    private double numberD = 43.83;

    void writeNumberA() {
        if (NumberA > NumberB) {
            double x = NumberA - NumberB;
            System.out.println("subtraction");
        } else {
            double x = NumberA + NumberB;
            System.out.println("addition");
        }
    }

    void writeNumberA(String Zero) {
        if (NumberA > NumberB) {
            double x = NumberA - NumberB;
            System.out.println("subtraction" + Zero);
        } else {
            double x = NumberA + NumberB;
            System.out.println("addition" + Zero);
        }
    }
    void writeNumberD(){
        System.out.println("Write D");
    }

    public double getNumber_a() {
        return NumberA;
    } // Извините за нижнее подчеркивание, ничего лучше не придумал, а изменять лень)

    public void setNumber_a(double NumberA) {
        this.NumberA = NumberA;
    }


    public double getNumber_b() {
        return NumberB;
    }

    public void setNumber_b(double NumberB) {
        this.NumberB = NumberB;
    }




}
