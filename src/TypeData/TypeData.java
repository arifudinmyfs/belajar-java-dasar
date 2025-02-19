package TypeData;

/**
 * type data primitif adalah type data bawaan dari bahasa pemprograman, tipe data primitif tidak bisa di ubah lagi
 * type data data  number, char, boolean adalah type data primitif, selalu memiliki default value.
 * type data "String" bukan type data primitif, tipe data tidak memiliki default value, dan bisa bernilai null.
 * <p>
 * type data data bukan primitif bisa memiliko method/function
 * di java, semua type data primitif memiliki repsentasi type data bukan primitif datanya
 */

/**
 *              type data
 *     primitif                 bukan primitif
 *
 *     byte                     Byte
 *     short                    Short
 *     int                      Integer
 *     long                     Long
 *     float                    Float
 *     double                   Double
 *     char                     Character
 *     boolean                  Boolean
 *
 *     di data bukan primitif jika  default valuenya adalah null
 */

public class TypeData {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100L;
        Boolean iniBoolean = true;

        Short iniSort = null;
        System.out.println(iniSort);

        Short iniShort; //null
        iniShort = 100;
        System.out.println( "iniShort" + " " + iniShort);

        // convert ke bukan data primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println( "iniInteger2" + " " + iniInteger2 );
    }
}
