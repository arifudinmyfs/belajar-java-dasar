package TypeData;

public class KonversiDariTypeDataPrimitif {

    public static void main(String[] args) {
        int age = 30;
        Integer ageObject = age;
        System.out.println(ageObject);

        // jika ingin conver;
        Integer ageObject2 = age;
        System.out.println(ageObject2);

        // didalam type data bukan primitif dia memiliki method, .shortValue dst....
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float floatAge = ageObject.floatValue();
        //dst...
    }
}
