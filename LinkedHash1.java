/*
 * COPYRIGHT VITESCO TECHNOLOGIES GROUP AG (EXCLUSIVE RIGHTS)
 *
 * Confidential
 *
 * The reproduction, transmission or use of this document or its contents is not permitted without express written authority. Offenders will be liable for damages. All rights, including rights created
 * by patent grant or registration of a utility model or design, are reserved.
 */
package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash1
{
    public static void main(final String args[])
    {

        LinkedHashSet<String> alList = new LinkedHashSet<>();
        alList.add("Nagaraj");
        alList.add("Harsha");
        alList.add("Nagaraj");
        alList.add("Sharan");

        Iterator<String> itr = alList.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
