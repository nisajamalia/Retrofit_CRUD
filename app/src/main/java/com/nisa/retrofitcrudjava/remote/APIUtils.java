package com.nisa.retrofitcrudjava.remote;

public class APIUtils {

    private APIUtils(){

    }
    //naro link API
    //nampilin API
    public static final String API_URL = "http://localhost/marketplace2/index.php/";

    public static ProductService getProductService(){
        return RetrofitClient.getClient(API_URL).create(ProductService.class);
    }
}
