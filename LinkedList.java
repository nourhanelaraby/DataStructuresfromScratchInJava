/* This is an implementation for linked list in java
methods :  addFirst - addLast -contains -indexOf -removeFirst -removeLast
* */

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node
    {
         int Node;
         Node next;

        public Node(int node)
        {
            Node = node;
        }
    }
    private Node first;
    private Node last;
    private int size;
    public void addLast(int value)
    {
        Node node=new Node(value);
       if(first==null)   //since variable isn't initialized for first the default is null
            {
           first = last = node;
            }
       else
           {
               last.next=node;
               last=node;
           }
        size++;
    }
    public void addFirst(int value)
    {
        Node node=new Node(value);
        if(first==null)
        {
            first=last=node;
        }
        else
        {
            node.next=first;
            first=node;
        }
        size++;
    }
    public int indexOf(int item)
    {
        int idx=-1;
        var current=first;
        while(current!=null)
        {   idx+=1;
            if (current.Node==item)
            {

                return idx;
            }
            current=current.next;
        }
        return -1;
    }
    public boolean contains(int item)
    {

        return indexOf(item) != -1;
    }
    private boolean isEmpty()
    {
        return first==null;
    }

    public void removeFirst()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        if (first==last)
        {
            first=last=null;
            size--;
            return;
        }
        var current=first.next;

        first.next=null;
        first=current;
        size--;
    }

    //time complexity is O(n)
    public void removeLast()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        if (first==last)
        {
            first=last=null;
            size--;
            return;
        }
        var beforeLast=getPrevious(last);
        beforeLast.next=null;
        last=beforeLast;
        size--;
    }
    private Node getPrevious(Node node)
    {
        var current=first;
        while(current!=null)
        {
            if (current.next==node) //current.next.next==null
            {
            return current;
            }
            current=current.next;
        }
        return null;
    }
    public  int getSize()
    {
        return size;
    }
    public int[] toArray()
    {
        int[] arr=new int[size];
        int index=0;
        var current=first;
        while(current!=null)
        {
          int value =current.Node;
          arr[index++]=value;
          current=current.next;

        }
        return arr;
    }
    public void reverse()
    {
        var current=first;
        Node previous,currentCopy;
        while (current!=null)
        {
            previous=current;
            current=current.next;
            currentCopy=current;
            currentCopy.next=previous;
        }
    }
}
