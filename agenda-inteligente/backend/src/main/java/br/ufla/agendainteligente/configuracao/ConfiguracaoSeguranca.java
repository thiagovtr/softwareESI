package br.ufla.agendainteligente.configuracao;
import org.springframework.beans.factory.annotation.Value; import org.springframework.context.annotation.*; import org.springframework.security.config.Customizer; import org.springframework.security.config.annotation.web.builders.HttpSecurity; import org.springframework.security.core.userdetails.*; import org.springframework.security.crypto.factory.PasswordEncoderFactories; import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.security.provisioning.InMemoryUserDetailsManager; import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class ConfiguracaoSeguranca {
 @Bean SecurityFilterChain filtro(HttpSecurity http) throws Exception {return http.csrf(csrf->csrf.disable()).cors(Customizer.withDefaults()).authorizeHttpRequests(regras->regras.requestMatchers("/api/publico/**").permitAll().requestMatchers("/erro").permitAll().anyRequest().authenticated()).httpBasic(Customizer.withDefaults()).build();}
 @Bean UserDetailsService usuarios(@Value("${profissional.usuario}") String usuario,@Value("${profissional.senha}") String senha, PasswordEncoder codificador){return new InMemoryUserDetailsManager(User.withUsername(usuario).password(codificador.encode(senha)).roles("PROFISSIONAL").build());}
 @Bean PasswordEncoder codificador(){return PasswordEncoderFactories.createDelegatingPasswordEncoder();}
}
