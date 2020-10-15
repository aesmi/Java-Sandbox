//Numeric primitives could be cast in two ways. Implicit casting heppens when the source type has smaller range than the target type.

public class Primitives {
    //Implicit Casting
    byte byteVar = 42;
    short shortVar = byteVar;
    int intVar = shortVar;
    long longVar = intVar;
    float floatVar = longVar;
    double doubleVar = floatVar;
    //Explicit Casting
    double exDoubleVar = 42.0d;
    float exFloatVar = (float) exDoubleVar;
    long exLongVar = (long) exFloatVar;
    int exIntVar = (int) exLongVar;
    short exShortVar = (short) exIntVar;
    byte exByteVar = (byte) exShortVar;
}
