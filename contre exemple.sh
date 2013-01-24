# Exemples donnees dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "chemin.net"
	graphe; todot "chemin.dot"
	Justifie EX(\$D) 0; Justifietodot EX(\$D) 0 "contre exemple 1.dot"
	Justifie EX(!\$A) 0; Justifietodot EX(!\$A) 0 "contre exemple 2.dot"
	Justifie EX(!EX(\$A)) 0; Justifietodot EX(!EX(\$A)) 0 "contre exemple 3.dot"
	stop
END_PARAMS