package _05_ARRAYS_;

import java.util.*;

public class _20_ANIMALES_ {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);

		int contAciertos=0;
		int contFallos=0; 
		
		String ingles[][]= {
				
				{"bear","oso"},
				{"cat","gato"},
				{"cheetah","guepardo"},
				{"dog","perro"},
				{"eagle","aguila"},
				{"fish","pez"},
				{"frog","rana"},
				{"horse","caballo"},
				{"lion","leon"},
				{"lizard","lagarto"},
				{"meerkat","suricata"},
				{"monkey","mono"},
				{"orangutan","orangutan"},
				{"panther","pantera"},
				{"parrot","loro"},
				{"pig","cerdo"},
				{"tiger","tigre"},
				{"toad","sapo"},
				{"tortoise","tortuga"},
				{"mare","yegua"}
			};
		
		System.out.println("Traduce bear...");
		String oso=in.nextLine();
		
		if(oso.equalsIgnoreCase(ingles[0][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es oso");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce car...");
		String gato=in.nextLine();
		
		if(gato.equalsIgnoreCase(ingles[1][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es gato");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce cheetah...");
		String guepardo=in.nextLine();
		
		if(guepardo.equalsIgnoreCase(ingles[2][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es guepardo");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce dog...");
		String perro=in.nextLine();
		
		if(perro.equalsIgnoreCase(ingles[3][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es perro");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce eagle...");
		String aguila=in.nextLine();
		
		if(aguila.equalsIgnoreCase(ingles[4][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es aguila");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce fish...");
		String pez=in.nextLine();
		
		if(pez.equalsIgnoreCase(ingles[5][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es pez");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce frog...");
		String rana=in.nextLine();
		
		if(rana.equalsIgnoreCase(ingles[6][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es rana");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce hourse...");
		String caballo=in.nextLine();
		
		if(caballo.equalsIgnoreCase(ingles[7][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es caballo");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce lion...");
		String leon=in.nextLine();
		
		if(leon.equalsIgnoreCase(ingles[8][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es leon");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce lizard...");
		String lagarto=in.nextLine();
		
		if(lagarto.equalsIgnoreCase(ingles[9][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es lagarto");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce meerkat...");
		String suricata=in.nextLine();
		
		if(suricata.equalsIgnoreCase(ingles[10][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es suricata");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce monkey...");
		String mono=in.nextLine();
		
		if(mono.equalsIgnoreCase(ingles[11][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es mono");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce orangutan...");
		String orangutan=in.nextLine();
		
		if(orangutan.equalsIgnoreCase(ingles[12][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es orangutan");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce panther...");
		String pantera=in.nextLine();
		
		if(pantera.equalsIgnoreCase(ingles[13][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es pantera");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce parrot...");
		String loro=in.nextLine();
		
		if(loro.equalsIgnoreCase(ingles[14][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es loro");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce pig...");
		String cerdo=in.nextLine();
		
		if(cerdo.equalsIgnoreCase(ingles[15][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es cerdo");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce tiger...");
		String tigre=in.nextLine();
		
		if(tigre.equalsIgnoreCase(ingles[16][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es tigre");
			contFallos++;
		}
		
		
		
		
		System.out.println("Traduce toad...");
		String sapo=in.nextLine();
		
		if(sapo.equalsIgnoreCase(ingles[17][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es sapo");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce tortoise...");
		String tortuga=in.nextLine();
		
		if(tortuga.equalsIgnoreCase(ingles[18][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es tortuga");
			contFallos++;
		}
		
		
		
		System.out.println("Traduce mare...");
		String yegua=in.nextLine();
		
		if(yegua.equalsIgnoreCase(ingles[19][1])) {
			System.out.println("Bien");
			contAciertos++;
		} else {
			System.out.println("Incorrecto, es yegua");
			contFallos++;
		}
		
		
		
		System.out.println("Has tenido..." +contAciertos+ "Aciertos.");
		System.out.println("Has tenido..." +contFallos+ "Fallos.");
		
	}

}
