class Solution1 {
    companion object {
        // Function to find the midpoint of a singly linked list
        fun midpoint(list: SinglyLinkedList<Char>): Node<Char>? {
            var slowPointer = list.first
            var fastPointer = list.first

            while (fastPointer?.next != null && fastPointer.next?.next != null) {
                slowPointer = slowPointer?.next
                fastPointer = fastPointer.next?.next
            }

            return slowPointer
        }
    }
}
