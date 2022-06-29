package br.com.ifsc.internacionalizacao;

import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        String idioma;
        String pais;
 
        if (args.length != 2) {
            idioma = new String("en");
            pais = new String("US");
        } else {
            idioma = new String(args[0]);
            pais = new String(args[1]);
        }
        
        Locale localCorrente;
        ResourceBundle traducoes = null;
        
        //para desenvolvimento local
        localCorrente = new Locale(idioma, pais);
        traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
        //teremos MessagesBundle_idioma_pais.properties

        //para o executavel .jar final
        InputStream newInputStream;
        String nomeArquivo = "./idiomas/MessagesBundle_"+idioma+"_"+pais+".properties";
//        try {
//            newInputStream = Files.newInputStream(Paths.get(nomeArquivo));
//            traducoes = new PropertyResourceBundle(newInputStream);
//        } catch (IOException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }

        
        IGUsuario cadastro = new IGUsuario(traducoes);
        cadastro.setLocationRelativeTo(null);
        cadastro.setVisible(true);
    }
}
