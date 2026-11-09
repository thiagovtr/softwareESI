package br.ufla.agendainteligente.erro;
import java.util.Map; import org.springframework.dao.DataIntegrityViolationException; import org.springframework.http.*; import org.springframework.web.bind.MethodArgumentNotValidException; import org.springframework.web.bind.annotation.*;
@RestControllerAdvice
public class TratadorErros {
 @ExceptionHandler(ExcecaoRegraNegocio.class) ResponseEntity<Map<String,String>> regra(ExcecaoRegraNegocio erro){return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("mensagem", erro.getMessage()));}
 @ExceptionHandler(DataIntegrityViolationException.class) ResponseEntity<Map<String,String>> integridade(DataIntegrityViolationException erro){return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("mensagem", "Este horario acabou de ser reservado. Escolha outro horario."));}
 @ExceptionHandler(MethodArgumentNotValidException.class) ResponseEntity<Map<String,String>> validacao(MethodArgumentNotValidException erro){String mensagem=erro.getBindingResult().getFieldErrors().stream().findFirst().map(item->item.getField()+" invalido").orElse("Dados invalidos"); return ResponseEntity.badRequest().body(Map.of("mensagem",mensagem));}
}
