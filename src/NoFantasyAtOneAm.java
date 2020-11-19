public class NoFantasyAtOneAm {
    private String addition;
    private String subtraction;
    private String multiply;
    private String division;
    private String mod;



    void writeAddition(){
        System.out.println("Operation +");
    }
    void writeSubtraction(){
        System.out.println("Operation -");
    }
    void writeMultiply(){
        System.out.println("Operation *");
    }
    void writeDivision(){
        System.out.println("Operation /");
    }
    void writeMod(){
        System.out.println("Operation %");
    }
    void writeMod(String A){
        System.out.println("Operation %");
    }
    void writeMod(String A, double C){
        System.out.println("Operation %");
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

}
