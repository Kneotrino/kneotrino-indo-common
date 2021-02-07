package com.indo.common.util;


import org.modelmapper.ModelMapper;

/**
 * ModelMapUtil
 * Singleton to provide ModelMapper in DTO conversion
 *
 * @author  kneotrino
 * @version 1.0
 * @since   2021-1-1
 */
public class ModelMapUtil {

    private static ModelMapper modelMapper = null;

    public static ModelMapper GetDefaultModelMapper() {
        if (modelMapper == null) {
            modelMapper = new ModelMapper();
        }
        return modelMapper;
    }
}
