import java.time.LocalDate;
public class PermisoEventoEspecial extends Permiso {
	private String tipoEvento;
	private int cantidadAsistentes;
	private String medidasSeguridad;

	public PermisoEventoEspecial(String tipo, LocalDate fechaEmision, LocalDate fechaVencimiento, double costo, String tipoEvento, int cantidadAsistentes, String medidasSeguridad) {
		super(tipo, fechaEmision, fechaVencimiento, costo); // Llamada al constructor de la superclase Permiso
		this.tipoEvento = tipoEvento;
		this.cantidadAsistentes = cantidadAsistentes;
		this.medidasSeguridad = medidasSeguridad;
	}

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getCantidadAsistentes() {
		return this.cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public String getMedidasSeguridad() {
		return this.medidasSeguridad;
	}

	public void setMedidasSeguridad(String medidasSeguridad) {
		this.medidasSeguridad = medidasSeguridad;
	}



@Override
	public Double calcularCosto() {

		double costoBase = 2000; // Costo base del permiso de evento especial
		double costo = costoBase + ((double) this.cantidadAsistentes / 100 * 100000);
		return costo;
	}
}