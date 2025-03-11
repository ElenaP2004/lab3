import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class AdaugareStudenti {
    {
            Random rand = new Random();
            List<Student> studenti = new ArrayList<>();


            studenti.add(new Student("Popescu Andrei", "A1"));
            studenti.add(new Student("Ionescu Maria","A2"));
            studenti.add(new Student("Georgescu Mihai", "A1"));
            studenti.add(new Student("Dumitru Elena","A3"));
            studenti.add(new Student("Radulescu Ioana", "A2"));


            for (Student s : studenti) {
                for (int i = 0; i < 5; i++) {
                    s.note.add(rand.nextInt(7) + 4); // [4,10]
                }
            }


            studenti.sort(Comparator.comparing((Student s) -> s.grupa).thenComparing(s -> s.nume));
            System.out.println("Sortare alfabetică pe grupe:");
            studenti.forEach(System.out::println);


            System.out.println("\nSortare descrescătoare a mediilor pentru integraliști:");
            studenti.stream()
                    .filter(s -> s.getNumarRestante() == 0)
                    .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                    .forEach(System.out::println);


            System.out.println("\nSortare crescătoare a numărului de restanțe pentru restanțieri:");
            studenti.stream()
                    .filter(s -> s.getNumarRestante() > 0)
                    .sorted(Comparator.comparingInt(Student::getNumarRestante))
                    .forEach(System.out::println);
        }
    }


