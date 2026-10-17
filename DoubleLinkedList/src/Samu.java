// Busca un dato en la lista
public boolean contains(T data) {
    DoublyNode<T> current = head;

    while (current != null) {
        // Comparamos objetos con equals, no con ==
        if (current.getData().equals(data)) {
            return true;
        }
        current = current.getNext();
    }
    return false;
}