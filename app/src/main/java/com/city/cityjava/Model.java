package com.city.cityjava;

public class Model {
    private int profileImage;
    private String userCidade;
    private String userEstado;


    public Model(int profileImage, String userCidade, String userEstado) {
        this.profileImage = profileImage;
        this.userCidade = userCidade;
        this.userEstado = userEstado;

    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getUserCidade() {
        return userCidade;
    }

    public void setUserCidade(String userCidade){
        this.userCidade=userCidade;
    }

    public String getUserEstado() {
        return userEstado;
    }

    public void setUserEstado(String userEstado) {
        this.userEstado = userEstado;
    }
}
