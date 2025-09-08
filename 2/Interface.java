public class Interface {
    public static void main(String[] args) {
        Usuario user = new Usuario("Gabriel", "123");
        Administrador admin = new Administrador("Carlos", "321");

        System.out.println("========== Autenticação ==========");
        System.out.println("Usuário autenticado? " + user.autenticar("123"));
        System.out.println("Usuário autenticado? " + user.autenticar("senhaincorreta"));
        System.out.println("\nAdministrador autenticado? " + admin.autenticar("321"));
        System.out.println("Administrador autenticado? " + admin.autenticar("senhaincorreta"));
    }
}