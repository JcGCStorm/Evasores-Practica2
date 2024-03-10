  /**
   * Interfaz Iterator que nos sirve para implementar
   * los iteradores faltantes de HashTable y ArrayList
   */
public interface Iterator {
    /**
     * Nos dice si hay un elemento siguiente. El método debe regresar
     * <code>true</code>, excepto cuando la lista esté vacía, o el iterador esté
     * antes del primer elemento.
     * @return <code>true</code> si el iterador tiene un elemento a su derecha,
     *         <code>false</code> en otro caso.
     */
    boolean hasNext();

    /**
     * Mueve el iterador a la derecha del primer elemento. Después de llamar
     * este método, el método {@link Iterator#hasNext} siempre regresa
     * <code>true</code> si la lista no es vacía.
     */
    Object next();
}
