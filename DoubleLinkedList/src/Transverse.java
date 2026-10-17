public void traverseBackward() {
    // Variable de trabajo LOCAL para empezar en el último nodo
    DoublyNode<T> current = tail;

    // Recorremos hacia atrás hasta pasar el primer nodo
    while (current != null) {
        System.out.print(current + ", ");
        // Retrocedemos current al nodo anterior
        current = current.getPrev();
    }

    System.out.println();
}
