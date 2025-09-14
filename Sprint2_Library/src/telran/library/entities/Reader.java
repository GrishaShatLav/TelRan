package telran.library.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Reader implements Serializable {
    private int readerId;
    private String name;
    private String phone;
    private LocalDate birthDay;

    public Reader() {
    }

    public Reader(int readerId, String name, String phone, LocalDate birthDay) {
        this.readerId = readerId;
        this.name = name;
        this.phone = phone;
        this.birthDay = birthDay;
    }

    public int getReaderId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Reader reader = (Reader) object;
        return readerId == reader.readerId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(readerId);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}

