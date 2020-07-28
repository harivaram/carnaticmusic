public class Converter
{
	public static void main(String[] args) {
	    String format="<tr><td>%s</td><td>%s</td><td class=\"line\">%s</td><td>%s</td><td class=\"line\">%s</td><td>%s</td><td class=\"endline\">%s</td><td>%s</td><td>%s</td><td class=\"line\">%s</td><td>%s</td><td class=\"line\">%s</td><td>%s</td><td class=\"endline\">%s</td></tr>";
	    String[] lines =new String[]{
        "r s d s , s , m g r m m p ,",
"Pa du ma na , bha , Pa ra ma pu ru sha ,",
"s d , d p m p d d p m g r s",
"Pa ram , jyo , , ti Swa ru , pa , , ,",
"r s d s , s , m g r m m p ,",
"Vi du ra van , dhya , Vi ma la cha ri ta ,",
"s d , d p m p d d p m g r s",
"Vi ham , ga , , dhi Ro , ha na , , ,",
"p m p d s d s r s d d s d p",
"U da bhi Ni va , sa U ra ga Sha ya , na",
"d d p p , p m r m m p , p ,",
"U , nna to , nna ta Ma hi , ma , , ,",
"d d p p , p m r , m m g r s",
"ya du ku lo , tta ma ya , gna ra , ksha ka",
"s , s d d d p p , p m g r s",
"ya , gna shi , ksya ka ra , ma na , , ma",
"d S , d p m p d d p m g r s",
"Vi bhi , sha na pa , la ka , na mo na mo",
"R S , d p m p d d p m g r s",
"E bha , va ra da , ya ka , na mo na mo"
	    };

	   for(String line : lines){
	        String[] nameArray = line.split(" ");
		    String formatedText = String.format(format, nameArray);
		    System.out.println(formatedText);
	    }
	}
}
