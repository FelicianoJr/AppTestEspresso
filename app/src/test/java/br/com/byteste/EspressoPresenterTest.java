package br.com.byteste;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import data.Espresso;
import espresso.EspressoContract;
import espresso.EspressoPresenter;
import repository.EspressoRepository;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

/**
 * Created by feliciano on 27/02/16.
 */
public class EspressoPresenterTest {

    @Mock
    private EspressoRepository mEspressoRepository;
    @Mock
    private EspressoContract.View mEspressoView;

    private EspressoPresenter espressoPresenter;


    @Before
    public void setupEspressoPresenter() {
        MockitoAnnotations.initMocks(this);

        espressoPresenter = new EspressoPresenter(mEspressoRepository, mEspressoView);
    }

    @Test
    public void saveEspresso_showSucessUI() {

        espressoPresenter.save("2332");

        verify(mEspressoRepository).saveEspresso(any(Espresso.class));
        verify(mEspressoView).showToast();
    }

    @Test
    public void save_emptyEspressoShowsErrorUi() {

        espressoPresenter.save("");
        verify(mEspressoView).showToastError();
    }

}
