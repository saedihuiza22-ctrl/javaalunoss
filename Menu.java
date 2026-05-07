
package menu;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Menu {

    
    public static void main(String[] args) throws IOException
    {
        
  
       Aluno[]pd=new Aluno[10];
       grave m= new grave ();
        
        
        
      int opc=0;
      opc=Integer.parseInt(JOptionPane.showInputDialog("digite uma opcao: 1- registrar 2-lerarquivo 3-somarpontos 9-sair"));   
      while(opc!=9){
          switch(opc){
               case 1:
                 pd= m.registrar(pd);
               break;
            
               case 2:
                  pd=m.lerarquivo(pd);
               break;
               case 3:
                pd= m. ordenacao(pd);
                  break;
          }
                  
      }
      
        
        
        
        
        
    }
    
}
        
        