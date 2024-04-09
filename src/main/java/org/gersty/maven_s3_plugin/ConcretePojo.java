package org.gersty.maven_s3_plugin;

import java.lang.annotation.Target;

public class ConcretePojo {
    private final String name;
    public ConcretePojo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @SomeAnnotation()
    public String testAnnotation(){
        return "this is a test string";
    }
}
