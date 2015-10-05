package com.bicing.services;

/**
 * Created by mikcorlej on 5/10/15.
 */
public abstract class Request<T> {

    public void withCallback( Callback<T> callback) {

    }

    public T await() {
        return null;
    }

    public void cancel() {

    }

    public abstract void makeRequest();


    public interface Callback<T> {
        void onSuccess(T result);

        void onFailure(Throwable e);
    }
}
