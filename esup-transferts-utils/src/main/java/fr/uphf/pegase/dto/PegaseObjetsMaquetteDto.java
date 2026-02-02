package fr.uphf.pegase.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PegaseObjetsMaquetteDto {

    private List<PegaseMinimalObjetMaquetteDto> items;

    private Integer totalElements;

    private Integer totalPages;
    private Integer taille;
    private Integer page;
}
