/**
 * @author: Brojandos.
 * @creation_date: 01.03.2017.
 */
class Main {
    public static void main(String[] s) throws java.io.IOException {
        System.out.print((System.in.read() + System.in.read()) % 2 > 0 ? "WHITE" : "BLACK");
    }
}