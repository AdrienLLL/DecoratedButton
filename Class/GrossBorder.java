import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrossBorder extends JButton {

    public GrossBorder(JButton button)
    {
        super(button.getText());
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LineBorder GrossBorder = new LineBorder(Color.black, 20);
                setBorder(GrossBorder);
            }
        });
    }
}