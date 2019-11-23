/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilidade.fatec;

import java.text.DecimalFormat;

/**
 *
 * @author mrsalustiano
 */
    
public class CalcularFolha {

  public static class Arredondar{
  
    public Arredondar(){
        
    }
    
    public  double converterDoisDecimais(double nro) {
    DecimalFormat fmt = new DecimalFormat("0.00");      
    String string = fmt.format(nro);
    String[] part = string.split("[,]");
    String string2 = part[0]+"."+part[1];
        double res = Double.parseDouble(string2);
    return res;
}
  
  }  
    
    
    public static class CalcularINSS{
        // variaveis usadas na classe
      //  private double salario;
      //  private int dependentes;
        
        //construtor
         public CalcularINSS(){         
         }
        

         //metodo calculo
         public double calculaINSS(double sal){
             double res = 0; 
             
             if (sal < 1751.81 ){
                 res = sal * 0.08;             
             } else if (sal < 2919.72){
                 res = sal * 0.09;
             } else if ( sal < 5839.45){
                 res = sal * 0.11;
             } else {
                 res = 642.34;
             }
             return res;             
         }
         
         public double calcDep(int dep){
             double res = 0;
             return res = dep * 189.59;
         
         }
    } // fim da classe
    
    public static class CalculaBaseDeCalculo{
//        private double baseCalc;
//        private double vlrINSS;
//        private double vlrDep;
//        private double salario;
        
        public CalculaBaseDeCalculo(){
        }
    
        public double calcularBase(double salario, double inss, double dep){
            double res = 0;
            return res = salario - inss - dep;            
        }    
    } // fim de classe
    
        public static class CalcIRRF{
//            private double baseCalc;
            
            public CalcIRRF(){
            }
            
            public double CalcularIRRF(double baseCalculo){
                double res = 0;
                if (baseCalculo < 1903.98){ 
                    res =0;
                }
                else if ((baseCalculo > 1903.98) && (baseCalculo < 2826.65)){
                    res = (baseCalculo * 0.075) - 142.8;                
                } else if ((baseCalculo > 2826.66) && (baseCalculo < 3751.05)){                
                    res = (baseCalculo * 0.15) - 354.8;
                }else if ((baseCalculo > 3751.06) && (baseCalculo < 4664.68)){                
                    res = (baseCalculo * 0.225) - 636.13;
                } else {
                    res = (baseCalculo * 0.275) - 869.36;                
                }
                
                return res;
            } 
        }//fim da classe
    
    
 
}
