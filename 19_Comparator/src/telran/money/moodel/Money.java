package telran.money.moodel;

import telran.money.test.MoneyTest;

import java.util.Objects;

public class Money implements Comparable<Money> {
    double width;
    double length;
    int value;
    double area;

    public double getArea() {
        return area;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }


    @Override
    public String toString() {
        return "Money{" +
                "width=" + width +
                ", length=" + length +
                ", value=" + value +
                ", area=" + area +
                '}';
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(width, money.width) == 0 && Double.compare(length, money.length) == 0 && value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, value);
    }


    public Money(double width, double length, int value, double area) {
        this.width = width;
        this.length = length;
        this.value = value;
        this.area = area;
    }

    @Override
    public int compareTo(Money o) {
        return value - o.value;
    }
}
