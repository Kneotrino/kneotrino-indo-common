package com.indo.common.util;


import org.modelmapper.ModelMapper;

/**
 * @author Kneotrino
 * @date 17/12/20
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
