public class Project {

    interface Test {
        void nothing();

        // void nothing1();
        // no errors as default declared
        default void nothing1() {

        }
    }

    // will get error if void nothing and void1 not used in all classes
    // therefore use defualt method
    class Class1 implements Test {
        public void nothing() {

        }
    }

    class Class2 implements Test {
        public void nothing() {

        }
    }

    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10, 20));
    }
}
