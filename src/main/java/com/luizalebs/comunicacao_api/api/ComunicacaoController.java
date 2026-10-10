package com.luizalebs.comunicacao_api.api;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.luizalebs.comunicacao_api.business.service.ComunicacaoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comunicacao")
@Tag(name = "Comunicação", description = "Comunicação e agendamento")
public class ComunicacaoController {

    private final ComunicacaoService service;

    public ComunicacaoController(ComunicacaoService service) {
        this.service = service;
    }

    @PostMapping("/agendar")
    @Operation(summary = "Salvar agendamento", description = "Cria um novo agendamento")
    @ApiResponse(responseCode = "200", description = "Agendamento salvo com sucesso")
    @ApiResponse(responseCode = "400" , description = "Agendamento já existente")
    @ApiResponse(responseCode = "500" , description = "Erro de servidor")
    public ResponseEntity<ComunicacaoInDTO> agendar(@RequestBody ComunicacaoInDTO dto)  {
        return ResponseEntity.ok(service.agendarComunicacao(dto));
    }

    @GetMapping()
    @Operation(summary = "Buscar agendamento", description = "Busca dados do agendamento")
    @ApiResponse(responseCode = "200", description = "Agendamento encontrado")
    @ApiResponse(responseCode = "400" , description = "Agendamento não encontrado")
    @ApiResponse(responseCode = "500" , description = "Erro de servidor")
    public ResponseEntity<ComunicacaoInDTO> buscarStatus(@RequestParam String emailDestinatario) {
        return ResponseEntity.ok(service.buscarStatusComunicacao(emailDestinatario));
    }

    @PatchMapping("/cancelar")
    @Operation(summary = "Alterar agendamento", description = "Altera o status do agendamento")
    @ApiResponse(responseCode = "200", description = "Status alterados com sucesso")
    @ApiResponse(responseCode = "400" , description = "Status alterado já existente")
    @ApiResponse(responseCode = "500" , description = "Erro de servidor")
    public ResponseEntity<ComunicacaoInDTO> cancelarStatus(@RequestParam String emailDestinatario) {
        return ResponseEntity.ok(service.alterarStatusComunicacao(emailDestinatario));
    }
}
