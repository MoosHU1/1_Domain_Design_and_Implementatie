import java.util.List;

public class Gereedschapschuur {

    private String schuurNaam;
    private static List<Gereedschap> gereedschappen;

    public Gereedschapschuur(String schrNm){
        schuurNaam=schrNm;

    }


    public static void setGereedschap(List<Gereedschap> gereedschapjes) {
        gereedschappen = gereedschapjes;
    }

    public static List<Gereedschap> getGereedschappen() {
        return gereedschappen;
    }




}

