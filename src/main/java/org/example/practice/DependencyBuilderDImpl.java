package org.example.practice;

public class DependencyBuilderDImpl implements DependencyBuilder {
    @Override
    public Dependency build() {
        return new D();
    }
}
