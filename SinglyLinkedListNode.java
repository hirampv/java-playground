public class SinglyLinkedListNode {
    int value;
    public SinglyLinkedListNode(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString(value);
    }

    public static void main(String[] args) {
        SinglyLinkedListNode myNode = new SinglyLinkedListNode(3);
        System.out.println(myNode);
    }
}