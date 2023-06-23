package fr.uphf.pegase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PegaseCredentialsDto {
    private String username;

    private String password;

    private boolean token;
}
