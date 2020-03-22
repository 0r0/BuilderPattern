package org.example;

import org.example.User.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        User user=new User.UserBuilder("ali","hassan","ali@hassan.ir").address("Kerman").build();
        System.out.println(user);
    }
}
