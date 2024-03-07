package kz.wonder.wonderauthrepository.dto;

import jakarta.validation.constraints.NotNull;
import kz.wonder.wonderauthrepository.constants.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotNull(message = "Firstname must not be null")
    private String firstname;
    @NotNull(message = "Lastname must not be null")
    private String lastname;
    @NotNull(message = "Email must not be null")
    private String email;
    @NotNull(message = "Password must not be null")
    private String password;
}
