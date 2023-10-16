public class SistemaInicioSesion {
    public void iniciarSesion(String usuario, String contraseña) throws InicioSesionException {

        // Simulamos un proceso de inicio de sesión.
        // En este ejemplo, comprobamos si el usuario y la contraseña son incorrectos.

        if (!usuario.equals("usuarioValido") || !contraseña.equals("contraseñaValida")) {
            throw new InicioSesionException("Credenciales de inicio de sesión incorrectas");
        }

        // Si las credenciales son válidas, continúa con el inicio de sesión.

        System.out.println("Inicio de sesión exitoso");
    }
}