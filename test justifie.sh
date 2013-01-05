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
# .dot produits:
# - "peterson.net": le graphe.
# - "test justifie 1.dot"
# - "test justifie 2.dot"
# - "test justifie 3.dot"
# - "test justifie 4.dot"
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "peterson.net"
	graphe; todot "peterson.net"
	Justifie (\$tour0 || \$tour1) && (\$tour0 && EX(!\$tour0)) 1; Justifietodot (\$tour0 || \$tour1) && (\$tour0 && EX(!\$tour0)) 1 "test justifie 1.dot"
	Justifie AX(EX(!(\$tour0))) 4; Justifietodot AX(EX(!(\$tour0))) 4 "test justifie 2.dot"
	Justifie EX(AX(EX(!\$tour0 || \$tour0))) 3; Justifietodot EX(AX(EX(!\$tour0 || \$tour0))) 3 "test justifie 3.dot"
	Justifie AX(AX(EX(!\$tour0 || \$tour0))) 3; Justifietodot AX(AX(EX(!\$tour0 || \$tour0))) 3 "test justifie 4.dot"
	stop
END_PARAMS