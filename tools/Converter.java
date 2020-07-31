public class Converter
{
	public static void main(String[] args) {
			String header ="<thead><th colspan=\"4\" class=\"line\">I4</th><th colspan=\"2\" class=\"line\">O</th><th colspan=\"2\" class=\"endline\">I4</th></thead>";
	    String format="<tr><td>%s</td><td>%s</td><td>%s</td><td class=\"line\">%s</td><td>%s</td><td class=\"line\">%s</td><td>%s</td><td class=\"endline\">%s</td></tr>";
	    String[] lines =new String[]{
        "S,,, S,n dp,, ,,mg m,,, ,,,g mp,, ,,dn",
				"Sa,,, mba,si, va,,, ya,na, ve,,, ,,,ra jita,, ,,giri",
				"S,,R n,,s d,,n p,,d m,,p m,g, m,,p d,,n",
				"Sha,,mba vi,,ma no,,ha ra,,pa ra,,tpa ra,,kru pa,,ka ra,,Sri",
				"S,R, Snn, S,nd d,n, dpp, d,mg sm,g mpdan",
				"Nee,ve, gurudai, vam,bani ye,ve, lanuSe, vim,puchu Sada,Ma diniShiva",
				"SRSn s,,, nSnd n,,, dndp d,,, pdpm p,,,",
				"Paramada ya,,, Nidhivanu Chu,,, Maruvaku na,,, hrudayamu na,,,",
				"ssss mmmm p,pp d,dd nsns n,dp dpmg mpdn",
				"mahadeva mahaprabho Sun,dara Na,yaka Suravara da,yaka bhavabhaya harashiva"
	    };
		System.out.println(header);
	   for(String line : lines){
	        String[] nameArray = line.split(" ");
		    String formatedText = String.format(format, nameArray);
		    System.out.println(formatedText);
	    }
	}
}
