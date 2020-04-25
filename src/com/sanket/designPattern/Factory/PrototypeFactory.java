package com.sanket.designPattern.Factory;

import com.sanket.designPattern.Album;
import com.sanket.designPattern.Movie;
import com.sanket.designPattern.PrototypeCapabilityIf;
import com.sanket.designPattern.Show;

public class PrototypeFactory {
    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }
    private static java.util.Map<String , PrototypeCapabilityIf> prototypes = new java.util.HashMap<>();

    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapabilityIf getInstance(final String s) throws CloneNotSupportedException {
        return prototypes.get(s).copy();
    }
}
