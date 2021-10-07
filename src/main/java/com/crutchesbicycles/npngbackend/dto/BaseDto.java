package com.crutchesbicycles.npngbackend.dto;

import com.crutchesbicycles.npngbackend.domain.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class BaseDto {
    private Long id;

    public BaseDto(BaseEntity baseEntity){
        this.id = baseEntity.getId();
    }
}
