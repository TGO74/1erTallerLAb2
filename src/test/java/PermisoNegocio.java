import java.time.LocalDate;
public class PermisoNegocio extends Permiso {
	private String tipoNegocio;
	private Double tamañoLocal;
	private int cantidadEmpleados;

	public PermisoNegocio(String tipo, LocalDate fechaEmision, LocalDate fechaVencimiento, Double costo, String tipoNegocio, Double tamañoLocal, int cantidadEmpleados) {

		super(tipo, fechaEmision, fechaVencimiento, costo);
		this.tipoNegocio = tipoNegocio;

	}


	public String getTipoNegocio() {
		return this.tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public Double getTamañoLocal() {
		return this.tamañoLocal;
	}

	public void setTamañoLocal(Double tamañoLocal) {
		this.tamañoLocal = tamañoLocal;
	}

	public int getCantidadEmpleados() {
		return this.cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}




	@Override
	public Double calcularCosto() {
		double costoBase = 1000;
		double costo = costoBase + (this.tamañoLocal * 150000) + (this.cantidadEmpleados * 20000);
		return costo;
	}
}