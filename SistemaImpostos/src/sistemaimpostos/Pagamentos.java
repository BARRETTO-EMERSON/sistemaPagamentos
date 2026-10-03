
package sistemaimpostos;

    import java.util.ArrayList;

    public class Pagamentos {

        private ArrayList<Imposto> impostos = new ArrayList<>();

        private String nomeEmpresa;

            public Pagamentos(String nomeEmpresa){

                this.nomeEmpresa = nomeEmpresa;
            }
            public void adicionarImposto(Imposto imposto){

                    impostos.add(imposto);
            }
            //--------------------
            public String getNomeEmpresa(){

                return nomeEmpresa;
            }
            public void setNomeEmpresa(String nomeEmpresa){

                this.nomeEmpresa = nomeEmpresa;
            }
            public void mostrarImposto(){
                
                 System.out.print("Nome da Empresa : ");
                  System.out.print(nomeEmpresa + "\n");
                
                  for (Imposto imposto :impostos ) {
            
                    System.out.println(imposto.getDescricao());
                    System.out.println(imposto.calcularImposto());
                }
            }

    }
