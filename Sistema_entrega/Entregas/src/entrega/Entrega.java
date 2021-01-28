package entrega;

import java.util.Scanner;

// criação da classe abstrata de entrega.

public abstract class Entrega {

// Declaração das variaveis,Codigo de Entrega,Kilometragem Final e Inicial, e Data.
    
    private int codEntrega;
    private int kmFim, kmStart;
    private String data;   

    // Encapsulamentos do codEntrega, data,kmFim, e kmSTart.
    
    public Entrega(int codEntrega, int kmFim, int kmStart, String data){
       this.codEntrega = codEntrega;
       this.data = data;
       this.kmFim = kmFim;
       this.kmStart = kmStart;
    }
    
    // usando o abstract para desconto e cadastro.
    
    
    public abstract double desc();
    
    // cadastro dos dados
    public void cadastrar() {
        
        Scanner scan = new Scanner(System.in);

        // usamos o \n e o # para melhor separação do conteudo visual.
        
        System.out.println("Digite a data que foi entregue o veiculo ");
        setData(scan.nextLine());
        System.out.println("#########---------------------########\n");
        

        System.out.println("Digite o código de entrega do automovel.");
        setCodentrega(scan.nextInt());
         System.out.println("#########---------------------########\n");
        
        System.out.println("Digite a kilometragem inicial");
        setKmStart(scan.nextInt());
         System.out.println("#########---------------------########\n");

        System.out.println("Digite a Kilometragem Final");
        setkmFim(scan.nextInt());
         System.out.println("#########---------------------########\n");

        //saida dos dados
    }

    // Saido dos dados finais do codigo da entrega,Kilometragem F, e Data de entrega.
    
    @Override
    public String toString() {

        return( "######################################## \n" +
                "O codigo de entrega é > " + getCodentrega()
                + " \na quilometragem Final é > " + getkmFim()
                + " \nA data de enrtrega do veiculo é >" + getData());
               
    }
    

    // Metodos get e sets.
    
    public int getCodentrega() {
        return codEntrega;
    }

    public void setCodentrega(int codentrega) {
        this.codEntrega = codentrega;
    }

    public int getkmFim() {
        return kmFim;
    }
    
    public void setkmFim(int kmFim) {
        this.kmFim = kmFim;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKmStart() {
        return kmStart;
    }

    public void setKmStart(int KmStart) {
        this.kmStart = KmStart;
    }

}


