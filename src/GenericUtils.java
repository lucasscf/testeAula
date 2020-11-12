
public class GenericUtils {

	// Comentario da aula de DWBE
	// Comentario da aula de DWBE
	// Comentario da aula de DWBE

	// Comentarios da branch2
	// Comentarios da branch2


	/*Mudanca grande
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	*/
	                                                     // $1 $2   $3
	public static String returnTelFormat(String value) { // 12 3456 7890 (10 numeoros)
		if(value.length() == 10 && isNumeric(value)) {
			//return "(" + value.substring(0, 2) + ")" + value.substring(2, 6) + "-" + value.substring(7, 10);
			return String.valueOf(value).replaceFirst("(\\d{2})(\\d{4})(\\d+)", "($1) $2-$3");
		} else {
			System.out.println("Valor invalido");
			return "";
		}
	}
	
	public static String returnCpfFormat(String value) {
		if(value.length() == 11 && isNumeric(value)) { 
			return String.valueOf(value).replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d+)", "$1.$2.$3-$4");
		} else {
			System.out.println("Valor invalido");
			return "";
		}
	}
	
	private static boolean isNumeric(String value) {
		try {
			Double.parseDouble(value);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
}
