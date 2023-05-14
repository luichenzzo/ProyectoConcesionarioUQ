package co.uniquindio.ConcesionarioUQ.model;

public class Vehiculo {
	private String marca;
	private boolean nuevo;
	private Integer modelo;
	private Integer cantidadCambios;
	private Integer velocidadM�xima;
	private Integer cilindraje;
	private String placa;
	private TipoTransmision tipoTransmision;


	public Vehiculo(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadM�xima,
			Integer cilindraje, String placa) {
		super();
		this.marca = marca;
		this.nuevo = nuevo;
		this.modelo = modelo;
		this.cantidadCambios = cantidadCambios;
		this.velocidadM�xima = velocidadM�xima;
		this.cilindraje = cilindraje;
		this.placa = placa;
	}


	public Vehiculo() {
		super();
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public boolean isNuevo() {
		return nuevo;
	}


	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}


	public Integer getModelo() {
		return modelo;
	}


	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}


	public Integer getCantidadCambios() {
		return cantidadCambios;
	}


	public void setCantidadCambios(Integer cantidadCambios) {
		this.cantidadCambios = cantidadCambios;
	}


	public Integer getVelocidadM�xima() {
		return velocidadM�xima;
	}


	public void setVelocidadM�xima(Integer velocidadM�xima) {
		this.velocidadM�xima = velocidadM�xima;
	}


	public Integer getCilindraje() {
		return cilindraje;
	}


	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


}
