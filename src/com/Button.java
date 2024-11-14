package com;

public class Button {
    String label;
    String bgColor;
    Button(String label,String bgColor){
        this.label = label;
        this.bgColor = bgColor;
    }
    void click(){
        System.out.println(label+" button clicked");

    }
    public static void main(String[] args) {
        Button b1 = new Button(" OK","red");
        Button b2 = new Button("Cancel","blue");
        b1.click();
        b2.click();
    }
}
