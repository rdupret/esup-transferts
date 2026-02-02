package fr.uphf.pegase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PegaseResultatDto {

    private ObjetFeuille objetFeuille;

    private Double noteSession1;
    private Double noteSession2;

    private ResultatSession resultatSession1;
    private ResultatSession resultatSession2;

    private MentionHonorifique mentionHonorifique;

    @Getter
    @Setter
    public static class ResultatSession {
        private String libelleAffichage;
    }

    @Getter
    @Setter
    public static class MentionHonorifique {
        private String libelleAffichage;
    }

    @Getter
    @Setter
    public static class ObjetFeuille {
        private String libelleLong;
    }
}
