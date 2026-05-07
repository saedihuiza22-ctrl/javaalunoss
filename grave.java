
package menu;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.*;

public class grave {
    
    
  public Aluno[]registrar(Aluno[]pd) throws IOException{
      
    String Filename= "arquivoaluno.txt";  
    BufferedWriter gravar= new BufferedWriter (new FileWriter(Filename));
     int i;
   for (i=0; i<10; i++ ){
       pd[i]= new Aluno();
   }//olha aqui e carregar 0.0,0 
   
   for(i=0; i<3; i++){
       pd[i].nome=JOptionPane.showInputDialog("digite seu nome");
       gravar.write(pd[i].nome);
       gravar.newLine();
       pd[i].pontos=Integer.parseInt(JOptionPane.showInputDialog("digite pontos;"));
       gravar.write(pd[i].pontos);
       gravar.newLine();
   }
   System.out.println("gravacao feita com sucesso");  
    gravar.close();
    return pd;
  }   
     
       
 public Aluno[] lerarquivo(Aluno[]pd)throws IOException {
    String Filename= "arquivoaluno.txt";  
 BufferedReader ler= new BufferedReader(new FileReader(Filename));  
    int i;
    

    for(i=0; i<3; i++){
        pd[i]= new Aluno();
    }
    
    for(i=0; i<3; i++){
        
        pd[i].nome= ler.readLine();
        pd[i].pontos=Integer.parseInt(ler.readLine());
    }  
    for(i=0; i<3; i++){
    
    System.out.println(pd[i].nome+""+"pontos"+pd[i].pontos);
    }
    
    ler.close();
 
    return pd;
    
 }
     
       
       
 public Aluno[]ordenacao(Aluno[]pd){
   int i,j; 
     Aluno aux;// variável do tipo objeto como ira trocar e necessario que seja do tipo aluno 
     for(i=0; i<2; i++){
       for(j=i+1; j<3; j++){
         if (pd[i].pontos > pd[j].pontos){
               aux= pd[i];
               pd[i]= pd[j];
               pd[j]= aux ;     
           }
               
           }
       }
     
 
     for (i=0; i<3; i++){
        System.out.println(pd[i].nome+""+ "pontos"+pd[i].pontos);
    }
    return pd;// ou seja se fosse so inteiro so inteiro mudaria mais os nomes estariam errado
     
     
 }
    
    
    
    
    
    
    
    
}
