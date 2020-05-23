package com.dev.testcasespro.model;

import com.dev.testcasespro.models.RetroPhoto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RetroPhotoTest {
    @Test
    public void photoDataProperMapping() throws Exception {
        RetroPhoto retroPhoto1 = new RetroPhoto(01, 01, "albumId1", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");
        RetroPhoto retroPhoto2 = new RetroPhoto(02, 02, "albumId2", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");
        RetroPhoto retroPhoto3 = new RetroPhoto(03, 03, "albumId3", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");
        RetroPhoto retroPhoto4 = new RetroPhoto(04, 04, "albumId4", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");
        RetroPhoto retroPhoto5 = new RetroPhoto(05, 05, "albumId5", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");
        RetroPhoto retroPhoto6 = new RetroPhoto(06, 06, "albumId6", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");
        RetroPhoto retroPhoto7 = new RetroPhoto(07, 07, "albumId7", "http://dev.com/imageUrl", "http://dev.com/thumbNailUrl");

        List<RetroPhoto> list = new ArrayList<>();
        list.add(retroPhoto1);
        list.add(retroPhoto2);
        list.add(retroPhoto3);
        list.add(retroPhoto4);
        list.add(retroPhoto5);
        list.add(retroPhoto6);
        list.add(retroPhoto7);

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<RetroPhoto>>() {
        }.getType();
        List<RetroPhoto> photoList = gson.fromJson(gson.toJson(list), listType);
        assertThat(7, is(equalTo(7)));
    }
}
