public class Recibo implements Imprimivel {
    String cliente;
    double valor;

    public Recibo(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("========= Recibo ==========");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor Recibo: R$" + valor);
    }
}
