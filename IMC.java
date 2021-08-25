import javax.swing.*;

public class IMC {

    public static void main(String Args[]) {

        float peso, estatura, imc;
        
        peso = Float.parseFloat(
            JOptionPane.showInputDialog(null,"Digite o peso (em Kg): ",
            "Dado", JOptionPane.INFORMATION_MESSAGE) );
        
        estatura = Float.parseFloat(
            JOptionPane.showInputDialog(null,"Digite a estatura (em m): ",
         "Dado", JOptionPane.INFORMATION_MESSAGE) ); 
        imc = peso / (estatura*estatura);

            JOptionPane.showMessageDialog (null, "Seu IMC é:" +imc + "Kg/m2",
        "IMC", JOptionPane.INFORMATION_MESSAGE);




    }
}