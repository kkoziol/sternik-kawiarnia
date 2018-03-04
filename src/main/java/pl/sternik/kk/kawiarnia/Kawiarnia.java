package pl.sternik.kk.kawiarnia;

import pl.sternik.kk.kawiarnia.dekoratory.BitaSmietana;
import pl.sternik.kk.kawiarnia.dekoratory.Cukier;
import pl.sternik.kk.kawiarnia.ekspres.Ekspres;
import pl.sternik.kk.kawiarnia.ekspres.EkspresCzekolada;
import pl.sternik.kk.kawiarnia.napoje.Czekolada;
import pl.sternik.kk.kawiarnia.napoje.Kawa;
import pl.sternik.kk.kawiarnia.napoje.Napoj;

public abstract class Kawiarnia {

	public static void main(String[] args) {

		Napoj kawa = new Kawa();
		System.out.println(kawa);
		
		kawa = new Cukier(kawa);
		System.out.println(kawa);
	    kawa = new Cukier(kawa);
        System.out.println(kawa);
		kawa = new BitaSmietana(kawa);
		System.out.println(kawa);
		
		System.out.println("-------- Czekolada --------");
		
		Napoj czekolada = new Czekolada();
        System.out.println(czekolada);
        
        czekolada = new BitaSmietana(czekolada);
        System.out.println(kawa);
        
        
		
//		System.out.println("------- Template Metod -----");
//		Ekspres ekspres = new EkspresCzekolada();
//		Napoj napoj = ekspres.dajNapoj();
//		System.out.println(napoj);

	}

}
