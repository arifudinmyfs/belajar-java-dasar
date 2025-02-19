package TypeData;

public class KonversiTypeDataNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;

        double iniDouble = iniFloat;

        float iniFloatInt2 = (float) iniDouble;
        long iniLong2 = (long) iniFloatInt2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniShort2;

        //bagaimana turun dari int turun ke byte ? jawabannya tidak bisa tetapi di paksa
        // misal
//        int iniInt22 = 1000;
//        yang bisa di tampung oleh byte hanya 127
        byte iniByte3 = (byte) iniInt; // di paksa
        // jika lebih dari 127 maka di conversi akan menjadi NUMBER OVER FLOW "dimana number yang melebihi 127 maka akan di balikin ke belakang ke -128 kemudian di tambahkan sampai mendapatkan 1000.
    }
}

// Widening Casting  (Otomatis) : byte -> short -> int -> long -> float -> double
// Narrowing Casting (Manual) : double -> float -> long -> int -> short -> byte
