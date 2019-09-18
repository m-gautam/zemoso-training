/**
 * Create a generic, singly linked list class called SList and SListIterator class.
 * The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
 * The only way to insert and remove elements from an SList is through SListIterator.
 * Write code to demonstrate SList
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 **/


package com.java.assignment;


public class SList<E> {
    private Link<E> head;


    static class SListIterator<E>{
        /**
         * this class implements insert, delete and print functions
         * for linked list.
         */


        SList<E> obj = new SList<>();

        void insert(E ndata){
            Link<E> tNode = obj.head;
            Link<E> newNode = new Link<>(ndata);

            if(obj.head == null){
                obj.head = newNode;
                return;
            }

            while (tNode.next != null){
                tNode = tNode.next;
                }
                tNode.next = newNode;
        }

        void delete(E ndata){
            Link<E> tNode = obj.head;

            if(tNode.data == ndata){
                obj.head = tNode.next;
                return;
            }

            while(tNode.next != null){
                if(tNode.next.data == ndata){
                    tNode.next = tNode.next.next;
                }
                tNode = tNode.next;

            }
        }

        void print(){
            Link<E> tNode = obj.head;
            while (tNode != null){
                System.out.println(tNode.data);
                tNode = tNode.next;
            }
        }
    }


    // this class forms link between nodes using next.
    static class Link<E>{
        Link<E> next;
        E data;

        Link(E theData) {
            this.data = theData;
            next = null;
        }
    }



        private SListIterator<E> iterator(){

            return new SListIterator<E>();
        }


    public static void main(String[] args){
        SList<Integer> list = new SList<>();
        SListIterator<Integer> iter = list.iterator();

        // inserting the nodes in linked list
        iter.insert(20);
        iter.insert(30);
        iter.insert(40);
        iter.insert(50);

        iter.print();

        iter.delete(40);

        iter.print();
    }


}

