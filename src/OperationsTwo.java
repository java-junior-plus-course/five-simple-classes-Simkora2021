public class OperationsTwo {
    private double NumberAA = 55.4;
    private double NumberBB = 43.7;
    private double NumberCC = 3.6;
    private double numberDD = 3.3;

    void writeNumberA() {
        if (NumberAA > NumberBB) {
            double z = NumberAA - NumberBB;
            System.out.println("subtraction");
        } else {
            double z = NumberAA + NumberBB;
            System.out.println("addition");
        }
    }

    void writeNumberA(String Zero) {
        if (NumberAA > NumberBB) {
            double z = NumberAA - NumberBB;
            System.out.println("subtraction" + Zero);
        } else {
            double z = NumberAA + NumberBB;
            System.out.println("addition" + Zero);
        }
    }
    void writeNumberDD(){
        System.out.println("Write DD");
    }
    void writeNumberDD(double stray){
        System.out.println("Write stray");
    }

    public double getNumber_aa() {
        return NumberAA;
    } // Извините за нижнее подчеркивание, ничего лучше не придумал, а изменять лень)

    public void setNumber_aa(double NumberAA) {
        this.NumberAA = NumberAA;
    }


    public double getNumber_bb() {
        return NumberBB;
    }

    public void setNumber_bb(double NumberBB) {
        this.NumberBB = NumberBB;
    }




}
