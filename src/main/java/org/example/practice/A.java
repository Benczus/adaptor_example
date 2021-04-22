package org.example.practice;

public class A {
    private final DependencyBuilder dependencyBuilder;

    public A(DependencyBuilder dependencyBuilder) {
        this.dependencyBuilder = dependencyBuilder;
    }

    public String demo(){
        return "A" + dependencyBuilder.build().needThis();
    }
}
