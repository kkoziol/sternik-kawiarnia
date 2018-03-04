package pl.sternik.kk.kawiarnia.ekspres;

import pl.sternik.kk.kawiarnia.dekoratory.BitaSmietana;
import pl.sternik.kk.kawiarnia.napoje.Czekolada;
import pl.sternik.kk.kawiarnia.napoje.Napoj;

public class EkspresCzekolada extends Ekspres {
    private final Napoj k = new Czekolada();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robię napój - Czekolada (cena " + k.getCena() + " zł)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam do kubka");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Gotuję mleko...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new BitaSmietana(napoj);
	}
}
