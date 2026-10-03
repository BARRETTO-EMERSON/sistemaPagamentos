
package sistemaimpostos;

public class Pis implements Imposto {
    
        private double valorDebito;
        private double valorCredito;
    
        public Pis(double valorDebito, double valorCredito){
        
        this.valorDebito = valorDebito;
        this.valorCredito = valorCredito;
        }
    
        public double getValorDebito(){
        
            return valorDebito;
        }
        public void setValorDebito(double valorDebito){
            
            this.valorDebito = valorDebito;
        }
        public double getValorCredito(){
            
            return valorCredito;
        }
       public void setValorCredito(double valorCredito){
            
            this.valorCredito = valorCredito;
        }
       
    @Override
        public double calcularImposto(){
            
            return (valorDebito - valorCredito) * 0.0165;
        }
    @Override
        public String getDescricao(){
            
            return "O calcuilo do PÌS é : ";
        }
        
}