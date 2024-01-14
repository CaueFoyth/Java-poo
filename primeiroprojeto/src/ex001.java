public class ex001 {
    public static void main(String[] args) {
        double notaUm = 7.4;
        double notaDois = 6.1;
        int mediaInteira = (int) ((notaUm + notaDois)/2);
        System.out.println("A média inteira é " + mediaInteira);
    
        char frase = 'e';
        String fraseInteira = "Test" + frase;
        System.out.println(fraseInteira);

        double precoProduto = 69.99;
        int qtdProduto = 3;
        double precoFinal = precoProduto * qtdProduto;
        System.out.println("Preço total: " + precoFinal);
        double valorEmDolares = precoFinal / 4.94;
        System.out.println("Valor em Dolares: " + valorEmDolares);
        double percentualDesconto = 10;
        double precoDesconto = precoFinal * (percentualDesconto/100);
        System.out.println("Valor com desconto: " + (precoFinal - precoDesconto));
        }
}
