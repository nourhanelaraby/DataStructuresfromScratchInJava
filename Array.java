import java.util.Arrays;

public class Array {
    private int[] items;
  // private int length;
    int count;
    public Array(int length)
    {
        items=new int[length];
       // this.length=length;
    }

    public void insert(int item)
    {  //here I created a dynamic array if I inserted a number and I exceeded length of array the length of array is
        //doubled
        if (count== items.length)
        {
           int[] newarr=new int[count*2];
           for(int i=0;i<items.length;i++)
           {
               newarr[i]=items[i];
           }
            items=newarr;
            items[count++]=item;
        }
        else
        {
            items[count++]=item;
        }

    }
    public void print()
    {
        for (int i =0;i<items.length;i++)
        {
            System.out.println(items[i]);
        }
    }
    //I applied brute search to find number I either returned index of number if found ow -1
    public int indexOf(int num)
    {
        for(int i=0;i< items.length;i++)
        {
            if (num==items[i])
                return i;
        }
        return -1;
    }
    public void removeAt(int index)
    {
        for(int i=index;i< items.length-1;i++)
        {
            items[i]=items[i+1];
        }
        items[items.length-1]=0;
    }
    public int max()
    {
        int max=items[0];
        for(int i=0;i<items.length;i++)
        {
         if(items[i]>max)
         {
             max=items[i];
         }
        }
        return max;
    }
    public void printReverse()
    {
        for(int i=items.length-1;i>-1;i--)
        {
            System.out.println(items[i]);
        }
    }
    public void reverseArray(){
        int tmp;
        int last_idx= items.length-1;
        int half_index=items.length/2;
        for(int i=0;i< half_index;i++)
        {   tmp=items[i];
            items[i]=items[last_idx];
            items[last_idx]=tmp;
            last_idx--;
        }
        //return items;
        System.out.println(Arrays.toString(items));

    }
   public void insertAt(int idx,int number)
    {
        items[idx]=number;
    }
}
