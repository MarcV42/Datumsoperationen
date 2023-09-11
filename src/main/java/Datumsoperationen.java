
import java.time.*;
        import java.time.temporal.ChronoUnit;

public class Datumsoperationen {
    public static void main(String[] args) {
        // Schritt 1: Aktuelles Datum und Uhrzeit ausgeben
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Aktuelles Datum und Uhrzeit: " + currentDateTime);

        // Schritt 2: Aktuelles Datum um 2 Wochen erhöhen
        LocalDateTime futureDateTime = currentDateTime.plus(2, ChronoUnit.WEEKS);
        System.out.println("Datum nach 2 Wochen: " + futureDateTime);

        // Schritt 3: Vergleich mit einem zukünftigen Datum
        LocalDateTime futureDate = LocalDateTime.of(2024, 1, 31, 0, 0); // Beispiel: 31. Dezember 2023
        if (currentDateTime.isBefore(futureDate)) {
            System.out.println("Aktuelles Datum liegt vor dem festgelegten Datum.");
        } else if (currentDateTime.isAfter(futureDate)) {
            System.out.println("Aktuelles Datum liegt nach dem festgelegten Datum.");
        } else {
            System.out.println("Aktuelles Datum ist gleich dem festgelegten Datum.");
        }

        // Schritt 4: Berechne die Differenz in Tagen zwischen zwei Daten
        LocalDate date1 = LocalDate.of(2023, 9, 1); // Beispiel: 1. September 2023
        LocalDate date2 = LocalDate.of(2023, 11, 15); // Beispiel: 15. September 2023
        long daysDifference = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Differenz in Tagen zwischen den beiden Daten: " + daysDifference + " Tage");
    }
}
