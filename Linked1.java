/*
 * COPYRIGHT VITESCO TECHNOLOGIES GROUP AG (EXCLUSIVE RIGHTS)
 *
 * Confidential
 *
 * The reproduction, transmission or use of this document or its contents is not permitted without express written authority. Offenders will be liable for damages. All rights, including rights created
 * by patent grant or registration of a utility model or design, are reserved.
 */
package com.collection.list1;

import java.util.LinkedList;

/**
 *
 */
public class Linked1
{
    public static void main(final String[] args)
    {
        long n = (long) 1E7;
        long milis = System.currentTimeMillis();

        LinkedList linkedList = new LinkedList();
        milis = System.currentTimeMillis();

        for (int x = 0; x <= n; x++)
        {
            linkedList.add(x);
        }
        System.out.println("Insert LinkedList Takes :" + (System.currentTimeMillis() - milis) + "ms");

    }

}
