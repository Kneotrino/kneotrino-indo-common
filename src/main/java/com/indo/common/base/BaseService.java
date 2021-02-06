package com.indo.common.base;

import javassist.NotFoundException;

import java.io.IOException;
import java.util.List;

/**
 * @author Kneotrino
 * @date 17/12/20
 */
public interface BaseService<DTO> {


    DTO SelectOneAvailableById(Long id) throws NotFoundException, IOException;

    DTO InsertOneAvailableById(DTO data) throws NotFoundException, IOException;

    DTO UpdateOneAvailableById(DTO data, Long id) throws NotFoundException, IOException;

    List<DTO> SelectAllAvailable() throws IOException, NotFoundException;

    void DisableOneAvailableById(Long id) throws NotFoundException, IOException;

    String GetEntityName();
}
