public class Relatorio implements Imprimivel {
    String titulo;
    double valorVendas;
    double meta;

    public Relatorio(String titulo, double valorVendas, double meta) {
        this.titulo = titulo;
        this.valorVendas = valorVendas;
        this.meta = meta;
    }

    @Override
    public void imprimir() {
        double porcentagem = 0;
        if (meta > 0) {
            porcentagem = (valorVendas / meta) * 100;
        }

        System.out.println("======== Relatório =========");
        System.out.println("Título: " + titulo);
        System.out.println("Total de Vendas: R$" + valorVendas);
        System.out.println("Meta de Vendas: R$" + meta);
        System.out.println("Percentual atingido: " + porcentagem + "%");
    }
}