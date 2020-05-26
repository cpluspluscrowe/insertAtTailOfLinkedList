    static SinglyLinkedListNode getLastNode(SinglyLinkedListNode head, int data){
        if(head == null){
            return new SinglyLinkedListNode(data);
        }else if(head.next == null){
            return head;
        }else{
            return getLastNode(head.next, data);
        }
    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
        SinglyLinkedListNode lastNode = getLastNode(head, data);
        lastNode.next = nodeToInsert;
        return head;
    }
