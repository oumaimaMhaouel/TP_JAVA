Manipuler une collection d’objets Produit en utilisant une interface générique.
- Structure
Classe Produit
Attributs :
id
nom
marque
prix
description
nombreEnStock

Interface Générique IMetier<T>

Méthodes :
void add(T o);
List<T> getAll();
T findById(long id);
void delete(long id);

Classe MetierProduitImpl

Implémente IMetier<Produit>
Contient une List<Produit>
Gère les opérations CRUD simples

Classe Application
Menu interactif avec boucle while :

1. Afficher la liste des produits
2. Rechercher un produit par id
3. Ajouter un produit
4. Supprimer un produit
5. Quitter le programme
    
Exemple d’exécution :
<img width="821" height="381" alt="image" src="https://github.com/user-attachments/assets/fb88af58-17e4-438a-998e-8c868e46e69e" />
