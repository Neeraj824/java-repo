package com.example.Quiz.App.model;

public class Response {

    private  Integer Id;

    private  String Response;
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }



    public Response(Integer id, String response) {
        Id = id;
        Response = response;
    }
}
