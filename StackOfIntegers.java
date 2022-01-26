public class StackOfIntegers 
{
    private int[] elements;
    private int size = 0;

    public StackOfIntegers()
    {
        this.elements = new int[16];
    }
    public StackOfIntegers(int capacity)
    {
        this.elements = new int[capacity];
    }

    public boolean empty()
    {
        if (this.size == 0)
        {
            return true;
        }
        else
        {
            return false;

        }
    }

    public int peek()
    {
        int temp;
        temp = this.elements[this.size];
        return temp;

    }

    public void push(int value)
    {
        this.elements[this.size] = value;
        this.size += 1;

    }


    public int pop()
    {
        this.size -= 1;
        int temp =  this.elements[this.size];
        return temp;
    }

    public int getSize()
    {
        return this.size;
    }


}