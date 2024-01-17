package com.xworkz.trail.demo;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class NewInstanceExample {
        String str="hello";
        public static void main(String args[])
        {
            //new keyword
//            NewInstanceExample newInstanceExample = new NewInstanceExample();
//           String dfg =newInstanceExample.str;
//            System.out.println(dfg);

            try
            {
                 //creating object new instance with constructor
                Constructor<NewInstanceExample> obj1 = NewInstanceExample.class.getConstructor();
                NewInstanceExample obj= obj1.newInstance();

                //OR   instance
//                NewInstanceExample obj= NewInstanceExample.class.newInstance();

                System.out.println(obj.str);
            }
            catch(Exception e)
            {
                System.out.println("instantiate exception");
            }
        }
}
//count the number of words in given words