package dev.rodni.ru.githubsearch.search;

import dev.rodni.ru.githubsearch.BaseSource;

public interface SearchSourceMock extends BaseSource {
    void setReturnFail();

    void setReturnEmpty();
}
