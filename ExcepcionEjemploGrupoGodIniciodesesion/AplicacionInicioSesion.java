public class AplicacionInicioSesion {
    public static void main(String[] args) {
        SistemaInicioSesion sistema = new SistemaInicioSesion();

        try {
            sistema.iniciarSesion("usuario", "contraseña");
        } catch (InicioSesionException e) {
            System.out.println("Error de inicio de sesión: " + e.getMessage());
        }
    }
}