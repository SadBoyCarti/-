//Сделал коментарий бесполезный
import java.util.Objects;

public final class ComplexNumber {
    private final float re;
    private final float im;

    public ComplexNumber(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public float getRe() {
        return re;
    }

    public float getIm() {
        return im;
    }


    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber("2.3412","7.2434");
        ComplexNumber cn2 = new ComplexNumber("2.3412","7.2434");
        ComplexNumber cn3 = new ComplexNumber("3.23124","1435.23");


        //ComplexNumber cn1 = new ComplexNumber(2.3412,7.2434);
        //ComplexNumber cn2 = new ComplexNumber(2.3412,7.2434);
        //ComplexNumber cn3 = new ComplexNumber(3.23124,1435.23);
        System.out.println("equals cn1 & cn2 true // " + cn1.equals(cn2));
        System.out.println("equals cn2 & cn1 true // " + cn2.equals(cn1));
        System.out.println("equals cn2 & cn3 false // " + cn2.equals(cn3));
        System.out.println("equals cn3 & cn1 false // " + cn3.equals(cn1));
        System.out.println("hash cn1 & cn2 true // " + (cn1.hashCode() == cn2.hashCode()));
        System.out.println("hash cn2 & cn1 true // " + (cn2.hashCode() == cn1.hashCode()));
        System.out.println("hash cn3 & cn1 false // " + (cn3.hashCode() == cn1.hashCode()));
        System.out.println("hash cn3 & cn2 false // " + (cn3.hashCode() == cn2.hashCode()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Float.compare(that.re, re) == 0 && Float.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    /*чары
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return re == that.re && im == that.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }*/
/*лонг
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return re == that.re && im == that.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }*/
/* байты-инты

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return re == that.re && im == that.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }*/
/* инты
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return re == that.re && im == that.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }*/
/*стринги
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Objects.equals(re, that.re) && Objects.equals(im, that.im);
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }*/
/* даблы
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(re, im);
        }*/
}
