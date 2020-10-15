//https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types#:~:text=Primitive%20types%20are%20the%20most,simple%20values%20of%20a%20kind.
//Numeric primitives could be cast in two ways. Implicit casting heppens when the source type has smaller range than the target type.
//Primitives and their size in memory
// boolean – 1 bit
// byte – 8 bits
// short, char – 16 bits
// int, float – 32 bits
// long, double – 64 bits

public class Primitives {
    // Implicit Casting
    // Essentially implicit casting casts the type that would accomodate the size of
    // the source type
    byte byteVar = 42;
    short shortVar = byteVar;
    int intVar = shortVar;
    long longVar = intVar;
    float floatVar = longVar;
    double doubleVar = floatVar;
    // Explicit casting has to be done when the source type has larger range than
    // the target type.
    // Explicit Casting
    double exDoubleVar = 42.0d;
    float exFloatVar = (float) exDoubleVar;
    long exLongVar = (long) exFloatVar;
    // When casting floating point primitives (float, double) to whole number
    // primitives, the number is rounded down
    int exIntVar = (int) exLongVar;
    short exShortVar = (short) exIntVar;
    byte exByteVar = (byte) exShortVar;

    static void testNumericPromotion() {
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        int1 = char1 + char2; // char is promoted to int
        int1 = short1 + short2; // short is promoted to int
        int1 = char1 + short2; // both char and short are promoted to int
        float1 = short1 + float2; // short is promoted to float
        int1 = int1 + int2; //int is unchanged
    }
    //Non-numeric primitive casting
    //The boolean type cannot be cast to/from any primitive type
    //
}
