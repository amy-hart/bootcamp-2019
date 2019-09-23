/*package com.manchesterdigital;


public class ScopeExample {

    int age = 20;
    boolean hasDrivingLicense = true;

    if (age >= 20) {
        // this code belongs to the outer block
        /* this variable can be used by both if statements, but can't be used by
        code outside of the ifs */
        /*int height = 10;
        if (hasDrivingLicense) {
            // this code belongs to the inner block
            // height can be used here
            height = 20;

            // this is declared in the inner block, and is locally scoped
            Date expiryDate = new Date();
        }

        Date expiryDate = new Date(); // COMPILE ERROR

        // this height is also at parent level and can be used
        height = 20;
    }
}*/
