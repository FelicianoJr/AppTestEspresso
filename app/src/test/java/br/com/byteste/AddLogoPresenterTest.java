package br.com.byteste;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

/**
 * Created by feliciano on 23/02/16.
 */
public class AddLogoPresenterTest {
    @Mock
    private AddLogoContract.View mAddLoView;

    private AddLogoPresent mAddLogoPresent;


    @Before
    public void setupAddLogoPresenter() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void saveAddLogoRepository() {

        verify().

    }
}