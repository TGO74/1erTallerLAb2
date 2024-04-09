import java.time.LocalDate;

public abstract class Permiso {
	private String tipo;
	private LocalDate fechaEmision;
	private LocalDate fechaVencimiento;
	private Double costo;
	private int idPermiso;

	public Permiso(String tipo, LocalDate fechaEmision, LocalDate fechaVencimiento, Double costo) {

		this.tipo = tipo;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.costo = costo;

	}



	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDate getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getCosto() {
		return this.costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getIdPermiso() {
		return this.idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}



	public abstract Double calcularCosto();

	@Override
	public String toString() {
		return "Permiso [costo=" + costo + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento
				+ ", idPermiso=" + idPermiso + ", tipo=" + tipo + "]";
	}

}


