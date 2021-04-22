package org.example.adapter;

public class Client {
    private final RepositoryProvider repositoryProvider;

    public Client(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    public String demo(String query){
        return this.repositoryProvider.searchRepository(query).get(0);
    }
}
