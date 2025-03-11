import java.util.*;

 public class Student {
    String nume;
    String grupa;
    List<Integer> note;

    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public double getMedie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getNumarRestante() {
        return (int) note.stream().filter(n -> n < 5).count();
    }

    @Override
    public String toString() {
        return nume + " - Grupa: " + grupa + " - Note: " + note + " - Medie: " + getMedie();
    }
}

