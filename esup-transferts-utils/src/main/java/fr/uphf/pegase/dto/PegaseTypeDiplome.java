package fr.uphf.pegase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PegaseTypeDiplome {
    private String code;

    private String libelleAffichage;

    public String getLibelleAffichage() {
        return (libelleAffichage != null && !libelleAffichage.isEmpty())
                ? libelleAffichage
                : "N/D";
    }
}
