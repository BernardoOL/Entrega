package teste_entrega;


import entrega.Entrega_vip;



public class testeentrega {

    public static void main(String[] args) {

      Entrega_vip vip = new Entrega_vip(0,0,0,null,0);
      
    // Aqui usa o system.out println para mostrar o conteudo do toString.
      
    vip.cadastrar();
    System.out.println(vip.toString());
  
    
    }

}