import java.util.Comparator;

public class GolesComparator implements Comparator<PartidoFutbol> {

	@Override
	public int compare(PartidoFutbol p1, PartidoFutbol p2) {
		return Integer.compare(p1.getGolesTotal(), p2.getGolesTotal());
	}

}
