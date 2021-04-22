package org.example.practice;

public class B  implements Dependency{

    @Override
    public String needThis(){
        return "You need this dependency";
    }

}
