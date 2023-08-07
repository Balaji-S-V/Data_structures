package LinkedList;

public class LinkedList
    {
        private Node head;
        private Node tail;

        class Node
        {
            Node next;
            int value;
            public Node(int value)
            {
                this.value = value;
            }
        }
        public LinkedList(int value)
        {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
        }

        LinkedList list = new LinkedList(4);
        LinkedList list;
    }
