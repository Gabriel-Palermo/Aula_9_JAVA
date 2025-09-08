public class Apresentacao {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio("Vendas do último mês", 6500.00, 8000.00);
        Imprimivel recibo = new Recibo("Gabriel Santos", 975.00);

        relatorio.imprimir();
        System.out.println();
        recibo.imprimir();
    }
}
