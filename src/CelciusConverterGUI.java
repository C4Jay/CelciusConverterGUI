import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusConverterGUI extends JFrame {
    private JPanel mainpnel;
    private JTextField CelciustextField;
    private JLabel celcius_lbl;
    private JButton convert_btn;
    private JLabel frnheit_lbl;

    public CelciusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpnel);
        this.pack();

        convert_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempfrnht = (int)((Double.parseDouble(CelciustextField.getText()))
                        * 1.8 + 32 );

                frnheit_lbl.setText(tempfrnht + " Farenheit ");




            }
        });
    }

    public static void main(String[] args ){
        JFrame frame = new CelciusConverterGUI("Celcius Converter");
        frame.setVisible(true);

    }
}
