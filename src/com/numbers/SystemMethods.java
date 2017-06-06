package com.numbers;

public interface SystemMethods extends Properties {
     Matrix getKoefs();
     Vectors getValues();
     Vectors faultVector();
     int findMaxRow();
     int findMaxColumn();
     Matrix changeMatrix();
     Vectors changeVectors();
     Vectors getRoots();
}
