package br.com.fiap.javags.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    // Página de login
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Credenciais inválidas. Tente novamente.");
        }

        if (logout != null) {
            model.addAttribute("logoutMessage", "Você saiu com sucesso!");
        }

        return "login"; // Retorna o template "login.html"
    }
}
