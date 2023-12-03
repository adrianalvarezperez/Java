package _04_STRING_;

public class _07_TRAMPA_GRAVE_ {

	public static void main(String[] args) {
		
		
		String texto= "El cielo esta";
		
		System.out.println(texto.concat(" enladrillado."));
		
		texto.concat(" enladrillado");						//TRAMPA...FALTA EL TEXTO=
		System.out.println(texto);
	}

}
