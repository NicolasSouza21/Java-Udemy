package POO.Produtos;

import java.util.Scanner;

public class ProdutosControll {
    
    Scanner sc = new Scanner(System.in);

    ProdutosModel pm = new ProdutosModel(null, 0, 0);

    public void cadastrarProduto(){
        System.out.println("Digite o nome do produto");
        pm.setNome(sc.next());
        System.out.println("Digite o preço dos produtos");
        pm.setPreco(sc.nextDouble());
        System.out.println("Digite a quantidade");
        pm.setQuantidade(sc.nextInt());
    }

    public void mostrarDetalhes(){

        System.out.println("Nome: " + pm.nome);
        System.out.println("Preço: " + pm.preco);
        System.out.println("Quantidade: " + pm.quantidade);

    }

    public void vender(int qntd){

        System.out.println("Quantos items deseja vender? ");
        qntd = sc.nextInt();

        if (qntd <= pm.quantidade) {
            pm.setQuantidade(pm.getQuantidade() - qntd);
            System.out.println("Foram vendidos:" + qntd);
            
        }else if(qntd > pm.quantidade){
            System.out.println("Quantidade insuficiente ");
        }else{
              System.out.println("Entrada Inválida");
                    }

        

    }

    public void reporEstoque(){
        System.out.println("Quanto você deseja repor de estoque \n");
        int repoEstoque = sc.nextInt();
        pm.setQuantidade(pm.getQuantidade() + repoEstoque);
        System.out.println("Você repôs " + repoEstoque);


            
    }

    public void abrir(){
        int op;

        do{
        System.out.println("Bem-vindo \n" +
                            "Selecione a opção desejada \n" +
                            "\n1.Cadastrar Produto \n " +
                            "2. Ver informações do produto \n" +
                            "3. Vender Produto \n " +
                            "4. Repor Estoque \n" +
                            "5 Sair. \n");

        op = sc.nextInt();

        switch (op ) {
            case 1:
            cadastrarProduto();
                
                break;

            
             case 2:
             if (pm != null) {
                mostrarDetalhes();
                
             }else{
                System.out.println("Cadastre um produto primeiro");
             }
             break;

             case 3:
             if (pm != null) {
                vender(pm.getQuantidade());

                
             }
             break;
             
             case 4:
             if (pm != null) {
                reporEstoque();
                
             }else{
                System.out.println("Cadastre um produto");
             }
             
             break;
                
                    
        
            default:
            System.out.println("Valor inválido");
                break;
        }
                        
    }while(op != 5); 

    
                    
                
    }


    
}
