package com.contactsmanager;

/**
 * Classe principale - point d'entrée du programme.
 *
 * Suit exactement les étapes de l'Exercice 1 du cours (chapitre 6) :
 * 1. Créer un objet ContactsManager via le constructeur par défaut.
 * 2. Créer une variable Contact, définir name et phoneNumber.
 * 3. Appeler addContact() pour l'ajouter.
 * 4. Répéter pour 4 autres contacts.
 * 5. Rechercher un contact avec searchContact() et afficher son numéro.
 */
public class Main {

    public static void main(String[] args) {

        // Étape 1 : Créer un objet ContactsManager avec le constructeur par défaut
        ContactsManager myContactsManager = new ContactsManager();

        // Étape 2 & 3 : Premier contact
        Contact contact1 = new Contact();
        contact1.setName("Kofi Mensah");
        contact1.setPhoneNumber("+225 07 12 34 56 78");
        myContactsManager.addContact(contact1);

        // Répétition pour le deuxième contact
        Contact contact2 = new Contact();
        contact2.setName("Aya Traore");
        contact2.setPhoneNumber("+225 05 98 76 54 32");
        myContactsManager.addContact(contact2);

        // Répétition pour le troisième contact
        Contact contact3 = new Contact();
        contact3.setName("Moussa Coulibaly");
        contact3.setPhoneNumber("+225 01 23 45 67 89");
        myContactsManager.addContact(contact3);

        // Répétition pour le quatrième contact
        Contact contact4 = new Contact();
        contact4.setName("Fatou Diallo");
        contact4.setPhoneNumber("+225 07 55 44 33 22");
        myContactsManager.addContact(contact4);

        // Répétition pour le cinquième contact
        Contact contact5 = new Contact();
        contact5.setName("Ibrahim Bamba");
        contact5.setPhoneNumber("+225 05 66 77 88 99");
        myContactsManager.addContact(contact5);

        // Étape 5 : Rechercher un contact avec searchContact() et afficher son numéro
        Contact contactTrouve = myContactsManager.searchContact("Aya Traore");

        // Affichage du numéro de téléphone du contact trouvé
        if (contactTrouve != null) {
            System.out.println("Contact trouve : " + contactTrouve.getName());
            System.out.println("Numero de telephone : " + contactTrouve.getPhoneNumber());
        } else {
            System.out.println("Contact non trouve.");
        }
    }
}
