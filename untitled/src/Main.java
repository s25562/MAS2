/*
Zwykła asocjacja 1–* (Klient — Zamówienie)
Asocjacja z atrybutem (Pracownik — Projekt — Udzial)
Asocjacja kwalifikowana (Biblioteka — Książka przez ISBN)
Kompozycja (Formularz — Pole z zabezpieczeniem współdzielenia)
 */

import pck.*;


public class Main {
    public static void main(String[] args) throws Exception {

        Client client = new Client("Anna");
        Order order1 = new Order("Z001");
        client.addOrder(order1);
        System.out.println("Order belongs to: " + order1.getClient().getName());

        Employee employee = new Employee("Kowalski");
        Project project = new Project("Intranet");
        employee.addParticipation(project, 120);
        System.out.println("Employee participations: " + employee.getParticipationList().size());

        Library library = new Library();
        Book book = new Book("978-1234567890", "Programming Java");
        library.addBook(book);
        System.out.println("Found book: " + library.findBook("978-1234567890").getIsbn());

        Form form = new Form("Registration");
        Field field = form.createField("Email");
        System.out.println("Field belongs to form: " + field.getForm());

        try {
            Form anotherForm = new Form("Contact");
            anotherForm.createField("Email");
        } catch (Exception ex) {
            System.out.println("Composition error: " + ex.getMessage());
        }
    }
}