/*
 * COPYRIGHT VITESCO TECHNOLOGIES GROUP AG (EXCLUSIVE RIGHTS)
 *
 * Confidential
 *
 * The reproduction, transmission or use of this document or its contents is not permitted without express written authority. Offenders will be liable for damages. All rights, including rights created
 * by patent grant or registration of a utility model or design, are reserved.
 */
package com.collection.list1;

import java.util.ArrayList;

public class Array1
{
    public static void main(final String[] args)
    {
        long n = (long) 1E7;
        long milis = System.currentTimeMillis();

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= n; i++)
        {
            arrayList.add(i);
        }
        System.out.println("Insert ArrayList Takes :" + (System.currentTimeMillis() - milis) + "ms");

    }
}
