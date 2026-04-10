public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    // Test main
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Aytaj", 95);

        System.out.println("Pair: " + student);

        student.setValue(100);
        System.out.println("Updated Pair: " + student);
    }
}