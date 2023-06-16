package class_packages;

import java.util.List;
import java.util.AbstractList;
import java.util.Collection;

public class LDLinkedList<E> extends AbstractList<E> implements List <E> {
    private int flag=0;
    Node<E> head=null;
    Node<E> tail=null;
    Node<E> temp=null;
    Node<E> temp2=null;

    public LDLinkedList() {
    }

    public boolean add(E data)
    {
      Node<E> node = new Node<E>(data);
  
      if (head == null)
      {
        head = node;
      }
      else
      {
        tail.next = node;
      }
  
      tail = node;
      return true;
      
    }

    public boolean remove(Object data)
    {
        if(head==null)
        return false;

        if(head.getNext()==null && head.getData()==data)
        {
            head=null;
            tail=null;
            
        }
        else if(head.getNext()!=null && head.getData()==data)
        {
            head=head.next;
            
        }
        else{
            temp=head;
            temp2=head;

            while(temp.next!=null)
            {
                if(head.getData()==data)
                {
                    temp2.next=temp.next;
                }
                temp2=temp;
                temp=temp.next;
            }
            if(head.getData()==data)
            {
                temp2.next=null;
                tail=temp2;
            }

        }
        return true;

    }

    @Override
    public int size() {
        int numberOfNodes = 0;
        Node<E> currentNode = head;
        while (currentNode != null) {
            numberOfNodes++;
            currentNode = currentNode.next;
        }
        return numberOfNodes;
    }
   
    @Override
    public E get(int index)
    {
        if(index<0 || index>=this.size())
        {
            throw new IndexOutOfBoundsException();
        }
        
        if(index<this.size()-1)
        {
            Node<E> current =head;
            for(int i=0;i<index;i++)
            {
                current=current.getNext();
            }
            return current.getData();
        }
        return tail.getData();
        
    }
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (obj.equals(currentNode.data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

  

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }


}