package com.luizalebs.comunicacao_api.infraestructure.repositories;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoOutDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmailClient {

    void enviarEmail(@RequestBody ComunicacaoOutDTO dto);

}
