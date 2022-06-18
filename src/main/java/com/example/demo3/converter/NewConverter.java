package com.example.demo3.converter;

import com.example.demo3.model.New;
import com.example.demo3.model.newDTO;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {
    public New toEntity(newDTO dto) {
        New entity = new New();
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setShortDescription(dto.getShortDescription());
        entity.setThumbnail(dto.getThumbnail());
        return entity;
    }
    public newDTO toDTO(New entity) {
        newDTO dto = new newDTO();
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setShortDescription(entity.getShortDescription());
        dto.setThumbnail(entity.getThumbnail());
        return dto;
    }
}
