package fr.uphf.pegase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PegaseObjetMaquetteDto {
    private String code;

    private DescripteursObjetMaquette descripteursObjetMaquette;
    private DescripteursEnquete descripteursEnquete;

    @Getter
    @Setter
    public static class DescripteursObjetMaquette {
        private String structurePrincipale;
    }

    @Getter
    @Setter
    public static class DescripteursEnquete {
        private DescripteursSise descripteursSise;

        private String niveauDiplomeSise;
    }

    @Getter
    @Setter
    public static class DescripteursSise {
        private RawInnerObject typeDiplome;
    }

    @Getter
    @Setter
    public static class RawInnerObject {
        private String type;
        private String code;
    }
}
