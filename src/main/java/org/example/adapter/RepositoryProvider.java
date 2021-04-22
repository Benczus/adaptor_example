package org.example.adapter;

import java.util.List;

public interface RepositoryProvider {
    List<String> searchRepository(String query);
}
