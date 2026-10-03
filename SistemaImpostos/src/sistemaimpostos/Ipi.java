
package sistemaimpostos;

public class Ipi implements Imposto{
    
        private double valor;
        private double frete;
        private double seguro;
        private double despesas;
        private double aliquota;


        public Ipi(double valor, double frete, double seguro, double despesas,
                double aliquota){

            this.valor = valor;
            this.frete = frete;
            this.seguro = seguro;
            this.despesas = despesas;
            this.aliquota = aliquota;
        }
        
        public double getValor(){
            
            return valor;
        }
        public void setValor(double valor){
            
            this.valor = valor;
        }
        public double getFrete(){
            
            return frete;
        }
        public void setFrete(double frete){
            
            this.frete = frete;
        }
        public double getSeguro(){
            
            return seguro;
        }
        public void setSeguro(double seguro){
            
            this.seguro = seguro;
        }
        public double getDespesas(){
            
            return despesas;
        }
        public void setDespesas(double despesas){
            
            this.despesas = despesas;
        }
        public double getAliquota(){
            
            return aliquota;
        }
        public void setAliquota(double aliquota){
            
            this.aliquota = aliquota;
        }
    @Override
        public double calcularImposto(){
            
            return (valor + frete + seguro + despesas) * (aliquota /100); 
        }   
    @Override 
        public String getDescricao(){
            
            return "O calculo do IPI é : ";
        }
}
