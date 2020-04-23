import java.util.ArrayList;
import java.util.List;
//bron: https://www.onlinetutorialspoint.com/java/oops/what-is-association-in-java.html

public class Boerderij {
    public static void main(String[] args){

    Weide weide1 = new Weide("weide1");
    Koe henkie = new Koe("henkie", 2, "niet", "wel" );
    henkie.setWeide(weide1);

    System.out.println(henkie.toString());
    henkie.setRijpVoorSlacht("wel"); //Uiteindelijk is de koe wel rijp voor slacht
    System.out.println(henkie.toString());

    Weide weide2 = new Weide("weide2");
    Kip jantje = new Kip("Jantje",10,"niet",3);
    jantje.setWeide(weide2);

    System.out.println("\n"+jantje.toString());
    jantje.setEierenGelegdVandaag(6);
    System.out.println(jantje.toString());

    Sla sla1 = new Sla("niet","9 januari 2020","1");
    System.out.println("\n"+sla1.toString());
    sla1.setOogstbaar("wel");   //De sla is uiteindelijk wel oogstbaar
    System.out.println(sla1.toString());


    Gereedschap hark = new Gereedschap("hark");
    Gereedschap schep = new Gereedschap("schep");


    List<Gereedschap> gerList = new ArrayList();
    gerList.add(hark);
    gerList.add(schep);

    Gereedschapschuur.setGereedschap(gerList);

    System.out.println("\nIn de gereedschapschuur liggen deze stukken gereedschap: "+Gereedschapschuur.getGereedschappen());




    }

}
