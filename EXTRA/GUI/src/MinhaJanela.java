import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanela extends JFrame{
    public MinhaJanela(){
        setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        JLabel label = new JLabel("Clique no botão");
        JButton botao = new JButton("Clique aqui");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                label.setText("BOTÃO CLICADO");
            }
        });

        add(label);
        add(botao);

        setTitle("Minha janela Swing");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
