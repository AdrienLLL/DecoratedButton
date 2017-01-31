import javax.swing.*;

public class Main {

    public static void main(String args[]){
        JPanel pan = new JPanel();

        JDialog dialog = new JDialog();
        dialog.setSize(600,300);
        dialog.setTitle("Buttons window");
        dialog.setVisible(true);

        JButton btn1 = new JButton("GrossBorder");
        JButton btn2 = new JButton("AlertOnClick");
        JButton btn3 = new JButton("HideOnclick");

        GrossBorder GB = new GrossBorder(btn1);
        AlertOnClick AOC = new AlertOnClick(btn2);
        HideOnClick HOC = new HideOnClick(btn3);

        pan.add(GB);
        pan.add(AOC);
        pan.add(HOC);

        dialog.add(pan);
    }


}
