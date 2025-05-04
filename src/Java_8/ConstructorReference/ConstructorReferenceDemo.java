package Java_8.ConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).toList();
        for (MobilePhone ml: mobilePhoneList) {
            System.out.println(ml);
        }
        /*
            MobilePhone{name='A'}
            MobilePhone{name='B'}
            MobilePhone{name='C'}
         */
    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                '}';
    }
}