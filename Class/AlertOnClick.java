import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlertOnClick extends JButton{
    public AlertOnClick(JButton button){
        super(button.getText());
        JFrame frame = new JFrame();
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame.getComponent(0),"Alert");
            }
        });
    }

}
