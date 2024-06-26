package com.design.createnal;

public class Singloton {
private static Singloton sigle;

private Singloton() {

}

//1.This is not Thead Safe
public static Singloton getSigleInstance() {

    if (sigle == null) {

        sigle = new Singloton();
    }

    return sigle;
}
//2.for Thread safe

public static synchronized Singloton getSingleInstance() {

    if (sigle == null) {
        sigle = new Singloton();
    }

    return sigle;

}

}





