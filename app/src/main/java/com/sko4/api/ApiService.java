package com.sko4.api;

import com.sko4.model.EventsWrapper;
import com.sko4.model.Filters;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Api service.
 * Created by Mayboroda.
 */
public interface ApiService {

    @GET("/api")
    Observable<EventsWrapper> getEvents(@Query("id_city") String city);

    @GET("/filters")
    Observable<Filters> getFilters();

}
