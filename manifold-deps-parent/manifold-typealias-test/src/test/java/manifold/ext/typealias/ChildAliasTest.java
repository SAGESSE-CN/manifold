package manifold.ext.typealias;

import manifold.ext.typealias.impl.EnumB;
import manifold.ext.typealias.impl.GenericC;

import java.util.HashMap;

public class ChildAliasTest extends ParentAliasTest{

    @Override
    void method1(EnumB value) {
        method1(value);
    }

//    @Override
//    void method2(EnumA value) {
//        method2(value);
//    }

    @Override
    void method3(HashMap<String, String> value) {
        method3(value);
    }

    @Override
    void method4(GenericC value) {
        method4(value);
    }
}
