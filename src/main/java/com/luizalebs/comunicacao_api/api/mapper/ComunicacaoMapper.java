package com.luizalebs.comunicacao_api.api.mapper;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComunicacaoMapper {

    ComunicacaoEntity paraEntity(ComunicacaoInDTO dto);
    ComunicacaoInDTO paraDTO(ComunicacaoEntity entity);
    List<ComunicacaoEntity> paraListaEntity(List<ComunicacaoInDTO> dtos);
    List<ComunicacaoInDTO> paraListaDTO(List<ComunicacaoEntity> entities);

}
