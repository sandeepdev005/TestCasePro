package com.dev.testcasespro.datasource;

import com.dev.testcasespro.models.RetroPhoto;
import com.dev.testcasespro.network.RetrofitSocialDataSource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

//@RunWith(RobolectricTestRunner.class)
public class RetrofitSocialDataSourceImpTest extends BaseDataSourceTest {
    static RetrofitSocialDataSource socialDataSourceService;
    CountDownLatch async;
    boolean complete = false;

    @BeforeClass
    public static void initialize() {
        socialDataSourceService = retrofit.create(RetrofitSocialDataSource.class);
    }

    @Before
    public void setUp() {
        async = new CountDownLatch(1);
        complete = false;
    }

    @Test
    public void testGetPhotoData() throws InterruptedException {
        Call<List<RetroPhoto>> call = socialDataSourceService.getAllPhotos();
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {

                if (response.isSuccessful()) {
                    List<RetroPhoto> retroPhotoList = response.body();
                    if (retroPhotoList != null && retroPhotoList.size() >= 0) {
                        complete = true;
                    }
                }

                async.countDown();

            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {
                async.countDown();
            }
        });

        async.await(CALLBACK_TIMEOUT, TimeUnit.SECONDS);
        assertThat("Should complete", complete, is(true));
    }

    @Test
    public void sampleTest() throws Exception{
        assertThat("Test",true,is(true));
    }
}
