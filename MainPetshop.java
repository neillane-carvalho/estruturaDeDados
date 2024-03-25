import java.util.Date;

public class MainPetshop {
    public static void main(String[] args) {
        Pets pet1 = new Pets("Duke", "(71) 98389-9780", new Date(2015,02,12),"Shitzu");
        Pets pet2 = new Pets("Theo", "(71) 98806-2109", new Date(2022,11,10),"Shitzu");


        System.out.println("Lista de pets do Petshop I LOVO DOGS:");
        System.out.println(pet1);
        System.out.println(pet2);
    }
}
