package Lec2;

/*
* Попытка выполнения нереализованного метода
* */

import java.util.Collections;
import java.util.List;

public class lec2_4_unsupportedOperationException {
    public static void main(String[] args) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
