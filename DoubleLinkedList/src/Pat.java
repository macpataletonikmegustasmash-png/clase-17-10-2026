public class Pat{
    public boolean remove(T data) {
        // Buscamos el nodo que tiene el dato
        // Ya no necesitamos "previous" porque cada nodo conoce a su anterior
        DoublyNode<T> current = head;
        while (current != null && !current.getData().equals(data)) {
            current = current.getNext();
        }

        // Si current llegó a null significa que no estaba el dato (o la lista estaba vacía)
        if (current == null) {
            return false;
        }

        // Reconectamos el lado izquierdo
        if (current.getPrev() == null) {
            // current era el head, así que el siguiente pasa a ser el primero
            head = current.getNext();
        } else {
            // El anterior ahora apunta al que venía después de current
            current.getPrev().setNext(current.getNext());
        }

}