package fr.uphf.pegase.services;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import fr.uphf.pegase.dto.PegaseIdentitesDto;

@Headers({"Authorization: Bearer {token}", "Accept: application/json"})
public interface PegaseIdtExtApiService {
    @RequestLine("GET /etablissements/{structure}/identites/apprenants?ine={ine}&etatIneMaitre=CONFIRME")
    PegaseIdentitesDto identites(@Param("token") String token,
                                 @Param("structure") String structure,
                                 @Param("ine") String ine);
}
