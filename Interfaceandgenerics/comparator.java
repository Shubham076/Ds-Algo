package Interfaceandgenerics;
import java.util.Comparator;
public class comparator implements Comparator<cars>{
		public int compare(cars tcar,cars ocar) {  //t=this o=other
			return tcar.speed-ocar.speed;
		}
}
