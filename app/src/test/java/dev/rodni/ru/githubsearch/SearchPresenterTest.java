package dev.rodni.ru.githubsearch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import dev.rodni.ru.githubsearch.search.SearchContract;
import dev.rodni.ru.githubsearch.search.SearchPresenter;
import dev.rodni.ru.githubsearch.search.SearchService;
import dev.rodni.ru.githubsearch.utils.SchedulerProvider;

@RunWith(MockitoJUnitRunner.class)
public class SearchPresenterTest {

    @Mock
    SearchContract.View view;

    //мы не мокаем класс, который тестируем
    private SearchPresenter presenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        presenter = new SearchPresenter(
                view,
                SearchService.getInstanceSearchService(),
                SchedulerProvider.getInstanceSchedulerProvider()
        );
    }

    //test
    @Test
    public void whenItemClicked() {
        presenter.onItemClick();

        Mockito.verify(view).startDetailsSearchActivity();
    }

    @Test
    public void whenOwnerClicked() {
        presenter.onOwnerClick();
    }

    @Test
    public void whenSwipedRefresh() {
        presenter.onSwipeRefresh();
    }
}
