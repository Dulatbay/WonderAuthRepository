package kz.wonder.wonderauthrepository.controllers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import kz.wonder.wonderauthrepository.dto.ChangePasswordRequest;
import kz.wonder.wonderauthrepository.entities.User;
import kz.wonder.wonderauthrepository.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @Operation(summary = "Change password")
    @PatchMapping("/change-password")
    public ResponseEntity<?> changePassword(
          @RequestBody ChangePasswordRequest request,
          Principal connectedUser
    ) {
        service.changePassword(request, connectedUser);
        return ResponseEntity.ok().build();
    }
    @Operation(summary = "Change role of user")
    @PostMapping("/add-role/{roleName}")
    public void addRole(@PathVariable String roleName, Principal connectedUser) {
        service.addRoleToUser(connectedUser, roleName);
    }
}
