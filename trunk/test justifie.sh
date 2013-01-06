# Quelques tests de justification.
# Met en evidence les particularites d'affichage de certaines formules.
#
# - ($tour0 || $tour1) && ($tour0 && EX(!$tour0)) 1:
# on prend les etats qui ont ($tour0 ou $tour1) et ($tour0 et pour lesquel un voisin n'a pas $tour0).
#
# - AX(EX(!(\$tour0))) 4:
# depuis l'etat 4 tous les voisins possedent un voisin pour lequel $tour0 est fausse.
#
# - EX(AX(EX(!$tour0 || $tour0))) 3:
# - AX(AX(EX(!$tour0 || $tour0))) 3:
# montre la difference d'affichage entre EX et AX.
# dans la premiere formule on a la justification de AX(EX(!$tour0 || $tour0)) uniquement pour l'etat 4.
# dans la seconde formule on a la justification de AX(EX(!$tour0 || $tour0)) pour les etats 4 et 17.
#
# - E(\$tour1 U \$tour0) 0:
# doit afficher un chemin avec une seule etape qui est le depart.
#
# - E(\$tour0 U \$tour1) 0:
# doit afficher un chemin de 0 a un etat ayant $tour1 a vraie.
# cet exemple montre qu'un seul chemin est dessine parmis ceux possibles.
#
# - EX(E(\$tour0 U \$tour1)) 0:
# pour un des voisins de l'etat 0, doit afficher un chemin jusqu'a un etat ayant $tour1 a vraie.
# cet exemple montre que le EX va dessiner la justification pour un seul voisin et,
# que pour ce voisin, un seul chemin est dessine parmis ceux possibles.
#
# - AX(E(\$tour0 U \$tour1)) 0:
# pour tous les voisins de l'etat 0, doit afficher un chemin jusqu'a un etat ayant $tour1 a vraie.
# cet exemple montre que le AX va dessiner la justification pour tous les voisins mais,
# que pour chaque voisin, un seul chemin est dessine parmis ceux possibles.
#
# - E(EX($tour0) U EX($SC0)) 0:
# doit afficher un chemin de l'etat 0 a un etat ayant comme voisin un etat pour lequel $SC0 est vraie.
# cet exemple montre que la justification de EX($tour0) est affichee pour tous les etats intermediaires.
#
# - A($tour0 U $tour1) 1:
# - A(EX($tour1) U $tour1) 1:
# doit prouver que quelque soit le chemin pris depuis l'etat 1, on peut arriver a $tour1 vraie en passant
# par des etats qui ont au moins un voisin ayant $tour1 a vraie.
# cet exemple montre comment l'ensemble des chemins est affiche et comment chaque etat est prouve.
#
# .dot produits:
# - "peterson.net": le graphe.
# - "test justifie 1-9.dot"
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "peterson.net"
	graphe; todot "peterson.net"
	Justifie (\$tour0 || \$tour1) && (\$tour0 && EX(!\$tour0)) 1; Justifietodot (\$tour0 || \$tour1) && (\$tour0 && EX(!\$tour0)) 1 "test justifie 1.dot"
	Justifie AX(EX(!(\$tour0))) 4; Justifietodot AX(EX(!(\$tour0))) 4 "test justifie 2.dot"
	Justifie EX(AX(EX(!\$tour0 || \$tour0))) 3; Justifietodot EX(AX(EX(!\$tour0 || \$tour0))) 3 "test justifie 3.dot"
	Justifie AX(AX(EX(!\$tour0 || \$tour0))) 3; Justifietodot AX(AX(EX(!\$tour0 || \$tour0))) 3 "test justifie 4.dot"
	Justifie E(\$tour1 U \$tour0) 0; Justifietodot E(\$tour1 U \$tour0) 0 "test justifie 5.dot"
	Justifie E(\$tour0 U \$tour1) 0; Justifietodot E(\$tour0 U \$tour1) 0 "test justifie 6.dot"
	Justifie EX(E(\$tour0 U \$tour1)) 0; Justifietodot EX(E(\$tour0 U \$tour1)) 0 "test justifie 7.dot"
	Justifie AX(E(\$tour0 U \$tour1)) 0; Justifietodot AX(E(\$tour0 U \$tour1)) 0 "test justifie 8.dot"
	Justifie E(EX(\$tour0) U EX(\$SC0)) 0; Justifietodot E(EX(\$tour0) U EX(\$SC0)) 0 "test justifie 9.dot"
	Justifie A(\$tour0 U \$tour1) 1; Justifietodot A(\$tour0 U \$tour1) 1 "test justifie 10.dot"
	Justifie A(EX(\$tour1) U \$tour1) 1; Justifietodot A(EX(\$tour1) U \$tour1) 1 "test justifie 11.dot"
	stop
END_PARAMS