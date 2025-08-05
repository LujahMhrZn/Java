package practice2;

class GarbageDemo {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageDemo g = new GarbageDemo();
        g = null;
        System.gc(); // Suggests JVM to run GC
    }
}

