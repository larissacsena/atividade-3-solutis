package a23.entities;

import java.time.LocalDate;
import java.time.Month;

public class People implements Comparable<People>{
    public String name;
    public LocalDate birthday;

    public People(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public int compareTo(People o) {
        return this.birthday.compareTo(o.birthday);
    }
}
