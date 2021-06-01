package org.hussain;

public class Sample {
   private  String str;
   int i;
   

public int getI() {
    return i;
}


public void setI(int i) {
    this.i = i;
}


public String getStr() {
    return str;
}


public void setStr(String str) {
    this.str = str;
}


@Override
public String toString() {
    return "Sample [str=" + str + ", i=" + i + "]";
}
   

}
