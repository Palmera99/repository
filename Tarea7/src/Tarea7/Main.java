package Tarea7;

public class Main {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor(200497297, "hector", "diaz", "calle1", 948574137, "hector@gmail.com");
		Galleta galleta1 = new Galleta("chocolate", 1500);
		Ventas venta1 = new Ventas(vendedor1, 12, galleta1);

		float resultado = venta1.total(galleta1);
		System.out.println(resultado);
		
		
	}

}
