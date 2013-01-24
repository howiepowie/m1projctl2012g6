# Exemples donnes dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "atomique.net"
	graphe; todot "atomique.dot"
	Justifie EX(\$B) 0; Justifietodot EX(\$B) 0 "preuve atomique 1.dot"
	Justifie EX(true) 0; Justifietodot EX(true) 0 "preuve atomique 2.dot"
	Justifie EX(dead) 0; Justifietodot EX(dead) 0 "preuve atomique 3.dot"
	Justifie EX(initial) 2; Justifietodot EX(initial) 2 "preuve atomique 4.dot"
	stop
END_PARAMS