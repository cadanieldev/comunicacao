package com.luizalebs.comunicacao_api.api.mapper;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-10T14:32:40-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.20 (Azul Systems, Inc.)"
)
@Component
public class ComunicacaoMapperImpl implements ComunicacaoMapper {

    @Override
    public ComunicacaoEntity paraEntity(ComunicacaoInDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ComunicacaoEntity.ComunicacaoEntityBuilder comunicacaoEntity = ComunicacaoEntity.builder();

        comunicacaoEntity.dataHoraEnvio( dto.getDataHoraEnvio() );
        comunicacaoEntity.nomeDestinatario( dto.getNomeDestinatario() );
        comunicacaoEntity.emailDestinatario( dto.getEmailDestinatario() );
        comunicacaoEntity.telefoneDestinatario( dto.getTelefoneDestinatario() );
        comunicacaoEntity.mensagem( dto.getMensagem() );
        comunicacaoEntity.modoDeEnvio( dto.getModoDeEnvio() );
        comunicacaoEntity.statusEnvio( dto.getStatusEnvio() );

        return comunicacaoEntity.build();
    }

    @Override
    public ComunicacaoInDTO paraDTO(ComunicacaoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ComunicacaoInDTO.ComunicacaoInDTOBuilder comunicacaoInDTO = ComunicacaoInDTO.builder();

        comunicacaoInDTO.dataHoraEnvio( entity.getDataHoraEnvio() );
        comunicacaoInDTO.nomeDestinatario( entity.getNomeDestinatario() );
        comunicacaoInDTO.emailDestinatario( entity.getEmailDestinatario() );
        comunicacaoInDTO.telefoneDestinatario( entity.getTelefoneDestinatario() );
        comunicacaoInDTO.mensagem( entity.getMensagem() );
        comunicacaoInDTO.modoDeEnvio( entity.getModoDeEnvio() );
        comunicacaoInDTO.statusEnvio( entity.getStatusEnvio() );

        return comunicacaoInDTO.build();
    }

    @Override
    public List<ComunicacaoEntity> paraListaEntity(List<ComunicacaoInDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ComunicacaoEntity> list = new ArrayList<ComunicacaoEntity>( dtos.size() );
        for ( ComunicacaoInDTO comunicacaoInDTO : dtos ) {
            list.add( paraEntity( comunicacaoInDTO ) );
        }

        return list;
    }

    @Override
    public List<ComunicacaoInDTO> paraListaDTO(List<ComunicacaoEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ComunicacaoInDTO> list = new ArrayList<ComunicacaoInDTO>( entities.size() );
        for ( ComunicacaoEntity comunicacaoEntity : entities ) {
            list.add( paraDTO( comunicacaoEntity ) );
        }

        return list;
    }
}
