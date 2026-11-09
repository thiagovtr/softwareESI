package br.ufla.agendainteligente.configuracao;
import java.util.List; import org.springframework.beans.factory.annotation.Value; import org.springframework.context.annotation.Configuration; import org.springframework.web.servlet.config.annotation.*;
@Configuration
public class ConfiguracaoCors implements WebMvcConfigurer {
 private final String origem; public ConfiguracaoCors(@Value("${cors.origem}") String origem){this.origem=origem;}
 @Override public void addCorsMappings(CorsRegistry registro){registro.addMapping("/api/**").allowedOrigins(origem).allowedMethods("GET","POST","DELETE","OPTIONS").allowedHeaders("Authorization","Content-Type");}
}
