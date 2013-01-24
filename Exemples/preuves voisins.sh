# Exemples donnes dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "chemin.net"
	graphe; todot "chemin.dot"
	Justifie EX(!\$D) 0; Justifietodot EX(!\$D) 0 "preuve voisins 1.dot"
	Justifie AX(!\$D) 0; Justifietodot AX(!\$D) 0 "preuve voisins 2.dot"
	Justifie AX(AX(\$D)) 0; Justifietodot AX(AX(\$D)) 0 "preuve voisins 3.dot"
	stop
END_PARAMS