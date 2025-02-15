public class TypeDataNumber {
    public static void main(String[] args) {
        byte b = 100; // hanya 3 angka karena byte;; default 0.
        short s = 1000; // hanya 4 angka karena short; default 0.
        int i = 1000000000; // 10 angka karena integer; default 0.
        long l = 1000000000; // 10 angka karena long; default 0.
        long l2 = 10000000000L; // lebih dari 10 angka; default 0.

        float f = 10.0F; // default 0.0
        double d = 10.0D; // default 0.0
    }
}


// TYPE DATA NUMBER
// byte = -128 -> 127 --> 1 byte
// short = -23,768 -> 23,767 2 byte
// int = -2jt -> 2 jt 4 byte
// long = -90.000t -> 90.000t
// float = 3.4e-038 -> 3.4e+038 4 byte ---> seperti int --------> default 0.0
// double 1.7e-38 -> 1.7e+38 8 bite ---> seperti long --------> default 0.0

// byte iniByte = 1000
// short iniShort = 10000
// int iniInt = 100000
// long iniLong = 1000000
// long iniLong2 = 100000000L