package com.contactsmanager;

/**
 * Classe représentant un contact.
 *
 * Modificateurs d'accès (cours chapitre 6) :
 * - private : accessible uniquement depuis cette classe (comme une photo privée)
 * - public  : accessible depuis n'importe quelle autre classe (comme une photo publique)
 *
 * Par défaut, les attributs doivent être privés.
 * On utilise des getters et setters publics pour y accéder.
 */
public class Contact {

    // Attributs privés : invisibles depuis l'extérieur de la classe
    private String name;
    private String phoneNumber;

    // Constructeur par défaut : initialise les attributs avec des valeurs vides
    public Contact() {
        this.name = "";
        this.phoneNumber = "";
    }

    // Getter public : permet de lire l'attribut name depuis une autre classe
    public String getName() {
        return name;
    }

    // Setter public : permet de modifier l'attribut name depuis une autre classe
    public void setName(String name) {
        this.name = name;
    }

    // Getter public : permet de lire l'attribut phoneNumber depuis une autre classe
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter public : permet de modifier l'attribut phoneNumber depuis une autre classe
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
