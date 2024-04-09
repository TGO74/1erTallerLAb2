import java.util.ArrayList;
import java.time.LocalDate;

public class GestionPermisos {
	private ArrayList<Permiso> permisosRealizados = new ArrayList<Permiso>();
	private ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

	public void registarCiudadano(Ciudadano ciudadano) {

		ciudadanos.add(ciudadano);
	}

	public void registrarPermiso(Permiso permiso) {
		permisosRealizados.add(permiso);
	}



	public ArrayList<Permiso> buscarPermisosCiudadano(Ciudadano ciudadano) {
		ArrayList<Permiso> permisos = new ArrayList<Permiso>();
		ArrayList<Permiso> permisosCiudadano = ciudadano.getPermisosCiudadano();
		for (Permiso permiso : permisosCiudadano) {
			permisos.add(permiso);
		}
		return permisos;
	}

	public ArrayList<Permiso> mostrarPermisosCiudadano(Ciudadano ciudadano) {
		return ciudadano.getPermisosCiudadano();
	}

	public Permiso obtenerInformacionPermiso(Permiso permiso) {
		permiso.toString();
        return permiso;
    }

}