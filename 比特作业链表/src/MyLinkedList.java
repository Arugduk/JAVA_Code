public class MyLinkedList {
    static class ListNode{
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    ListNode head=null;
    ListNode last=null;
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            last=node;
        }else {
            node.prev=last;
            last.next=node;
            last=node;
        }
    }
    //打印链表
    public void display(){
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //判断回文
    public boolean isPalind(){
        ListNode start=head;
        ListNode end=last;
        boolean flag=true;
        while(start!=end&&start.prev!=end){
            if(start.val!=end.val){
                flag=false;
                break;
            }else {
                start=start.next;
                end=end.prev;
            }
        }
        return flag;
    }
    //取出倒数的节点
    public ListNode getNodeLast(int k){
        ListNode tNode=last;
        for(int i=1;i<k;i++){
            if(tNode.prev!=null)
                tNode=tNode.prev;
        }
        return tNode;
    }

    //取出中间节点
    public ListNode getNodeMiddle(){
        ListNode  fast=head;
        ListNode  slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //将两个有序链表合并
    public static MyLinkedList conbine(MyLinkedList a,MyLinkedList b){
        MyLinkedList conbined=new MyLinkedList();
        ListNode startA=a.head;
        ListNode startB=b.head;
        while (startA!=null||startB!=null){
            if(startA==null&&startB!=null){
                conbined.addLast(startB.val);
                startB=startB.next;
            }else if(startA!=null&&startB==null){
                conbined.addLast(startA.val);
                startA=startA.next;
            }else {
                if(startA.val<startB.val){
                    conbined.addLast(startA.val);
                    startA=startA.next;
                }else {
                    conbined.addLast(startB.val);
                    startB=startB.next;
                }
            }
        }
        return conbined;
    }

    //单链表逆置
    public void reserve(){
        ListNode p=head;
        ListNode q;

        while (p.next!=null){
            q=p.next;
            p.next=p.next.next;;
            q.next=head;
            head=q;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedListA=new MyLinkedList();
        myLinkedListA.addLast(1);
        myLinkedListA.addLast(2);
        myLinkedListA.addLast(3);
        myLinkedListA.addLast(4);
        myLinkedListA.addLast(5);
        myLinkedListA.addLast(7);
        myLinkedListA.addLast(9);
        myLinkedListA.display();
        myLinkedListA.reserve();
        myLinkedListA.display();
/*        MyLinkedList myLinkedListB=new MyLinkedList();
        myLinkedListB.addLast(4);
        myLinkedListB.addLast(5);
        myLinkedListB.addLast(6);
        myLinkedListB.addLast(7);;
        myLinkedListB.addLast(8);
        myLinkedListB.display();
        MyLinkedList myLinkedListC= MyLinkedList.conbine(myLinkedListA,myLinkedListB);
        myLinkedListC.display();
        System.out.println(myLinkedListA.getNodeLast(3).val);
        System.out.println(myLinkedListA.getNodeMiddle().val);*/
    }
}
