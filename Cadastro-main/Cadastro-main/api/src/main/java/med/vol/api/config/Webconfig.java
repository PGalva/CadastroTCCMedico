package med.vol.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Aplica CORS para todas as rotas da API
        registry.addMapping("/**")  // Aplica CORS a todas as rotas da API
                .allowedOrigins("http://localhost:63342")  // Frontend está rodando em http://localhost:63342
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Métodos permitidos
                .allowedHeaders("*")  // Permite todos os cabeçalhos
                .allowCredentials(true);  // Permite enviar cookies ou cabeçalhos de autenticação, se necessário
    }
}

