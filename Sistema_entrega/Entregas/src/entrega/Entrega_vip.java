
package entrega;


public class Entrega_vip extends Entrega{
   
    // Declaração do valor fixo da Kilometragem 3000, e criação da variavel desconto.
    
   private double desc;
   private double valor_t = 3000;
  
   public Entrega_vip(int codEntrega, int kmFim, int kmStart, String data, double desc){
       super(codEntrega, kmFim, kmStart, data);
       this.desc = desc;
   }
  
   // o calculo do desconto para mostrar se a pessoa vai receber o desconto vip.
  // Aqui e o metodo de poliformismo e sobrescrita usando o Override.
 // Porque precisamos sobrescrever o valor final menos o desconto se assim o tiver. 
   
   @Override
   public double desc(){
       int kmTotal = getkmFim() - getKmStart();
       if(kmTotal <300){
           System.out.println(valor_t);
         return valor_t - (valor_t * 0.3);
       }
       return valor_t;
}
   
   @Override
   public void cadastrar(){
       super.cadastrar();
   }
  
   // Aqui e o metodo de sobrescrever o println usando o toString.
   
   @Override
   public String toString() {
      return super.toString() + ("\nvalor do desconto é > " + desc()
              + "\n########################################" );
    }
   
   // Metodos get e set.
   
    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public double getValor_t() {
        return valor_t;
    }

    public void setValor_t(double valor_t) {
        this.valor_t = valor_t;
    }
   
   
}
