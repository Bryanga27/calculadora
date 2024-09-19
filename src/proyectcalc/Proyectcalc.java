
package proyectcalc;


public class Proyectcalc {

    public static void main(String[] args) {
        calculadora numero = new calculadora();
       numero.setTitle("CALCULADORA(BRYANPRO)");
       numero.setBounds(500, 100, 400, 600);
       numero.setResizable(false);
       numero.panel();
       numero.texto();
       numero.botones();
    }
    
}
