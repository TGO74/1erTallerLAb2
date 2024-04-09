import java.util.ArrayList;
import java.time.LocalDate;

public class Ciudadano {
	private String nombre;
	private int id;
	private String rut;
	private ArrayList<Permiso> permisosCiudadano = new ArrayList<Permiso>();

	public Ciudadano(String nombre, int id, String rut) {
		this.nombre = nombre;
		this.id = id;
		this.rut = rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void registrarse(String nombre, String rut) {
		throw new UnsupportedOperationException();
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void registrarPermiso(Permiso permiso) {
		permisosCiudadano.add(permiso);
	}

	public ArrayList<Permiso> getPermisosCiudadano() {
		return permisosCiudadano;
	}



	public ArrayList<Permiso> buscarPermisoTipo(String tipo) {
		ArrayList<Permiso> permisosEncontrados = new ArrayList<>();
		for (Permiso permiso : permisosCiudadano) {
			if (permiso.getTipo().equals(tipo)) {
				permisosEncontrados.add(permiso);
			}
		}
		return permisosEncontrados;
	}

	public ArrayList<Permiso> buscarPermisoFechaEmision(LocalDate fecha) {
		ArrayList<Permiso> permisosEncontrados = new ArrayList<>();
		for (Permiso permiso : permisosCiudadano) {
			if (permiso.getFechaEmision().equals(fecha) || permiso.getFechaVencimiento().equals(fecha)) {
				permisosEncontrados.add(permiso);
			}
		}
		return permisosEncontrados;
	}


}