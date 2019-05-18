package dev.rodni.ru.githubsearch.search;

public class FakeSearchServiceMock implements SearchSourceMock {

    private static FakeSearchServiceMock instanceFakeSearchServiceMock;

    boolean returnFailure = false;
    boolean returnEmpty = false;

    private FakeSearchServiceMock() {
    }

    public static FakeSearchServiceMock getInstanceFakeSearchServiceMock() {
        if (instanceFakeSearchServiceMock == null) {
            instanceFakeSearchServiceMock = new FakeSearchServiceMock();
        }

        return instanceFakeSearchServiceMock;
    }


    @Override
    public void setReturnFail() {
        this.returnFailure = true;
    }

    @Override
    public void setReturnEmpty() {
        this.returnEmpty = true;
    }
}
