# ContactsManager

Projet Java réalisé dans le cadre du cours **Chapitre 06 – Programmation Orientée Objet en Java**
(UE Projet Informatique II – LPRGL3 – PIGIER Côte d'Ivoire).

---

## Description

**ContactsManager** est une application Java qui gère une liste de contacts (nom + numéro de téléphone).

Elle illustre les concepts du cours :
- Création de classes, objets, attributs et méthodes
- Modificateurs d'accès `public` et `private`
- Constructeur par défaut avec `this`
- Tableau d'objets et compteur `friendsCount`
- Méthodes `addContact()` et `searchContact()`

---

## Structure du projet

```
ContactsManager/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── contactsmanager/
│                   ├── Contact.java
│                   ├── ContactsManager.java
│                   └── Main.java
├── ContactsManager.iml
└── README.md
```

---

## Modificateurs d'accès (cours chapitre 6)

Analogie du cours : comme des photos privées vs publiques.

| Élément | Modificateur | Explication |
|---|---|---|
| `Contact.name` | `private` | Accessible uniquement depuis la classe Contact |
| `Contact.phoneNumber` | `private` | Accessible uniquement depuis la classe Contact |
| `ContactsManager.myFriends` | `private` | Tableau interne à ContactsManager |
| `ContactsManager.friendsCount` | `private` | Compteur interne à ContactsManager |
| `getName()`, `getPhoneNumber()` | `public` | Getters accessibles depuis n'importe quelle classe |
| `setName()`, `setPhoneNumber()` | `public` | Setters accessibles depuis n'importe quelle classe |
| `addContact()`, `searchContact()` | `public` | Accessibles depuis Main |

---

## Structure imposée par le cours

### ContactsManager – attributs et constructeur

```java
ContactsManager() {
    this.friendsCount = 0;
    this.myFriends = new Contact[500];
}
```

### addContact

```java
void addContact(Contact contact) {
    myFriends[friendsCount] = contact;
    friendsCount++;
}
```

### searchContact

```java
Contact searchContact(String searchName) {
    for (int i = 0; i < friendsCount; i++) {
        if (myFriends[i].getName().equals(searchName)) {
            return myFriends[i];
        }
    }
    return null;
}
```

---

## Importer et exécuter dans IntelliJ IDEA

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/<votre-username>/ContactsManager.git
   ```
2. `File → Open → dossier ContactsManager`
3. `File → Project Structure → Project SDK → Java 21`
4. Ouvrir `Main.java` → clic droit → `Run 'Main.main()'`

---

## Sortie console

```
Contact trouve : Aya Traore
Numero de telephone : +225 05 98 76 54 32
```

---

## Auteur

Projet réalisé par Coulibaly Seydou – L3 Informatique, PIGIER Côte d'Ivoire.
