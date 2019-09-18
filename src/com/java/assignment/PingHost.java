/**
 *  Function that will ping any host ( given as input ) and computes the median of the time taken to ping.
 * Author : Gautam Meena
 * Date : 19 September 2019
 * Time Complexity : O(nlog(n))
 **/


package com.java.assignment;

import java.net.*;

public class PingHost {

    private long[] array;
    private long[] sortedArr;
    private int n;
    private String address;

    /** Implemented merge sort
     **/
    private void merge(long[] arr, int start, int mid, int end){

        int n1 = mid - start + 1;
        int n2 = end - mid;

        long[] L = new long[n1];
        long[] R = new long[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[start + i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[mid + i + 1];
        }



        int i = 0;
        int j = 0;
        int k = start;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }


    }

    private void mergeSort(long[] arr, int start, int end){

        if(start < end){

            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }


    private void sortArray(long[] arr, int n){
        int start = 0;
        int end = n-1;

        mergeSort(arr, start, end);
    }

    private void ping() {
        /**
         * it pings given host address
         * calculates the ping time and add it into array
         **/

        int i = 0;
        while (i < n){
            try {

                InetAddress inet = InetAddress.getByName(address);
                System.out.println("Sending ping Request to " + address);
                long current = System.currentTimeMillis();

                if (inet.isReachable(1000)) {
                    long currentTime = System.currentTimeMillis();

                    array[i] = currentTime - current;
                } else {
                    System.out.println("not Reachable");
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());

            }
            i++;
        }

    }

    /** two arguments should be given while executing
    * first one host address
    * second one no. of pings
    * this code will need root privileges to run this code as it ICMP request is sent to server to
    * ping the host address and system ping file needs root privileges to execute
     **/

    // Used merge sort to sorts the array containing ping time.
    public static void main(String[] args){

        PingHost obj = new PingHost();

        obj.address = args[0];
        obj.n = Integer.parseInt(args[1]);
        obj.array = new long[obj.n];

        obj.ping();
        obj.sortArray(obj.array, obj.n);

        //Arrays.sort(obj.array);

        for(int i = 0; i < obj.n ; i++){
            System.out.println(obj.array[i]);
        }

        if(obj.n % 2 == 1){
            System.out.println(obj.array[obj.n/2]);
        }

        else{
            System.out.println((obj.array[obj.n/2] + obj.array[obj.n/2 + 1])/2.0);
        }

    }
}
