
public class Button {
    private String JButton0;
    private String JButton1;
    private String JButton2;
    private String JButton3;
    private String JButton4;
    private String JButton5;
    private String JButton6;
    private String JButton7;
    private String JButton8;
    private String JButton9;

    public class First {
        void writeNumberOne() {
            System.out.println("Write one");
        }
    }

    public class Second {
        void writeNumberTwo() {
            System.out.println("Write two");
        }
    }

    void writeNumberThree() {
        System.out.println("Write three");
    }


    void writeNumberThree(String JButton3) {
        System.out.println("Write three" + JButton3);

    }

    public String getJbutton0() {
        return JButton0;
    }

    public void setJbutton0(String JButton0) {
        this.JButton0 = JButton0;
    }


    public String getJbutton1() {
        return JButton1;
    }

    public void setJbutton1(String JButton1) {
        this.JButton1 = JButton1;
    }


}
