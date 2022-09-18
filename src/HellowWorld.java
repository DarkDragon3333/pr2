
public class HellowWorld {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int z = 0;
        if (a)
            z += 1;
        if (b)
            z += 1;
        if (c)
            z += 1;
        if (d)
            z += 1;
        return z == 2 ? true : false;
    }
}
