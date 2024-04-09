import java.time.LocalDate;
public class PermisoConstruccion extends Permiso {
	private String tipoConstruccion;
	private double metrosCuadrados;
	private String ubicacion;

	public PermisoConstruccion(String tipo, LocalDate fechaEmision, LocalDate fechaVencimiento, Double costo) {
		super(tipo, fechaEmision, fechaVencimiento, costo);
		this.tipoConstruccion = tipoConstruccion;
		this.metrosCuadrados = metrosCuadrados;
		this.ubicacion = ubicacion;
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public double getMetrosCuadrados() {
		return this.metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public Double calcularCosto() {
		double costoBase = 1500; // Costo base del permiso de construcción
		double costo = costoBase + (this.metrosCuadrados * 150000);
		return costo;
	}
}