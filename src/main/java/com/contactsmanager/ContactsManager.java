package com.contactsmanager;

/**
 * Classe de gestion des contacts.
 *
 * Structure imposée par le cours (chapitre 6) :
 * - Un tableau Contact[] myFriends de 500 éléments pour stocker les contacts.
 * - Un compteur int friendsCount pour savoir combien d'amis ont été ajoutés.
 * - Un constructeur par défaut qui initialise friendsCount à 0 et crée le tableau.
 * - Une méthode addContact() pour ajouter un contact.
 * - Une méthode searchContact() pour rechercher un contact par nom.
 *
 * Les attributs sont privés : inaccessibles directement depuis l'extérieur.
 */
public class ContactsManager {

    // Attributs privés (modificateur d'accès : private)
    private Contact[] myFriends;   // tableau de 500 contacts maximum
    private int friendsCount;      // nombre de contacts actuellement ajoutés

    // Constructeur par défaut : initialise friendsCount à 0 et crée le tableau
    public ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode publique : ajoute un contact au tableau à la position friendsCount
    // puis incrémente le compteur (exactement comme dans le cours)
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode publique : recherche un contact par son nom
    // Retourne l'objet Contact trouvé, ou null si aucun contact ne correspond
    // (exactement comme dans le cours)
    public Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    // Getter public : permet de lire friendsCount depuis l'extérieur
    public int getFriendsCount() {
        return friendsCount;
    }
}
