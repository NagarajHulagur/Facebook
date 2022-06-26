/*
 * COPYRIGHT VITESCO TECHNOLOGIES GROUP AG (EXCLUSIVE RIGHTS)
 *
 * Confidential
 *
 * The reproduction, transmission or use of this document or its contents is not permitted without express written authority. Offenders will be liable for damages. All rights, including rights created
 * by patent grant or registration of a utility model or design, are reserved.
 */
package com.collections.set;

import java.util.HashSet;

public class HasSet2
{

    public static void main(final String args[])
    {
        HashSet<String> set = new HashSet<>();
        set.add("Nagaraj");
        set.add("Karabasu");
        set.add("Sharan");
        set.add("Harsha");
        System.out.println("An initial list of elements: " + set);

        //Removing specific element from HashSet

        set.remove("Sharan");
        System.out.println("After invoking remove(object) method: " + set);
        HashSet<String> set1 = new HashSet<>();
        set1.add("Nagaraj");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        //Removing all the new elements from HashSet

        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);

        //Removing elements on the basis of specified condition

        set.removeIf(str -> str.contains("Harsha"));
        System.out.println("After invoking removeIf() method: " + set);

        //Removing all the elements available in the set

        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }

}
