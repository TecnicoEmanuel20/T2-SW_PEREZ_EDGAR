package pe.edu.cibertec.T2_SW_PEREZ_EDGAR.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import pe.edu.cibertec.T2_SW_PEREZ_EDGAR.dto.MensajeErrorDto;
// EDGAR EMANUEL PEREZ ANCHAYA
// EDGAR EMANUEL PEREZ ANCHAYA
import java.util.Date;

@RestControllerAdvice
public class ControllerExceptionHandler {
    // EDGAR EMANUEL PEREZ ANCHAYA
    // EDGAR EMANUEL PEREZ ANCHAYA
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MensajeErrorDto resourceNotFoundException(
            ResourceNotFoundException ex,
            WebRequest request){
        return MensajeErrorDto.builder()
                .mensaje(ex.getMessage())
                .codigoEstado(HttpStatus.NOT_FOUND.value())
                .fechaError(new Date())
                .descripcion(request
                        .getDescription(true))
                .build();
    }

}
