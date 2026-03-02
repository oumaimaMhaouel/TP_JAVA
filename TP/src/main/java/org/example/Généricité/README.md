Manipuler une collection d’objets Produit en utilisant une interface générique.

Structure

Classe Produit

Attributs : id; nom; marque; prix; description; nombreEnStock;
Interface Générique IMetier

Méthodes : void add(T o); List getAll(); T findById(long id); void delete(long id);
Classe MetierProduitImpl Implémente IMetier Contient une List Gère les opérations simples

Classe Application

Menu interactif avec boucle while :
Afficher la liste des produits
Rechercher un produit par id
Ajouter un produit
Supprimer un produit
Quitter le programme
Exemple d’exécution :

<img width="821" height="381" alt="image" src="https://github.com/user-attachments/assets/fb88af58-17e4-438a-998e-8c868e46e69e" />
