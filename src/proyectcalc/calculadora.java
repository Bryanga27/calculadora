package proyectcalc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculadora extends JFrame {

    JPanel panelcalculadora = new JPanel();
    JTextField texto = new JTextField();
    double valor = 0;
    char signo = ' ';

    public calculadora() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //Panel
    public void panel() {
        this.getContentPane().add(panelcalculadora);
        panelcalculadora.setBackground(Color.black);
        panelcalculadora.setLayout(null);
    }

    //texto
    public void texto() {
        texto.setBounds(20, 10, 340, 70);
        panelcalculadora.add(texto);
    }

    //botones
    public void botones() {
        JButton suma = new JButton("+");
        suma.setBackground(Color.pink);
        suma.setBounds(310, 100, 50, 30);
        panelcalculadora.add(suma);
        suma.repaint();

        ActionListener sum = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    valor += Double.parseDouble(texto.getText());
                    signo = '+';
                    texto.setText("");
                }

            }
        };
        suma.addActionListener(sum);

        JButton resta = new JButton("-");
        resta.setBounds(310, 150, 50, 30);
        resta.setBackground(Color.pink);
        panelcalculadora.add(resta);
        resta.repaint();

        ActionListener res = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor == 0) {
                        valor = Double.parseDouble(texto.getText());
                    } else {
                        valor -= Double.parseDouble(texto.getText());
                    }
                    signo = '-';
                    texto.setText("");
                }
            }
        };
        resta.addActionListener(res);

        JButton multi = new JButton("x");
        multi.setBounds(310, 200, 50, 30);
        multi.setBackground(Color.pink);
        panelcalculadora.add(multi);
        multi.repaint();

        ActionListener mul = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor == 0) {
                        valor = Double.parseDouble(texto.getText());
                    } else {
                        valor -= Double.parseDouble(texto.getText());
                    }
                }
                signo = 'x';
                texto.setText("");

            }

        };
        multi.addActionListener(mul);

        JButton division = new JButton("%");
        division.setBounds(310, 250, 50, 30);
        division.setBackground(Color.pink);
        panelcalculadora.add(division);
        division.repaint();

        ActionListener divi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor == 0) {
                        valor = Double.parseDouble(texto.getText());
                    } else {
                        valor -= Double.parseDouble(texto.getText());

                    }
                    signo = '%';
                    texto.setText("");
                }

            }
        };
        division.addActionListener(divi);

        JButton igual = new JButton("=");
        igual.setBounds(220, 250, 80, 30);
        igual.setBackground(Color.pink);
        panelcalculadora.add(igual);
        igual.repaint();

        ActionListener igu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = 0;
                if (signo == '+') {
                    resultado = valor + Double.parseDouble(texto.getText());
                } else if (signo == '-') {
                    resultado = valor - Double.parseDouble(texto.getText());
                } else if (signo == 'x') {
                    resultado = valor * Double.parseDouble(texto.getText());
                } else if (signo == '%') {
                    resultado = valor / Double.parseDouble(texto.getText());
                }

                texto.setText(String.valueOf(resultado));
                valor = 0;
            }
        };
        igual.addActionListener(igu);

        JButton btnuno = new JButton("1");
        btnuno.setBounds(20, 100, 80, 30);
        btnuno.setBackground(Color.pink);
        panelcalculadora.add(btnuno);
        btnuno.repaint();

        ActionListener numero1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "1";
                texto.setText(une);
            }
        };
        btnuno.addActionListener(numero1);

        JButton btndos = new JButton("2");
        btndos.setBackground(Color.pink);
        btndos.setBounds(120, 100, 80, 30);
        panelcalculadora.add(btndos);
        btndos.repaint();

        ActionListener numero2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "2";
                texto.setText(une);
            }
        };
        btndos.addActionListener(numero2);

        JButton btntres = new JButton("3");
        btntres.setBounds(220, 100, 80, 30);
        btntres.setBackground(Color.pink);
        panelcalculadora.add(btntres);
        btntres.repaint();

        ActionListener numero3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "3";
                texto.setText(une);
            }
        };
        btntres.addActionListener(numero3);

        JButton btncuatro = new JButton("4");
        btncuatro.setBounds(20, 150, 80, 30);
        btncuatro.setBackground(Color.pink);
        panelcalculadora.add(btncuatro);
        btncuatro.repaint();

        ActionListener numero4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "4";
                texto.setText(une);
            }
        };
        btncuatro.addActionListener(numero4);

        JButton btncinco = new JButton("5");
        btncinco.setBackground(Color.pink);
        btncinco.setBounds(120, 150, 80, 30);
        panelcalculadora.add(btncinco);
        btncinco.repaint();

        ActionListener numero5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "5";
                texto.setText(une);
            }
        };
        btncinco.addActionListener(numero5);

        JButton btnseis = new JButton("6");
        btnseis.setBounds(220, 150, 80, 30);
        btnseis.setBackground(Color.pink);
        panelcalculadora.add(btnseis);
        btnseis.repaint();

        ActionListener numero6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "6";
                texto.setText(une);
            }
        };
        btnseis.addActionListener(numero6);

        JButton btnsiete = new JButton("7");
        btnsiete.setBounds(20, 200, 80, 30);
        btnsiete.setBackground(Color.pink);
        panelcalculadora.add(btnsiete);
        btnsiete.repaint();

        ActionListener numero7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "7";
                texto.setText(une);
            }
        };
        btnsiete.addActionListener(numero7);

        JButton btnocho = new JButton("8");
        btnocho.setBackground(Color.pink);
        btnocho.setBounds(120, 200, 80, 30);
        panelcalculadora.add(btnocho);
        btnocho.repaint();

        ActionListener numero8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "8";
                texto.setText(une);
            }
        };
        btnocho.addActionListener(numero8);

        JButton btnnueve = new JButton("9");
        btnnueve.setBackground(Color.pink);
        btnnueve.setBounds(220, 200, 80, 30);
        panelcalculadora.add(btnnueve);
        btnnueve.repaint();

        ActionListener numero9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "9";
                texto.setText(une);
            }
        };
        btnnueve.addActionListener(numero9);

        JButton btncero = new JButton("0");
        btncero.setBackground(Color.pink);
        btncero.setBounds(120, 250, 80, 30);
        panelcalculadora.add(btncero);
        btncero.repaint();

        ActionListener numero0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + "0";
                texto.setText(une);
            }
        };
        btncero.addActionListener(numero0);

        JButton punto = new JButton(".");
        punto.setBackground(Color.pink);
        punto.setBounds(20, 250, 80, 30);
        panelcalculadora.add(punto);
        punto.repaint();

        ActionListener pun = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String une = texto.getText() + ".";
                texto.setText(une);
            }
        };
        punto.addActionListener(pun);

        JButton C = new JButton("C");
        C.setBackground(Color.pink);
        C.setBounds(20, 300, 80, 30);
        panelcalculadora.add(C);
        C.repaint();
        ActionListener borrarTodo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = "";
                for (int i = 0; i < texto.getText().length() - texto.getText().length(); i++) {
                    union = union + texto.getText().charAt(i);
                }

                texto.setText(union);
            }
        };

        C.addActionListener(borrarTodo);

        JButton raiz = new JButton("√");
        raiz.setBackground(Color.pink);
        panelcalculadora.add(raiz);
        raiz.setBounds(120, 300, 80, 30);
        ActionListener resRaiz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ingresar un valor");
                } else {
                    if (Double.parseDouble(texto.getText()) >= 0) {
                        double total = Math.sqrt(Double.parseDouble(texto.getText()));
                        texto.setText(String.valueOf(total));
                        valor = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Syntaxis Error");
                    }
                }
            }
        };
        raiz.addActionListener(resRaiz);
    }
}
