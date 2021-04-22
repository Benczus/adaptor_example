package org.example.practice;

public class DependencyBuilderBImpl implements DependencyBuilder {
    @Override
    public Dependency build() {
        return new B();
    }
}
