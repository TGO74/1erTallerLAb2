import java.time.LocalDate;
import java.util.ArrayList;
public class TestGestionPermisos {

    public static void main(String[] args) {
        // Crear instancia de GestionPermisos
        GestionPermisos gestionPermisos = new GestionPermisos();

        // Crear algunos ciudadanos
        Ciudadano ciudadano1 = new Ciudadano("Juan", "12345678-9");
        Ciudadano ciudadano2 = new Ciudadano("María", "98765432-1");

        // Registrar ciudadanos
        gestionPermisos.registarCiudadano(ciudadano1);
        gestionPermisos.registarCiudadano(ciudadano2);

        // Crear instancias de permisos tipo negocio
        Permiso permiso1 = new PermisoNegocio("Negocio", LocalDate.of(2022, 4, 1), LocalDate.of(2022, 4, 30), 100.0, "TipoNegocio1", 50.0, 10);
        Permiso permiso2 = new PermisoNegocio("Negocio", LocalDate.of(2022, 5, 1), LocalDate.of(2022, 5, 31), 150.0, "TipoNegocio2", 70.0, 15);

        // Crear instancias de permisos tipo evento especial
        Permiso permiso3 = new PermisoEventoEspecial("EventoEspecial", LocalDate.of(2022, 6, 1), LocalDate.of(2022, 6, 30), 200.0, "TipoEvento1", 100, "MedidasSeguridad1");
        Permiso permiso4 = new PermisoEventoEspecial("EventoEspecial", LocalDate.of(2022, 7, 1), LocalDate.of(2022, 7, 31), 250.0, "TipoEvento2", 150, "MedidasSeguridad2");

        //Crear instancias de permisos tipo construcción
        Permiso permiso5 = new PermisoConstruccion("Construccion", LocalDate.of(2022, 8, 1), LocalDate.of(2022, 8, 31), 300.0);
        Permiso permiso6 = new PermisoConstruccion("Construccion", LocalDate.of(2022, 9, 1), LocalDate.of(2022, 9, 30), 350.0);

        // Asignar permisos a ciudadanos
        ciudadano1.registrarPermiso(permiso1);
        ciudadano2.registrarPermiso(permiso2);


        // Registrar permisos
        gestionPermisos.registrarPermiso(permiso1);
        gestionPermisos.registrarPermiso(permiso2);

        // Buscar permisos de un ciudadano
        System.out.println("Permisos del ciudadano Juan Pérez:");
        ArrayList<Permiso> permisosCiudadano1 = gestionPermisos.buscarPermisosCiudadano(ciudadano1);
        for (Permiso permiso : permisosCiudadano1) {
            System.out.println(permiso);
        }

        // Mostrar todos los permisos de un ciudadano
        System.out.println("Permisos del ciudadano María López:");
        ArrayList<Permiso> permisosCiudadano2 = gestionPermisos.mostrarPermisosCiudadano(ciudadano2);
        for (Permiso permiso : permisosCiudadano2) {
            System.out.println(permiso);
        }

        // Obtener información de un permiso
        Permiso permisoObtenido = gestionPermisos.obtenerInformacionPermiso(permiso1);
        System.out.println("Información del permiso:");
        System.out.println(permisoObtenido);
    }
}

