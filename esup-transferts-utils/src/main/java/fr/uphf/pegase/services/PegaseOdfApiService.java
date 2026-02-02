package fr.uphf.pegase.services;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import fr.uphf.pegase.dto.PegaseObjetMaquetteDto;
import fr.uphf.pegase.dto.PegaseObjetsMaquetteDto;

@Headers({"Authorization: Bearer {token}", "Accept: application/json"})
public interface PegaseOdfApiService {
    @RequestLine("GET /etablissement/{structure}/objets-maquette?page={page}&taille=1500&typeObjetMaquette=FORMATION&valideSeulement=true")
    PegaseObjetsMaquetteDto getObjetsMaquette(@Param("token") String token,
                                              @Param("structure") String structure,
                                              @Param("page") Integer page);

    @RequestLine("GET /etablissement/{structure}/objets-maquette/{id}")
    PegaseObjetMaquetteDto getObjetMaquette(@Param("token") String token,
                                            @Param("structure") String structure,
                                            @Param("id") String id);
}
